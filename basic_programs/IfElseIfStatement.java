package basic_programs;

public class IfElseIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10, num2 = 20;
		if (num1 > num2) {// greater than condition
			System.out.println("num1 is greater");
		} else if (num1 == num2) {// equal condition
			System.out.println("Both are same");
		} else {// less than condition
			System.out.println("num2 is greater");
		}
	}

}