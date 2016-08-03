/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */

package cl.cnsv.wsreporteproyeccion.service;

import cl.cnsv.wsreporteproyeccion.vo.InputObtenerProyeccionVO;
import cl.cnsv.wsreporteproyeccion.vo.OutputObtenerProyeccionVO;

/** 
 * Clase que provee el servicio para obtener el documento de proyeccion.
 * 
 * fecha: 02-08-2016 
 * @author exitcs6 
 */
public interface ReporteProyeccionService {

    OutputObtenerProyeccionVO obtenerProyeccion(InputObtenerProyeccionVO input);
    
    String obtenerXmlProyeccion(String numeroPoliza);
}