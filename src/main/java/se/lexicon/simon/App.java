package se.lexicon.simon;


public class App 
{
    public static void main( String[] args ) {


        //Pen object1 = new WhiteBoardPen();

        Pen object = new BallPointPen();
        System.out.println(object.getDescription());

    }
}
