// 20120903
// �ۑ�6�FFizzBuzz

//public class Kadai0106 {
//	public static void main(String args[]){
//		int n = Integer.parseInt(args[0]);
//		for(int i=1;i<=n;i++){
//			if(i%5==0 && i%3==0){ // i%15==0�ł悩����
//				System.out.println("FizzBuzz");
//			} else if(i%5==0){
//				System.out.println("Buzz");
//			} else if(i%3==0){
//				System.out.println("Fizz");
//			} else{
//			System.out.println(i);
//			}
//		}
//	}
//}

/* �]����g��Ȃ�FizzBuzz�̃A�C�f�A
 * �P����ꂽ���A�{�Q�������l�������đҋ@
 * �P���R�ɗ������ɁA�q�b�g
 * �������T���q�b�g������
 * �����q�b�g�������AFizzBuzz�Ƃ���
 * �Ȃ񂩁A�������S��for���ōs�������H
 *
 * �ƍ��N���X�́A�l�擾�Əƍ��̂Q�̃��\�b�h���K�v�B
 * �R�̏ƍ��ƂT�̏ƍ��ŁA���ۃN���X����p���ł��邩��
 *
 *  */

public class Kadai0106 {
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		Matching m = new Matching();
		for(int i=1;i<=n;i++){
			if(i==1){
				m.getNum(i);
			}
			if(m.matching3(i) && m.matching5(i)){
				System.out.println("FizzBuzz");
			}

		}
	}
}


class Matching{
	int num;
	void getNum(int i){
		this.num = i;
	}

	boolean matching3(int i){
		if(this.num+2==i){
		return true;
		} else {
			return false;
		}
	}

	boolean matching5(int i){
		if(this.num+4==i){
		return true;
		} else {
			return false;
		}
	}
}
