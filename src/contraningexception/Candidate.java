/*package contraningexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Candidate {

    public Candidate(String name, String Gender,Double salery){
        try {
            Scanner sc = new Scanner((System.in);
            System.out.println("Enter Your Name");
            String Name = sc.next();
            if (!(Name.matches("^[a-zA-Z]*$"))){
                throw new InputMismatchException();
            }
            System.out.println("Enter Your Gender M or F");
            Character Gender =sc.next().charAt(0);
            if (!(Gender.charValue()=='M'||Gender.charValue()=='F')){
                throw new InputMismatchException();
            }


            System.out.print("Enter Your Salary ");
            double Salary=sc.nextInt();


          if (Salary<10000){
              throw new MyException("Salary can not be less than 10000 ");
          }
          Candidate can = new Candidate(Name,Gender,Salary);
          System.out.println(can.getName());
          System.out.println(can.getGender());
          System.out.println(can.getSalary());
        }
        catch (InputMismatchException||MyException e) {
            if (e instanceof InputMismatchException)
               System.out.println("InputMismatchException Occured");
            if (e instanceof MyException){
                System.out.println("InvalidSalaryException");
            }
        }
    }
}
*/
