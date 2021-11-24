function status_code = license_plate_location(detect_folder, suffix, output_folder)
    %
    % description.
    %
    % @since 1.0.0
    % @param {string} [detect_folder] �����ͼ�������ļ���.
    % @return {int} [status_code] ���ִ��״̬.
    % @see dependencies
    %

    % ��������ļ����Ƿ����
    if (~exist(detect_folder, 'dir'))
        status_code = 0;
        fprintf('The detect folder is not exist.\n');
        return;
    end

    % �������ļ����Ƿ����
    if (~exist(output_folder, 'dir'))
        mkdir(output_folder);
    end

    % Ĭ��ֻ���JPG��ʽͼƬ
    if (isempty(suffix))
        suffix = '*.jpg';
    end

    img_path_list = dir(strcat(detect_folder, suffix));
    %��ȡ���ļ���������jpg��ʽ��ͼƬ
    img_num = length(img_path_list);
    %��ȡͼ������
    morphology = zeros(1, img_num);
    color = zeros(1, img_num);

    for j = 1:img_num
        image_name = img_path_list(j).name;
        image_path = strcat(detect_folder, image_name);
        [plate, cnt, morphology(1, j), color(1, j)] = plate_location_kelnel(image_path);

        if cnt == 1
            imwrite(squeeze(plate), strcat(output_folder, num2str(j), '.jpg'))
            %��⵽1����ѡ����
            fprintf('%s: %s\n', image_name, 'one license plate area detected');
        elseif cnt > 1

            for i = 1:cnt
                imwrite(uint8(squeeze(plate(i, :, :, :))), strcat(output_folder, num2str(j), '_', num2str(i), '.jpg'))
                %��⵽�����ѡ����
            end

            fprintf('%s: %s\n', image_name, 'error,more than one license plate area detected');
        else
            fprintf('%s: %s\n', image_name, 'no license plate detected');
        end

    end

    %plot_result(img_num, morphology, color);
    status_code = 1;
end
