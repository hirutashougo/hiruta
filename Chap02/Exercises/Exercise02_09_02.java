package Chap02.Exercises;
//Randomライブラリの読み込み
import java.util.Random;
/*
 * クラス名:Exercise02_09_02
 * 概要:0.0以上10.0未満の実数値をランダムに生成して表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise02_09_02 {
	/*
	 *関数名:main
	 *概要:0.0以上10.0未満の実数値をランダムに生成して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/02
	 */
	public static void main(String[] args) {
		//ランダムの範囲を指定する定数を定義
		final double RANDOM_RANGE = 10.0;
		//Randomクラスの変数を定義
		Random rand = new Random();
		
		//定義した定数の範囲内で乱数を生成
		double randomRealNumber = rand.nextDouble(RANDOM_RANGE);
		
		//乱数の表示
		System.out.println(randomRealNumber);

	}

}