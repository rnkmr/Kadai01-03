// 20120903
// 課題5：1～入力した数字を出力

//public class Kadai0105 {
//	public static void main(String args[]){
//		int n = Integer.parseInt(args[0]);
//		for(int i=0;i<n;i++){
//			System.out.println( i + 1 );
//		}
//	}
//}
// 20120903
// 課題5：1～入力した数字を出力

public class Kadai0105 {
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int min = 0;
		int max = 0;
		if(n>=m){
			min = m;
			max = n;
		} else {
			min = n;
			max = m;
		}
		for(int i=min;i<=max;i++){
			System.out.println(i);
		}
	}
}
