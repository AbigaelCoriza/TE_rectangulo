
package com.emergentes.controlador;

import com.emergentes.modelo.Rectangulo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CalculaControlador", urlPatterns = {"/CalculaControlador"})
public class CalculaControlador extends HttpServlet {

 

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int base= Integer.parseInt(request.getParameter("base"));
        int altura= Integer.parseInt(request.getParameter("altura"));
    
    Rectangulo obj =new Rectangulo();
    
    
     obj.setAltura(altura);
     obj.setBase(base);
    
    request.setAttribute("miobj", obj);
    request.getRequestDispatcher("salida.jsp").forward(request, response);
    }

}
