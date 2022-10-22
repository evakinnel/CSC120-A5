/*
 * Eva Kinnel
 * Boot class
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Boot {
  
    private String direction;
  
    /* Constructor */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    /*
     * prints/displays ASCII Art Boots!
     */
    public void display() {
        if (this.direction.equals("top")) {
          System.out.println("    |          | |          |");
          System.out.println("    |          | |          |");
          System.out.println("    |          | |          |");
          System.out.println("    |          | |          |");
          System.out.println("    |__________| |__________|");
          System.out.println("    \\     X    | |     X    |");
          System.out.println("     \\    X   /   \\    X    /");
          System.out.println("     |    X   |   |    X    |");
          System.out.println("     |    X   |   |    X    |");
          System.out.println("     |    X   |   |    X    |");
          System.out.println("     |    X   |   |    X    |");
          System.out.println("     |    X   |   |    X    |");
  
;
        } else if (this.direction.equals("bottom")) {
          System.out.println("      \\   X   /    \\   X   /");
          System.out.println("      \\   X   /    \\   X   /");
          System.out.println("      |   X  |      |  X  |");
          System.out.println("     /       |      |      \\");
          System.out.println("    /        |      |       \\");
          System.out.println("___/         |      |        \\___");
          System.out.println("|        |   |      |   |         |");
          System.out.println("|________A___|      |___A_________|");
  
        } else {
          System.out.println("Which boot?");
        }
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("top");
        Boot myRightBoot = new Boot("bottom");
        myLeftBoot.display();
        myRightBoot.display();
    }
}
