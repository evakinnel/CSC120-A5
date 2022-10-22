/*
 * Eva Kinnel
 * Banner class
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */


public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /* Displays an ASCI text box to contain message
     * @param none
     * @return none
    */
    public void display() {
        for (int i = 0; i <= message.length()+4; i++) {
            System.out.print("-"); //top
        }
        System.out.println("");
        System.out.println("∆ " + this.message + " ∆"); //side decorations
        for (int i = 0; i <= message.length()+4; i++) {
            System.out.print("-"); //bottom
        }
        System.out.println("\n    V"); //tail
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Enjoy Autumn");
        myBanner.display();
    }
}
