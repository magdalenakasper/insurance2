package pl.sda.sapiens.insurance2.model;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class LifeInsurance {
    private String name;
    private BigDecimal insuranceAmount;

    public LifeInsurance() {
    }

    public LifeInsurance(String name, BigDecimal insuranceAmount) {
        this.name = name;
        this.insuranceAmount = insuranceAmount;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getInsuranceAmount() {
        return insuranceAmount;
    }
}