package Day9AddressBook;

import java.util.*;

class AddressBook {
    String firstName, lastName, address, city, state,email;
    long phoneNo;
    int zip;
    public void setDetails(){
        firstName = "Yash";
        lastName = "Atkulwar";
        address = "Tukum";
        city ="Chandrapur";
        state = "Maharashtra";
        zip = 123456;
        phoneNo = 935946359;
        email = "yashatkulwar45@gmail.com";
    }
    public void printDetails(){

        System.out.println("\nFirst Nmae : " + firstName  + "\n\nLast Name : " + lastName + "\n\nAddress : " + address + "\n\nCity : " + city + "\n\nState : " + state + "\n\nZip : " + zip + "\n\nPhone Number : " + phoneNo + "\n\nE-mail : " + email);
    }
}
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook System");
        AddressBook address = new AddressBook();
        address.setDetails();
        address.printDetails();
    }
}
