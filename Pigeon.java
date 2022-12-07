import java.util.ArrayList;

public class Pigeon{

    int xpos;
    int ypos;
    ArrayList<String> inventory;
    public boolean canMoveNorth = false;
    public boolean canMoveSouth = true;
    public boolean canMoveEast = false;
    public boolean canMoveWest = true;

    //creates a new map
    Map myMap = new Map();

    public Pigeon(){
        this.xpos = 0;
        this.ypos = 0;
        inventory = new ArrayList<String>();
    }
    
    public void move(String direction){
            switch (direction){
                case "n":
                    if (canMoveNorth){
                        ypos += 1;
                        System.out.println("New pos: " + "(" + xpos + ", " + ypos + ")");
                        checkLocation();
                        break;
                     }
                     else{
                        System.out.println("The path towards your north is obstructed");
                        break;
                     }
                case "s":
                     if (canMoveSouth){
                         ypos -= 1;
                         System.out.println("New pos: " + "(" + xpos + ", " + ypos + ")");
                         checkLocation();
                         break;
                     }
                     else{
                        System.out.println("The path towards your south is obstructed");
                        break;
                     }
                case "e":
                     if (canMoveEast){
                         xpos += 1;
                         System.out.println("New pos: " + "(" + xpos + ", " + ypos + ")");
                         checkLocation();
                         break;
                     }
                     else{
                        System.out.println("The path towards your east is obstructed");
                        break;
                     }
                case "w":
                     if (canMoveWest){
                         xpos -= 1;
                         System.out.println("New pos: " + "(" + xpos + ", " + ypos + ")");
                         checkLocation();
                         break;
                     }
                     else{
                        System.out.println("The path towards your west is obstructed");
                        break;
                     }
            }
    }

    public void checkLocation(){

       if (xpos == 0 && ypos == 0){
            myMap.nest();
            canMoveNorth = false;
            canMoveEast = false;
            canMoveSouth = true;
            canMoveWest = true;
       }

       else if (xpos == -2 && ypos == -2){
            myMap.river();
            canMoveNorth = true;
            canMoveEast = true;
            canMoveSouth = false;
            canMoveWest = false;
        }

        else if (xpos == -2 && ypos == 1){
            myMap.park();
            canMoveNorth = false;
            canMoveEast = true;
            canMoveSouth = true;
            canMoveWest = false;
        }

       else if (xpos == 2 && ypos == 1){
            myMap.square();
            canMoveNorth = false;
            canMoveEast = false;
            canMoveSouth = true;
            canMoveWest = true;
        }

        else if (xpos == 1 && ypos == 1){
            myMap.sewer();
            canMoveNorth = false;
            canMoveEast = true;
            canMoveSouth = false;
            canMoveWest = false;
        }

        else if (xpos == 2 && ypos == -2){
            myMap.store();
            canMoveNorth = true;
            canMoveEast = false;
            canMoveSouth = false;
            canMoveWest = true;
        }

       else if (xpos == 0 && ypos == -1){
            System.out.println("You hear the distant sound of running water. It may prove beneficial to follow it...");
            canMoveNorth = true;
            canMoveEast = true;
            canMoveSouth = false;
            canMoveWest = true;
        }

       else if (xpos == 1 && ypos == -1){
            System.out.println("You waddle along the sidewalk, making sure to avoid the big clumsy feet of humans passing by.");
            canMoveNorth = false;
            canMoveEast = true;
            canMoveSouth = true;
            canMoveWest = true;
        }

        else if (xpos == 1 && ypos == -2){
            System.out.println("You enter a parking lot full of shopping carts. You look around and see a store to your east.");
            canMoveNorth = true;
            canMoveEast = true;
            canMoveSouth = false;
            canMoveWest = false;
        }

       else if (xpos == 2 && ypos == -1){
            System.out.println("You enter a parking lot full of shopping carts. You look around and see a store to your south.");
            canMoveNorth = true;
            canMoveEast = false;
            canMoveSouth = true;
            canMoveWest = true;
        }

        else if (xpos == 2 && ypos == 0){
            System.out.println("You hear the distant sound of a fountain, and the number of people around you seems to increase");
            canMoveNorth = true;
            canMoveEast = false;
            canMoveSouth = true;
            canMoveWest = false;
        }

        else if (xpos == -1 && ypos == -1){
            System.out.println("The ground seems to be getting more damp. Maybe there's some water around here...");
            canMoveNorth = true;
            canMoveEast = true;
            canMoveSouth = true;
            canMoveWest = true;
        }

        else if (xpos == -1 && ypos == -2){
            System.out.println("You can hear ducks quacking and water running to your west. ");
            canMoveNorth = true;
            canMoveEast = false;
            canMoveSouth = false;
            canMoveWest = true;
        }

        else if (xpos == -2 && ypos == -1){
            System.out.println("You can see a river to your south. Maybe you should explore it...");
            canMoveNorth = true;
            canMoveEast = true;
            canMoveSouth = true;
            canMoveWest = false;
        }

        else if (xpos == -2 && ypos == 0){
            System.out.println("As you waddle along the tree lined path, you begin to hear children playing to your north.");
            canMoveNorth = true;
            canMoveEast = true;
            canMoveSouth = true;
            canMoveWest = false;
        }

        else if (xpos == -1 && ypos == 0){
            System.out.println("To your east you can see your hungry baby pigeons crying. It is essential that you bring them worms before it's too late.");
            canMoveNorth = true;
            canMoveEast = true;
            canMoveSouth = true;
            canMoveWest = true;
        }

        else if (xpos == -1 && ypos == 1){
            System.out.println("You see children playing at a park to your west. I wonder if they could be any help on your journey...");
            canMoveNorth = false;
            canMoveEast = false;
            canMoveSouth = true;
            canMoveWest = true;
        }

    }
}