package Chap04.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise04_24
 * 概要:正の整数値を読み込み、それが素数であるか判定
 * 作成者:S.Hiruta
 * 作成日:2024/04/12
 */
public class Exercise04_24 {

	/*
	 * 関数名：main
	 * 概要:正の整数値を読み込み、それが素数であるか判定
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/12
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);

		//整数値の読み込みを促す
		System.out.print("素数かどうか判定します。\n正の整数値:");
		//入力された整数値を読み込む
		int integralNumber = standardInput.nextInt();
		//正の整数が入力されるまで
		while (integralNumber <= 0) {
			//正の整数値を入力するように促す
			System.out.print("正の整数で入力してください。\n正の整数値:");//////////////
			//入力された整数値を読み込む
			integralNumber = standardInput.nextInt();
		}

		//繰り返す処理の処理回数を調整するための定数の定義
		final int TIMES_ADJUSTMENT = 1;

		//整数値をインクリメントした数値で割っていく処理
		for (int i = 1; i < integralNumber; i++) {
			//整数値を割った余りが0であれば繰り返しを終了
			if (i > 1 && integralNumber % i == 0) {
				//整数値が素数でないと表示
				System.out.println("その整数は素数ではありません。");
				//処理を抜ける
				break;
			}
			//整数値がどの数値でも割り切れなかった場合
			if (i == integralNumber - TIMES_ADJUSTMENT) {
				//整数値が素数であると表示
				System.out.println("その整数は素数です。");
			}
		}
		//1が入力された場合
		if (integralNumber == 1) {
			//1は双腕はないと表示
			System.out.println("その整数は素数ではありません。");
		}
	}
}