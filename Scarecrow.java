/*
 * Eva Kinnel
 * Scarecrow class
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

class Scarecrow {

    /* Parts of the Scarecrow */
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    // private Hat hat;
    private Boot leftFoot;
    private Boot rightFoot;
    // private Banner sign;
    // private String message;

    /* Constructor */
    public Scarecrow(Pumpkin h, Shirt bod, Pants l, Boot lF, Boot rF){//, Banner s, String m) {
        head = h;
        body = bod;
        legs = l;
        leftFoot = lF;
        rightFoot = rF;
        // sign = s;
        // message = m;

    }

    /* Displays the Scarecrow */

    public void display() {
        // sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }

    /* Main method (for testing) */
    public static void main(String[] args) {

        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(), 
        new Boot("top"), new Boot("bottom"));//, new Banner(), new String());

        // If a message was passed in on the command line, extract and store it
        // TODO: in Step 4, you'll pass this value along to your Banner constructor
        // if (args.length > 0) {
        //     myScarecrow.message = args[0];
        // }

        myScarecrow.display();
    }

}
