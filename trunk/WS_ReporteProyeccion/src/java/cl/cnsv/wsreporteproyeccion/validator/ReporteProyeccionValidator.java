/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cnsv.wsreporteproyeccion.validator;

import cl.cnsv.wsreporteproyeccion.vo.InputObtenerProyeccionVO;
import cl.cnsv.wsreporteproyeccion.vo.OutputVO;

/**
 *
 * @author exitcs6
 */
public interface ReporteProyeccionValidator {
    
    OutputVO validarObtenerProyeccion(InputObtenerProyeccionVO input);
}
