package Chap02;

import java.util.Random;
//クラスの宣言
public class Chap02_9_2 {
	//mainメソッドの宣言
	public static void main(String[] args) {

		Random rand = new Random();
		
		double lucky = rand.nextDouble(10.0);   //0～10.0の乱数
		
		//乱数の表示
		System.out.println(lucky);

	}

}