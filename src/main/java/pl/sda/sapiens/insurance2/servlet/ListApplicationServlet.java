package pl.sda.sapiens.insurance2.servlet;

import pl.sda.sapiens.insurance2.service.ApplicationService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/application/list")
public class ListApplicationServlet extends HttpServlet {
    @EJB
    private ApplicationService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("applications", service.findAll());
        getServletContext().getRequestDispatcher("/application/application-list.jsp").forward(req, resp);
    }
}
