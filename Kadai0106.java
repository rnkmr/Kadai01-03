// 20120903
// 課題6：FizzBuzz

//public class Kadai0106 {
//	public static void main(String args[]){
//		int n = Integer.parseInt(args[0]);
//		for(int i=1;i<=n;i++){
//			if(i%5==0 && i%3==0){ // i%15==0でよかった
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

/* 余りを使わないFizzBuzzのアイデア
 * １を入れた時、＋２した数値を持って待機
 * １が３に来た時に、ヒット
 * 同じく５をヒットさせる
 * 両方ヒットした時、FizzBuzzとする
 * なんか、しかも全部for文で行けそう？
 *
 * 照合クラスは、値取得と照合の２つのメソッドが必要。
 * ３の照合と５の照合で、抽象クラスから継承できるかも
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
