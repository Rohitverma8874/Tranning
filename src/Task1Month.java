import java.util.Scanner;
public enum Task1Month{


        January(1),
        Febraury(2),
        March(3),
        April(4),
        May(5),
        june(6),
        july(7),
        august(8),
        september(9),
        october(10),
        november(11),
        december(12);

        private  int mon;
        private Task1Month(int mon)
        {
            this.mon=mon;
        }




        public static void main(String[] args) {

            System.out.println("Enter the num of month: ");
            Scanner sc = new Scanner(System.in);
            int num=sc.nextInt();

            for(Task1Month monthName:Task1Month.values())
            {
                if( monthName.mon==num)
                {
                    System.out.println(num +" th month is "+monthName);
                }
            }

        }
    }
