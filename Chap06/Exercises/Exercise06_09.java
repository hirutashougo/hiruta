package Chap06.Exercises;

//乱数生成パッケージの読み込み
import java.util.Random;
//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise06_09
 * 概要:入力した要素数を持つint型配列の要素に生成した1以上10以下の値を代入する
 * 作成者:S.Hiruta
 * 作成日:2024/04/17
 */
public class Exercise06_09 {

	/*
	 * 関数名：main
	 * 概要:入力した要素数を持つint型配列の要素に生成した1以上10以下の値を代入する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/17
	*/
	public static void main(String[] arg) {
		//Scannerクラスの変数の定義
		Random randomNumber = new Random();
		//Randomクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//要素数の入力を促す
		System.out.print("要素数：");
		//入力された要素数を読み込む
		int elementCount = standardInput.nextInt();
		//要素数が正の整数で入力されるまで繰り返す処理
		while (elementCount <= 0) {
			//正の整数で入力するように促す
			System.out.print("正の整数で入力してください。");
			//要素数の入力を促す
			System.out.print("要素数：");
			//入力された要素数を読み込む
			elementCount = standardInput.nextInt();
		}
		//入力された要素数を持つ配列を宣言
		int[] numberArray = new int[elementCount];

		//生成する乱数の範囲を表す定数の定義
		final int RANDOM_RANGE = 10;
		//生成する乱数の範囲を調節する定数の定義
		final int ADJUSTMENT_NUMBER = 1;

		//配列の各要素に乱数を代入していく
		for (int i = 0; i < elementCount; i++) {
			//1～10の範囲に調整して乱数を生成し、各要素に代入
			numberArray[i] = ADJUSTMENT_NUMBER + randomNumber.nextInt(RANDOM_RANGE);
			//各要素に代入された値を表示
			System.out.println("a[" + i + "] = " + numberArray[i]);
		}
	}
}
