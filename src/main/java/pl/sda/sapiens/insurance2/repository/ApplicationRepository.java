package pl.sda.sapiens.insurance2.repository;

import pl.sda.sapiens.insurance2.model.InsuranceLifeContractApplication;

import java.util.List;
import java.util.stream.Stream;

public interface ApplicationRepository {
    void save(InsuranceLifeContractApplication application);
    List<InsuranceLifeContractApplication> findAll();
}