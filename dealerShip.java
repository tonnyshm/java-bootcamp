package Section3;

import java.util.Scanner;

public class dealerShip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the java Dealership");
        System.out.println(" . Select option 'a' to buy a car");
        System.out.println(" . Select option 'b' to sell a car");

        String option = scan.nextLine();
        switch (option) {
            case "a":
                System.out.println("What is your Budget");
                int budget = scan.nextInt();
                if (budget >= 10000) {
                    System.out.println("Great! A Nissan Altima is available");
                    System.out.println("\n do you have insurance? Write 'yes' or 'no");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\n do you hava a License? Write 'yes' or 'no' ");
                    String license = scan.nextLine();
                    System.out.println("what is your credit score?");
                    int creditscore = scan.nextInt();

                    if (insurance.equals("yes") && license.equals("yes") && creditscore > 660) {
                        System.out.println("Sold!, pleasure doing business with you!");
                        break;
                    } else {
                        System.out.println("we're sorry. you are not eligible");
                        break;
                    }

                } else {
                    System.out.println("We dont sell cars under $10000, Sorry!");
                    break;
                }
            case "b":
                System.out.println("\nwhat is your car values at?");
                int value = scan.nextInt();
                System.out.println("\nwhat is your selling price");
                int price = scan.nextInt();

                if (value > price && price < 30000) {
                    System.out.println("\nWe will buy your car. Pleasure doing business with you!");
                    break;

                } else {
                    System.out.println("\nSorry, We are not interested!");
                }
                break;
            default:
                System.out.println("invalid option");
                break;
        }
        scan.close();
    }

}
