
package controlador;

import dao.PersonaDAO;
import entities.Persona;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Lista extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PersonaDAO dao = new PersonaDAO();
        List<Persona> personaEntities = dao.findPersonaEntities();

        req.setAttribute("items", personaEntities);
        req.getRequestDispatcher("lista.jsp").forward(req, resp);
    }
}
