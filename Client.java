package Client;
import LinkList.LinkedListDefinitionClass;

public class Client {
    private String frsitName;
    private String lastName;
    private LinkedListDefinitionClass<Long> contactNo;
    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public LinkedListDefinitionClass getContactNo() {
        return contactNo;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFrsitName() {
        return frsitName;
    }

    public void setFrsitName(String frsitName) {
        this.frsitName = frsitName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setContactNo(LinkedListDefinitionClass<Long> contactNo) {
        this.contactNo = contactNo;
    }
}
