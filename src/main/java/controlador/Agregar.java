
package controlador;

import dao.PersonaDAO;
import entities.Persona;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Agregar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("formId").toString());
        String nombre = request.getParameter("formNombres").toString();
        String apellidos = request.getParameter("formApellidos").toString();
        String rut = request.getParameter("formRut").toString();
        String direccion = request.getParameter("formDireccion").toString();
        String ciudad = request.getParameter("formCiudad").toString();

        Persona persona = new Persona(id, nombre, apellidos, rut, direccion, ciudad);

        PersonaDAO personaDAO = new PersonaDAO();

        try {
            if (personaDAO.findPersona(id) == null) {
                personaDAO.create(persona);
            } else {
                personaDAO.edit(persona);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        response.sendRedirect(request.getContextPath() + "/lista");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
