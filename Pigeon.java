import java.util.ArrayList;

public class Pigeon {

    int xpos;
    int ypos;
    ArrayList<String> inventory;
    float money;
    int worms;

    public Pigeon() {
        this.xpos = 0;
        this.ypos = 0;
        inventory = new ArrayList<String>();
        this.money = 0.00f;
        this.worms = 0;
    }

    public void move(String direction) {
        switch (direction) {
            case "n":
                ypos += 1;
                System.out.println("New pos: " + "(" + xpos + ", " + ypos + ")");
                break;
            case "s":
                ypos -= 1;
                System.out.println("New pos: " + "(" + xpos + ", " + ypos + ")");
                break;
            case "e":
                xpos += 1;
                System.out.println("New pos: " + "(" + xpos + ", " + ypos + ")");
                break;
            case "w":
                xpos -= 1;
                System.out.println("New pos: " + "(" + xpos + ", " + ypos + ")");
                break;

        }
    }

    public void grab(String item) {
        inventory.add(item);
        System.out.println(
                item + " has been added to your inventory. Use drop to get rid of it.");
    }

    public void drop(String item) {
        if (inventory.contains(item)) {
            inventory.remove(item);
            System.out.println(item + " removed from your inventory.");
        } else {
            System.out.println("Cannot drop " + item + " because it is not in your inventory.");
        }
    }

    public boolean canAfford(String item) {
        if (item.equals("Water")) {
            return money >= 2;
        }
        if (item.equals("Bread")) {
            return money >= 4;
        }
        if (item.equals("Milk")) {
            return money >= 3;
        } else {
            return money >= 15;
        }
    }
}
