package Model;

import java.util.List;
import View.ContactDisplayView;

public class ContactModel {
    private String firstName;
    private String lastName;
    private String title;
    private String organization;
    private List<ContactDisplayView> observers;

    public ContactModel(String firstName, String lastName, String title, String Organization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.organization = Organization;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public String getOrganization() {
        return organization;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOrganization(String Organization) {
        this.organization = Organization;
    }
    
    private void notify1() {
        for(ContactDisplayView observer : this.observers) {
            observer.refreshContact(firstName,lastName,title,organization);
        }
    }
}
