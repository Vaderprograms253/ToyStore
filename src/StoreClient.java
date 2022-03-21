import java.util.*;

public class StoreClient
{
	public static void main(String[] args)
	{
		ToyStore store = new ToyStore();
		store.loadToys("Baseball-5.99 SoccerBall-2.99 Barbie-9.99 Barbie-9.99 Slinky-3.99 Jenga-15.99" );
		System.out.println( store );	
      System.out.println();
	   
    
      System.out.println( "Toy most frequently bought: " + store.getMostFrequentToy() );
      System.out.println( );
      
      
      
   }
}