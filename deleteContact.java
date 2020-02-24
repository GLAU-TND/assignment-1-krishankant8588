package functionality;


import Client.Client;
import LinkList.LinkedListDefinitionClass;

import java.util.Scanner;

public class deleteContact {

    public void removeContactFormLIst(LinkedListDefinitionClass person) {
        Scanner tell = new Scanner(System.in);
        System.out.println("Here are all your contacts:");
        for (int i = 0; i < person.getSize(); i++) {
            Client person1 = (Client) person.dataAtIndex(i);
            System.out.println(i + 1 + ". " + person1.getFrsitName() + " " + person1.getLastName());
        }
        System.out.println("Press the number against the contact to delete it: ");
        int choice = Integer.parseInt(tell.nextLine());
        Client person2 = (Client) person.dataAtIndex(choice - 1);
        System.out.println(person2.getFrsitName() + "'s contact deleted from list!");
        person.remove(choice - 1);
    }

}
