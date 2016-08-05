/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */

package cl.cnsv.wsreporteproyeccion.utils;

import cl.cnsv.wsreporteproyeccion.service.ReporteProyeccionService;
<<<<<<< HEAD
import cl.cnsv.wsreporteproyeccion.service.ReporteProyeccionServiceImpl;
=======
import cl.cnsv.wsreporteproyeccion.service.ReporteProyeccionServiceDummyImpl;
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
import cl.cnsv.wsreporteproyeccion.vo.InputObtenerProyeccionVO;
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
<<<<<<< HEAD
//        servicio = new ReporteProyeccionServiceDummyImpl();
        servicio = new ReporteProyeccionServiceImpl();
=======
        servicio = new ReporteProyeccionServiceDummyImpl();
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
    }   
    
    public OutputObtenerProyeccionVO obtenerProyeccion(InputObtenerProyeccionVO input) {
        return servicio.obtenerProyeccion(input);
    }
    
    public String obtenerXmlProyeccion(String numeroPoliza) {
        return servicio.obtenerXmlProyeccion(numeroPoliza);
    }
} 