import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        
        int result;
        int score = 0;

        System.out.println("Let's play Rolling Java. Type anything to start.");
        String anyThing = scan.nextLine();
        System.out.println("-Great, here are the rules: \n");
        System.out.println("-If you roll a 6, the game stops.");
        System.out.println("-otherwise, you get 1 point. \n");
        System.out.println("You must collect at least 3 point to win.Enter anything to roll: ");

        while (true){
           scan.nextLine();
            result = rollDice();
           System.out.println("You rolled: "+result );

           if (result==6){
            System.out.println("End of game");
            break;

           }else if (result==4){
            System.out.println("Zero points.keep rolling!");
            score +=0;
            continue;

           }else {
            System.out.println("One point. keep rolling");
            score +=1;
            continue;
           }
        }
        System.out.println("Your score is: "+ score);
        if (score>=3){
            System.out.println("woow, thats luck!. you win!");
        }else{
            System.out.println("Tough luck, you lose: (");
        }

     
      }
      public static int rollDice(){
        double random = Math.random() *6;
        random +=1;        
        return (int)random;

    }
  
  

  
  
}
