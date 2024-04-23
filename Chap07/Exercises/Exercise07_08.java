package Chap07.Exercises;

//乱数生成パッケージのインポート
import java.util.Random;
//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_08
* 概要:指定された範囲での乱数を表示する
* 作成者:S.Hiruta
* 作成日:2024/04/22
*/
public class Exercise07_08 {

	/*
	 * 関数名：random
	 * 概要：a(教科書準拠)以上b(教科書準拠)未満の乱数を生成して、その値を返却する
	 * 引数：乱数生成の範囲を指定する整数(int型)
	 * 戻り値：指定された範囲内での乱数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	static int random(int a, int b) {
		//b(教科書準拠)がa(教科書準拠)以下の値の場合
		if (a >= b) {
			//aの値をそのまま返す
			return a;
			//bがa以上の値の場合
		} else {
			//Randomクラスの変数の定義
			Random randomNumber = new Random();
			//a(教科書準拠)以上b(教科書準拠)未満の乱数を生成する
			int randomValue = a + randomNumber.nextInt(b - a);
			//生成した乱数を返却する
			return randomValue;
		}
	}

	/*
	 * 関数名：main
	 * 概要：指定された範囲での乱数を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	public static void main(String[] arg) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//これから指定された範囲の乱数を表示すると伝える
		System.out.println("a以上b未満の範囲で乱数を表示します。");
		
		//下限の入力を促す
		System.out.print("aは：");
		//入力された下限を読み込む
		int lowerLimit = standardInput.nextInt();

		//上限の入力を促す
		System.out.print("bは：");
		//入力された上限を読み込む
		int upperLimit = standardInput.nextInt();

		//入力された範囲での乱数を生成し、表示する
		System.out.print("生成された乱数は" + random(lowerLimit, upperLimit) + "です。");
	}
}
