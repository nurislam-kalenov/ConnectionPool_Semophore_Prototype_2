package nuris.epam.entity;

import java.sql.Date;

/**
 * Created by User on 17.03.2017.
 */
public class Person extends BaseEntity{

    private String firstName;

    private String lastName;

    private String middleName;

    private int phone;

    private Date birthday;

    private String adrees;

    private City city;

    public Person(){
        city = new City();
    }

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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAdrees() {
        return adrees;
    }

    public void setAdrees(String adrees) {
        this.adrees = adrees;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return getId()+ "/"+ firstName+"/"+lastName+"/"+middleName+"/"+phone+"/"+birthday+"/"+adrees+"/"+city;
    }
}
