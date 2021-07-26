package pl.sda.sapiens.insurance2.service;

import pl.sda.sapiens.insurance2.model.InsuranceType;

import java.util.List;

public interface InsuranceTypeService {
    List<InsuranceType> findAll();
    void create(InsuranceType insuranceType);
}