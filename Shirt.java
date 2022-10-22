/*
 * Eva Kinnel
 * Shirt class 
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Shirt {

    /*
     * displays an ASCII Art Shirt and bellybutton
     */
    public void display() {
        

        System.out.println("         ___|       |___");
        System.out.println("     .;'                ';.");
        System.out.println("     ;;                  ;;");
        System.out.println("     ()                  ()");
        System.out.println("     .\\__     \\   /     __/.");
        System.out.println("     |    '''''\\_/''''''   |"); 
        System.out.println("     |                     |");
        System.out.println("      \\         /\\        /");
        System.out.println("       |'               '|");  
        System.out.println("       |                 |");  
        System.out.println("       |                 |");
        System.out.println("       |_________________|");
        System.out.println("        |       º       |");

    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}
