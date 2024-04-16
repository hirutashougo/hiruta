package Chap05.Exercises;

/*
 * クラス名:Exercise05_06
 * 概要:List05_09とList05_10の出力結果を横並びに表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/15
 */
public class Exercise05_06 {

	/*
	 * 関数名：main
	 * 概要その1:float型の変数を0.0から1.0まで0.001ずつ増やしていく
	 * 概要その2:int型の変数を0から1000までインクリメントした値を1000で割る
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/15
	*/
	public static void main(String[] args) {
		//0.001ずつインクリメントする変数を定義
		float firstVariable = 0;
		//int型の変数をfloat型に変換する変数を定義
		float secondVariable = 0;

		//float型・int型の表示
		System.out.println("   float         int");
		//横線の表示
		System.out.println("------------------------");

		//0から1000まで1段ずつ処理を繰り返す
		for (int i = 0; i <= 1000; i++) {
			//float型の加算過程を表示
			System.out.printf("%9.7f", firstVariable);//////////////
			//見やすくするために間をあける
			System.out.print("    ");
			//インクリメントするint型の変数をfloat型に変換
			secondVariable = (float) i / 1000;
			//int型から変換したfloat型の加算過程を表示
			System.out.printf("%9.7f\n", secondVariable);
			//float型の変数を0.001ずつインクリメントさせる
			firstVariable += 0.001;
		}
	}
}