package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_21
 * 概要:List4_16の変更。三角形の直角部分を左上・右下・右上側に表示させる
 * 作成者:S.Hiruta
 * 作成日:2024/04/11
 */
public class Exercise04_21 {

	/*
	 * 関数名：main
	 * 概要:入力された段数の直角三角形を表示する。直角の位置は左上・右下・右上。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/11
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);
		
		//記号「　」の表示を調整する定数を定義する
		final int ADJUSTMENT_NUMBER = 1;

		//段数の入力を促す
		System.out.print("直角三角形を表示します。\n段数は：");
		//入力された段数値を読み込む
		int stepCount = standardInput.nextInt();
		//入力された段数が正の整数でない場合
		while (stepCount <= 0) {
			//正の整数値をで入力するように促す
			System.out.print("正の整数値で入力してください。\n段数は：");
			//入力された整数値を読み込む
			stepCount = standardInput.nextInt();
		}

		//左上に直角のある三角形を表示すると伝える
		System.out.println("左上に直角のある三角形\n");
		//段数分の、記号「＊」でできた列の、段を組む
		for (int i = 1; i <= stepCount; i++) {
			//「＊」を段数の数値分だけ表示。段数の数値はデクリメントされる
			for (int j = stepCount; j >= i; j--) {
				//記号「＊」を表示
				System.out.print('＊');
			}
			//改行文字を表示
			System.out.println();
		}

		//右下に直角のある三角形を表示すると伝える
		System.out.println("\n右下に直角のある三角形\n");
		//段数分の、記号「＊」と「　」でできた列の、段を組む
		for (int i = 1; i <= stepCount; i++) {
			//「　」を段数の数値から1引いた数だけ表示。段数はデクリメントされる
			for (int j = stepCount - ADJUSTMENT_NUMBER; j >= i; j--) {
				//記号「　」を表示
				System.out.print('　');
			}
			//「＊」を段数の数値分だけ表示していく
			for (int k = 1 ; k <= i ; k++) {
				//記号「＊」を表示
				System.out.print('＊');
			}
			//改行文字を表示
			System.out.println();
		}

		//右上に直角のある三角形を表示すると伝える
		System.out.println("\n右上に直角のある三角形\n");
		//段数分の、記号「＊」と「　」でできた列の、段を組む
		for (int i = 1; i <= stepCount; i++) {
			//「　」を段数の数値分だけ表示していく
			for (int j = 1 ; j < i ; j++) {
				//記号「　」を表示
				System.out.print('　');
			}
			//「＊」を段数の数だけ表示。段数はデクリメントしていく
			for (int k = 0; k <= stepCount - i; ++k) {
				//記号「＊」を表示
				System.out.print('＊');
			}
			//改行文字を表示
			System.out.println();
		}
	}
}