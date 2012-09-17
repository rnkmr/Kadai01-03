// 20120904
// ‰Û‘è‚PF‚QŸŒ³”z—ñ‚É“ü‚ê‚½®”—v‘f‚Ì‘˜a
import java.util.Scanner;

public class Kadai0302 {
	public static void main(String args[]){
		int n = 3;
		int m = 4;
		int[][] a = new int[n][m];
		Scanner stdIn = new Scanner(System.in);
		int sum = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
			a[i][j]=stdIn.nextInt();
			sum = sum + a[i][j];
			}
		}
		System.out.println(sum);
	}
}