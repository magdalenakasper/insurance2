package pl.sda.sapiens.insurance2.service;
import pl.sda.sapiens.insurance2.model.InsuranceLifeContractApplication;
import pl.sda.sapiens.insurance2.repository.ApplicationRepository;

import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Stateless
public class ApplicationServiceImpl implements ApplicationService{

    private final ApplicationRepository applicationRepository;

    @Inject
    public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }


    @Override
    public void registerApplication(InsuranceLifeContractApplication application) {
        applicationRepository.save(application);
    }

    @Override
    public List<InsuranceLifeContractApplication> findAll() {
        return applicationRepository.findAll();
    }

    @Override
    public void sendToClient(Integer id) {
        // ...
    }
}