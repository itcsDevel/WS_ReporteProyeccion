/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cnsv.wsreporteproyeccion.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import org.apache.log4j.Logger;

/**
 *
 * @author exitcs3
 */
public class Propiedades {
   
    private static final String FUNC_FILENAME = "func_WS_ReporteProyeccion.properties";
    private static final String KEY_FILENAME = "key_WS_ReporteProyeccion.properties";
    private static final String CONF_FILENAME = "conf_WS_ReporteProyeccion.properties";
    private static ResourceBundle FUNC_BUNDLE;
    private static ResourceBundle KEY_BUNDLE;
    private static ResourceBundle CONF_BUNDLE;
    private static final Logger LOGGER = Logger.getLogger(Propiedades.class);
   
    
    static {
        
        String propFile = System.getProperty("MAE_REPORTEPROYECCION");
        
        //Func file
        FileInputStream fisFunc = null;        
        try {
            String funcFile = propFile + File.separator + FUNC_FILENAME;
            fisFunc = new FileInputStream(funcFile);
            FUNC_BUNDLE = new PropertyResourceBundle(fisFunc);
            fisFunc.close();
        } catch (FileNotFoundException ex) {
            LOGGER.error("Archivo no encontrado " + FUNC_FILENAME + ": " + ex.getMessage(), ex);
        } catch (IOException ex) {
            LOGGER.error("Problema al acceder al archivo " + FUNC_FILENAME + ": " + ex.getMessage());
        } finally {
            try {
                if (fisFunc != null) {
                    fisFunc.close();
                }
            } catch (IOException ex) {
                LOGGER.error("Problema al cerrar el stream del archivo " + FUNC_FILENAME + ": " + ex.getMessage(), ex);
            }
        }
        
        //Key file
        FileInputStream fisKey = null;        
        try {
            String keyFile = propFile + File.separator + KEY_FILENAME;
            fisKey = new FileInputStream(keyFile);
            KEY_BUNDLE = new PropertyResourceBundle(fisKey);
            fisKey.close();
        } catch (FileNotFoundException ex) {
            LOGGER.error("Archivo no encontrado " + KEY_FILENAME + ": " + ex.getMessage(), ex);
        } catch (IOException ex) {
            LOGGER.error("Problema al acceder al archivo " + KEY_FILENAME + ": " + ex.getMessage(), ex);
        } finally {
            try {
                if (fisKey != null) {
                    fisKey.close();
                }
            } catch (IOException ex) {
                LOGGER.error("Problema al cerrar el stream del archivo " + KEY_FILENAME + ": " + ex.getMessage(), ex);
            }
        }
        
        //Conf file
        FileInputStream fisConf = null;        
        try {
            String confFile = propFile + File.separator + CONF_FILENAME;
            fisConf = new FileInputStream(confFile);
            CONF_BUNDLE = new PropertyResourceBundle(fisConf);
            fisConf.close();
        } catch (FileNotFoundException ex) {
            LOGGER.error("Archivo no encontrado " + CONF_FILENAME + ": " + ex.getMessage(), ex);
        } catch (IOException ex) {
            LOGGER.error("Problema al acceder al archivo " + CONF_FILENAME + ": " + ex.getMessage(), ex);
        } finally {
            try {
                if (fisConf != null) {
                    fisConf.close();
                }
            } catch (IOException ex) {
                LOGGER.error("Problema al cerrar el stream del archivo " + CONF_FILENAME + ": " + ex.getMessage(), ex);
            }
        }
    }
   
    /**
     *
     * @param key
     * @return
     */
    public static String getFuncProperty(String key) {
        return FUNC_BUNDLE.getString(key);
    }
    
    /**
     *
     * @param key
     * @return
     */
    public static String getConfProperty(String key) {
        return CONF_BUNDLE.getString(key);
    }
    
    /**
     *
     * @param key
     * @return
     */
    public static String getKeyProperty(String key) {
        return KEY_BUNDLE.getString(key);
    }

}
