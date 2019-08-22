public class Expressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12, b = 5;
		int c = a + b; 
		System.out.println("c = "+c);
		int d = a / b;  
		System.out.println("d = "+d); 
		
		double e = 12;
		double f = e / b;
		System.out.println("f = "+f); 
		
		double g = 3.4;
		int h = (int)(g+0.5); //casting
		System.out.println("h = "+h); 
		
		double i = 3.6;
		int j = (int)(i+0.5);
		System.out.println("j = "+j); 
			
		/*
		 * can you determine what operation does (int)(x+0.5)
		 * perform?
		 * 
		 */
		
		//bonus points for determining why are there warnings below?
		System.out.println("false && false = " +(false && false));
		System.out.println("false && true  = " +(false && true));
		System.out.println("true  && false = " +(true && false));
		System.out.println("true  && true  = " +(true && true));
		
		System.out.println("false || false = " +(false || false));
		System.out.println("false || true  = " +(false || true));
		System.out.println("true  || false = " +(true || false));
		System.out.println("true  || true  = " +(true || true));
		
		System.out.println("!true = "+(!true));
		System.out.println("!false = "+(!false));
	}

}
