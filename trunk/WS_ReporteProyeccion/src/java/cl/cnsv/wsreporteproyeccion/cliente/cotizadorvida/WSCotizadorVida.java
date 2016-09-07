
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "WSCotizadorVida", targetNamespace = "http://cnsv.cl/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSCotizadorVida {


    /**
     * 
     * @param entradaPrueba
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "test", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.Test")
    @ResponseWrapper(localName = "testResponse", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.TestResponse")
    public String test(
        @WebParam(name = "entradaPrueba", targetNamespace = "")
        String entradaPrueba);

    /**
     * 
     * @param entrada
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputCondicionadoVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNombreCondicionado", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetNombreCondicionado")
    @ResponseWrapper(localName = "getNombreCondicionadoResponse", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetNombreCondicionadoResponse")
    public OutputCondicionadoVO getNombreCondicionado(
        @WebParam(name = "entrada", targetNamespace = "")
        InputCondicionadoVO entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputPromRentFondoVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRentabilidadPromedioPorFondo", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetRentabilidadPromedioPorFondo")
    @ResponseWrapper(localName = "getRentabilidadPromedioPorFondoResponse", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetRentabilidadPromedioPorFondoResponse")
    public OutputPromRentFondoVO getRentabilidadPromedioPorFondo(
        @WebParam(name = "entrada", targetNamespace = "")
        InputPromRentFondoVO entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputCostoCoberturaAdicionalVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCostoCoberturaAdicional", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetCostoCoberturaAdicional")
    @ResponseWrapper(localName = "getCostoCoberturaAdicionalResponse", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetCostoCoberturaAdicionalResponse")
    public OutputCostoCoberturaAdicionalVO getCostoCoberturaAdicional(
        @WebParam(name = "entrada", targetNamespace = "")
        InputCostoCoberturaAdicionalVO entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputCostoCoberturaPrincipalVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCostoCoberturaPrincipal", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetCostoCoberturaPrincipal")
    @ResponseWrapper(localName = "getCostoCoberturaPrincipalResponse", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetCostoCoberturaPrincipalResponse")
    public OutputCostoCoberturaPrincipalVO getCostoCoberturaPrincipal(
        @WebParam(name = "entrada", targetNamespace = "")
        InputCostoCoberturaPrincipalVO entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputMontosInyeccionVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMontosInyeccion", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetMontosInyeccion")
    @ResponseWrapper(localName = "getMontosInyeccionResponse", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetMontosInyeccionResponse")
    public OutputMontosInyeccionVO getMontosInyeccion(
        @WebParam(name = "entrada", targetNamespace = "")
        InputMontosInyeccionVO entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputLimitesCapitalVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLimitesCapital", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetLimitesCapital")
    @ResponseWrapper(localName = "getLimitesCapitalResponse", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetLimitesCapitalResponse")
    public OutputLimitesCapitalVO getLimitesCapital(
        @WebParam(name = "entrada", targetNamespace = "")
        InputLimitesCapitalVO entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputProyeccionesVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProyeccionesVO", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesVO")
    @ResponseWrapper(localName = "getProyeccionesVOResponse", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesVOResponse")
    public OutputProyeccionesVO getProyeccionesVO(
        @WebParam(name = "entrada", targetNamespace = "")
        InputProyeccionesVO entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionFlexInvGlodVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProyeccionesFlexInvGlodVO", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesFlexInvGlodVO")
    @ResponseWrapper(localName = "getProyeccionesFlexInvGlodVOResponse", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesFlexInvGlodVOResponse")
    public OutputWSProyeccionFlexInvGlodVO getProyeccionesFlexInvGlodVO(
        @WebParam(name = "entrada", targetNamespace = "")
        InputProyeccionesVO entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionVidAhorro100
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProyeccionesVidAhorro100VO", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesVidAhorro100VO")
    @ResponseWrapper(localName = "getProyeccionesVidAhorro100VOResponse", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesVidAhorro100VOResponse")
    public OutputWSProyeccionVidAhorro100 getProyeccionesVidAhorro100VO(
        @WebParam(name = "entrada", targetNamespace = "")
        InputProyeccionesVO entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionVidAhorro57Bis
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProyeccionesVidAhorro57BisVO", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesVidAhorro57BisVO")
    @ResponseWrapper(localName = "getProyeccionesVidAhorro57BisVOResponse", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesVidAhorro57BisVOResponse")
    public OutputWSProyeccionVidAhorro57Bis getProyeccionesVidAhorro57BisVO(
        @WebParam(name = "entrada", targetNamespace = "")
        InputProyeccionesVO entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionVidAhorroFlex
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProyeccionesVidAhorroFlexVO", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesVidAhorroFlexVO")
    @ResponseWrapper(localName = "getProyeccionesVidAhorroFlexVOResponse", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesVidAhorroFlexVOResponse")
    public OutputWSProyeccionVidAhorroFlex getProyeccionesVidAhorroFlexVO(
        @WebParam(name = "entrada", targetNamespace = "")
        InputProyeccionesVO entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputTipoProyeccionVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTipoProyeccionVO", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetTipoProyeccionVO")
    @ResponseWrapper(localName = "getTipoProyeccionVOResponse", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetTipoProyeccionVOResponse")
    public OutputTipoProyeccionVO getTipoProyeccionVO(
        @WebParam(name = "entrada", targetNamespace = "")
        InputProyeccionesVO entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputCotizacionInternet
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCotizacionInternet", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetCotizacionInternet")
    @ResponseWrapper(localName = "getCotizacionInternetResponse", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetCotizacionInternetResponse")
    public OutputCotizacionInternet getCotizacionInternet(
        @WebParam(name = "entrada", targetNamespace = "")
        InputCotizacionInternet entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputEmailCotizacionInternetVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDatosEmailCotizacionInternet", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetDatosEmailCotizacionInternet")
    @ResponseWrapper(localName = "getDatosEmailCotizacionInternetResponse", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetDatosEmailCotizacionInternetResponse")
    public OutputEmailCotizacionInternetVO getDatosEmailCotizacionInternet(
        @WebParam(name = "entrada", targetNamespace = "")
        InputCotizacionInternet entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputRentabilidadPromVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRentabilidadPromedio", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetRentabilidadPromedio")
    @ResponseWrapper(localName = "getRentabilidadPromedioResponse", targetNamespace = "http://cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetRentabilidadPromedioResponse")
    public OutputRentabilidadPromVO getRentabilidadPromedio(
        @WebParam(name = "entrada", targetNamespace = "")
        InputRentabilidadPromVO entrada);

}
