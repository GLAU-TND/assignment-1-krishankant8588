package executionClass;

import Client.Client;
import LinkList.LinkedListDefinitionClass;
import functionality.AddContact;
import functionality.SeachContact;
import functionality.View;
import functionality.deleteContact;
import functionality.sort.Sort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedListDefinitionClass<Client> listContact = new LinkedListDefinitionClass<Client>();
        boolean turnoff = false;
        Scanner tell = new Scanner(System.in);
        int a = 0;
        System.out.println("Welcome to krishan Contact list \uD83D\uDE01:");
        while (!turnoff) {
            System.out.println("Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            int ch = tell.nextInt();
            switch (ch) {
                case 1:
                    Sort change = new Sort();
                    AddContact add = new AddContact();
                    listContact.add(add.addContact());
                    change.sorting(listContact);
                    break;
                case 2:
                    View view = new View();
                    view.viewList(listContact);
                    break;

                case 3:
                    SeachContact search = new SeachContact();
                    search.seach(listContact);
                    break;
                case 4:
                    deleteContact delete = new deleteContact();
                    delete.removeContactFormLIst(listContact);
                    break;
                case 5:
                    turnoff = true;
                    break;
                default:
                    System.out.println("invalid choice please re-enter");
                    break;
            }
        }
    }
}
