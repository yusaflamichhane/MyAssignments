public class Assignment2 {
    public static void main(String[] args) {
   /*make a calculator to find out
        	the simple interest
       	    the compound interest

        - assume the values of p, n and r as per your imagination
        - use class way designing technique to solve this
        */
        InterestCalculator calculator = new InterestCalculator();
        calculator.interestCalculator(25000,2,5);
        calculator.calculateSimpleInterest();
        calculator.calculateCompoundInterest();
        calculator.printDetails();
        double simpleInterest = calculator.calculateSimpleInterest();
        System.out.println("Simple Interest is : $"+simpleInterest);
        double compoundInterest = calculator.calculateCompoundInterest();
        System.out.println("Compound Interest is :$"+compoundInterest);

    }
    }

 class InterestCalculator {
    private int principal;
    private int time;
    private double rate;

    void interestCalculator(int x, int y, double z)
    {
         System.out.println("Interest Details");
      principal =x;
      time = y;
      rate =z;
      calculateSimpleInterest();
      calculateCompoundInterest();
    }
     void printDetails() {
         System.out.println("Principal :$" + principal);
         System.out.println("Time :" + time+" years");
         System.out.println("Rate :" + rate+"%");
         System.out.println("####################################");
     }
    double calculateSimpleInterest()
    {
        return (principal * time * rate) / 100;
    }

    double calculateCompoundInterest()
    {
        return principal * Math.pow((1 + rate / 100), time);
    }
}








