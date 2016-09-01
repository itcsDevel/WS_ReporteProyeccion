/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */

package cl.cnsv.wsreporteproyeccion.validator;

import cl.cnsv.wsreporteproyeccion.utils.Propiedades;
import cl.cnsv.wsreporteproyeccion.vo.InputObtenerCotizacionInternetVO;
import cl.cnsv.wsreporteproyeccion.vo.InputObtenerProyeccionVO;
import cl.cnsv.wsreporteproyeccion.vo.OutputVO;

/** 
 * Clase que implementa las validaciones de entrada.
 * 
 * fecha: 09-08-2016 
 * @author exitcs6 
 */
public class ReporteProyeccionValidatorImpl implements ReporteProyeccionValidator {

    @Override
    public OutputVO validarObtenerProyeccion(InputObtenerProyeccionVO input) {
        OutputVO output = new OutputVO();
        if (input == null) {
            output.setCodigo(Integer.valueOf(Propiedades.getFuncProperty("validaciones.null.codigo")));
            output.setMensaje(Propiedades.getFuncProperty("validaciones.null.mensaje"));
            return output;
        }
        String numeroPoliza = input.getNumeroPoliza();
        if (numeroPoliza == null) {
            output.setCodigo(Integer.valueOf(Propiedades.getFuncProperty("validaciones.null.codigo")));
            output.setMensaje(Propiedades.getFuncProperty("validaciones.null.mensaje"));
            return output;
        }
        else if ("".equals(numeroPoliza)){
            output.setCodigo(Integer.valueOf(Propiedades.getFuncProperty("validaciones.empty.codigo")));
            output.setMensaje(Propiedades.getFuncProperty("validaciones.empty.mensaje"));
            return output;
        }
        output.setCodigo(Integer.valueOf(Propiedades.getFuncProperty("codigo.ok")));
        output.setMensaje(Propiedades.getFuncProperty("mensaje.ok"));
        return output;
    }

    @Override
    public OutputVO validarObtenerCotizacionInternet(InputObtenerCotizacionInternetVO input) {
        OutputVO output = new OutputVO();
        if (input == null) {
            output.setCodigo(Integer.valueOf(Propiedades.getFuncProperty("validaciones.null.codigo")));
            output.setMensaje(Propiedades.getFuncProperty("validaciones.null.mensaje"));
            return output;
        }
        String numeroCotizacion = input.getNumeroCotizacion();
        if (numeroCotizacion == null) {
            output.setCodigo(Integer.valueOf(Propiedades.getFuncProperty("validaciones.null.codigo")));
            output.setMensaje(Propiedades.getFuncProperty("validaciones.null.mensaje"));
            return output;
        }
        else if ("".equals(numeroCotizacion)){
            output.setCodigo(Integer.valueOf(Propiedades.getFuncProperty("validaciones.empty.codigo")));
            output.setMensaje(Propiedades.getFuncProperty("validaciones.empty.mensaje"));
            return output;
        }
        output.setCodigo(Integer.valueOf(Propiedades.getFuncProperty("codigo.ok")));
        output.setMensaje(Propiedades.getFuncProperty("mensaje.ok"));
        return output;
    }
}