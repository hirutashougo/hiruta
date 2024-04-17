package Chap06.Lists;

import java.util.Scanner;

/*
 * クラス名:List06_13
 * 概要:配列の全要素をコピーして表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/17
 */
public class List06_13 {

	/*
	 * 関数名：main
	 * 概要:配列の全要素をコピーして表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/17
	*/
	public static void main(String[] arg) {
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//要素数の入力を促す
		System.out.print("要素数：");
		//入力された要素数を読み込む
		int elementCount = standardInput.nextInt();

		//配列aを宣言する
		int[] numberArray = new int[elementCount];
		//配列bを宣言する
		int[] copyArray = new int[elementCount];

		//配列aに値を入力していく
		for (int i = 0; i < elementCount; i++) {
			//配列のインデックスを表示
			System.out.print("a[" + i + "] = ");
			//入力された値を要素に読み込む
			numberArray[i] = standardInput.nextInt();
		}

		//配列aの全要素を配列bにコピーしていく
		for (int i = 0; i < elementCount; i++) {
			//配列aの要素を配列bにコピー
			copyArray[i] = numberArray[i];
		}

		//配列aの全要素を配列bにコピーしたことを表示
		System.out.println("配列aの全要素を配列bにコピーしました。");

		//配列bを表示
		for (int i = 0; i < elementCount; i++) {
			//要素の値を表示
			System.out.println("b[" + i + "] = " + copyArray[i]);
		}
	}
}
