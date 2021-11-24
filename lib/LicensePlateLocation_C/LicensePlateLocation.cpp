//
// MATLAB Compiler: 7.0 (R2018b)
// Date: Wed Nov 24 12:36:37 2021
// Arguments:
// "-B""macro_default""-W""cpplib:LicensePlateLocation,all""-T""link:lib""licens
// e_plate_location.m""plate_location_kelnel.m""minboundrect.m""rgb2hsi.m""recti
// fy.m""detection_color.m""-d""LicensePlateLocation_C"
//

#include <stdio.h>
#define EXPORTING_LicensePlateLocation 1
#include "LicensePlateLocation.h"

static HMCRINSTANCE _mcr_inst = NULL;

#if defined( _MSC_VER) || defined(__LCC__) || defined(__MINGW64__)
#ifdef __LCC__
#undef EXTERN_C
#endif
#include <windows.h>

static char path_to_dll[_MAX_PATH];

BOOL WINAPI DllMain(HINSTANCE hInstance, DWORD dwReason, void *pv)
{
    if (dwReason == DLL_PROCESS_ATTACH)
    {
        if (GetModuleFileName(hInstance, path_to_dll, _MAX_PATH) == 0)
            return FALSE;
    }
    else if (dwReason == DLL_PROCESS_DETACH)
    {
    }
    return TRUE;
}
#endif
#ifdef __cplusplus
extern "C" {
#endif

static int mclDefaultPrintHandler(const char *s)
{
    return mclWrite(1 /* stdout */, s, sizeof(char)*strlen(s));
}

#ifdef __cplusplus
} /* End extern "C" block */
#endif

#ifdef __cplusplus
extern "C" {
#endif

static int mclDefaultErrorHandler(const char *s)
{
    int written = 0;
    size_t len = 0;
    len = strlen(s);
    written = mclWrite(2 /* stderr */, s, sizeof(char)*len);
    if (len > 0 && s[ len-1 ] != '\n')
        written += mclWrite(2 /* stderr */, "\n", sizeof(char));
    return written;
}

#ifdef __cplusplus
} /* End extern "C" block */
#endif

/* This symbol is defined in shared libraries. Define it here
 * (to nothing) in case this isn't a shared library. 
 */
#ifndef LIB_LicensePlateLocation_C_API
#define LIB_LicensePlateLocation_C_API /* No special import/export declaration */
#endif

LIB_LicensePlateLocation_C_API 
bool MW_CALL_CONV LicensePlateLocationInitializeWithHandlers(
    mclOutputHandlerFcn error_handler,
    mclOutputHandlerFcn print_handler)
{
    int bResult = 0;
    if (_mcr_inst != NULL)
        return true;
    if (!mclmcrInitialize())
        return false;
    if (!GetModuleFileName(GetModuleHandle("LicensePlateLocation"), path_to_dll, _MAX_PATH))
        return false;
    {
        mclCtfStream ctfStream = 
            mclGetEmbeddedCtfStream(path_to_dll);
        if (ctfStream) {
            bResult = mclInitializeComponentInstanceEmbedded(&_mcr_inst,
                                                             error_handler, 
                                                             print_handler,
                                                             ctfStream);
            mclDestroyStream(ctfStream);
        } else {
            bResult = 0;
        }
    }  
    if (!bResult)
    return false;
    return true;
}

LIB_LicensePlateLocation_C_API 
bool MW_CALL_CONV LicensePlateLocationInitialize(void)
{
    return LicensePlateLocationInitializeWithHandlers(mclDefaultErrorHandler, 
                                                    mclDefaultPrintHandler);
}

LIB_LicensePlateLocation_C_API 
void MW_CALL_CONV LicensePlateLocationTerminate(void)
{
    if (_mcr_inst != NULL)
        mclTerminateInstance(&_mcr_inst);
}

LIB_LicensePlateLocation_C_API 
void MW_CALL_CONV LicensePlateLocationPrintStackTrace(void) 
{
    char** stackTrace;
    int stackDepth = mclGetStackTrace(&stackTrace);
    int i;
    for(i=0; i<stackDepth; i++)
    {
        mclWrite(2 /* stderr */, stackTrace[i], sizeof(char)*strlen(stackTrace[i]));
        mclWrite(2 /* stderr */, "\n", sizeof(char)*strlen("\n"));
    }
    mclFreeStackTrace(&stackTrace, stackDepth);
}


LIB_LicensePlateLocation_C_API 
bool MW_CALL_CONV mlxLicense_plate_location(int nlhs, mxArray *plhs[], int nrhs, mxArray 
                                            *prhs[])
{
    return mclFeval(_mcr_inst, "license_plate_location", nlhs, plhs, nrhs, prhs);
}

LIB_LicensePlateLocation_C_API 
bool MW_CALL_CONV mlxPlate_location_kelnel(int nlhs, mxArray *plhs[], int nrhs, mxArray 
                                           *prhs[])
{
    return mclFeval(_mcr_inst, "plate_location_kelnel", nlhs, plhs, nrhs, prhs);
}

LIB_LicensePlateLocation_C_API 
bool MW_CALL_CONV mlxMinboundrect(int nlhs, mxArray *plhs[], int nrhs, mxArray *prhs[])
{
    return mclFeval(_mcr_inst, "minboundrect", nlhs, plhs, nrhs, prhs);
}

LIB_LicensePlateLocation_C_API 
bool MW_CALL_CONV mlxRgb2hsi(int nlhs, mxArray *plhs[], int nrhs, mxArray *prhs[])
{
    return mclFeval(_mcr_inst, "rgb2hsi", nlhs, plhs, nrhs, prhs);
}

LIB_LicensePlateLocation_C_API 
bool MW_CALL_CONV mlxRectify(int nlhs, mxArray *plhs[], int nrhs, mxArray *prhs[])
{
    return mclFeval(_mcr_inst, "rectify", nlhs, plhs, nrhs, prhs);
}

LIB_LicensePlateLocation_C_API 
bool MW_CALL_CONV mlxDetection_color(int nlhs, mxArray *plhs[], int nrhs, mxArray *prhs[])
{
    return mclFeval(_mcr_inst, "detection_color", nlhs, plhs, nrhs, prhs);
}

LIB_LicensePlateLocation_CPP_API 
void MW_CALL_CONV license_plate_location(int nargout, mwArray& status_code, const 
                                         mwArray& detect_folder, const mwArray& suffix, 
                                         const mwArray& output_folder)
{
    mclcppMlfFeval(_mcr_inst, "license_plate_location", nargout, 1, 3, &status_code, &detect_folder, &suffix, &output_folder);
}

LIB_LicensePlateLocation_CPP_API 
void MW_CALL_CONV plate_location_kelnel(int nargout, mwArray& img_out, mwArray& cnt, 
                                        mwArray& p_morphology, mwArray& p_color, const 
                                        mwArray& image_path)
{
    mclcppMlfFeval(_mcr_inst, "plate_location_kelnel", nargout, 4, 1, &img_out, &cnt, &p_morphology, &p_color, &image_path);
}

LIB_LicensePlateLocation_CPP_API 
void MW_CALL_CONV minboundrect(int nargout, mwArray& rectx, mwArray& recty, mwArray& 
                               area, mwArray& perimeter, const mwArray& x, const mwArray& 
                               y, const mwArray& metric)
{
    mclcppMlfFeval(_mcr_inst, "minboundrect", nargout, 4, 3, &rectx, &recty, &area, &perimeter, &x, &y, &metric);
}

LIB_LicensePlateLocation_CPP_API 
void MW_CALL_CONV rgb2hsi(int nargout, mwArray& hsi, const mwArray& rgb)
{
    mclcppMlfFeval(_mcr_inst, "rgb2hsi", nargout, 1, 1, &hsi, &rgb);
}

LIB_LicensePlateLocation_CPP_API 
void MW_CALL_CONV rectify(int nargout, mwArray& I4, const mwArray& img)
{
    mclcppMlfFeval(_mcr_inst, "rectify", nargout, 1, 1, &I4, &img);
}

LIB_LicensePlateLocation_CPP_API 
void MW_CALL_CONV detection_color(int nargout, mwArray& pass, const mwArray& img)
{
    mclcppMlfFeval(_mcr_inst, "detection_color", nargout, 1, 1, &pass, &img);
}

