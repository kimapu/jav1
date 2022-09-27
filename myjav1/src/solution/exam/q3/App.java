package solution.exam.q3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class App {

	public static void main(String[] args) {
		tst3b();
	}

	static void tst3b()
	{
		List<String> nameLst = Arrays.asList("oranges", null, "apples", "grapes", "banana");
		
		System.out.println( ">> Length: " );
		nameLst.forEach( elem -> System.out.printf( "%s\t:%5d\n", elem, elem.length() ));
		
		//solution1
//		System.out.println( ">> Solution-1" );
//		nameLst.forEach( elem -> {
//			try {
//				System.out.printf( "%s\t:%5d\n", elem, elem.length() );
//			} catch (Exception e) {
//				System.err.println("Nullable exception!");
//			}
//		} );
//		
//		System.out.println();
		
		//recommended!
//		class ThreeA
//		{
//			//recommend!
//			Consumer<String> wrap(Consumer<String> consumer)
//			{
//				return s -> {
//					try {
//						consumer.accept(s);
//					} catch (Exception e) {
//						System.err.println("Nullable exception!");
//					}
//				};
//			}
//		}
//		System.out.println( ">> Recommended!" );
//		nameLst.forEach( new ThreeA().wrap(elem -> System.out.printf( "%s\t:%5d\n", elem, elem.length() ) ));
		
	}
	
	
	
}
