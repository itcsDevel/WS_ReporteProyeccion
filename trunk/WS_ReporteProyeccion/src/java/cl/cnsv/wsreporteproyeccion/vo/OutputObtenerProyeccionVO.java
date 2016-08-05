/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */

package cl.cnsv.wsreporteproyeccion.vo;

<<<<<<< HEAD
import java.io.Serializable;

=======
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642
/** 
 * Clase que integra informacion de salida con el documento de proyeccion
 * 
 * fecha: 02-08-2016 
 * @author exitcs6 
 */
<<<<<<< HEAD
public class OutputObtenerProyeccionVO implements  Serializable{
=======
public class OutputObtenerProyeccionVO {
>>>>>>> a03222cbf07e6f20cb8a3cbc9445747eb5248642

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