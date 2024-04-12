package Chap04.Lists;

import java.util.Scanner;

/*
 * クラス名:List4_20
 * 概要：読み込んだ整数のグループを加算(整数5個×10グループ)
 * 作成者:S.Hiruta
 * 作成日:2024/04/12
 */
public class List04_21 {

	/*
	 * 関数名：main
	 * 概要：読み込んだ整数のグループを加算(整数5個×10グループ)
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：hiruta
	 * 作成日：2024/04/12
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//整数を加算すると表示
		System.out.println("整数を加算します。");
		//
		int total = 0;

		Outer: for (int i = 1; i <= 10; i++) {
			System.out.println("■第" + i + "グループ");
			//

			for (int j = 0; j < 5; j++) {
				int sum = 0;
				System.out.print("整数:");
				int t = standardInput.nextInt();
				if (t == 99999)
					break Outer;
				else if (t == 88888)
					continue Outer;
				total += t;
			}
		}
		System.out.println("\n合計は" + total + "です。\n");
	}
}
