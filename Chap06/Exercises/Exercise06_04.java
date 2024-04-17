package Chap06.Exercises;

//乱数生成パッケージの読み込み
import java.util.Random;
//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise06_04
 * 概要:List06_05の横グラフを縦グラフに書き換える
 * 作成者:S.Hiruta
 * 作成日:2024/04/16
 */
public class Exercise06_04 {

	/*
	 * 関数名：main
	 * 概要:配列の全要素に乱数を代入して縦向きのグラフで表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/16
	*/
	public static void main(String[] arg) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		//Randomクラスの変数の定義
		Random randomNumber = new Random();

		//生成される乱数の幅を指定する定数(0～9)の定義
		final int RANDOM_RANGE = 10;

		//要素数の入力を促す
		System.out.print("要素数:");
		//入力された要素数を読み込む
		int elementCount = standardInput.nextInt();
		//要素数に正の整数が入力されるまで繰り返す処理
		while (elementCount <= 0) {
			//正の整数を入力するように促す
			System.out.println("正の整数で入力してください");
			//要素数の入力を促す
			System.out.print("要素数:");
			//入力された要素数を読み込む
			elementCount = standardInput.nextInt();
		}
		//入力された要素数のint型配列を宣言
		int[] verticalValue = new int[elementCount];

		//生成する乱数の範囲を調整する定数の定義
		final int ADJUSTMENT_CONSTANT = 1;

		//要素数の分だけ、要素に乱数を割り振る処理を繰り返す
		for (int i = 0; i < elementCount; i++) {
			//各要素に1～10の乱数を代入
			verticalValue[i] = ADJUSTMENT_CONSTANT + randomNumber.nextInt(RANDOM_RANGE);
		}

		//グラフを見やすくするための空の行の挿入
		System.out.println("\n");

		//乱数生成の範囲分だけ、記号「　」「＊」を表示した列を改行する
		for (int i = 0; i < RANDOM_RANGE; i++) {
			//要素数の数だけ、条件に応じて記号「　」「＊」を表示する処理を繰り返す
			for (int j = 0; j < elementCount; j++) {
				//要素に代入された数値が、グラフの縦軸数値よりも小さい場合
				if (verticalValue[j] < (RANDOM_RANGE - i)) {
					//記号「　」を表示
					System.out.print(" ");
					//要素に代入された数値が、グラフの縦軸数値以上の場合
				} else {
					//記号「＊」を表示
					System.out.print("*");
				}
				//見やすくするためのスペースを表示
				System.out.print(" ");
			}
			//記号「　」「＊」を表示した列を改行する
			System.out.println();
		}

		//仕切り棒の数を合せるための定数の定義
		final int NUMBER_AJUSTMENT = 2;

		//要素数に応じた長さの仕切り線の表示
		for (int i = 1; i < elementCount * NUMBER_AJUSTMENT; i++) {
			//仕切り線の表示
			System.out.print("-");
		}

		//列を切り替える改行を行う
		System.out.println();

		//要素数の1の位を算出するために用いる定数の定義
		final int DECIMAL_NUMBER = 10;

		//各要素の表示
		for (int i = 1; i <= elementCount; i++) {
			//要素数の1の位の数値を表示
			System.out.print((i % DECIMAL_NUMBER) + " ");
		}

		//確認表示の回数調整する定数の定義
		final int TIMES_ADJUSTMENT = 1;

		//見やすくするための改行
		System.out.println("\n");
		//処理内容の確認のための表示を行う
		for (int i = 0; i < elementCount; i++) {
			//確認の為の要素番号の表示
			System.out.println("verticalGraph[" + (i + TIMES_ADJUSTMENT) + "] = " + verticalValue[i]);
		}
	}
}