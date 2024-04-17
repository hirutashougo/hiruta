package Chap06.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise06_06
 * 概要:人数と点数を読み込み、合計点・平均点・最高点・最低点を表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/16
 */
public class Exercise06_06 {

	/*
	 * 関数名：main
	 * 概要:人数と点数を読み込み、合計点・平均点・最高点・最低点を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/16
	*/
	public static void main(String[] arg) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//人数の入力を促す
		System.out.print("人数を入力してください：");
		//入力された要素数を読み込む
		int personCount = standardInput.nextInt();
		//要素数に正の整数が入力されるまで繰り返す処理
		while (personCount <= 0) {
			//正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//要素数の入力を促す
			System.out.print("人数を入力してください：");
			//入力された要素数を読み込む
			personCount = standardInput.nextInt();
		}

		//受験者たちの点数を代入するint型配列を宣言する
		int[] examScore = new int[personCount];
		//点数入力を促す表示において、人数調整に用いる定数の定義
		final int ADJUSTMENT_CONSTANT = 1;
		//点数の上限を表す定数の定義
		final int MAXIMUM_SCORE = 100;////////
		//点数の下限を表す定数の定義
		final int MINIMUM_SCORE = 0;/////////
		
		//点数の入力を促す
		System.out.println("点数を入力してください(0点～100点)。");
		//各受験者の点数を読み込ませる
		for (int i = 0; i < personCount; i++) {
			//各受験者の点数の入力を促す
			System.out.print(i + ADJUSTMENT_CONSTANT + "人目の受験者の点数：");
			//入力された点数を読み込む
			examScore[i] = standardInput.nextInt();
			//点数に0～100の点数が入力されるまで繰り返す処理
			while (examScore[i] < MINIMUM_SCORE || examScore[i] > MAXIMUM_SCORE) {
				//0～100の範囲で入力するように促す
				System.out.println("0～100の範囲で入力してください。");//////////////
				//点数の入力を促す
				System.out.print(i + ADJUSTMENT_CONSTANT + "人目の受験者の点数：");
				//入力された点数を読み込む
				examScore[i] = standardInput.nextInt();
			}
		}
		
		//合計値を算出するための変数を定義
		int scoreSum = 0;
		//平均値を算出するための変数を定義
		double scoreAverage = 0;
		//最高点を算出するための変数を定義
		int maximumScore = examScore[0];
		//最低点を算出するための変数を定義
		int minimumScore = examScore[0];

		//各受験者の点数から、合計点・平均点・最高点・最低点を算出する
		for (int i = 0; i < personCount; i++) {
			//合計値を更新する
			scoreSum += examScore[i];
			//点数が最高の場合
			if (examScore[i] >= maximumScore) {
				//最高点を更新する
				maximumScore = examScore[i];
			}
			//点数が最低の場合
			if (examScore[i] <= minimumScore) {
				//最低点を更新する
				minimumScore = examScore[i];
			}
		}
		//平均値を算出
		scoreAverage = (double) scoreSum / personCount;
		
		//合計点を表示する
		System.out.println("合計は" + scoreSum + "点です。");
		//平均点を表示する
		System.out.println("平均は" + scoreAverage + "点です。");
		//最高点を表示する
		System.out.println("最高は" + maximumScore + "点です。");
		//最低点を表示する
		System.out.println("最低は" + minimumScore + "点です。");
	}
}