package pl.sda.sapiens.insurance2.service;

import pl.sda.sapiens.insurance2.model.InsuranceType;
import pl.sda.sapiens.insurance2.repository.InsuranceTypeRepository;


import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class InsuranceTypeServiceImpl implements InsuranceTypeService {
    private final InsuranceTypeRepository insuranceTypeRepository;

    @Inject
    public InsuranceTypeServiceImpl(InsuranceTypeRepository insuranceTypeRepository) {
        this.insuranceTypeRepository = insuranceTypeRepository;
    }

    @Override
    public List<InsuranceType> findAll() {
        return insuranceTypeRepository.findAll();
    }

    @Override
    public void create(InsuranceType insuranceType) {
        insuranceTypeRepository.save(insuranceType);
    }
}