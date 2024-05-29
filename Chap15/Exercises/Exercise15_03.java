package Chap15.Exercises;

//Scannerをインポート
import java.util.Scanner;

/*
* クラス名:Exercise15_03
* 概要：入力した文字列の中から、指定の文字のみを位置を変えずに残して表示
* 作成者:S.Hiruta
* 作成日:2024/05/29
*/
public class Exercise15_03 {

	//Scannerクラスの変数を設定
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：main
	 * 概要:入力した文字列の中から、指定の文字のみを位置を変えずに残して表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public static void main(String[] args) {

		//ある文字列の中に特定の文字列が含まれていなかった場合の返却値を定数化
		final int MISS_MATCH = -1;

		//1つめの文字列の入力を促す
		System.out.print("文字列s1：");
		//入力された文字列を読み込む
		String firstString = standardInput.next();
		//2つめの文字列の入力を促す
		System.out.print("文字列s2：");
		//入力された文字列を読み込む
		String secondString = standardInput.next();

		//1つめの文字列の中に2つめの文字列がないか調べる
		int matchIndex = firstString.indexOf(secondString);

		//1つめの文字列の中に2つめの文字列がない場合
		if (matchIndex == MISS_MATCH) {
			//1つめの文字列の中に2つめの文字列がないと伝える
			System.out.println("s1のなかにs2がありません。");
			//1つめの文字列の中に2つめの文字列がある場合
		} else {
			//１つめの文字列を表示
			System.out.println("文字列s1：" + firstString);
			//2つめの文字列のインデックス数を表す変数を宣言
			int indexNumber = 0;
			//１つめの文字列を表示
			System.out.print("文字列s2：");
			//2つめの文字列の1つめと重なる箇所
			for (int i = 0; i < matchIndex + secondString.length(); i++) {
				//2つめの文字列が現れる前の段階
				if (i < matchIndex) {
					//空白を表示
					System.out.print(" ");
					//2つめの文字列が現れたあと
				} else {
					//2つめの文字列を順番に表示
					System.out.print(secondString.charAt(indexNumber));
					//2つめの文字列のインデックス数をインクリメント
					indexNumber++;
				}
			}
		}
	}

}
