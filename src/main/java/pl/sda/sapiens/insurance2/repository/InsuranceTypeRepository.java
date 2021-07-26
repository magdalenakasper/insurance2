package pl.sda.sapiens.insurance2.repository;

import pl.sda.sapiens.insurance2.model.InsuranceType;

import java.util.List;
import java.util.Optional;

public interface InsuranceTypeRepository {
   void save(InsuranceType insuranceType);
   Optional<InsuranceType> findById(int id);
   List<InsuranceType> findAll();
}