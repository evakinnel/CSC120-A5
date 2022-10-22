/*
 * Eva Kinnel
 * Pants class
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Pants {

    /*
     * Prints ASCII Art skirt
     */
    public void display() {
        System.out.println("       /_________________\\");
        System.out.println("      /                   \\");
        System.out.println("     /                     \\");
        System.out.println("    /                       \\");     
        System.out.println("   /                         \\");
        System.out.println("  /                           \\");
        System.out.println(" (                             )");
        System.out.println("(                               )");
        System.out.println("(EVAEVAEVAEVAEVAEVAEVAEVAEVAEVAEV)");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}
