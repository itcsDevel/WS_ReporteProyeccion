/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cnsv.wsreporteproyeccion.servlet;

import cl.cnsv.wsreporteproyeccion.utils.ReporteProyeccionUtil;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

/**
 * Servlet que permite obtener los datos necesarios para el reporte de 
 * cotizacion internet.
 * @author exitcs6
 */
public class CotizacionInternetServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(CotizacionInternetServlet.class);
    private final ReporteProyeccionUtil reporteProyeccionUtil;

    public CotizacionInternetServlet() {
        this.reporteProyeccionUtil = new ReporteProyeccionUtil();
    }
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //<editor-fold defaultstate="collapsed" desc="Inicio">
        response.setContentType("text/xml;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String nroCotizacion = request.getParameter("NRO_COTIZACION");
        LOGGER.info("Numero de cotizacion -> " + nroCotizacion);
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Construir XML del cotizador internet">
        String xml = reporteProyeccionUtil.obtenerXmlCotizacionInternet(nroCotizacion);
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Termino">
        out.println(xml);
        //</editor-fold>
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
