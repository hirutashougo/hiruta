package Chap02.Exercises;

import java.util.Random;
//クラスの宣言
public class Exercise02_07_01 {
	//mainメソッドの宣言
	public static void main(String[] args) {
		Random rand = new Random();
		
		int lucky = rand.nextInt(10);    //0～9の乱数
		
		//乱数の表示
		System.out.println(lucky - 1);

	}

}