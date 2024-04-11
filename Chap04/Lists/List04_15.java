package Chap04.Lists;

/*
 * クラス名:List4_15
 * 概要：九九の表を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/11
 */
public class List04_15 {

	/*
	 * 関数名：main
	 * 概要：九九の表を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：hiruta
	 * 作成日：2024/04/11
	*/
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				//
				if (i * j < 10) {
					//
					System.out.print("  ");
				//
				} else {
					//
					System.out.print(" ");
				}
				//
				System.out.print(i * j);
			}
			//
			System.out.println();
		}
	}
}
