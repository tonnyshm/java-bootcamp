import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        //Task 3 – Wait for the user to press enter.
        scan.nextLine();
        //Task 4 – Get two random cards.
        int randomCardNumber1 = drawRandomCard();
        int randomCardNumber2 = drawRandomCard();
        String randomCard1 = cardString(randomCardNumber1);
        String randomCard2 = cardString(randomCardNumber2);


        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>

        System.out.println(" \n You get a \n"+ randomCard1+ "\n and a \n" +randomCard2);
        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>

        int handValue = randomCardNumber1 + randomCardNumber2;
        System.out.println("your total is: " +handValue);

        
        //Task 6 – Get two random cards for the dealer.
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden

        int dealerCardNumber1 = drawRandomCard();
        int dealerCardNumber2 = drawRandomCard();

        String dealerCard1 = cardString(dealerCardNumber1);
        String dealerCard2 = cardString(dealerCardNumber2);

        System.out.println("The dealer shows \n" + dealerCard1 + "\nand has a card facing down \n" + faceDown());
        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop. 

        while(true){
            String playerChoice = hitOrStay();
            if (playerChoice.equals("hit")){
                randomCardNumber1 = drawRandomCard();
                randomCard1 = cardString(randomCardNumber1);
                handValue +=randomCardNumber1 ;
                if (handValue>21){
                    System.out.println("Bust! Player loses");
                    System.exit(0);
                }
                System.out.println("\n you get a \n" +randomCard1);
                System.out.println("Your new total is: "+handValue);
            }else if (playerChoice.equals("stay")){
                break;
            }}

            System.out.println("\n Dealer's turn");
            System.out.println("\n the dealer's card are \n" +dealerCard1 +"\n" + " and a \n"+ dealerCard2);
            int dealerHandValue = dealerCardNumber1+dealerCardNumber2;

            if (dealerHandValue>21){
                System.out.println("Brust! Dealer loses");
                System.exit(0);
            }
            while(dealerHandValue<17){
                dealerCardNumber1 = drawRandomCard();
                dealerCard1 = cardString(dealerCardNumber1);
                System.out.println("\n Dealer gets a \n"+dealerCard1);
                dealerHandValue +=dealerCardNumber1;
                System.out.println("\n Deale's total is: "+ dealerHandValue);
                if (dealerHandValue>21){
                    System.out.println("Brust! Dealer loses");
                    System.exit(0);
                }
                
            }
            if (handValue>dealerHandValue){
                System.out.println("Player win!");

            }else if (handValue==dealerHandValue){
                System.out.println("Draw");
            }else{
                System.out.println("Dealer wins");
            }



        
        //For tasks 9 to 13, see the article: Blackjack Part II. 
         scan.close();
        }

    

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */

     public static int drawRandomCard(){
        double random = Math.random() *13;
        random +=1;
        return  (int)random;

     }
     
    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */

    public static String cardString(int cardNumber){

        if (cardNumber ==1){
            return "_____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";

        }else if (cardNumber==2){
            return "   _____\n"+              
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n";

        }else if (cardNumber==3){
            return  "   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n";

        }else if (cardNumber==4){
            return  "   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";

        }else if (cardNumber==5){
            return   "   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n";

        }else if (cardNumber==6){
            return "   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n";

        }else if (cardNumber==7){
            return "   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n";

        }else if (cardNumber==8){
            return  "   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n";

        }else if (cardNumber==9){
            return 
            "   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n";

        }else if (cardNumber==10){
            return "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";

        }else if (cardNumber==11){
            return "   _____\n" +
            "  |J  ww|\n"+ 
            "  | o {)|\n"+ 
            "  |o o% |\n"+ 
            "  | | % |\n"+ 
            "  |__%%[|\n";

        }else if (cardNumber==12){
            return "   _____\n" +
            "  |Q  ww|\n"+ 
            "  | o {(|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%O|\n";

        }else if (cardNumber==13){
            return  "   _____\n" +
            "  |K  WW|\n"+ 
            "  | o {)|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%>|\n";

        }else{
            return "";
        
        }
    }


    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */

    public static String hitOrStay(){
        while (true){
            System.out.println("Press 'hit' or 'stay' ");
            String userChoice = scan.nextLine();
            if (!(userChoice.equals("hit") || userChoice.equals("stay"))){
                continue;
            }
            return userChoice;     
        }
    }

    }

