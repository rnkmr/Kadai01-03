// 20120904
// 課題１：２つの整数要素の配列を比較するプログラム
import java.util.Scanner;

public class Kadai0301 {
	public static void main(String args[]){
		int n = 5;
		int[] a = new int[n];
		int[] b = new int[n];
		Scanner stdIn = new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			a[i]=stdIn.nextInt();
		}
		for(int i=0;i<b.length;i++){
			b[i]=stdIn.nextInt();
		}

		int countTrue=0;
	for(int i=0;i<n;i++){
			if(a[i]==b[i]){
				countTrue++;
			}
		}

		if(countTrue==a.length && a.length == b.length){
		System.out.println("両者の配列は等しい");
		} else {
		System.out.println("両者の配列は等しくない");
		}
	}
}