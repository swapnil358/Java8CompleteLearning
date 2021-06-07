package LambdaExpression;

public class TestRunner {

	public static void main(String[] args) {

		// Conventional way
		IPrintable obj = new LogFileImp();
		obj.print();

		
		
		
		// Anonymous inner class
		IPrintable obj1 = new IPrintable() {

			@Override
			public void print() {
				System.out.println("From anonymous inner class");

			}
		};
		obj1.print();

		
		
		
		// Funtional programming
		//  -> (lambda expression)
		//Rules:
		//Method parameter should match
		//1. parameter the abstract method and your lambda expression
		//2. Return type of your abstract method and lambda expression should match
		//3. Only one abstract and Unimplemeted method
		IPrintable obj2 = () -> System.out.println("I am Lambda expression");
		obj2.print();
			
		};

	}

