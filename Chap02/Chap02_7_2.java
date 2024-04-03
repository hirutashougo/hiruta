package Chap02;

import java.util.Random;
//クラスの宣言
public class Chap02_7_2 {
	//mainメソッドの宣言
	public static void main(String[] args) {
		Random rand = new Random();
		
		int lucky = rand.nextInt(9);   //0～8の乱数
		
		//乱数の表示
		System.out.println(lucky - 9);

	}

}