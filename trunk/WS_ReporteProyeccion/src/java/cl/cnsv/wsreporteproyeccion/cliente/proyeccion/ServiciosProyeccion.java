
package cl.cnsv.wsreporteproyeccion.cliente.proyeccion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiciosProyeccion", targetNamespace = "http://ws.proyeccion.cnsv.cl/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiciosProyeccion {


    /**
     * 
     * @param transaccion
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.servicio.proyeccion.RespuestaVidAhorro100
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerProyeccionVidAhorro100", targetNamespace = "http://ws.proyeccion.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.proyeccion.ObtenerProyeccionVidAhorro100")
    @ResponseWrapper(localName = "obtenerProyeccionVidAhorro100Response", targetNamespace = "http://ws.proyeccion.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.proyeccion.ObtenerProyeccionVidAhorro100Response")
    @Action(input = "http://ws.proyeccion.cnsv.cl/ServiciosProyeccion/obtenerProyeccionVidAhorro100Request", output = "http://ws.proyeccion.cnsv.cl/ServiciosProyeccion/obtenerProyeccionVidAhorro100Response")
    public RespuestaVidAhorro100 obtenerProyeccionVidAhorro100(
        @WebParam(name = "transaccion", targetNamespace = "")
        TransaccionVidAhorro100 transaccion);

    /**
     * 
     * @param transaccion
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.servicio.proyeccion.RespuestaVidAhorro57Bis
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerProyeccionVidAhorro57Bis", targetNamespace = "http://ws.proyeccion.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.proyeccion.ObtenerProyeccionVidAhorro57Bis")
    @ResponseWrapper(localName = "obtenerProyeccionVidAhorro57BisResponse", targetNamespace = "http://ws.proyeccion.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.proyeccion.ObtenerProyeccionVidAhorro57BisResponse")
    @Action(input = "http://ws.proyeccion.cnsv.cl/ServiciosProyeccion/obtenerProyeccionVidAhorro57BisRequest", output = "http://ws.proyeccion.cnsv.cl/ServiciosProyeccion/obtenerProyeccionVidAhorro57BisResponse")
    public RespuestaVidAhorro57Bis obtenerProyeccionVidAhorro57Bis(
        @WebParam(name = "transaccion", targetNamespace = "")
        TransaccionVidAhorro57Bis transaccion);

    /**
     * 
     * @param transaccion
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.servicio.proyeccion.RespuestaFlexInvGold
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerProyeccionFlexInvGold", targetNamespace = "http://ws.proyeccion.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.proyeccion.ObtenerProyeccionFlexInvGold")
    @ResponseWrapper(localName = "obtenerProyeccionFlexInvGoldResponse", targetNamespace = "http://ws.proyeccion.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.proyeccion.ObtenerProyeccionFlexInvGoldResponse")
    @Action(input = "http://ws.proyeccion.cnsv.cl/ServiciosProyeccion/obtenerProyeccionFlexInvGoldRequest", output = "http://ws.proyeccion.cnsv.cl/ServiciosProyeccion/obtenerProyeccionFlexInvGoldResponse")
    public RespuestaFlexInvGold obtenerProyeccionFlexInvGold(
        @WebParam(name = "transaccion", targetNamespace = "")
        TransaccionFlexInvGold transaccion);

    /**
     * 
     * @param transaccion
     * @return
     *     returns cl.cnsv.wsreporteproyeccion.servicio.proyeccion.RespuestaVidAhorroFlex
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerProyeccionVidAhorroFlex", targetNamespace = "http://ws.proyeccion.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.proyeccion.ObtenerProyeccionVidAhorroFlex")
    @ResponseWrapper(localName = "obtenerProyeccionVidAhorroFlexResponse", targetNamespace = "http://ws.proyeccion.cnsv.cl/", className = "cl.cnsv.wsreporteproyeccion.servicio.proyeccion.ObtenerProyeccionVidAhorroFlexResponse")
    @Action(input = "http://ws.proyeccion.cnsv.cl/ServiciosProyeccion/obtenerProyeccionVidAhorroFlexRequest", output = "http://ws.proyeccion.cnsv.cl/ServiciosProyeccion/obtenerProyeccionVidAhorroFlexResponse")
    public RespuestaVidAhorroFlex obtenerProyeccionVidAhorroFlex(
        @WebParam(name = "transaccion", targetNamespace = "")
        TransaccionVidAhorroFlex transaccion);

}
