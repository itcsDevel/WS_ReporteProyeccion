/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cnsv.wsreporteproyeccion.vo;

import java.io.Serializable;

/**
 *
 * @author ITCS09
 */
public class ResultadoWSAlfresco implements Serializable  {
      private String codigo;
      private String mensaje;
    //  private String carpeta;
    //  private String docAlfresco;
      private String documento;
    //  private String erroracle;
    //  private String errorpackage;
    //  private String fechaCarga;
    //  private String idDocAlfresco;
    //  private String msgoracle;
    //  private String nombreArchivo;
    //  private String npoliza;
    //  private String rutAsegurado;
    //  private String urlName;
    //  private byte[] archivo;

    public ResultadoWSAlfresco() {
    }
   
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
/*
    public String getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(String carpeta) {
        this.carpeta = carpeta;
    }

    public String getDocAlfresco() {
        return docAlfresco;
    }

    public void setDocAlfresco(String docAlfresco) {
        this.docAlfresco = docAlfresco;
    }
*/
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /*
    public String getErroracle() {
        return erroracle;
    }

    public void setErroracle(String erroracle) {
        this.erroracle = erroracle;
    }

    public String getErrorpackage() {
        return errorpackage;
    }

    public void setErrorpackage(String errorpackage) {
        this.errorpackage = errorpackage;
    }

    public String getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(String fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public String getIdDocAlfresco() {
        return idDocAlfresco;
    }

    public void setIdDocAlfresco(String idDocAlfresco) {
        this.idDocAlfresco = idDocAlfresco;
    }

    public String getMsgoracle() {
        return msgoracle;
    }

    public void setMsgoracle(String msgoracle) {
        this.msgoracle = msgoracle;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getNpoliza() {
        return npoliza;
    }

    public void setNpoliza(String npoliza) {
        this.npoliza = npoliza;
    }

    public String getRutAsegurado() {
        return rutAsegurado;
    }

    public void setRutAsegurado(String rutAsegurado) {
        this.rutAsegurado = rutAsegurado;
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    /**
     * @return the archivo
     
    public byte[] getArchivo() {
        return archivo;
    }

    /**
     * @param archivo the archivo to set
     
    public void setArchivo(byte[] archivo) {
        this.archivo = archivo;
    }
 
    */
      
}
