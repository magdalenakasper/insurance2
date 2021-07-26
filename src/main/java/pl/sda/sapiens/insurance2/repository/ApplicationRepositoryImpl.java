package pl.sda.sapiens.insurance2.repository;

import pl.sda.sapiens.insurance2.model.InsuranceLifeContractApplication;

import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

@Stateless(name = "life-applications")
public class ApplicationRepositoryImpl implements ApplicationRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(InsuranceLifeContractApplication application) {
        entityManager.persist(application);
    }

    @Override
    public List<InsuranceLifeContractApplication> findAll() {
        return entityManager.createQuery(
                "SELECT app FROM InsuranceLifeContractApplication app",
                InsuranceLifeContractApplication.class)
                .getResultList();
    }
}