
package cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
<<<<<<< HEAD
=======
import javax.xml.ws.Action;
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
<<<<<<< HEAD
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
=======
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
 * 
 */
@WebService(name = "WSCotizadorVida", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/")
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
<<<<<<< HEAD
    @RequestWrapper(localName = "test", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.Test")
    @ResponseWrapper(localName = "testResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.TestResponse")
=======
    @RequestWrapper(localName = "test", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.Test")
    @ResponseWrapper(localName = "testResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.TestResponse")
    @Action(input = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/testRequest", output = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/testResponse")
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
    public String test(
        @WebParam(name = "entradaPrueba", targetNamespace = "")
        String entradaPrueba);

    /**
     * 
     * @param entrada
     * @return
<<<<<<< HEAD
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputCondicionadoVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNombreCondicionado", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetNombreCondicionado")
    @ResponseWrapper(localName = "getNombreCondicionadoResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetNombreCondicionadoResponse")
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
    @RequestWrapper(localName = "getRentabilidadPromedioPorFondo", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetRentabilidadPromedioPorFondo")
    @ResponseWrapper(localName = "getRentabilidadPromedioPorFondoResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetRentabilidadPromedioPorFondoResponse")
    public OutputPromRentFondoVO getRentabilidadPromedioPorFondo(
        @WebParam(name = "entrada", targetNamespace = "")
        InputPromRentFondoVO entrada);
=======
     *     returns cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.OutputWSProyeccionFlexInvGlodVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProyeccionesFlexInvGlodVO", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetProyeccionesFlexInvGlodVO")
    @ResponseWrapper(localName = "getProyeccionesFlexInvGlodVOResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetProyeccionesFlexInvGlodVOResponse")
    @Action(input = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getProyeccionesFlexInvGlodVORequest", output = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getProyeccionesFlexInvGlodVOResponse")
    public OutputWSProyeccionFlexInvGlodVO getProyeccionesFlexInvGlodVO(
        @WebParam(name = "entrada", targetNamespace = "")
        InputProyeccionesVO entrada);
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

    /**
     * 
     * @param entrada
     * @return
<<<<<<< HEAD
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputRentabilidadPromVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRentabilidadPromedio", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetRentabilidadPromedio")
    @ResponseWrapper(localName = "getRentabilidadPromedioResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetRentabilidadPromedioResponse")
    public OutputRentabilidadPromVO getRentabilidadPromedio(
        @WebParam(name = "entrada", targetNamespace = "")
        InputRentabilidadPromVO entrada);
=======
     *     returns cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.OutputWSProyeccionVidAhorro100
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProyeccionesVidAhorro100VO", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetProyeccionesVidAhorro100VO")
    @ResponseWrapper(localName = "getProyeccionesVidAhorro100VOResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetProyeccionesVidAhorro100VOResponse")
    @Action(input = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getProyeccionesVidAhorro100VORequest", output = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getProyeccionesVidAhorro100VOResponse")
    public OutputWSProyeccionVidAhorro100 getProyeccionesVidAhorro100VO(
        @WebParam(name = "entrada", targetNamespace = "")
        InputProyeccionesVO entrada);
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

    /**
     * 
     * @param entrada
     * @return
<<<<<<< HEAD
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputCostoCoberturaAdicionalVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCostoCoberturaAdicional", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetCostoCoberturaAdicional")
    @ResponseWrapper(localName = "getCostoCoberturaAdicionalResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetCostoCoberturaAdicionalResponse")
    public OutputCostoCoberturaAdicionalVO getCostoCoberturaAdicional(
        @WebParam(name = "entrada", targetNamespace = "")
        InputCostoCoberturaAdicionalVO entrada);
=======
     *     returns cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.OutputWSProyeccionVidAhorro57Bis
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProyeccionesVidAhorro57BisVO", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetProyeccionesVidAhorro57BisVO")
    @ResponseWrapper(localName = "getProyeccionesVidAhorro57BisVOResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetProyeccionesVidAhorro57BisVOResponse")
    @Action(input = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getProyeccionesVidAhorro57BisVORequest", output = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getProyeccionesVidAhorro57BisVOResponse")
    public OutputWSProyeccionVidAhorro57Bis getProyeccionesVidAhorro57BisVO(
        @WebParam(name = "entrada", targetNamespace = "")
        InputProyeccionesVO entrada);
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

    /**
     * 
     * @param entrada
     * @return
<<<<<<< HEAD
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputCostoCoberturaPrincipalVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCostoCoberturaPrincipal", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetCostoCoberturaPrincipal")
    @ResponseWrapper(localName = "getCostoCoberturaPrincipalResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetCostoCoberturaPrincipalResponse")
    public OutputCostoCoberturaPrincipalVO getCostoCoberturaPrincipal(
        @WebParam(name = "entrada", targetNamespace = "")
        InputCostoCoberturaPrincipalVO entrada);
=======
     *     returns cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.OutputWSProyeccionVidAhorroFlex
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProyeccionesVidAhorroFlexVO", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetProyeccionesVidAhorroFlexVO")
    @ResponseWrapper(localName = "getProyeccionesVidAhorroFlexVOResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetProyeccionesVidAhorroFlexVOResponse")
    @Action(input = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getProyeccionesVidAhorroFlexVORequest", output = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getProyeccionesVidAhorroFlexVOResponse")
    public OutputWSProyeccionVidAhorroFlex getProyeccionesVidAhorroFlexVO(
        @WebParam(name = "entrada", targetNamespace = "")
        InputProyeccionesVO entrada);
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

    /**
     * 
     * @param entrada
     * @return
<<<<<<< HEAD
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputMontosInyeccionVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMontosInyeccion", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetMontosInyeccion")
    @ResponseWrapper(localName = "getMontosInyeccionResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetMontosInyeccionResponse")
    public OutputMontosInyeccionVO getMontosInyeccion(
        @WebParam(name = "entrada", targetNamespace = "")
        InputMontosInyeccionVO entrada);
=======
     *     returns cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.OutputProyeccionesVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProyeccionesVO", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetProyeccionesVO")
    @ResponseWrapper(localName = "getProyeccionesVOResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetProyeccionesVOResponse")
    @Action(input = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getProyeccionesVORequest", output = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getProyeccionesVOResponse")
    public OutputProyeccionesVO getProyeccionesVO(
        @WebParam(name = "entrada", targetNamespace = "")
        InputProyeccionesVO entrada);
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

    /**
     * 
     * @param entrada
     * @return
<<<<<<< HEAD
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputLimitesCapitalVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLimitesCapital", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetLimitesCapital")
    @ResponseWrapper(localName = "getLimitesCapitalResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetLimitesCapitalResponse")
    public OutputLimitesCapitalVO getLimitesCapital(
        @WebParam(name = "entrada", targetNamespace = "")
        InputLimitesCapitalVO entrada);
=======
     *     returns cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.OutputCondicionadoVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNombreCondicionado", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetNombreCondicionado")
    @ResponseWrapper(localName = "getNombreCondicionadoResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetNombreCondicionadoResponse")
    @Action(input = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getNombreCondicionadoRequest", output = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getNombreCondicionadoResponse")
    public OutputCondicionadoVO getNombreCondicionado(
        @WebParam(name = "entrada", targetNamespace = "")
        InputCondicionadoVO entrada);
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

    /**
     * 
     * @param entrada
     * @return
<<<<<<< HEAD
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputProyeccionesVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProyeccionesVO", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesVO")
    @ResponseWrapper(localName = "getProyeccionesVOResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesVOResponse")
    public OutputProyeccionesVO getProyeccionesVO(
        @WebParam(name = "entrada", targetNamespace = "")
        InputProyeccionesVO entrada);
=======
     *     returns cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.OutputPromRentFondoVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRentabilidadPromedioPorFondo", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetRentabilidadPromedioPorFondo")
    @ResponseWrapper(localName = "getRentabilidadPromedioPorFondoResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetRentabilidadPromedioPorFondoResponse")
    @Action(input = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getRentabilidadPromedioPorFondoRequest", output = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getRentabilidadPromedioPorFondoResponse")
    public OutputPromRentFondoVO getRentabilidadPromedioPorFondo(
        @WebParam(name = "entrada", targetNamespace = "")
        InputPromRentFondoVO entrada);
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

    /**
     * 
     * @param entrada
     * @return
<<<<<<< HEAD
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionFlexInvGlodVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProyeccionesFlexInvGlodVO", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesFlexInvGlodVO")
    @ResponseWrapper(localName = "getProyeccionesFlexInvGlodVOResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesFlexInvGlodVOResponse")
    public OutputWSProyeccionFlexInvGlodVO getProyeccionesFlexInvGlodVO(
        @WebParam(name = "entrada", targetNamespace = "")
        InputProyeccionesVO entrada);
=======
     *     returns cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.OutputRentabilidadPromVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRentabilidadPromedio", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetRentabilidadPromedio")
    @ResponseWrapper(localName = "getRentabilidadPromedioResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetRentabilidadPromedioResponse")
    @Action(input = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getRentabilidadPromedioRequest", output = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getRentabilidadPromedioResponse")
    public OutputRentabilidadPromVO getRentabilidadPromedio(
        @WebParam(name = "entrada", targetNamespace = "")
        InputRentabilidadPromVO entrada);
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

    /**
     * 
     * @param entrada
     * @return
<<<<<<< HEAD
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionVidAhorro100
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProyeccionesVidAhorro100VO", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesVidAhorro100VO")
    @ResponseWrapper(localName = "getProyeccionesVidAhorro100VOResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesVidAhorro100VOResponse")
    public OutputWSProyeccionVidAhorro100 getProyeccionesVidAhorro100VO(
        @WebParam(name = "entrada", targetNamespace = "")
        InputProyeccionesVO entrada);
=======
     *     returns cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.OutputCostoCoberturaAdicionalVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCostoCoberturaAdicional", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetCostoCoberturaAdicional")
    @ResponseWrapper(localName = "getCostoCoberturaAdicionalResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetCostoCoberturaAdicionalResponse")
    @Action(input = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getCostoCoberturaAdicionalRequest", output = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getCostoCoberturaAdicionalResponse")
    public OutputCostoCoberturaAdicionalVO getCostoCoberturaAdicional(
        @WebParam(name = "entrada", targetNamespace = "")
        InputCostoCoberturaAdicionalVO entrada);
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

    /**
     * 
     * @param entrada
     * @return
<<<<<<< HEAD
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionVidAhorro57Bis
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProyeccionesVidAhorro57BisVO", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesVidAhorro57BisVO")
    @ResponseWrapper(localName = "getProyeccionesVidAhorro57BisVOResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesVidAhorro57BisVOResponse")
    public OutputWSProyeccionVidAhorro57Bis getProyeccionesVidAhorro57BisVO(
        @WebParam(name = "entrada", targetNamespace = "")
        InputProyeccionesVO entrada);
=======
     *     returns cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.OutputCostoCoberturaPrincipalVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCostoCoberturaPrincipal", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetCostoCoberturaPrincipal")
    @ResponseWrapper(localName = "getCostoCoberturaPrincipalResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetCostoCoberturaPrincipalResponse")
    @Action(input = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getCostoCoberturaPrincipalRequest", output = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getCostoCoberturaPrincipalResponse")
    public OutputCostoCoberturaPrincipalVO getCostoCoberturaPrincipal(
        @WebParam(name = "entrada", targetNamespace = "")
        InputCostoCoberturaPrincipalVO entrada);
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

    /**
     * 
     * @param entrada
     * @return
<<<<<<< HEAD
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionVidAhorroFlex
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProyeccionesVidAhorroFlexVO", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesVidAhorroFlexVO")
    @ResponseWrapper(localName = "getProyeccionesVidAhorroFlexVOResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetProyeccionesVidAhorroFlexVOResponse")
    public OutputWSProyeccionVidAhorroFlex getProyeccionesVidAhorroFlexVO(
        @WebParam(name = "entrada", targetNamespace = "")
        InputProyeccionesVO entrada);
=======
     *     returns cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.OutputMontosInyeccionVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMontosInyeccion", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetMontosInyeccion")
    @ResponseWrapper(localName = "getMontosInyeccionResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetMontosInyeccionResponse")
    @Action(input = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getMontosInyeccionRequest", output = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getMontosInyeccionResponse")
    public OutputMontosInyeccionVO getMontosInyeccion(
        @WebParam(name = "entrada", targetNamespace = "")
        InputMontosInyeccionVO entrada);
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

    /**
     * 
     * @param entrada
     * @return
<<<<<<< HEAD
     *     returns cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputTipoProyeccionVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTipoProyeccionVO", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetTipoProyeccionVO")
    @ResponseWrapper(localName = "getTipoProyeccionVOResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.GetTipoProyeccionVOResponse")
    public OutputTipoProyeccionVO getTipoProyeccionVO(
        @WebParam(name = "entrada", targetNamespace = "")
        InputProyeccionesVO entrada);
=======
     *     returns cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.OutputLimitesCapitalVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLimitesCapital", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetLimitesCapital")
    @ResponseWrapper(localName = "getLimitesCapitalResponse", targetNamespace = "http://ws.wscotizadorvida.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.cotizadorvida.GetLimitesCapitalResponse")
    @Action(input = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getLimitesCapitalRequest", output = "http://ws.wscotizadorvida.cnsv.cl/WSCotizadorVida/getLimitesCapitalResponse")
    public OutputLimitesCapitalVO getLimitesCapital(
        @WebParam(name = "entrada", targetNamespace = "")
        InputLimitesCapitalVO entrada);
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

}
