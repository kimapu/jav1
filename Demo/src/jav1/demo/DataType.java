package jav1.demo;

public class DataType {

	public static void main(String[] args) {
		
		//Primitive type for data
			//byte(8bit), short(16bit), int(32bit), long(64bit)
			//code samples, 
			byte b = 120;
			short s = 130;
			int i = 1000000;
			long l = 100000000000L; 
			//by default, Java compiler interpretes the n as int
				//if n is long typed, L or l is required
			
			//float(32bit), double(64bit)
			float f = (float)99.9; //type casting
			//by default, in compiler's eye floating point n is double typed
			double d = 99.9;
			
		//Special/ object type
			//String is a special data type (Object based)
			String str = new String("hello");
			//equivalent, String s = "hello";
			
		//Wrapper class
			//every primitive type has a corresponding wrapper class
			//Byte, Short, Integer, Long, Float, Double, Character
			char c = 'a';
			//how to check this c is digit?
			boolean isDigit = Character.isDigit(c);
			
			//can we declare variables using wrapper ?
			Integer i2 = 100; //primitive type or object type?
			//note: auto boxing feature takes place to fit 100 into i2
			//equivalent, Integer i2 = new Integer(100);
			
			//expression in mixed type
			byte b2 = 1;
			short s2 = 10;
			short r1 = (short)(b2 + s2);
			
			long l2 = 999;
			long r2 = s2 + l2;
			
			
	}

}
