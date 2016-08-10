/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */

package cl.cnsv.wsreporteproyeccion.vo;

/** 
 * Clase que contiene codigo y mensaje de salida.
 * 
 * fecha: 09-08-2016 
 * @author exitcs6 
 */
public class OutputVO {

    private Integer codigo;
    private String mensaje;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}