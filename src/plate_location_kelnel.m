function [img_out, cnt, p_morphology, p_color] = plate_location_kelnel(image_path)
    img = imread(image_path);
    % ��ȡͼ��
    [p, q, ~] = size(img);
    %% �Զ�������ʾ���ȡͼ��
    % figure;

    % subplot(1,2,1), imshow(img),title('����ͼ��');
    %% ��˹ģ�����˳������Ե
    G = fspecial('gaussian', [5 5], 6);
    img_gaussian = imfilter(img, G, 'same');
    % subplot(1,2,2), imshow(img_gaussian), title('��˹ģ��');
    %% �Ҷȴ���
    img_gray = rgb2gray(img_gaussian);
    % RGBͼ��ת�Ҷ�ͼ��
    % figure;
    % imshow(img_gray);
    % title('�Ҷ�ͼ��');

    %% ��Ե��ȡ
    img_edge = edge(img_gray, 'Sobel', 'vertical');
    % figure('name','��Ե���');
    % imshow(img_edge);
    % title('Sobel���ӱ�Ե���');
    %% ����Ӧ��ֵ��ֵ��
    k = graythresh(im2double(img_edge));
    %�õ�������ֵ
    img_bin = imbinarize(im2double(img_edge), k);
    % figure('name','��ֵ��')
    % imshow(img_bin);

    %% �ղ���,ͼ������
    se = strel('rectangle', [double(int16(0.012 * p)), double(int16(0.025 * p))]);
    img_close = imclose(img_bin, se);
    % figure('name','ƽ������');
    % imshow(img_close);
    % title('ͼ�������');
    %% ��ʴ������ϸС��ϵ
    se = ones(double(int16(0.0025 * p)), double(int16(0.0075 * p)));
    img_erode = imerode(img_close, se);
    % figure('name','ͼ��ʴ');
    % imshow(img_erode);
    % title('ͼ��ʴ���ͼ��');
    %% ��ͼ����ɾ����������1/200����8�ڽӵ�С����
    threshold = p * q / 200;
    img_del = bwareaopen(img_erode, double(int16(threshold)));
    % figure('name', '�Ƴ�С����');
    % imwrite(img_del,'�Ƴ�С����.jpg')
    % imshow(img_del);
    % title('��ͼ�����Ƴ�С����');
    %% ȡ�����ж�������������������εĳ���ȣ����������ɸѡ
    cnt_morphology = 0;
    cnt_color = 0;
    bound = bwboundaries(img_del);
    [num, ~] = size(bound);
    %��ȡ�������
    rect_area = zeros(1, num);
    % �洢���
    rect_ratio = zeros(1, num);
    % �洢�����
    rect_slope = zeros(1, num);
    % �洢��б�Ƕ�
    for i = 1:1:num
        %�������ж�������
        [rectx, recty, area] = minboundrect((bound{i}(:, 1)), (bound{i}(:, 2)), 'a');
        % ����Ӿ��Σ��пӡ����������rectx�����ŵ���ߣ���ͼ�ε�y
        Length = sqrt((rectx(1) - rectx(2))^2 + (recty(1) - recty(2))^2);
        Width = sqrt((rectx(2) - rectx(3))^2 + (recty(2) - recty(3))^2);
        rect_area(1, i) = area;
        % ���
        if Length / Width >= 1
            rect_ratio(1, i) = Length / Width;
            % ���ýϳ��ıߣ�����б��
            rect_slope(1, i) = (rectx(1) - rectx(2)) / (recty(1) - recty(2));
        else
            rect_ratio(1, i) = Width / Length;
            rect_slope(1, i) = (rectx(2) - rectx(3)) / (recty(2) - recty(3));
        end

    end

    thr_ratio = 4.727272; error = 0.4;
    % ����������Լ����
    thr_area_min = 0; thr_area_max = p * q / 10;
    %�����Χ
    thr_slope_min = -atan(pi / 6); thr_slope_max = atan(pi / 6);
    candidate = [];

    for j = 1:1:num
        %�����ж�
        if (rect_ratio(1, j) > thr_ratio * (1 - error)) && (rect_ratio(1, j) < thr_ratio * (1 + error)) ...
            && (rect_slope(1, j) >= thr_slope_min) && (rect_slope(1, j) <= thr_slope_max) ...
                && (rect_area(1, j) >= thr_area_min) && (rect_area(1, j) <= thr_area_max)

            candidate = [candidate, j];
        else
            cnt_morphology = cnt_morphology + 1;
        end

    end

    %% ȡ�����к�ѡ����
    % ��ѡ�˸���
    [~, num_cnd] = size(candidate);
    cnt = 0;
    [H, W, ~] = size(img);

    memory = zeros(5, 40, 130, 3);
    % δ������ɫ���
    for k = 1:1:num_cnd

        ndx = candidate(1, k);
        [x, y] = minboundrect(bound{ndx}(:, 1), bound{ndx}(:, 2));
        % ����Ӿ���

        up = int16(min(x) + 1);
        down = int16(max(x) - 1);
        left = int16(min(y) + 1);
        right = int16(max(y) - 1);

        if up <= 1
            up = 1;
        end

        if down >= H
            down = H;
        end

        if left <= 1
            left = 1;
        end

        if right >= W
            right = W;
        end

        img_rectify = img(up:down, left:right, :);

        if detection_color(img_rectify) == 1
            % ��ɫ�б�ͨ����Ϊ��ɫ����ɫ
            % ��Ϊǰ���и�ʴ����˽�ȡ�Դ�Χ

            up = up - 10;
            down = down + 10;
            left = left - 10;
            right = right + 10;

            if up <= 1
                up = 1;
            end

            if down >= H
                down = H;
            end

            if left <= 1
                left = 1;
            end

            if right >= W
                right = W;
            end

            cnt = cnt + 1;
            img_crop_ex = img(up:down, left:right, :);
            % figure();
            % imshow(img_crop_ex),title('δ����ͼ��');
            % imwrite(imresize(img_crop_ex, [40 130],'bicubic'),strcat('δ����ͼ��', num2str(cnt), '.jpg'))
            img_rectify = rectify(img_crop_ex);

            img_rectify = imresize(img_rectify, [40 130], 'bicubic');
            % figure('name', strcat('��λ����ͼ��', num2str(cnt)));
            % imshow(img_rectify);
            % title(strcat('��λ����ͼ��', num2str(cnt)))
            % imwrite(img_rectify,);
            memory(cnt, :, :, :) = img_rectify;
        else
            cnt_color = cnt_color + 1;
        end

        img_rectify = imresize(img_rectify, [40 130], 'bicubic');
    end

    if cnt == 1
        img_out = img_rectify;
    elseif cnt == 0
        img_out = zeros(130, 280);
    else
        img_out = memory;

    end

    p_morphology = (num - cnt_morphology) / num;
    p_color = (num_cnd - cnt_color) / num_cnd;

end
