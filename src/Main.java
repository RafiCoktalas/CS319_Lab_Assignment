import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main( String[] args ){
        ArrayList<Integer> a0 = new ArrayList<Integer>( Arrays.asList(100,500,900) );
        ArrayList<Integer> a1 = new ArrayList<Integer>( Arrays.asList(800,600,300) );
        ArrayList<Integer> a2 = new ArrayList<Integer>( Arrays.asList(400,700,200) );

        ArrayOrganizer arrayOrganizer = new ArrayOrganizer();

        System.out.println( "Result => " + arrayOrganizer.concatAndSort(a0,a1,a2) );

        System.out.println("-----------------------------");

        Player tom = new Player("Tom");
        Player john = new Player("John");
        Player james = new Player("James");
        Player henry = new Player("Henry");

        Die d = new Die();
        int points = 0;

        for( int i = 0; i < 20; i++ ){
            points = d.rollDie();
            switch( i % 4 ){
                case 0:
                    tom.addScore(points);
                    break;
                case 1:
                    john.addScore(points);
                    break;
                case 2:
                    james.addScore(points);
                    break;
                case 3:
                    henry.addScore(points);
                    break;
            }
        }

        System.out.println(tom);
        System.out.println(john);
        System.out.println(james);
        System.out.println(henry);


    }
}
