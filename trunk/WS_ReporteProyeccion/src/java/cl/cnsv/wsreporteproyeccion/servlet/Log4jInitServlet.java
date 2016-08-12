/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */
package cl.cnsv.wsreporteproyeccion.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import org.apache.log4j.PropertyConfigurator;

/**
 * Clase que configura log4j.
 *
 * fecha: 12-08-2016
 *
 * @author exitcs6
 */
public class Log4jInitServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        String maePath = System.getProperty("MAE_REPORTEPROYECCION");
        String file = maePath + "/" + getInitParameter("log4j-init-file");
        if (file != null) {
            PropertyConfigurator.configure(file);
        }
    }
}
