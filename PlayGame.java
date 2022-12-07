import java.util.Scanner;
public class PlayGame {

    public static void main(String[] args) {

        // tells us whether the game is still running
        boolean isRunning = false;

        // gets input from the user
        Scanner input = new Scanner(System.in);

        // Storage for user's responses
        String userResponse = "";

        System.out.println("Welcome to Pigeon, enter \"look around\" to begin the game!");

        //creates new pigeon and map locations
        Pigeon myPigeon = new Pigeon();

        userResponse = input.nextLine();

        //give the opening message and prompt the user to start the game
        do {
            if (userResponse.toLowerCase().equals("look around")){
                System.out.println("You are awoken by the sound of your hungry baby pigeons.");
                    System.out.println("You look around your nest, and are faced with the fact that you have no more worms to give them.");
                    System.out.println("It's time for an adventure...");
                    System.out.println("Enter \"go\" plus a direction to begin your journey. If you are stuck at any time, enter \"help\" for a list of commands.");
                    isRunning = true;
            }
            else{
                System.out.println("Please enter \"look around\" to get started.");
                userResponse = input.nextLine();
            }
        } while (!isRunning);

        //main game loop
        do {
            //gets user input
            userResponse = input.nextLine();

            //movement
            if (userResponse.toLowerCase().contains("go") || userResponse.toLowerCase().contains("walk") || userResponse.toLowerCase().contains("fly")){
                if (userResponse.toLowerCase().contains("north")){
                    myPigeon.move("n");
                }
                else if (userResponse.toLowerCase().contains("south")){
                    myPigeon.move("s");
                }
                else if (userResponse.toLowerCase().contains("east")){
                    myPigeon.move("e");
                }
                else if (userResponse.toLowerCase().contains("west")){
                    myPigeon.move("w");
                }
                else {
                    System.out.println("Please enter go + north, south, east, or west.");
                }
            }

            //interaction
            else if (userResponse.toLowerCase().contains("talk") || userResponse.toLowerCase().contains("interact")){
                System.out.println("talking...");
            }

            //picking up an item
            else if(userResponse.toLowerCase().contains("take") || userResponse.toLowerCase().contains("grab") || userResponse.toLowerCase().contains("pick up")){
                System.out.println("taking...");
            }

            //dropping an item
            else if (userResponse.toLowerCase().contains("drop") || userResponse.toLowerCase().contains("discard")){
                System.out.println("dropping...");
            }

            //looking around
            else if (userResponse.toLowerCase().contains("look")){
                System.out.println("looking around");
            }

            //gives possible commands
            else if (userResponse.toLowerCase().contains("help")){
                System.out.println("helping...");
            }

            //exits the game
            else if (userResponse.toLowerCase().contains("quit") || userResponse.toLowerCase().contains("exit") || userResponse.toLowerCase().contains("stop")){
                System.out.println("exiting the game...");
                isRunning = false;
                input.close();
            }

            else if (userResponse.toLowerCase().equals("show inventory")) {
                System.out.println("inventory: ");
                for (int i=0; i<myPigeon.inventory.size(); i++){
                    System.out.println(myPigeon.inventory.get(i));
                }
            }

            else{
                System.out.println("\"" + userResponse + "\"" + " is not a valid command. Enter \"help\" for a list of valid commands");
            }

        } while (isRunning);
 }
}