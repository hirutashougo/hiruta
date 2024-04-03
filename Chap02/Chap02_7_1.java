package Chap02;

import java.util.Random;
//クラスの宣言
public class Chap02_7_1 {
	//mainメソッドの宣言
	public static void main(String[] args) {
		Random rand = new Random();
		
		int lucky = rand.nextInt(10);    //0～9の乱数
		
		//乱数の表示
		System.out.println(lucky - 1);

	}

}