package Chap02.Exercises;
//Randomライブラリの読み込み
import java.util.Random;
/*
 * クラス名:Exercise02_07_03
 * 概要:10以上99以下の値をランダムに生成して表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/01
 */
public class Exercise02_07_03 {
	/*
	 *関数名:main
	 *概要:10以上99以下の値をランダムに生成して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/01
	 */
	public static void main(String[] args) {
		//ランダム定数を定義
		final int RANDOM_RANGE = 90;
		// Randomクラスの変数を定義
		Random randomVariable = new Random();
		
		//0～9の乱数を生成
		int randomNumber = randomVariable.nextInt(RANDOM_RANGE);
		
		//乱数の表示
		System.out.println( randomNumber + 10);

	}

}