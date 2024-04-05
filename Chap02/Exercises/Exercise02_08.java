package Chap02.Exercises;
//Randomライブラリの読み込み
import java.util.Random;
//Scannerライブラリの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise02_08
 * 概要:入力した値の±5の範囲の乱数を生成して表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/01
 */
public class Exercise02_08 {
	
	/*
	 *関数名:main
	 *概要:10以上99以下の値をランダムに生成して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/01
	 */
	public static void main(String[] args) {
		
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		// Randomクラスの変数を定義
		Random randomVariable = new Random();
		
		//ランダムの範囲を指定する定数を定義
		final int RANDOM_RANGE = 11;
		
		//整数の入力を促す
		System.out.print("整数値:");
		//入力された整数値を読み込む
		int integralNumber = standardInput.nextInt();
	
		//定義した定数の範囲内で乱数を生成
		int randomNumber = randomVariable.nextInt(RANDOM_RANGE);
		
		//文字列及び生成された乱数を表示
		System.out.println("その値の±5の乱数を生成しました。\nそれは" + (( randomNumber - 5) + integralNumber ) +  "です。");

	}

}