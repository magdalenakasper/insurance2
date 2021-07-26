package pl.sda.sapiens.insurance2.model;

import javax.persistence.Embeddable;
import java.time.LocalDate;

@Embeddable
public class CandidateClient {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String pesel;
    private String email;

    public CandidateClient() {
    }

    public CandidateClient(String firstName, String lastName, LocalDate birthDate, String pesel, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.pesel = pesel;
        this.email = email;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {

        return birthDate;
    }

    public String getPesel() {
        return pesel;
    }

    public String getEmail() {

        return email;
    }
}
