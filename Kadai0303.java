// 20120904
// �ۑ�3�F�N���̌o�ߓ����i���邤�N��z���j
//4�Ŋ���؂��N�͉[�N
//100�Ŋ���؂��N�͉[�N�ł͂Ȃ�
//400�Ŋ���؂��N�͉[�N
import java.util.Scanner;
public class Kadai0303 {
	public static void main(String args[]){
		int[][] month = { {31,29,31,30,31,30,31,31,30,31,30,31},
						  {31,28,31,30,31,30,31,31,30,31,30,31}
						};
		Scanner stdIn = new Scanner(System.in);
		int y = stdIn.nextInt(); // ����
		int m = stdIn.nextInt();
		int d = stdIn.nextInt();
		boolean leap = false;

		if(y%4 == 0){
			leap = true;
		}
		if(y%100 == 0){
			leap = false;
		}
		if(y%400 == 0){
			leap = true;
		}

		int day = 0;
		for(int i=0;i<m-1;i++){
			if(leap==false){
			day = day + month[0][i];
			} else{
			day = day + month[1][i];
			}
		}
		day = day + d;
		System.out.println(day);
	}
}