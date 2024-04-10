package Chap04.Lists;

import java.util.Scanner;

/*
 * クラス名:List4_14
 * 概要：読み込んだ整数値と1,2…との差を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/10
 */
public class List04_14 {

	/*
	 * 関数名：main
	 * 概要：読み込んだ整数値と1,2…との差を表示
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
		
		/*変数i(教科書準拠)を初期状態1で設定
		 *変数j(教科書準拠)を初期状態n-1で設定*/
		//変数iが変数n以下であることが条件
		/*for文の更新毎に変数iに1追加する
		 *for文の更新毎に変数jから1を引く*/
		for (int i = 1, j = n - 1; i <= n; i++, j-- ) {
				//変数iと変数jを交互に表示
				System.out.println(i + " " + j);
		}
	}
}
