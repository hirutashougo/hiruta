package Chap05.Lists;

/*
 * クラス名:List05_09
 * 概要:0.0から0.1まで0.001単位で増やして合計を表示(繰り返しをfloatで制御)
 * 作成者:S.Hiruta
 * 作成日:2024/04/15
 */
public class List05_09 {

	/*
	 * 関数名：main
	 * 概要:0.0から0.1まで0.001単位で増やして合計を表示(繰り返しをfloatで制御)
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/15
	*/
	public static void main(String[] arg) {
		float sum = 0.00F;
		
		for (float x = 0.0F; x <= 1.0F; x += 0.001F) {
			System.out.println("x = " + x);
			sum += x;
		}
		System.out.println("sum = " + sum);
	}
}