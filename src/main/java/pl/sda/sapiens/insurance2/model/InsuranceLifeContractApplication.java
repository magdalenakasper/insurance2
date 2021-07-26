package pl.sda.sapiens.insurance2.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class InsuranceLifeContractApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Embedded
    private CandidateClient client;
    @Embedded
    private LifeInsurance insurance;
    @ManyToOne
    private InsuranceType type;


    public InsuranceLifeContractApplication() {
    }

    public InsuranceLifeContractApplication(CandidateClient client, LifeInsurance insurance, InsuranceType type) {
        this.client = client;
        this.insurance = insurance;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public CandidateClient getClient() {
        return client;
    }

    public LifeInsurance getInsurance() {
        return insurance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InsuranceLifeContractApplication that = (InsuranceLifeContractApplication) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public InsuranceType getType() {
        return type;
    }
}