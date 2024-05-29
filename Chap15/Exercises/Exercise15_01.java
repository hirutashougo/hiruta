package Chap15.Exercises;

//Scannerをインポート
import java.util.Scanner;

/*
* クラス名:Exercise15_01
* 概要：入力した文字列を逆順で表示する
* 作成者:S.Hiruta
* 作成日:2024/05/29
*/
public class Exercise15_01 {

	//Scannerクラスの変数を設定
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：main
	 * 概要:入力した文字を逆順で表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public static void main(String[] args) {

		//文字列の順番とインデックス数を揃えるための調整数を定数化
		final int INDEX_ADJUSTMENT = -1;

		//入力した文字を逆順で表示すると伝え、文字列の入力を促す
		System.out.print("入力した文字を逆順で表示します。\n文字：");
		//入力された文字列を読み込む
		String reversedText = standardInput.next();

		//入力した文字を逆順で表示する
		for (int i = reversedText.length() + INDEX_ADJUSTMENT; i >= 0; i--) {
			//入力された文字列を、逆順で一文字ずつ表示していく
			System.out.print(reversedText.charAt(i));
		}
	}
}
