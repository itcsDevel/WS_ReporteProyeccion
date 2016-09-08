/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */

package cl.cnsv.wsreporteproyeccion.vo;

import javax.xml.bind.annotation.XmlRootElement;

/** 
 * Clase que integra informacion de parametros de entrada para obtener el
 * documento de proyeccion.
 * 
 * fecha: 02-08-2016 
 * @author exitcs6 
 */
@XmlRootElement
public class InputObtenerProyeccionVO {

    private String numeroPoliza;

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }
}