package pl.sda.sapiens.insurance2.repository;

import pl.sda.sapiens.insurance2.model.InsuranceType;

import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Stateless(name = "insurance-types")
public class InsuranceTypeRepositoryImpl implements InsuranceTypeRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<InsuranceType> findById(int id) {
        return Optional.ofNullable(entityManager.find(InsuranceType.class, id));
    }

    @Override
    public List<InsuranceType> findAll() {
        return entityManager.createQuery("SELECT it FROM InsuranceType it", InsuranceType.class)
                .getResultList();
    }
    @Override
    public void save(InsuranceType insuranceType) {

    }
}
