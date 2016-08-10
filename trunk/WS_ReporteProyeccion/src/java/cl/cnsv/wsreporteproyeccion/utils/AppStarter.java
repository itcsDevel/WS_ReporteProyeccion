/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cnsv.wsreporteproyeccion.utils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 *
 * @author MarceloPinto
 */
public class AppStarter implements ServletContextListener{
    
    private final int LOG_WATCH_PERIOD = 10000;
    private static final Logger LOGGER = Logger.getLogger(AppStarter.class); 
    
    /**
     *
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String log4jFile = Propiedades.getConfProperty("LOG4JPROPERTIES");
        DOMConfigurator.configureAndWatch(log4jFile, LOG_WATCH_PERIOD);
        LOGGER.info("AppStarter:contextInitialized:: AppStarter contextInitialized");
    }

    /**
     *
     * @param sce
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOGGER.info("AppStarter:contextInitialized:: AppStarter contextDestroyed");
    }
}
