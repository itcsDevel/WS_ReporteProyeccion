/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */

package cl.cnsv.wsreporteproyeccion.utils;

import cl.cnsv.wsreporteproyeccion.service.ReporteProyeccionService;
import cl.cnsv.wsreporteproyeccion.service.ReporteProyeccionServiceImpl;
import cl.cnsv.wsreporteproyeccion.vo.InputObtenerCotizacionInternetVO;
import cl.cnsv.wsreporteproyeccion.vo.InputObtenerProyeccionVO;
import cl.cnsv.wsreporteproyeccion.vo.OutputObtenerCotizacionInternetVO;
import cl.cnsv.wsreporteproyeccion.vo.OutputObtenerProyeccionVO;

/** 
 * Clase que implementa el llamado al servicio entre otros utilitarios.
 * 
 * fecha: 03-08-2016 
 * @author exitcs6 
 */
public class ReporteProyeccionUtil {

    private final ReporteProyeccionService servicio;

    public ReporteProyeccionUtil() {
        servicio = new ReporteProyeccionServiceImpl();
    }   
    
    public OutputObtenerProyeccionVO obtenerProyeccion(InputObtenerProyeccionVO input) {
        return servicio.obtenerProyeccion(input);
    }
    
    public String obtenerXmlProyeccion(String numeroPoliza) {
        return servicio.obtenerXmlProyeccion(numeroPoliza);
    }
    
    public OutputObtenerCotizacionInternetVO obtenerCotizacionInternet(InputObtenerCotizacionInternetVO input) {
        return servicio.obtenerCotizacionInternet(input);
    }
    
    public String obtenerXmlCotizacionInternet(String nroCotizacion) {
        return servicio.obtenerXmlCotizacionInternet(nroCotizacion);
    }
} 