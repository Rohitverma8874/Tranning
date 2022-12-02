 import java.util.Scanner;

    public class Task2Order{
        public static void main(String[] args){

            System.out.println("Enter the product");
            Scanner sc= new Scanner(System.in);
            String productName = sc.next();
            int quantity = sc.nextInt();
            System.out.println("product "+productName+" and quantity "+quantity);

            String cooker;
            while (productName.equals("laptop")){
                if (quantity > 50) {
                    int price = quantity*850;
                    System.out.println("Total price is "+price);
                    break;
                } else if (quantity < 50 && quantity > 30) {
                    int price = quantity*900;
                    System.out.println("Total price is "+price);
                    break;
                } else if (quantity<30) {
                    int price = quantity*950;
                    System.out.println("Total price is "+price);
                    break;
                }
            }

            String kettle;
            while (productName.equals("Mobile")){
                if (quantity > 50) {
                    int price = quantity*700;
                    System.out.println("Total price is "+price);
                    break;
                } else if (quantity < 50 && quantity > 30) {
                    int price = quantity*800;
                    System.out.println("Total price is "+price);
                    break;
                } else if (quantity<30) {
                    int price = quantity*900;
                    System.out.println("Total price is "+price);
                    break;
                }
            }



        }
    }

