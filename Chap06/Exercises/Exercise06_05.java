package Chap06.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise06_05
 * 概要:配列の要素数と個々の要素の値を読み込んで表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/16
 */
public class Exercise06_05 {

	/*
	 * 関数名：main
	 * 概要:配列の要素数と個々の要素の値を読み込んで表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/16
	*/
	public static void main(String[] arg) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//要素数の入力を促す
		System.out.print("要素数:");
		//入力された要素数を読み込む
		int elementCount = standardInput.nextInt();
		//要素数に正の整数が入力されるまで繰り返す処理
		while (elementCount <= 0) {
			//正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//要素数の入力を促す
			System.out.print("要素数:");
			//入力された要素数を読み込む
			elementCount = standardInput.nextInt();
		}
		
		//入力された要素数のint型配列を宣言する
		int[] indexNumber = new int[elementCount];

		//各要素の値を読み込ませる
		for (int i = 0; i < elementCount; i++) {
			//要素の値の入力を促す
			System.out.print("a[" + i + "] = ");
			//入力された数値を読み込む
			indexNumber[i] = standardInput.nextInt();
		}

		//要素の数値表示の際の処理回数調整の定数
		final int TIMES_ADJUSTMENT = 1;

		//要素の数値の表示の前段階の表示
		System.out.print("a = {");

		//入力された要素の数値を表示する
		for (int i = 0; i < elementCount; i++) {
			//表示する要素が最終要素でない場合
			if (i < elementCount - TIMES_ADJUSTMENT) {
				//その要素に入力されている数値と空白を表示していく
				System.out.print(indexNumber[i] + ", ");
				//表示する要素が最終要素の場合
			} else {
				//その要素に入力されている数値と閉じ括弧を表示していく
				System.out.print(indexNumber[i] + "}");
			}
		}
	}
}