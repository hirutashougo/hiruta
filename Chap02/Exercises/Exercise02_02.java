package Chap02.Exercises;

/*
 * クラス名:Exercise02_02
 * 概要:3つのint型変数に値を代入し、合計と平均を求める
 * 作成者:S.Hiruta
 * 作成日:2024/04/01
 */
public class Exercise02_02 {
	
	/*
	 *関数名:main
	 *概要:3つのint型変数に値を代入し、合計と平均を求める
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/01
	 */
	public static void main(String[] args) {
		
		//1つめのint型の変数を設定
		int firstNumber = 0 ;
		//2つめのint型の変数を設定
		int secondNumber = 0 ;
		//3つめのint型の変数を設定
		int thirdNumber = 0 ;
		
		//1つめの変数に63を代入
		firstNumber = 63;
		//2つめの変数に18を代入
		secondNumber = 18;
		//3つめの変数に44を代入
		thirdNumber = 44;
		
		//1つめの変数に入力された値を表示
		System.out.println("xの値は" + firstNumber + "です。");
		//2つめの変数に入力された値を表示
		System.out.println("yの値は" + secondNumber + "です。");
		//3つめの変数に入力された値を表示
		System.out.println("zの値は" + thirdNumber + "です。");
		//3つの合計を表示
		System.out.println("合計は" + ( firstNumber + secondNumber + thirdNumber ) + "です。");
		//3つの平均を表示
		System.out.println("平均は" + ( firstNumber + secondNumber + thirdNumber ) / 3 + "です。");
		

	}

}
