
package controlador;

import dao.PersonaDAO;
import entities.Persona;
import exceptions.NonexistentEntityException;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Eliminar extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));

        if (id == null) {
            throw new ServletException("Sin parámetro 'id'");
        }

        PersonaDAO dao2 = new PersonaDAO();
        Persona persona = dao2.findPersona(id);

        try {
            dao2.destroy(id);
        } catch (NonexistentEntityException e) {
            throw new RuntimeException(e);
        }

        request.setAttribute("persona", persona);
        request.getRequestDispatcher("borrado.jsp").forward(request, response);
    }
}
