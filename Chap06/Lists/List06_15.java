package Chap06.Lists;

/*
 * クラス名:List06_15
 * 概要:配列変数の値を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/18
 */
public class List06_15 {

	/*
	 * 関数名：main
	 * 概要:配列変数の値を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/18
	*/
	public static void main(String[] arg) {
		int[] a = new int[5];
		System.out.println("a = " + a);
		
		a = null;
		System.out.println("a = " + a);
	}
}
