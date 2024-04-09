package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_06
 * 概要:List4-8を書き換え、入力値が1未満の場合には改行しないようにする
 * 作成者:S.Hiruta
 * 作成日:2024/04/08
 */
public class Exercise04_06_List4_8 {

	/*
	 * 関数名：main
	 * 概要:List4-8を書き換え、入力値が1未満の場合には改行しないようにする
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：hiruta
	 * 作成日：2024/04/08
	*/

	public static void main(String[] args) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//「*」の個数値を表わす変数を定義(変数nは教科書準拠)
		int n = 0;

		//「*」の個数値の入力を促す
		System.out.print("何個*を表示しますか : ");

		//入力された個数値を読み込む(変数nは教科書準拠)
		n = standardInput.nextInt();

		//変数iを初期条件1で設定(変数iは教科書準拠)
		int i = 1;

		//入力した個数値を変数が1以下になるまで繰り返し処理
		while (i <= n) {
			//「*」を表示
			System.out.print('*');
			//変数iを後置増分演算子で増加
			i++;
		}
		//入力値が1以上の場合
		if (n >= 1) {
			//改行文字の出力
			System.out.println();
		}
	}

}