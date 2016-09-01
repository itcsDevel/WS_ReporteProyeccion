/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */

package cl.cnsv.wsreporteproyeccion.vo;

/** 
 * Clase que registra la informacion de respuesta una vez 
 * obtenida la cotizacion internet.
 * 
 * fecha: 30-08-2016 
 * @author exitcs6 
 */
public class OutputObtenerCotizacionInternetVO {

    private String codigo;
    private String mensaje;

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
}