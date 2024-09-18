/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servletFigura;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Cuadrado;
import logica.Cuadrilatero;
import logica.Equilatero;
import logica.Escaleno;
import logica.Figura;
import logica.Isosceles;
import logica.Rectangulo;
import logica.Rombo;
import logica.Triangulo;

/**
 *
 * @author laver
 */
public class servletFigura extends HttpServlet {

    public static Figura ani;
    public static void liskov(Figura a,String b, String c){
        a.mostrarDato();
        a.mostrarArea();
        a.setNombre(b);
        a.setTipo(c);
        ani=a;
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
        
        // Obtener el tipo y nombre de la figura y convertir a minúsculas
        String tipo = request.getParameter("tipo").toLowerCase();
        String nombre = request.getParameter("nombre").toLowerCase();

        // Bloque de código para cuando es cuadrilatero
        if ("cuadrilatero".equals(tipo)) {
            if (nombre == null) {
                Cuadrilatero cuadrilatero = new Cuadrilatero();
                liskov(cuadrilatero, "No escogió nombre correcto de figura", "Cuadrilatero");
            } else {
                switch (nombre) {
                    case "cuadrado" -> {
                        Cuadrado cuadrado = new Cuadrado();
                        liskov(cuadrado, "Cuadrado", "Cuadrilatero");
                    }
                    case "rectangulo" -> {
                        Rectangulo rectangulo = new Rectangulo();
                        liskov(rectangulo, "Rectangulo", "Cuadrilatero");
                    }
                    case "rombo" -> {
                        Rombo rombo = new Rombo();
                        liskov(rombo, "Rombo", "Cuadrilatero");
                    }
                    default -> {
                        Cuadrilatero cuadrilatero = new Cuadrilatero();
                        liskov(cuadrilatero, "No escogió nombre correcto de figura", "Cuadrilatero");
                    }
                }
            }
        }

        // Bloque de código para cuando es triángulo
        if ("triangulo".equals(tipo)) {
            if (nombre == null) {
                Triangulo triangulo = new Triangulo();
                liskov(triangulo, "No escogió nombre correcto de figura", "Triangulo");
            } else {
                switch (nombre) {
                    case "isosceles" -> {
                        Isosceles isosceles = new Isosceles();
                        liskov(isosceles, "Isosceles", "Triangulo");
                    }
                    case "escaleno" -> {
                        Escaleno escaleno = new Escaleno();
                        liskov(escaleno, "Escaleno", "Triangulo");
                    }
                    case "equilatero" -> {
                        Equilatero equilatero = new Equilatero();
                        liskov(equilatero, "Equilatero", "Triangulo");
                    }
                    default -> {
                        Triangulo triangulo = new Triangulo();
                        liskov(triangulo, "No escogió nombre correcto de figura", "Triangulo");
                    }
                }
            }
        }

            
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Mostrar figuras</title>");
            out.println("<link rel='stylesheet' href='estilo2.css'/>");
            out.println("<link href='https://fonts.googleapis.com/css2?family=Patrick+Hand&display=swap\' rel='stylesheet'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("    <div class='rectangulo'></div>");
            out.println("    <h1>Figuras</h1>");
            out.println("</div>");
            out.println("<br>");
            if (ani != null) {
            out.println("<center>");
            out.println("<h2>Tipo: " + ani.getTipo() + " </h2>");
            out.println("<h2>Nombre: " + ani.getNombre() + "</h2>");
            out.println("<br>");
            out.println("<h2>¿Que es?</h2>");
            out.println("<p>"+ani.getDato()+"</p>");
            out.println("<br>");
            out.println("<h2>¿Como se calcula su area?</h2>");
            out.println("<p>"+ani.getArea()+"</p>");
            out.println("</center>");
            } else {
            out.println("<h2>No se encontró la figura</h2>");
            }
            out.println("</body>");
            out.println("</html>");
        }
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
