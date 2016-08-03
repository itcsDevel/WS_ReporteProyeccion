/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */

package cl.cnsv.wsreporteproyeccion.vo;

import java.io.Serializable;

/** 
 * Clase que integra informacion de salida con el documento de proyeccion
 * 
 * fecha: 02-08-2016 
 * @author exitcs6 
 */
public class OutputObtenerProyeccionVO implements  Serializable{

    private String codigo;
    private String mensaje;
    private String proyeccion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getProyeccion() {
        return proyeccion;
    }

    public void setProyeccion(String proyeccion) {
        this.proyeccion = proyeccion;
    }
}