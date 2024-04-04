package Chap02.Exercises;
/*
 * クラス名:Exercise02_02
 * 概要:3つのint型変数に値を代入し、合計と平均を求める
 * 作成者:S.Hiruta
 * 作成日:2024/04/01
 */
public class Exercise02_02 {
	/*
	 *関数名:main
	 *概要:3つのint型変数に値を代入し、合計と平均を求める
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/01
	 */
	public static void main(String[] args) {
		//xはint型の変数
		int x;
		//yはint型の変数
		int y;
		//zはint型の変数
		int z;
		
		//xに63を代入
		x = 63;
		//yに18を代入
		y = 18;
		//zに44を代入
		z = 44;
		
		//xの値を表示
		System.out.println("xの値は" + x + "です。");
		//yの値を表示
		System.out.println("yの値は" + y + "です。");
		//zの値を表示
		System.out.println("zの値は" + z + "です。");
		//合計を表示
		System.out.println("合計は" + ( x + y + z ) + "です。");
		//平均を表示
		System.out.println("平均は" + ( x + y + z ) / 3 + "です。");
		

	}

}
