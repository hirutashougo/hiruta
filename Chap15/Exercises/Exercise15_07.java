package Chap15.Exercises;

//Scannerをインポート
import java.util.Scanner;

/*
* クラス名:Exercise15_07
* 概要：コマンドライン引数で与えられた数値をすべて加算して表示する
* 作成者:S.Hiruta
* 作成日:2024/05/30
*/
public class Exercise15_07 {

	//Scannerクラスの変数を設定
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：main
	 * 概要:コマンドライン引数で与えられた数値をすべて加算して表示する
	 * 引数：加算する数値(String[]型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/30
	*/
	public static void main(String[] args) {

		//コマンドライン引数と同じ要素数を持つ配列を宣言
		double[] additinElementArray = new double[args.length];
		//コマンドライン引数の要素を配列に代入していく
		for (int i = 0; i < args.length; i++) {
			//コマンドライン引数の要素を配列の該当要素に代入
			additinElementArray[i] = Double.parseDouble(args[i]);
		}
		
		//全要素の合計数を格納する変数を宣言
		double elementSum = 0.0;
		//拡張for文を用いて全要素の加算を行う
		for (double i : additinElementArray) {
			//各要素を加算していく
			elementSum += i;
		}
		
		//全要素の合計を表示
		System.out.println("合計は" + elementSum + "です。");
	}

}
