/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cnsv.wsreporteproyeccion.ws;

import cl.cnsv.wsreporteproyeccion.utils.ReporteProyeccionUtil;
import cl.cnsv.wsreporteproyeccion.vo.InputObtenerCotizacionInternetVO;
import cl.cnsv.wsreporteproyeccion.vo.InputObtenerProyeccionVO;
import cl.cnsv.wsreporteproyeccion.vo.OutputObtenerCotizacionInternetVO;
import cl.cnsv.wsreporteproyeccion.vo.OutputObtenerProyeccionVO;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author exitcs6
 */
@Path("WS_ReporteProyeccion")
public class WS_ReporteProyeccionRest {

    /**
     * Creates a new instance of WS_ReporteProyeccionRest
     */
    public WS_ReporteProyeccionRest() {
    }
    
    @POST
    @Path("/obtenerProyeccion")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public OutputObtenerProyeccionVO obtenerProyeccion(InputObtenerProyeccionVO input) {
        ReporteProyeccionUtil reporteProyeccionUtil = new ReporteProyeccionUtil();
        return reporteProyeccionUtil.obtenerProyeccion(input);
    }
    
    @POST
    @Path("/obtenerCotizacionInternet")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public OutputObtenerCotizacionInternetVO obtenerCotizacionInternet(InputObtenerCotizacionInternetVO input) {
        ReporteProyeccionUtil reporteProyeccionUtil = new ReporteProyeccionUtil();
        return reporteProyeccionUtil.obtenerCotizacionInternet(input);
    }
}