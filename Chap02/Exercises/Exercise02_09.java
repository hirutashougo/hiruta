package Chap02.Exercises;
//Randomライブラリの読み込み
import java.util.Random;

/*
 * クラス名:Exercise02_09
 * 概要①:0.0以上1.0未満の実数値をランダムに生成して表示
 * 概要②:0.0以上10.0未満の実数値をランダムに生成して表示
 * 概要③:-1.0以上1.0未満の実数値をランダムに生成して表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise02_09 {
	
	/*
	 *関数名:main
	 *概要①:0.0以上1.0未満の実数値をランダムに生成して表示
	 *概要②:0.0以上10.0未満の実数値をランダムに生成して表示
	 *概要③:-1.0以上1.0未満の実数値をランダムに生成して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/02
	 */
	public static void main(String[] args) {
		
		//ランダムの範囲を指定する定数を定義
		final double RANDOM_RANGE = 1.0;
		
		// Randomクラスの変数を定義
		Random randomVariable = new Random();
		
		//0.0以上1.0未満の範囲の乱数を生成
		double firstRandomRealNumber = randomVariable.nextDouble(RANDOM_RANGE);
		//0.0以上10.0未満の範囲の乱数を生成
		double secondRandomRealNumber = randomVariable.nextDouble(RANDOM_RANGE * 10 );
		//-1.0以上1.0未満の範囲の乱数を生成
		double thirdRandomRealNumber = randomVariable.nextDouble(RANDOM_RANGE * 2 ) - 1;
		
		//0.0以上1.0未満の範囲の乱数を表示
		System.out.println(firstRandomRealNumber);
		//0.0以上10.0未満の範囲の乱数を表示
		System.out.println(secondRandomRealNumber);
		//-1.0以上1.0未満の範囲の乱数を表示
		System.out.println(thirdRandomRealNumber);

	}

}