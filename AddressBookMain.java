package Day9AddressBook;

import javaday9addressbook.AddressBook;
import java.util.*;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome In Address Book System Program ");
        String firstName, lastName, address, city, state, email;
        int zip;
        long phoneNo;
        char option;
        ArrayList<AddressBook> contactArr = new ArrayList<AddressBook>();

        Scanner sc = new Scanner(System.in);
        do {
            AddressBook contact = new AddressBook();
            System.out.print("Enter First Name  : ");
            firstName = sc.nextLine();
            contact.setFirstName(firstName);
            System.out.print("\nEnter Last Name  : ");
            lastName = sc.nextLine();
            contact.setLastName(lastName);
            System.out.print("\nEnter E-mail  : ");
            email = sc.nextLine();
            contact.setEmail(email);
            System.out.print("\nEnter Address  : ");
            address = sc.nextLine();
            contact.setAddress(address);
            System.out.print("\nEnter City  : ");
            city = sc.nextLine();
            contact.setCity(city);
            System.out.print("\nEnter State  : ");
            state = sc.nextLine();
            contact.setState(state);
            System.out.print("\nEnter Phone Number  : ");
            phoneNo = sc.nextLong();
            contact.setPhoneNo(phoneNo);
            System.out.print("\nEnter Zip  : ");
            zip = sc.nextInt();
            contact.setZip(zip);
            contactArr.add(contact);
            System.out.print(
                    "\nDo you want to add one more contact? press Y / N : ");
            option = sc.next().charAt(0);
            sc.nextLine();
        } while (option == 'Y');

        Operate operate = new Operate();
        System.out.print("\nDo you want to edit? press Y / N : ");
        char editOption = sc.next().charAt(0);
        if (editOption == 'Y') {
            operate.editContact(contactArr);
        }
        operate.showContact(contactArr);
        System.out.print("\nDo you want to delete? press Y / N : ");
        char deleteOption = sc.next().charAt(0);
        if (deleteOption == 'Y') {
            contactArr = operate.deleteContact(contactArr);
        }
        operate.showContact(contactArr);
        sc.close();
    }
}