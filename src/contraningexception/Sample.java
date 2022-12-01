    package contraningexception;

    import java.io.File;
    import java.io.FileReader;
    import java.util.Scanner;

    public class Sample {
    public static void main(String args[]){


    Scanner s = new Scanner(System.in);
    System.out.println("Enter age");
    int ar[] = {6};

    try {
        for (int i = 0; i <=5; i++)
                ar[i] = s.nextInt();
                System.out.print(" this is not a exception ");


    }
    catch (ArithmeticException e) {
        System.out.println("Arithmatic Exception : : ");
    }
    catch (Exception e){
        System.out.println("Arithmatic Exception encountered : : ");
    }
    finally {
        System.out.println("Inside Finally: : :");
    }
    System.out.println("Program continues.. ..");
    }
    }
