%%
% ≤‚ ‘demo
%%
clear;
close all;
clc;

clc; 
clear; 
close all;

tic;
detect_folder = '../test_dataset/plate_set1/';
suffix='*.jpg';
output_folder= '../test_dataset/detect_result/';
fprintf('***************License Plate Location Begin***************\n');
status_code = license_plate_location(detect_folder,suffix,output_folder);
fprintf('***************License Plate Location End***************\n');
toc

