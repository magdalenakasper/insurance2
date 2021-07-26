package pl.sda.sapiens.insurance2.mapper;

import pl.sda.sapiens.insurance2.model.CandidateClient;
import pl.sda.sapiens.insurance2.model.InsuranceLifeContractApplication;
import pl.sda.sapiens.insurance2.model.InsuranceType;
import pl.sda.sapiens.insurance2.model.LifeInsurance;
import pl.sda.sapiens.insurance2.repository.InsuranceTypeRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

@Stateless(name = "mapper")
public class LifeApplicationMapper {
    private final InsuranceTypeRepository insuranceTypeRepository;

    @Inject
    public LifeApplicationMapper(InsuranceTypeRepository insuranceTypeRepository) {
        this.insuranceTypeRepository = insuranceTypeRepository;
    }

    public Optional<InsuranceLifeContractApplication> toModel(HttpServletRequest request){
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String birthDateString = request.getParameter("birthDate");
        String pesel = request.getParameter("pesel");
        String name = request.getParameter("name");
        String amountString = request.getParameter("insuranceAmount");
        String insuranceTypeIdString = request.getParameter("insuranceTypeId");
        try {
            LocalDate birthDate = LocalDate.parse(birthDateString);
            BigDecimal insuranceAmount = new BigDecimal(amountString);
            CandidateClient client = new CandidateClient(firstName, lastName, birthDate, pesel, email);
            LifeInsurance insurance = new LifeInsurance(name, insuranceAmount);
            int insuranceTypeId = Integer.parseInt(insuranceTypeIdString);
            InsuranceType insuranceType = insuranceTypeRepository.findById(insuranceTypeId)
                    .orElseThrow(RuntimeException::new);
            InsuranceLifeContractApplication application = new InsuranceLifeContractApplication(
                    client,
                    insurance,
                    insuranceType);
            return Optional.of(application);
        } catch (RuntimeException e){
            return Optional.empty();
        }
    }
}