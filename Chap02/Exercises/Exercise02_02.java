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
		int numberX;
		//yはint型の変数
		int numberY;
		//zはint型の変数
		int numberZ;
		
		//xに63を代入
		numberX = 63;
		//yに18を代入
		numberY = 18;
		//zに44を代入
		numberZ = 44;
		
		//xの値を表示
		System.out.println("xの値は" + numberX + "です。");
		//yの値を表示
		System.out.println("yの値は" + numberY + "です。");
		//zの値を表示
		System.out.println("zの値は" + numberZ + "です。");
		//合計を表示
		System.out.println("合計は" + ( numberX + numberY + numberZ ) + "です。");
		//平均を表示
		System.out.println("平均は" + ( numberX + numberY + numberZ ) / 3 + "です。");
		

	}

}
