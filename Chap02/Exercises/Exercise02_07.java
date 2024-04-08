package Chap02.Exercises;

//Randomライブラリの読み込み
import java.util.Random;

/*
 * クラス名:Exercise02_07
 * 概要①:1以上9以下の値をランダムに生成して表示
 * 概要②:-9以上-1以下の値をランダムに生成して表示
 * 概要③:10以上99以下の値をランダムに生成して表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/01
 */
public class Exercise02_07 {
	
	/*
	 *関数名:main
	 *概要①:1以上9以下の値をランダムに生成して表示
	 *概要②:-9以上-1以下の値をランダムに生成して表示
	 *概要③:10以上99以下の値をランダムに生成して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/01
	 */
	public static void main(String[] args) {
		
		//ランダムの範囲を表す定数を定義
		final int RANDOM_RANGE = 10;
		
		// Randomクラスの変数を定義
		Random randomVariable = new Random();
		
		//0～9の乱数を生成
		int firstRandomNumber = randomVariable.nextInt(RANDOM_RANGE);
		//-9～-1の乱数を生成 
		int secondRandomNumber = randomVariable.nextInt(RANDOM_RANGE - 1) * (- 1) -1 ;
		//10～99の乱数を生成
		int thirdRandomNumber = randomVariable.nextInt(RANDOM_RANGE*9 ) + 10 ;
		
		//0～9の乱数の表示
		System.out.println(firstRandomNumber);
		//-9～-1の乱数を表示
		System.out.println(secondRandomNumber);
		//10～99の乱数を表示
		System.out.println(thirdRandomNumber);

	}

}