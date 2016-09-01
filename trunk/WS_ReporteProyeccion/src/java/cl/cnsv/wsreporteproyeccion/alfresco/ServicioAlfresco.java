/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cnsv.wsreporteproyeccion.alfresco;

import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.InputProyeccionesVO;
import cl.cnsv.wsreporteproyeccion.vo.ResultadoDocumentoVO;

/**
 *
 * @author exitcs3
 */
public interface ServicioAlfresco {

    ResultadoDocumentoVO buscarArchivoAlfrescoByName(InputProyeccionesVO nameFile);
}
