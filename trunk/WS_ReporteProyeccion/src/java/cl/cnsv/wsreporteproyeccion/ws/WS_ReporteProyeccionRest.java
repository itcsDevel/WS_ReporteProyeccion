/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cnsv.wsreporteproyeccion.ws;

import cl.cnsv.wsreporteproyeccion.service.ReporteProyeccionService;
import cl.cnsv.wsreporteproyeccion.utils.ReporteProyeccionUtil;
import cl.cnsv.wsreporteproyeccion.vo.InputObtenerProyeccionVO;
import cl.cnsv.wsreporteproyeccion.vo.OutputObtenerProyeccionVO;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
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

    /**
     * PUT method for updating or creating an instance of WS_ReporteProyeccionRest
     * @param input
     * @return 
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public OutputObtenerProyeccionVO obtenerProyeccion(InputObtenerProyeccionVO input) {
        ReporteProyeccionUtil reporteProyeccionUtil = new ReporteProyeccionUtil();
        return reporteProyeccionUtil.obtenerProyeccion(input);
    }
}
