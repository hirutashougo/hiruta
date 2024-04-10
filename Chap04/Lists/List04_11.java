package Chap04.Lists;

import java.util.Scanner;

/*
 * クラス名:List4_11
 * 概要：読み込んだ個数だけ*を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/10
 */
public class List04_11 {

	/*
	 * 関数名：main
	 * 概要：読み込んだ個数だけ*を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：hiruta
	 * 作成日：2024/04/10
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);
		
		//個数を表す整数の入力を促す
		System.out.print("何個*を表示しますか：");
		//入力された整数値を変数nに読み込む(変数nは教科書準拠)
		int n = standardInput.nextInt();
		
		//変数i(教科書準拠)を初期状態0で設定
		//変数iが変数n未満であることが条件
		//for文の更新毎に変数iに1追加する
		for (int i = 0; i < n; i++) {
			//*を表示する
			System.out.print("*");
		}
		//改行文字を表示
		System.out.println();

	}
}
