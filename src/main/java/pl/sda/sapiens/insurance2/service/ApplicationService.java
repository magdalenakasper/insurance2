package pl.sda.sapiens.insurance2.service;

import pl.sda.sapiens.insurance2.model.InsuranceLifeContractApplication;

import java.util.List;

public interface ApplicationService {
    void registerApplication(InsuranceLifeContractApplication application);
    List<InsuranceLifeContractApplication> findAll();
    void sendToClient(Integer id);
}
