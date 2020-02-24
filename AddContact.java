package functionality;

import Client.Client;
import LinkList.LinkedListDefinitionClass;

import java.util.Scanner;

public class AddContact {

    public Client addContact() {
        Client client = new Client();
        Scanner tell = new Scanner(System.in);
        System.out.println("You have chosen to add a new Contact: ");
        System.out.println("Please enter the Name of the Person: ");
        System.out.print("First Name : ");
        client.setFrsitName(tell.nextLine());
        System.out.print("Last Name : ");
        client.setLastName(tell.nextLine());
        LinkedListDefinitionClass<Long> contactNumber = new LinkedListDefinitionClass<Long>();
        boolean no = false;
        while (no != true) {
            System.out.print("Contact number: ");
            long contactNo = Long.parseLong(tell.nextLine());
            contactNumber.add(contactNo);
            System.out.print("Would you like to add another contact number? (y/n): ");
            char choise = (tell.nextLine()).charAt(0);
            if (choise != 'n') {

            } else
                no = true;
        }
        client.setContactNo(contactNumber);
        System.out.print("Would you like to add Email address ? (y/n): ");
        char choise = (tell.nextLine()).charAt(0);
        if (choise == 'y') {
            System.out.println("Enter the Email: ");
            client.setEmailAddress(tell.nextLine());
        }
        return client;
    }
}

