package Chap06.Exercises;

import java.util.Random;
import java.util.Scanner;

//乱数生成パッケージの読み込み
//Scannerの読み込み

/*
 * クラス名:Exercise06_12
 * 概要:配列の要素の並びをシャッフルして表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/17
 */
public class Exercise06_12 {

	/*
	 * 関数名：main
	 * 概要:配列の要素の並びをシャッフルして表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/17
	*/
	public static void main(String[] arg) {
		//Randomクラスの変数の定義
		Random randomNumber = new Random();
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//要素数の入力を促す
		System.out.print("要素数：");
		//入力された要素数を読み込む
		int elementCount = standardInput.nextInt();
		//要素数が正の整数で入力されるまで繰り返す処理
		int[] numberArray = new int[elementCount];
		//正の整数で入力するように促す
		while (elementCount <= 0) {
		//正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
		//要素数の入力を促す
			System.out.print("要素数：");
		//入力された要素数を読み込む
			elementCount = standardInput.nextInt();
		}
		
		//生成する乱数の範囲を表す定数の定義
		final int RANDOM_RANGE = 90;
		//生成する乱数の範囲を調節する定数の定義
		final int ADJUSTMENT_NUMBER = 10;
		
		//入力された要素数の配列を宣言
		for (int i = 0; i < elementCount; i++) {
		//10～99の範囲に調整して乱数を生成し、各要素に代入
			numberArray[i] = ADJUSTMENT_NUMBER + randomNumber.nextInt(RANDOM_RANGE);
		//各要素に代入された値を表示
			System.out.println("a[" + i + "] = " + numberArray[i]);
		}
		
		//配列の要素をランダムに並べ替えるための変数の定義
		int randomElement = 0;
		
		//配列の要素の順序をランダムに並べ替えていく
		for (int i = 0; i < elementCount / 2; i++) {
			//配列の要素の中から、被らないようにランダムに一つ選ぶ
			do {
				//要素数の範囲内で乱数を生成
				randomElement = randomNumber.nextInt(elementCount);
			//扱う要素とランダムに選んだ要素が被ったらやり直し
			} while (randomElement == i);
		//代入用の変数に並べ替える前の要素の値を代入
			int assigmentValuable = numberArray[i];
		//並べ替える前の要素に並べ替えた後の要素の値を代入
			numberArray[i] = numberArray[randomElement];
		//並べ替えた後の要素に代入用の変数の値を代入
			numberArray[randomElement] = assigmentValuable;
		}
		
		//要素の並びをランダムに並び替えたことを伝える
		System.out.println("要素の並びをシャッフルしました。");
		//順序がシャッフルされた各要素の値を表示していく
		for (int i = 0; i < elementCount; i++) {
		//各要素の値を表示
			System.out.println("a[" + i + "] = " + numberArray[i]);
		}
	}
}
