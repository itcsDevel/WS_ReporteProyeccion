/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */

package cl.cnsv.wsreporteproyeccion.jasperserver;

import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.InputCotizacionInternet;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.InputProyeccionesVO;
import cl.cnsv.wsreporteproyeccion.vo.ResultadoDocumentoVO;

/** 
 * Clase que define el metodo para el llamado al servicio web JasperServer
 * 
 * fecha: 25-08-2016 
 * @author exitcs6 
 */
public interface ServicioJasperServer {    
    
    ResultadoDocumentoVO buscarArchivoByPoliza(InputProyeccionesVO inputProyecciones);    

    ResultadoDocumentoVO buscarArchivoByCotizacion(InputCotizacionInternet inputCotizacionInternet);
}