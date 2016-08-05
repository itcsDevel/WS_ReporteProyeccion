/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cnsv.wsreporteproyeccion.servlet;

import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.InputProyeccionesVO;
import cl.cnsv.wsreporteproyeccion.utils.ReporteProyeccionUtil;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

/**
 *
 * @author ITCS09
 */
@WebServlet(name = "ReporteProyeccionServlet", urlPatterns = {"/ReporteProyeccionServlet"})
public class ReporteProyeccionServlet extends HttpServlet {
    
    private static final Logger LOGGER = Logger.getLogger(ReporteProyeccionServlet.class);
    
    private final ReporteProyeccionUtil reporteProyeccionUtil;

    public ReporteProyeccionServlet() {
        reporteProyeccionUtil = new ReporteProyeccionUtil();
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
        String nroPropuesta = request.getParameter("NRO_PROPUESTA");            
        LOGGER.info("Número de Propuesta -> " + nroPropuesta);
        InputProyeccionesVO input = new InputProyeccionesVO();
        input.setNumeroPoliza(nroPropuesta);
        //</editor-fold>       
        
        //<editor-fold defaultstate="collapsed" desc="Construir XML de proyeccion">
        String xml = "";
        xml = reporteProyeccionUtil.obtenerXmlProyeccion(nroPropuesta);
        LOGGER.info("XML: \n" + xml);
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

