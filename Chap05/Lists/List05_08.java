package Chap05.Lists;

/*
 * クラス名:List05_08
 * 概要:整数型から不動点小数型への変換(精度が失われる例)
 * 作成者:S.Hiruta
 * 作成日:2024/04/15
 */
public class List05_08 {

	/*
	 * 関数名：main
	 * 概要:整数型から不動点小数型への変換(精度が失われる例)
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/15
	*/
	public static void main(String[] arg) {
		
		int a = 123456789;
		long b = 1234567890123456789L;
		
		System.out.println("a   =" +  a);
		System.out.println("(float) a =" +  (float) a);
		System.out.println("b   =" +  b);
		System.out.println("(double) a =" +  (double) a);
	}
}