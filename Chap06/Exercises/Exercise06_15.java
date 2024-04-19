package Chap06.Exercises;

import java.util.Random;
//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise06_15
 * 概要:曜日を表示して、その英語表現を入力させる
 * 作成者:S.Hiruta
 * 作成日:2024/04/18
 */
public class Exercise06_15 {

	/*
	 * 関数名：main
	 * 概要:曜日表示して、その英語表現を入力させる
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/18
	*/
	public static void main(String[] arg) {
		//Scannerクラスの変数の定義
		Random randomNumber = new Random();
		//Randomクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//曜日の英語表記を定義
		String[] weekString = {
				"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday",/////////////////////////
		};
		//曜日の日本語表記を定義
		String[] japaneseString = {
				"日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日",////////////////////////////
		};

		//問題の再挑戦の選択を迫る変数。
		int retryChoice = 0;
		//繰り返し処理の実行回数を表わす変数の定義
		int repeatCount = 0;
		//乱数の範囲を指定する定数の定義
		final int WEEK_NUMBER = 7;
		//要素数の調整のための定数
		final int ADJUSTMENT_NUMBER = 1;
		//クイズの実行回数を調整するための定数を定義
		final int ADJUSTMENT_COUNT = 1;
		//クイズの再試行の選択に用いる定数の定義
		final int RETRY_CHOICE = 1;
		//クイズの終了の選択に用いる定数の定義
		final int RETIRE_CHOICE = 0;

		//問題への導入
		System.out.println("英語の曜日名を小文字で入力してください。");///////////////////////////////////////////////////////////

		//1が入力される限り繰り返すクイズ
		for (int i = 0; i <= repeatCount; i++) {
			//月の数字を格納する配列の宣言
			int[] weekNumber = new int[i + ADJUSTMENT_NUMBER];
			//月の数字を表わす変数に、1～12の数字をランダムに表示
			weekNumber[i] = randomNumber.nextInt(WEEK_NUMBER);
			//クイズが二回目以降の場合
			if (i >= ADJUSTMENT_COUNT) {//////////////////////////////////////////////////////////////////////////////
				//前回と同じ月が表示されないようにする処理
				while (weekNumber[i] == weekNumber[i - ADJUSTMENT_NUMBER]) {
					//もう一度配列に乱数を代入する
					weekNumber[i] = randomNumber.nextInt(WEEK_NUMBER);
				}
			}
			//何月が問題であるか表記する。入力を促す
			System.out.print(japaneseString[(weekNumber[i])] + ":");
			//正解の月を読み込む
			String answerMonth = weekString[weekNumber[i]];
			//入力された回答を読み込む
			String monthName = standardInput.next();
			//入力した英語が正解の場合
			if (answerMonth.equals(monthName)) {
				//正解であると表示
				System.out.print("正解です。");
				//入力した英語が不正解の場合
			} else {
				//間違っていると表示
				System.out.print("違います。");
			}

			//再度挑戦するか選択を迫る。
			System.out.print("もう一度？ 1…Yes/0…No：");
			//入力された数値を読み込む
			retryChoice = standardInput.nextInt();
			//入力される数値が1と0以外の場合
			while (retryChoice != RETIRE_CHOICE && retryChoice != RETRY_CHOICE) {//////////////////////////////////////////////////////////
				//0か1で入力するように伝える
				System.out.println("0か1で入力してください。");
				//再度挑戦するか選択を迫る。
				System.out.print("もう一度？ 1…Yes/0…No：");
				//入力された数値を読み込む
				retryChoice = standardInput.nextInt();
			}
			//再試行が選択された場合
			if (retryChoice == RETRY_CHOICE) {/////////////////////////////////////////////////////////////////////////
				//実行回数をカウントする
				repeatCount++;
				//終了が選択された場合
			} else {
				//終了しますと表示
				System.out.print("終了します。");
			}
		}
	}
}
