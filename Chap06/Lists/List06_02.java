package Chap06.Lists;

/*
 * クラス名:List06_02
 * 概要:構成要素型がint型の配列(構成要素は５：newによって本体を生成)
 * 作成者:S.Hiruta
 * 作成日:2024/04/16
 */
public class List06_02 {

	/*
	 * 関数名：main
	 * 概要:構成要素型がint型の配列(構成要素は５：newによって本体を生成 
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/16
	*/
	public static void main(String[] arg) {
		int [] a = new int[5];
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;
		
		System.out.println("a[" + 0 + "] = " + a[0]);
		System.out.println("a[" + 1 + "] = " + a[1]);
		System.out.println("a[" + 2 + "] = " + a[2]);
		System.out.println("a[" + 3 + "] = " + a[3]);
		System.out.println("a[" + 4 + "] = " + a[4]);
	}
}