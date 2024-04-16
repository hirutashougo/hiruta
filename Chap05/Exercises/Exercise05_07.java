package Chap05.Exercises;

/*
 * クラス名:Exercise05_07
 * 概要:0.0から1.0まで0.001おきに、その値と、その値の二乗を表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/15
 */
public class Exercise05_07 {

	/*
	 * 関数名：main
	 * 概要:0.0から1.0まで0.001おきに、その値と、その値の二乗を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/15
	*/
	public static void main(String[] args) {

		//float型・int型の表示
		System.out.println("0.001ずつ増加    2乗");
		//横線の表示
		System.out.println("------------------------------");

		//0から1000まで1ずつ処理を繰り返す
		for (int i = 0; i <= 1000; i++) {
			//0から1000まで1ずつインクリメントするint型の変数をfloat型に変換
			float firstVariable = (float) i / 1000;
			//0から0.001ずつ増加する数値を表示
			System.out.printf("%9.7f", firstVariable);
			//見やすくするために間をあける
			System.out.print("      ");
			//0から0.001ずつ増加する数値の2乗を算出
			float squareValue = firstVariable * firstVariable;
			//0から0.001ずつ増加する数値の2乗を表示
			System.out.printf("%9.7f\n", squareValue);
			//数値を0.001ずつインクリメントさせる
			firstVariable += 0.001;
		}

	}
}

////
//for (float floatVariable = 0.0F; floatVariable <= 1.0F; floatVariable += 0.001F) {
//	//その値を表示
//	System.out.printf("%9.7f", floatVariable);
//	//
//	System.out.print("          ");
//	//その値の2乗を算出
//	float squareValue = floatVariable * floatVariable;
//	//その値の2乗を表示
//	System.out.printf("%9.7f\n", squareValue);
//}