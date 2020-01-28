	package test;

public class Test   {
		public static void test() {
		System.out.println("In the pulblic function");
		   }
		
	
			 public static void main(String[] args) {
				 try {
						System.out.println("Starting of try block");
						// I'm throwing the custom exception using throw
						test();
					
				 }	catch(Exception exp){
						System.out.println("Catch Block") ;
						System.out.println(exp) ;
					}
				   }
			 
		}
	
	
