function status_code = license_plate_location(detect_folder, suffix, output_folder)
    %
    % description.
    %
    % @since 1.0.0
    % @param {string} [detect_folder] 待检测图像所在文件夹.
    % @return {int} [status_code] 检测执行状态.
    % @see dependencies
    %

    % 检测输入文件夹是否存在
    if (~exist(detect_folder, 'dir'))
        status_code = 0;
        fprintf('The detect folder is not exist.\n');
        return;
    end

    % 检测输出文件夹是否存在
    if (~exist(output_folder, 'dir'))
        mkdir(output_folder);
    end

    % 默认只检测JPG格式图片
    if (isempty(suffix))
        suffix = '*.jpg';
    end

    img_path_list = dir(strcat(detect_folder, suffix));
    %获取该文件夹中所有jpg格式的图片
    img_num = length(img_path_list);
    %获取图像总数
    morphology = zeros(1, img_num);
    color = zeros(1, img_num);

    for j = 1:img_num
        image_name = img_path_list(j).name;
        image_path = strcat(detect_folder, image_name);
        [plate, cnt, morphology(1, j), color(1, j)] = plate_location_kelnel(image_path);

        if cnt == 1
            imwrite(squeeze(plate), strcat(output_folder, num2str(j), '.jpg'))
            %检测到1个候选区域
            fprintf('%s: %s\n', image_name, 'one license plate area detected');
        elseif cnt > 1

            for i = 1:cnt
                imwrite(uint8(squeeze(plate(i, :, :, :))), strcat(output_folder, num2str(j), '_', num2str(i), '.jpg'))
                %检测到多个候选区域
            end

            fprintf('%s: %s\n', image_name, 'error,more than one license plate area detected');
        else
            fprintf('%s: %s\n', image_name, 'no license plate detected');
        end

    end

    %plot_result(img_num, morphology, color);
    status_code = 1;
end
