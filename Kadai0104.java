// 20120903
// 課題4：入力した数字によって、EvenとOddを出力

public class Kadai0104 {
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		if(n % 2 == 0){
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}
