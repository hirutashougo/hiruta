package Chap04.Lists;

/*
 * クラス名:List4_22
 * 概要：九九の表を表示(System.out.printfを利用)
 * 作成者:S.Hiruta
 * 作成日:2024/04/15
 */
public class List04_22 {

	/*
	 * 関数名：main
	 * 概要：九九の表を表示(System.out.printfを利用)
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：hiruta
	 * 作成日：2024/04/15
	*/
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
	}
}
