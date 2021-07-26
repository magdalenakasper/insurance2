package pl.sda.sapiens.insurance2.mapper;

import pl.sda.sapiens.insurance2.model.InsuranceType;

import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Stateless
public class InsuranceTypeMapper {

    public Optional<InsuranceType> toModel(HttpServletRequest request) {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String priorityString = request.getParameter("priority");
        try {
            int priority = Integer.parseInt(priorityString);
            return Optional.of(new InsuranceType(name, description, priority));
        } catch (RuntimeException e) {
            return Optional.empty();

        }

    }
}
