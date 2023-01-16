import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static char[] fillThis = {'_','_','_','_','_','_','_','_','_'};
    public static Scanner scan =new Scanner(System.in); 


public static void main(String[] args) {

    String charArray = randomWord(words);
    char[] computerGuess = charArray.toCharArray();
    int wordCount = charArray.length();
    int countMisses = 0;
    int updateMisses;
    char [] missedWord = new char[10];
    char [] compare = new char[charArray.length()];



    while (countMisses!=7){
        System.out.println(charArray);
        updateMisses=0;
        System.out.println(gallowFuct(countMisses));
        System.out.println("\n");
        System.out.print("Word: ");
        printWord(fillThis,wordCount);
        System.out.println("\n");
        System.out.println("Misses: "+String.valueOf(missedWord));
        System.out.println("\n");
        if(String.valueOf(compare).equals(charArray)){
            System.out.println("\t\t \n Good Work");
            break;}
        System.out.print("Guess: ");
        char userGuess = scan.next().charAt(0);
       
            for (int i=0;i<charArray.length();i++){
                if(userGuess==(computerGuess[i])){
                    System.out.println("you getting somewhere fam");
                    fillThis[i] = userGuess;
                    compare[i] =userGuess;
                    updateMisses=1;        
        }
    } 
            if(updateMisses==0) {
                missedWord[countMisses]=userGuess;
                countMisses +=1;
        }    
    System.out.println("\n");
    System.out.println("Rip");
    System.out.println("\nThe word was: "+charArray);
    }
 }

   
    



public static String randomWord(String[] words){
    double chooseRandom = Math.random()*64;
    return words[(int)chooseRandom];
}

public static String gallowFuct(int misses){
    switch(misses){
        case 0 : return gallows[0];
        case 1 : return gallows[1];
        case 2 : return gallows[2];
        case 3 : return gallows[3];
        case 4 : return gallows[4];
        case 5 : return gallows[5];
        case 6 : return gallows[6];
        default: return "it will not get here";
    }
}

public static void printWord (char[]fillThis, int wordCount){
    for(int i=0;i<wordCount;i++){
        System.out.print("  "+fillThis[i]);
    }
}




}






