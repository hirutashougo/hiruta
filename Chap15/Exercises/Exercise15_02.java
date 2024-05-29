package Chap15.Exercises;

//Scannerをインポート
import java.util.Scanner;

/*
* クラス名:Exercise15_02
* 概要：入力した文字列の、全文字の文字コードを表示する
* 作成者:S.Hiruta
* 作成日:2024/05/29
*/
public class Exercise15_02 {

	//Scannerクラスの変数を設定
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：main
	 * 概要:入力した文字列の、全文字の文字コードを表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public static void main(String[] args) {
		
		//文字列の順番とインデックス数を揃えるための調整数を定数化
		final int INDEX_ADJUSTMENT = 1;

		//入力した文字列の各文字コードを表示すると伝え、文字列の入力を促す
		System.out.print("入力した文字列の各文字コードを表示します。\n文字：");
		
		//入力された文字列を読み込む
		String stringColumn = standardInput.next();

		//入力した文字列の各文字コードを表示する
		for (int i = 0; i < stringColumn.length(); i++) {
			//文字を進数の文字コードに置き換える
			int textCode = stringColumn.charAt(i);
			//入力された文字列の文字コードを、一文字ずつ16進数で表示していく
			System.out.printf("%d番目の文字コード：%x", i + INDEX_ADJUSTMENT, textCode);
			//見やすくするため改行
			System.out.println();
		}
	}

}
