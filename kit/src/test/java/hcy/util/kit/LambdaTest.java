package hcy.util.kit;

public class LambdaTest {

	public static void main(String[] args) {
		MathOperation add = (int a, int b) -> a + b; 
		MathOperation sub = (a, b) -> a-b;
		MathOperation mul = (int a, int b) -> { return a * b; };
		MathOperation div = (int a, int b) -> a / b;
	
	}
	
	 interface MathOperation {
         int operation(int a, int b);
      }

      interface GreetingService {
         void sayMessage(String message);
      }

      private int operate(int a, int b, MathOperation mathOperation){
         return mathOperation.operation(a, b);
      }
}
