/*
 * MATLAB Compiler: 7.0 (R2018b)
 * Date: Wed Nov 24 17:24:47 2021
 * Arguments: 
 * "-B""macro_default""-W""java:LicensePlateLocation,LicensePlateLocation""license_plate_location.m""plate_location_kelnel.m""minboundrect.m""rgb2hsi.m""rectify.m""detection_color.m""-d""LicensePlateLocation_Java"
 */

package LicensePlateLocation;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;
import java.util.*;

/**
 * The <code>LicensePlateLocation</code> class provides a Java interface to MATLAB functions. 
 * The interface is compiled from the following files:
 * <pre>
 *  license_plate_location.m
 *  plate_location_kelnel.m
 *  minboundrect.m
 *  rgb2hsi.m
 *  rectify.m
 *  detection_color.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a 
 * <code>LicensePlateLocation</code> instance when it is no longer needed to ensure that 
 * native resources allocated by this class are properly freed.
 * @version 0.0
 */
public class LicensePlateLocation extends MWComponentInstance<LicensePlateLocation>
{
    /**
     * Tracks all instances of this class to ensure their dispose method is
     * called on shutdown.
     */
    private static final Set<Disposable> sInstances = new HashSet<Disposable>();

    /**
     * Maintains information used in calling the <code>license_plate_location</code> 
     *MATLAB function.
     */
    private static final MWFunctionSignature sLicense_plate_locationSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "license_plate_location",
                                /* max inputs = */ 3,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>plate_location_kelnel</code> 
     *MATLAB function.
     */
    private static final MWFunctionSignature sPlate_location_kelnelSignature =
        new MWFunctionSignature(/* max outputs = */ 4,
                                /* has varargout = */ false,
                                /* function name = */ "plate_location_kelnel",
                                /* max inputs = */ 1,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>minboundrect</code> MATLAB 
     *function.
     */
    private static final MWFunctionSignature sMinboundrectSignature =
        new MWFunctionSignature(/* max outputs = */ 4,
                                /* has varargout = */ false,
                                /* function name = */ "minboundrect",
                                /* max inputs = */ 3,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>rgb2hsi</code> MATLAB function.
     */
    private static final MWFunctionSignature sRgb2hsiSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "rgb2hsi",
                                /* max inputs = */ 1,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>rectify</code> MATLAB function.
     */
    private static final MWFunctionSignature sRectifySignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "rectify",
                                /* max inputs = */ 1,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>detection_color</code> MATLAB 
     *function.
     */
    private static final MWFunctionSignature sDetection_colorSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "detection_color",
                                /* max inputs = */ 1,
                                /* has varargin = */ false);

    /**
     * Shared initialization implementation - private
     * @throws MWException An error has occurred during the function call.
     */
    private LicensePlateLocation (final MWMCR mcr) throws MWException
    {
        super(mcr);
        // add this to sInstances
        synchronized(LicensePlateLocation.class) {
            sInstances.add(this);
        }
    }

    /**
     * Constructs a new instance of the <code>LicensePlateLocation</code> class.
     * @throws MWException An error has occurred during the function call.
     */
    public LicensePlateLocation() throws MWException
    {
        this(LicensePlateLocationMCRFactory.newInstance());
    }
    
    private static MWComponentOptions getPathToComponentOptions(String path)
    {
        MWComponentOptions options = new MWComponentOptions(new MWCtfExtractLocation(path),
                                                            new MWCtfDirectorySource(path));
        return options;
    }
    
    /**
     * @deprecated Please use the constructor {@link #LicensePlateLocation(MWComponentOptions componentOptions)}.
     * The <code>com.mathworks.toolbox.javabuilder.MWComponentOptions</code> class provides an API to set the
     * path to the component.
     * @param pathToComponent Path to component directory.
     * @throws MWException An error has occurred during the function call.
     */
    public LicensePlateLocation(String pathToComponent) throws MWException
    {
        this(LicensePlateLocationMCRFactory.newInstance(getPathToComponentOptions(pathToComponent)));
    }
    
    /**
     * Constructs a new instance of the <code>LicensePlateLocation</code> class. Use this 
     * constructor to specify the options required to instantiate this component.  The 
     * options will be specific to the instance of this component being created.
     * @param componentOptions Options specific to the component.
     * @throws MWException An error has occurred during the function call.
     */
    public LicensePlateLocation(MWComponentOptions componentOptions) throws MWException
    {
        this(LicensePlateLocationMCRFactory.newInstance(componentOptions));
    }
    
    /** Frees native resources associated with this object */
    public void dispose()
    {
        try {
            super.dispose();
        } finally {
            synchronized(LicensePlateLocation.class) {
                sInstances.remove(this);
            }
        }
    }
  
    /**
     * Invokes the first MATLAB function specified to MCC, with any arguments given on
     * the command line, and prints the result.
     *
     * @param args arguments to the function
     */
    public static void main (String[] args)
    {
        try {
            MWMCR mcr = LicensePlateLocationMCRFactory.newInstance();
            mcr.runMain( sLicense_plate_locationSignature, args);
            mcr.dispose();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    /**
     * Calls dispose method for each outstanding instance of this class.
     */
    public static void disposeAllInstances()
    {
        synchronized(LicensePlateLocation.class) {
            for (Disposable i : sInstances) i.dispose();
            sInstances.clear();
        }
    }

    /**
     * Provides the interface for calling the <code>license_plate_location</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %
     *     % description.
     *     %
     *     % @since 1.0.0
     *     % @param {string} [detect_folder] 待检测图像所在文件夹.
     *     % @return {int} [status_code] 检测执行状态.
     *     % @see dependencies
     *     %
     * </pre>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void license_plate_location(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sLicense_plate_locationSignature);
    }

    /**
     * Provides the interface for calling the <code>license_plate_location</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %
     *     % description.
     *     %
     *     % @since 1.0.0
     *     % @param {string} [detect_folder] 待检测图像所在文件夹.
     *     % @return {int} [status_code] 检测执行状态.
     *     % @see dependencies
     *     %
     * </pre>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void license_plate_location(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sLicense_plate_locationSignature);
    }

    /**
     * Provides the standard interface for calling the <code>license_plate_location</code> MATLAB function with 
     * 3 comma-separated input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %
     *     % description.
     *     %
     *     % @since 1.0.0
     *     % @param {string} [detect_folder] 待检测图像所在文件夹.
     *     % @return {int} [status_code] 检测执行状态.
     *     % @see dependencies
     *     %
     * </pre>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] license_plate_location(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sLicense_plate_locationSignature), 
                    sLicense_plate_locationSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>plate_location_kelnel</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * % 读取图像
     * </pre>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void plate_location_kelnel(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sPlate_location_kelnelSignature);
    }

    /**
     * Provides the interface for calling the <code>plate_location_kelnel</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * % 读取图像
     * </pre>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void plate_location_kelnel(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sPlate_location_kelnelSignature);
    }

    /**
     * Provides the standard interface for calling the <code>plate_location_kelnel</code> MATLAB function with 
     * 1 input argument.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * % 读取图像
     * </pre>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] plate_location_kelnel(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sPlate_location_kelnelSignature), 
                    sPlate_location_kelnelSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>minboundrect</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * % minboundrect: Compute the minimal bounding rectangle of points in the plane
     *     % usage: [rectx,recty,area,perimeter] = minboundrect(x,y,metric)
     *     %
     *     % arguments: (input)
     *     %  x,y - vectors of points, describing points in the plane as
     *     %        (x,y) pairs. x and y must be the same lengths.
     *     %
     *     %  metric - (OPTIONAL) - single letter character flag which
     *     %        denotes the use of minimal area or perimeter as the
     *     %        metric to be minimized. metric may be either 'a' or 'p',
     *     %        capitalization is ignored. Any other contraction of 'area'
     *     %        or 'perimeter' is also accepted.
     *     %
     *     %        DEFAULT: 'a'    ('area')
     *     %
     *     % arguments: (output)
     *     %  rectx,recty - 5x1 vectors of points that define the minimal
     *     %        bounding rectangle.
     *     %
     *     %  area - (scalar) area of the minimal rect itself.
     *     %
     *     %  perimeter - (scalar) perimeter of the minimal rect as found
     *     %
     *     %
     *     % Note: For those individuals who would prefer the rect with minimum
     *     % perimeter or area, careful testing convinces me that the minimum area
     *     % rect was generally also the minimum perimeter rect on most problems
     *     % (with one class of exceptions). This same testing appeared to verify my
     *     % assumption that the minimum area rect must always contain at least
     *     % one edge of the convex hull. The exception I refer to above is for
     *     % problems when the convex hull is composed of only a few points,
     *     % most likely exactly 3. Here one may see differences between the
     *     % two metrics. My thanks to Roger Stafford for pointing out this
     *     % class of counter-examples.
     *     %
     *     % Thanks are also due to Roger for pointing out a proof that the
     *     % bounding rect must always contain an edge of the convex hull, in
     *     % both the minimal perimeter and area cases.
     *     %
     *     %
     *     % Example usage:
     *     %  x = rand(50000,1);
     *     %  y = rand(50000,1);
     *     %  tic,[rx,ry,area] = minboundrect(x,y);toc;
     *     %
     *     %  Elapsed time is 0.105754 seconds.
     *     %
     *     %  [rx,ry]
     *     %  ans =
     *     %      0.99994  -4.2515e-06
     *     %      0.99998      0.99999
     *     %   2.6441e-05            1
     *     %  -5.1673e-06   2.7356e-05
     *     %      0.99994  -4.2515e-06
     *     %
     *     %  area
     *     %  area =
     *     %      0.99994
     *     %
     *     %
     *     % See also: minboundcircle, minboundtri, minboundsphere
     *     %
     *     %
     *     % Author: John D'Errico
     *     % E-mail: woodchips@rochester.rr.com
     *     % Release: 3.0
     *     % Release date: 3/7/07
     * </pre>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void minboundrect(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sMinboundrectSignature);
    }

    /**
     * Provides the interface for calling the <code>minboundrect</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * % minboundrect: Compute the minimal bounding rectangle of points in the plane
     *     % usage: [rectx,recty,area,perimeter] = minboundrect(x,y,metric)
     *     %
     *     % arguments: (input)
     *     %  x,y - vectors of points, describing points in the plane as
     *     %        (x,y) pairs. x and y must be the same lengths.
     *     %
     *     %  metric - (OPTIONAL) - single letter character flag which
     *     %        denotes the use of minimal area or perimeter as the
     *     %        metric to be minimized. metric may be either 'a' or 'p',
     *     %        capitalization is ignored. Any other contraction of 'area'
     *     %        or 'perimeter' is also accepted.
     *     %
     *     %        DEFAULT: 'a'    ('area')
     *     %
     *     % arguments: (output)
     *     %  rectx,recty - 5x1 vectors of points that define the minimal
     *     %        bounding rectangle.
     *     %
     *     %  area - (scalar) area of the minimal rect itself.
     *     %
     *     %  perimeter - (scalar) perimeter of the minimal rect as found
     *     %
     *     %
     *     % Note: For those individuals who would prefer the rect with minimum
     *     % perimeter or area, careful testing convinces me that the minimum area
     *     % rect was generally also the minimum perimeter rect on most problems
     *     % (with one class of exceptions). This same testing appeared to verify my
     *     % assumption that the minimum area rect must always contain at least
     *     % one edge of the convex hull. The exception I refer to above is for
     *     % problems when the convex hull is composed of only a few points,
     *     % most likely exactly 3. Here one may see differences between the
     *     % two metrics. My thanks to Roger Stafford for pointing out this
     *     % class of counter-examples.
     *     %
     *     % Thanks are also due to Roger for pointing out a proof that the
     *     % bounding rect must always contain an edge of the convex hull, in
     *     % both the minimal perimeter and area cases.
     *     %
     *     %
     *     % Example usage:
     *     %  x = rand(50000,1);
     *     %  y = rand(50000,1);
     *     %  tic,[rx,ry,area] = minboundrect(x,y);toc;
     *     %
     *     %  Elapsed time is 0.105754 seconds.
     *     %
     *     %  [rx,ry]
     *     %  ans =
     *     %      0.99994  -4.2515e-06
     *     %      0.99998      0.99999
     *     %   2.6441e-05            1
     *     %  -5.1673e-06   2.7356e-05
     *     %      0.99994  -4.2515e-06
     *     %
     *     %  area
     *     %  area =
     *     %      0.99994
     *     %
     *     %
     *     % See also: minboundcircle, minboundtri, minboundsphere
     *     %
     *     %
     *     % Author: John D'Errico
     *     % E-mail: woodchips@rochester.rr.com
     *     % Release: 3.0
     *     % Release date: 3/7/07
     * </pre>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void minboundrect(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sMinboundrectSignature);
    }

    /**
     * Provides the standard interface for calling the <code>minboundrect</code> MATLAB function with 
     * 3 comma-separated input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * % minboundrect: Compute the minimal bounding rectangle of points in the plane
     *     % usage: [rectx,recty,area,perimeter] = minboundrect(x,y,metric)
     *     %
     *     % arguments: (input)
     *     %  x,y - vectors of points, describing points in the plane as
     *     %        (x,y) pairs. x and y must be the same lengths.
     *     %
     *     %  metric - (OPTIONAL) - single letter character flag which
     *     %        denotes the use of minimal area or perimeter as the
     *     %        metric to be minimized. metric may be either 'a' or 'p',
     *     %        capitalization is ignored. Any other contraction of 'area'
     *     %        or 'perimeter' is also accepted.
     *     %
     *     %        DEFAULT: 'a'    ('area')
     *     %
     *     % arguments: (output)
     *     %  rectx,recty - 5x1 vectors of points that define the minimal
     *     %        bounding rectangle.
     *     %
     *     %  area - (scalar) area of the minimal rect itself.
     *     %
     *     %  perimeter - (scalar) perimeter of the minimal rect as found
     *     %
     *     %
     *     % Note: For those individuals who would prefer the rect with minimum
     *     % perimeter or area, careful testing convinces me that the minimum area
     *     % rect was generally also the minimum perimeter rect on most problems
     *     % (with one class of exceptions). This same testing appeared to verify my
     *     % assumption that the minimum area rect must always contain at least
     *     % one edge of the convex hull. The exception I refer to above is for
     *     % problems when the convex hull is composed of only a few points,
     *     % most likely exactly 3. Here one may see differences between the
     *     % two metrics. My thanks to Roger Stafford for pointing out this
     *     % class of counter-examples.
     *     %
     *     % Thanks are also due to Roger for pointing out a proof that the
     *     % bounding rect must always contain an edge of the convex hull, in
     *     % both the minimal perimeter and area cases.
     *     %
     *     %
     *     % Example usage:
     *     %  x = rand(50000,1);
     *     %  y = rand(50000,1);
     *     %  tic,[rx,ry,area] = minboundrect(x,y);toc;
     *     %
     *     %  Elapsed time is 0.105754 seconds.
     *     %
     *     %  [rx,ry]
     *     %  ans =
     *     %      0.99994  -4.2515e-06
     *     %      0.99998      0.99999
     *     %   2.6441e-05            1
     *     %  -5.1673e-06   2.7356e-05
     *     %      0.99994  -4.2515e-06
     *     %
     *     %  area
     *     %  area =
     *     %      0.99994
     *     %
     *     %
     *     % See also: minboundcircle, minboundtri, minboundsphere
     *     %
     *     %
     *     % Author: John D'Errico
     *     % E-mail: woodchips@rochester.rr.com
     *     % Release: 3.0
     *     % Release date: 3/7/07
     * </pre>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] minboundrect(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sMinboundrectSignature), 
                    sMinboundrectSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>rgb2hsi</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %RGB2HSI Converts an RGB image to HSI.
     *     %   HSI = RGB2HSI(RGB) converts an RGB image to HSI. The input image
     *     %   is assumed to be of size M-by-N-by-3, where the third dimension
     *     %   accounts for three image planes: red, green, and blue, in that
     *     %   order. If all RGB component images are equal, the HSI conversion
     *     %   is undefined. The input image can be of class double (with values
     *     %   in the range [0, 1]), uint8, or uint16.
     *     %
     *     %   The output image, HSI, is of class double, where:
     *     %     hsi(:, :, 1) = hue image normalized to the range [0, 1] by
     *     %                    dividing all angle values by 2*pi.
     *     %     hsi(:, :, 2) = saturation image, in the range [0, 1].
     *     %     hsi(:, :, 3) = intensity image, in the range [0, 1].
     * </pre>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void rgb2hsi(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sRgb2hsiSignature);
    }

    /**
     * Provides the interface for calling the <code>rgb2hsi</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %RGB2HSI Converts an RGB image to HSI.
     *     %   HSI = RGB2HSI(RGB) converts an RGB image to HSI. The input image
     *     %   is assumed to be of size M-by-N-by-3, where the third dimension
     *     %   accounts for three image planes: red, green, and blue, in that
     *     %   order. If all RGB component images are equal, the HSI conversion
     *     %   is undefined. The input image can be of class double (with values
     *     %   in the range [0, 1]), uint8, or uint16.
     *     %
     *     %   The output image, HSI, is of class double, where:
     *     %     hsi(:, :, 1) = hue image normalized to the range [0, 1] by
     *     %                    dividing all angle values by 2*pi.
     *     %     hsi(:, :, 2) = saturation image, in the range [0, 1].
     *     %     hsi(:, :, 3) = intensity image, in the range [0, 1].
     * </pre>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void rgb2hsi(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sRgb2hsiSignature);
    }

    /**
     * Provides the standard interface for calling the <code>rgb2hsi</code> MATLAB function with 
     * 1 input argument.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %RGB2HSI Converts an RGB image to HSI.
     *     %   HSI = RGB2HSI(RGB) converts an RGB image to HSI. The input image
     *     %   is assumed to be of size M-by-N-by-3, where the third dimension
     *     %   accounts for three image planes: red, green, and blue, in that
     *     %   order. If all RGB component images are equal, the HSI conversion
     *     %   is undefined. The input image can be of class double (with values
     *     %   in the range [0, 1]), uint8, or uint16.
     *     %
     *     %   The output image, HSI, is of class double, where:
     *     %     hsi(:, :, 1) = hue image normalized to the range [0, 1] by
     *     %                    dividing all angle values by 2*pi.
     *     %     hsi(:, :, 2) = saturation image, in the range [0, 1].
     *     %     hsi(:, :, 3) = intensity image, in the range [0, 1].
     * </pre>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] rgb2hsi(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sRgb2hsiSignature), 
                    sRgb2hsiSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>rectify</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * % 将原始图像转换为灰度图像
     * </pre>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void rectify(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sRectifySignature);
    }

    /**
     * Provides the interface for calling the <code>rectify</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * % 将原始图像转换为灰度图像
     * </pre>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void rectify(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sRectifySignature);
    }

    /**
     * Provides the standard interface for calling the <code>rectify</code> MATLAB function with 
     * 1 input argument.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * % 将原始图像转换为灰度图像
     * </pre>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] rectify(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sRectifySignature), 
                    sRectifySignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>detection_color</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * % 检测蓝色或者黄色
     * </pre>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void detection_color(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sDetection_colorSignature);
    }

    /**
     * Provides the interface for calling the <code>detection_color</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * % 检测蓝色或者黄色
     * </pre>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void detection_color(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sDetection_colorSignature);
    }

    /**
     * Provides the standard interface for calling the <code>detection_color</code> MATLAB function with 
     * 1 input argument.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * % 检测蓝色或者黄色
     * </pre>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] detection_color(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sDetection_colorSignature), 
                    sDetection_colorSignature);
        return lhs;
    }
}
