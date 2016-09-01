/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */

package cl.cnsv.wsreporteproyeccion.vo;

/** 
 * Clase que registra el numero de cotizacion como entrada para el servicio 
 * de obtener la cotizacion internet.
 * 
 * fecha: 30-08-2016 
 * @author exitcs6 
 */
public class InputObtenerCotizacionInternetVO {

    private String numeroCotizacion;

    public String getNumeroCotizacion() {
        return numeroCotizacion;
    }

    public void setNumeroCotizacion(String numeroCotizacion) {
        this.numeroCotizacion = numeroCotizacion;
    }
}