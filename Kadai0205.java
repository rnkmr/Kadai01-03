// 20120903
// �ۑ�5�F�z��̗v�f�͈͊O�̑��/�Q�Ƃ��s�������ɉ����N�����������m�F���Ȃ���

import java.util.Scanner;

public class Kadai0205 {
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		int n = 10;
		int[] a = new int[n];

		for(int i=0;i<n;i++){
			a[i] = stdIn.nextInt();
		}

		a[10] = 100;
		System.out.println(a[10]);

		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
		// ���o�͂����B

	}
}
