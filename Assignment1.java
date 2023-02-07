public class Assignment1 {
    //a=5, b=4, c=8 write a java program to find out which number is greatest out of these//
    //HINT : use && to solve this//
    public static void main(String[] args)
    {

                int a = 5;
                int b = 8;
                int c = 10;
                int greatestNumber;

                if (a > b && a > c) {
                    greatestNumber = a;
                } else if (b > a && b > c) {
                    greatestNumber = b;
                } else {
                    greatestNumber = c;
                }

                System.out.println("The greatest number is: " + greatestNumber);
            }
        }
