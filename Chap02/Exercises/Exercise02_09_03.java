package Chap02.Exercises;

import java.util.Random;
//クラスの宣言
public class Exercise02_09_03 {
	//mainメソッドの宣言
	public static void main(String[] args) {

		Random rand = new Random();
		
		double lucky = rand.nextDouble(2.0);   //0～10.0の乱数
		
		//乱数の表示
		System.out.println(lucky - 1);

	}

}