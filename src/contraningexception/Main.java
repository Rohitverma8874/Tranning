package contraningexception;
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        System.out.println("Menu");
        System.out.println("1.Add Contact");
        System.out.println("2.Display all contacts");
        System.out.println("3.Search contact by phone ");
        System.out.println("4.Remove contact");
        System.out.println("5.Exit");
        System.out.println("Enter your Contact choice:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();
        PhoneBook p = new PhoneBook();

        switch(input)
        {
            case 1:
            {
                System.out.println("Add a Contact:");
                System.out.println("First Name:");
                String firstName = sc.nextLine();
                if (firstName.matches("[a-zA-Z]*$*")) {
                }
                    else {
                        throw new InputMismatchException();
                    }

                System.out.println("Phone No.:");
                Long phoneNumber = sc.nextLong();
                sc.nextLine();
                System.out.println("Email:");
                String emailId = sc.nextLine();
                if (emailId.matches("[a-zA-Z@.1-9]*$*")){
                }
                else {
                    throw new InputMismatchException();
                }
                Contact c = new Contact(firstName,phoneNumber,emailId);
                p.addContact(c);
                break;
            }
            case 2:
            {
                System.out.println("The contacts in the List are:");
                List<Contact> phoneBook = p.viewAllContacts();
                for(Contact obj : phoneBook)
                {
                    System.out.println("First Name: "+obj.getFirstName());
                    System.out.println("Phone No.: "+obj.getPhoneNumber());
                    System.out.println("Email: "+obj.getEmailId());
                }
                break;
            }
            case 3:
            {
                System.out.println("Enter the Phone to search contact:");
                long searchContact = sc.nextLong();
                sc.nextLine();
                System.out.println(" contact is:");
                Contact c = p.viewContactGivenPhone(searchContact);
                System.out.println("First Name: "+c.getFirstName());
                System.out.println("Phone No.: "+c.getPhoneNumber());
                System.out.println("Email: "+c.getEmailId());
                break;
            }
            case 4:
            {
                System.out.println("Enter the Phone number to remove :");
                long removePhoneNumber = sc.nextLong();
                sc.nextLine();
                System.out.println("Do you want to remove the contact (Y/N):");
                String confirm = sc.nextLine();
                confirm = confirm.toLowerCase();
                if(confirm.equals("y"))
                {
                    boolean deletedContact = p.removeContact(removePhoneNumber);
                    if(deletedContact){
                        System.out.println("contact is successfully del.");
                    }
                }
                break;
            }
            default: {
                break;
            }
        }
    }
}