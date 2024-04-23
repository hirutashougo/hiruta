package Chap07.Lists;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:List07_10
* 概要:識別子の有効範囲を確認する
* 作成者:S.Hiruta
* 作成日:2024/04/23
*/
public class List07_10 {

	//クラス有効範囲(フィールド)として変数xを定義
	static int x = 700;

	/*
	 * 関数名：printX
	 * 概要:クラス有効範囲(フィールド)の値を「x = 」に続く形で表示する
	 * 引数:なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/23
	*/
	static void printX() {
		//有効範囲700のフィールドxを「x = 」に続く形で表示する
		System.out.println("x = " + x);
	}

	/*
	 * 関数名：main
	 * 概要:クラス有効範囲(フィールド)とブロック有効範囲(局所変数)の値を
	        各々の表示形式に続く形で表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/23
	*/
	public static void main(String[] arg) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//有効範囲700のフィールドxを「x = 」に続く形で表示する
		System.out.println("x = " + x);

		//ブロック有効範囲(局所変数)を定義
		int x = 800;

		//有効範囲800の局所変数xを「x = 」に続く形で表示する
		System.out.println("x = " + x);

		//有効範囲700のフィールドxを「List07_10.x = 」に続く形で表示する
		System.out.println("List07_10.x = " + List07_10.x);

		//関数printXを用いて有効範囲700のフィールドxを表示する
		printX();
	}

}
