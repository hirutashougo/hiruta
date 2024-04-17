package Chap06.Lists;

/*
 * クラス名:List06_12
 * 概要:配列の代入(間違い)
 * 作成者:S.Hiruta
 * 作成日:2024/04/17
 */
public class List06_12 {

	/*
	 * 関数名：main
	 * 概要:配列の代入(間違い)
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/17
	*/
	public static void main(String[] arg) {
		//配列aを定義
		int[] a = { 1, 2, 3, 4, 5 };
		//配列bを定義
		int[] b = { 6, 5, 4, 3, 2, 1, 0 };

		//配列aの要素を示す前段階の表示
		System.out.print("a = ");
		//配列aの要素を表示していく
		for (int i = 0; i < a.length; i++) {
			//要素に代入された値を表示
			System.out.print(a[i] + " ");
		}
		//改行する
		System.out.println();

		//配列bの要素を示す前段階の表示
		System.out.print("b = ");
		//配列bの要素を表示していく
		for (int i = 0; i < b.length; i++) {
			//要素に代入された値を表示
			System.out.print(b[i] + " ");
		}
		//改行する
		System.out.println();

		//配列aをbにコピー(?)
		b = a;

		//配列a[0]の値を書き換える
		a[0] = 10;

		//aをbに代入したことを表示
		System.out.println("aをbに代入しました。");

		//配列aの要素を示す前段階の表示
		System.out.print("a = ");
		//配列aの要素を表示していく
		for (int i = 0; i < a.length; i++) {
			//要素に代入された値を表示
			System.out.print(a[i] + " ");
		}
		//改行する
		System.out.println();

		//配列bの要素を示す前段階の表示
		System.out.print("b = ");
		//配列bの要素を表示していく
		for (int i = 0; i < b.length; i++) {
			//要素に代入された値を表示
			System.out.print(b[i] + " ");
		}
		//改行する
		System.out.println();
	}
}
