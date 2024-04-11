package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_20
 * 概要:入力された段数の正方形を表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/11
 */
public class Exercise04_20 {

	/*
	 * 関数名：main
	 * 概要:入力された段数の正方形を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/11
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);
		
		//段数の入力を促す
		System.out.print("正方形を出力します。\n段数：");
		//入力された段数を読み込む
		int stepCount = standardInput.nextInt();
		//段数に正の整数が入力されるまで繰り返す処理
		while (stepCount <= 0) {
			//正の整数を入力するように促す
			System.out.print("正の整数で入力してください。\n段数：");
			//入力された段数を
			stepCount = standardInput.nextInt();
		}
		
		//1列あたり段数の数値分の記号「＊」を、段数の回数だけ出力する
		for (int i = 1; i <= stepCount; i++) {
			//段数の数値だけ「＊」の処理を繰り返す
			for (int j = 1; j <= stepCount; j++) {
				//「＊」を表示
				System.out.print("＊");
			}
			//段数分の改行文字を出力
			System.out.println();
		}
    }
    
}