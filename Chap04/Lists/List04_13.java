package Chap04.Lists;

import java.util.Scanner;

/*
 * クラス名:List4_13
 * 概要：読み込んだ整数値の全ての約数を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/10
 */
public class List04_13 {

	/*
	 * 関数名：main
	 * 概要：読み込んだ整数値の全ての約数を表示
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
		//for文の更新毎に変数iに1追加する
		for (int i = 1; i <= n; i++ ) {
			//変数iで割り切れるかを判定
			if (n % i == 0) {
				//変数iを整数値の約数として表示する
				System.out.println(i);
			}
		}
	}
}
