function plot_result(img_num, morphology, color)
    %
    % description.
    %
    % @since 1.0.0
    % @param {type} [name] description.
    % @return {type} [name] description.
    % @see dependencies
    %
    figure(1);
    bar(1:img_num, morphology);
    bar(1:img_num, color);

    figure(2);
    h1 = scatter(1:img_num, morphology, 'r*'); hold on;
    h2 = scatter(1:img_num, color, 'b*'); hold on;
    % 按颜色分，那么只需每类颜色的第一个即可
    legend([h1(1), h2(1)], 'morphology pass rate', 'color pass rate', 'location', 'northwest');
end
