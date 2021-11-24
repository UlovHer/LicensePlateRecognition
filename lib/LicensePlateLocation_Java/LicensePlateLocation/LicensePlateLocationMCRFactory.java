/*
 * MATLAB Compiler: 7.0 (R2018b)
 * Date: Wed Nov 24 17:24:47 2021
 * Arguments: 
 * "-B""macro_default""-W""java:LicensePlateLocation,LicensePlateLocation""license_plate_location.m""plate_location_kelnel.m""minboundrect.m""rgb2hsi.m""rectify.m""detection_color.m""-d""LicensePlateLocation_Java"
 */

package LicensePlateLocation;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class LicensePlateLocationMCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "LicensePlate_E097517060FECFA94645B3C347625474";
    
    /** Component name */
    private static final String sComponentName = "LicensePlateLocation";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(LicensePlateLocationMCRFactory.class)
        );
    
    
    private LicensePlateLocationMCRFactory()
    {
        // Never called.
    }
    
    public static MWMCR newInstance(MWComponentOptions componentOptions) throws MWException
    {
        if (null == componentOptions.getCtfSource()) {
            componentOptions = new MWComponentOptions(componentOptions);
            componentOptions.setCtfSource(sDefaultComponentOptions.getCtfSource());
        }
        return MWMCR.newInstance(
            componentOptions, 
            LicensePlateLocationMCRFactory.class, 
            sComponentName, 
            sComponentId,
            new int[]{9,5,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
