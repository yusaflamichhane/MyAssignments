import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("Laptop Selection");
        System.out.println("1. Lenovo");
        System.out.println("2. HP");
        System.out.println("3.Dell");
        System.out.println("4. None");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select your choice :");
        int choice = scanner.nextInt();



        switch (choice)
        {
            case 1:
                System.out.println("Great Selection: We have Thinkpad X9 Carbon");
                System.out.println("with 16 GB RAM...");
                System.out.println("and 1TB SSD...");
                break;
            case 2: System.out.println("Always a fan of HP, i think you are too");
                System.out.println("with 64 GB RAM...");
                System.out.println("512 GB SSD + 1 TB HDD...");
                System.out.println("comes with Nvidia GeForce RTX 40 Series GPU...");
                break;
            case 3: System.out.println("Dell!!!!....awesome... we have a deal going on this laptop with 8 GB RAM...");
                System.out.println("256 GB SSD ...");
                System.out.println("comes with 3 years of factory warranty and 1 year subs of office 365...");
                break;
            case 4: System.out.println("Hope to see you back");
            break;

            default:
                System.out.println("Please select a laptop that meets your needs");
        }
    }
}
