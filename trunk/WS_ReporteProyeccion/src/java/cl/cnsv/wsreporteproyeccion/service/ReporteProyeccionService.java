/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */

package cl.cnsv.wsreporteproyeccion.service;

import cl.cnsv.wsreporteproyeccion.vo.InputObtenerCotizacionInternetVO;
import cl.cnsv.wsreporteproyeccion.vo.InputObtenerProyeccionVO;
import cl.cnsv.wsreporteproyeccion.vo.OutputObtenerCotizacionInternetVO;
import cl.cnsv.wsreporteproyeccion.vo.OutputObtenerProyeccionVO;

/** 
 * Clase que provee el servicio para obtener documentos.
 * 
 * fecha: 02-08-2016 
 * @author exitcs6 
 */
public interface ReporteProyeccionService {

    OutputObtenerProyeccionVO obtenerProyeccion(InputObtenerProyeccionVO input);
    
    String obtenerXmlProyeccion(String numeroPoliza);
    
    OutputObtenerCotizacionInternetVO obtenerCotizacionInternet(InputObtenerCotizacionInternetVO input);
    
    String obtenerXmlCotizacionInternet(String nroCotizacion);
}