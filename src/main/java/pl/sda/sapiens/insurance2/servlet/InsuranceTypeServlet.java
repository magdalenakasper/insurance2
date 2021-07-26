package pl.sda.sapiens.insurance2.servlet;

import pl.sda.sapiens.insurance2.mapper.InsuranceTypeMapper;
import pl.sda.sapiens.insurance2.model.InsuranceType;
import pl.sda.sapiens.insurance2.service.InsuranceTypeService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/insurance-type")
public class InsuranceTypeServlet extends HttpServlet {
    @EJB
    private InsuranceTypeMapper mapper;
    @EJB
    private InsuranceTypeService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/insurance-type/insurance-type-form.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Optional<InsuranceType> optionalInsuranceType = mapper.toModel(req);
        if (optionalInsuranceType.isPresent()) {
            service.create(optionalInsuranceType.get());
            getServletContext().getRequestDispatcher("/insurance-type/accepted-info.jsp")
                    .forward(req, resp);
        } else {
            getServletContext().getRequestDispatcher("/insurance-type/not-accepted-info.jsp")
                    .forward(req, resp);
        }
    }
}