/*
 * MATLAB Compiler: 7.0 (R2018b)
 * Date: Wed Nov 24 17:24:47 2021
 * Arguments: 
 * "-B""macro_default""-W""java:LicensePlateLocation,LicensePlateLocation""license_plate_location.m""plate_location_kelnel.m""minboundrect.m""rgb2hsi.m""rectify.m""detection_color.m""-d""LicensePlateLocation_Java"
 */

package LicensePlateLocation;

import com.mathworks.toolbox.javabuilder.pooling.Poolable;
import java.util.List;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * The <code>LicensePlateLocationRemote</code> class provides a Java RMI-compliant 
 * interface to MATLAB functions. The interface is compiled from the following files:
 * <pre>
 *  license_plate_location.m
 *  plate_location_kelnel.m
 *  minboundrect.m
 *  rgb2hsi.m
 *  rectify.m
 *  detection_color.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a 
 * <code>LicensePlateLocationRemote</code> instance when it is no longer needed to ensure 
 * that native resources allocated by this class are properly freed, and the server-side 
 * proxy is unexported.  (Failure to call dispose may result in server-side threads not 
 * being properly shut down, which often appears as a hang.)  
 *
 * This interface is designed to be used together with 
 * <code>com.mathworks.toolbox.javabuilder.remoting.RemoteProxy</code> to automatically 
 * generate RMI server proxy objects for instances of 
 * LicensePlateLocation.LicensePlateLocation.
 */
public interface LicensePlateLocationRemote extends Poolable
{
    /**
     * Provides the standard interface for calling the 
     * <code>license_plate_location</code> MATLAB function with 3 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * Documentation as provided by the author of the MATLAB function:
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
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.rmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] license_plate_location(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>plate_location_kelnel</code> 
     * MATLAB function with 1 input argument.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * Documentation as provided by the author of the MATLAB function:
     * <pre>
     * % 读取图像
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.rmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] plate_location_kelnel(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>minboundrect</code> MATLAB 
     * function with 3 input arguments.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * Documentation as provided by the author of the MATLAB function:
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
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.rmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] minboundrect(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>rgb2hsi</code> MATLAB 
     * function with 1 input argument.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * Documentation as provided by the author of the MATLAB function:
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
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.rmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] rgb2hsi(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>rectify</code> MATLAB 
     * function with 1 input argument.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * Documentation as provided by the author of the MATLAB function:
     * <pre>
     * % 将原始图像转换为灰度图像
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.rmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] rectify(int nargout, Object... rhs) throws RemoteException;
    /**
     * Provides the standard interface for calling the <code>detection_color</code> 
     * MATLAB function with 1 input argument.  
     *
     * Input arguments to standard interface methods may be passed as sub-classes of 
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of any 
     * supported Java type (i.e. scalars and multidimensional arrays of any numeric, 
     * boolean, or character type, or String). Arguments passed as Java types are 
     * converted to MATLAB arrays according to default conversion rules.
     *
     * All inputs to this method must implement either Serializable (pass-by-value) or 
     * Remote (pass-by-reference) as per the RMI specification.
     *
     * Documentation as provided by the author of the MATLAB function:
     * <pre>
     * % 检测蓝色或者黄色
     * </pre>
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     *
     * @return Array of length nargout containing the function outputs. Outputs are 
     * returned as sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>. 
     * Each output array should be freed by calling its <code>dispose()</code> method.
     *
     * @throws java.rmi.RemoteException An error has occurred during the function call or 
     * in communication with the server.
     */
    public Object[] detection_color(int nargout, Object... rhs) throws RemoteException;
  
    /** 
     * Frees native resources associated with the remote server object 
     * @throws java.rmi.RemoteException An error has occurred during the function call or in communication with the server.
     */
    void dispose() throws RemoteException;
}
