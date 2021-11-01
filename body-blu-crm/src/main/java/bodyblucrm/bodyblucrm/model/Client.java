package bodyblucrm.bodyblucrm.model;

import bodyblucrm.bodyblucrm.documents.Waver;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

public class Client extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clientId;

    private String firstName;

    private String lastName;

    private String email; // check with a email lib

    private int phoneNumber;

    private Date dateOfBirth;

    private String gender;

    private String address; // check with a lib

    private Waver theWaver;

    private Appointment[]  theirAptments;

    private List[] theirPackages; // TODO create class for packages

    private List[] membership;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Waver getTheWaver() {
        return theWaver;
    }

    public void setTheWaver(Waver theWaver) {
        this.theWaver = theWaver;
    }

    public Appointment[] getTheirAptments() {
        return theirAptments;
    }

    public void setTheirAptments(Appointment[] theirAptments) {
        this.theirAptments = theirAptments;
    }

    public void addTheirAptments(Appointment theAptments){
        this.theirAptments[theirAptments.length + 1] =theAptments;
    }

    public List[] getTheirPackages() {
        return theirPackages;
    }

    public void setTheirPackages(List[] theirPackages) {
        this.theirPackages = theirPackages;
    }

    public List[] getMembership() {
        return membership;
    }

    public void setMembership(List[] membership) {
        this.membership = membership;
    }
}
