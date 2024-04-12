package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_23 /////////////////
 * 概要:入力された段数の二等辺三角形を表示させる。表示は段数の一の位の数字で行う
 * 作成者:S.Hiruta
 * 作成日:2024/04/11
 */
public class Exercise04_23 {

	/*
	 * 関数名：main
	 * 概要:入力された段数の二等辺三角形を表示させる。表示は段数の一の位の数字で行う
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/11
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);
		
		//記号「 」の表示を調整する定数の定義
		final int ADJUSTMENT_NUMBER = 1;
		//三角形として表示する数値の算出に用いる定数の定義
		final int DIVISION_NUMBER = 10;
		//記号「＊」の表示を調整する為に減じる定数の定義
		final int SUBTRACT_NUMBER = 1;
		//記号「＊」の表示を調整する為にかける定数の定義
		final int ADDITION_NUMBER = 2;
		//記号「＊」の表示を調整する為に足す定数の定義
		final int MULTIOLY_NUMBER = 1;

		//段数の入力を促す
		System.out.print("二等辺三角形を表示します。\n段数は：");
		//入力された段数値を読み込む
		int stepCount = standardInput.nextInt();
		//入力された段数が正の整数でない場合
		while (stepCount <= 0) {
			//正の整数値をで入力するように促す
			System.out.print("正の整数値で入力してください。\n段数は：");
			//入力された整数値を読み込む
			stepCount = standardInput.nextInt();
		}
		
		//二等辺三角形を見やすくするためのスペースを開ける
		System.out.print("\n");

		//段数分の、記号「＊」と「 」でできた列の、段を組む
		for (int i = 1; i <= stepCount; i++) {
			//段数の一の位の数字を算出する
			int stepFirst = i % DIVISION_NUMBER;
			//「 」を段数の数値から1引いた数だけ表示。段数はデクリメントされる
			for (int j = stepCount - ADJUSTMENT_NUMBER; j >= i; j--) {
				//記号「 」を表示
				System.out.print(' ');
			}
			//「＊」を段数の数値分だけ表示していく
			for (int k = 1 ; k <= (i - SUBTRACT_NUMBER) * ADDITION_NUMBER + MULTIOLY_NUMBER  ; k++) {
				//記号「＊」を表示
				System.out.print(stepFirst);
			}
			//改行文字を表示
			System.out.println();
		}

	}
}