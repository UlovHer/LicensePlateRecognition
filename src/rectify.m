function [I4] = rectify(img)
    I1 = rgb2gray(img); 
    % ��ԭʼͼ��ת��Ϊ�Ҷ�ͼ��
    I2 = wiener2(I1, [5, 5]); 
    % �ԻҶ�ͼ�����ά���˲�
    I3 = edge(I2, 'canny'); 
    % ��Ե���
%     subplot(132), imshow(I3);
    [m, n] = size(I3); 
    % compute the size of the image
    rho = round(sqrt(m^2 + n^2));
    % ��ȡ�ѵ����ֵ
    theta = 180; 
    % ��ȡ�ȵ����ֵ
    r = zeros(rho, theta); 
    % ������ֵΪ0�ļ�������
    for i = 1:m
        for j = 1:n
            if I3(i, j) == 1 
               % I3�Ǳ�Ե���õ���ͼ��
                for k = 1:theta
                    ru = round(abs(i * cosd(k) + j * sind(k)));
                    r(ru + 1, k) = r(ru + 1, k) + 1; 
                    % �Ծ������ 
                end
            end
        end
    end
    r_max = r(1, 1);

    for i = 1:rho

        for j = 1:theta
            if r(i, j) > r_max
                r_max = r(i, j);
                c = j; 
                % �Ѿ���Ԫ�����ֵ����Ӧ���������͸�c
            end
        end
    end
    if c <= 90
        rot_theta = -c; 
        % ȷ����ת�Ƕ�
    else
        rot_theta = 180 - c;
    end
    I4 = imrotate(img, rot_theta, 'crop');
    % ��ͼ�������ת��У��ͼ��
end
