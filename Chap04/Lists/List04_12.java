package Chap04.Lists;

import java.util.Scanner;

/*
 * クラス名:List4_12
 * 概要：読み込んだ整数値以下の奇数を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/10
 */
public class List04_12 {

	/*
	 * 関数名：main
	 * 概要：読み込んだ整数値以下の奇数を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：hiruta
	 * 作成日：2024/04/10
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);
		
		//整数の入力を促す
		System.out.print("整数値：");
		//入力された整数値を変数nに読み込む(変数nは教科書準拠)
		int n = standardInput.nextInt();
		
		//変数i(教科書準拠)を初期状態1で設定
		//変数iが変数n以下であることが条件
		//for文の更新毎に変数iに2追加する
		for (int i = 1; i <= n; i+= 2) {
			//1から小さい順に奇数を表示する
			System.out.println(i);
		}

	}
}
