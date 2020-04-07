import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main( String[] args ){
        ArrayList<Integer> a0 = new ArrayList<Integer>( Arrays.asList(100,500,900) );
        ArrayList<Integer> a1 = new ArrayList<Integer>( Arrays.asList(800,600,300) );
        ArrayList<Integer> a2 = new ArrayList<Integer>( Arrays.asList(400,700,200) );

        ArrayOrganizer arrayOrganizer = new ArrayOrganizer();

	System.out.println( "Result => " + arrayOrganizer.concatAndSort(a0,a1,a2) );

	System.out.println("Successfully reverted in Git");
        

    }
}
