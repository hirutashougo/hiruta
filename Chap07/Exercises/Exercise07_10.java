package Chap07.Exercises;

import java.util.Random;
//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_10
* 概要:暗算力トレーニング
       4パターンの数式を出力し、暗算によって正解するまで解答させる
* 作成者:S.Hiruta
* 作成日:2024/04/23
*/
public class Exercise07_10 {

	//入力読み込みの為のクラスの変数を定義
	static Scanner standardInput = new Scanner(System.in);
	//使用者の暗算の結果を格納する変数の宣言
	static int mentalArithmetic = 0;
	//計算式の正解を格納する変数の宣言
	static int caliculationAnswer = 0;

	/*
	 * 関数名：rverseSign
	 * 概要:引数が負の値であれば、()を付けた表記にして返却する
	 * 引数:整数(int型)
	 * 戻り値：()のついた整数(string型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/23
	*/
	static string confirmRetry() {
	}
	
	/*
	 * 関数名：confirmRetry
	 * 概要:引数が0なら終了、1なら続行
	 * 引数:なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/23
	*/
	static boolean confirmRetry() {
		//終了か実行かを判断する変数を宣言
		int cont;
		//引数に応じて、処理の終了・続行を判断する
		do {
			//選択を迫る表示
			System.out.print("もう一度?<Yes…1/No…0>：");
			//入力された値を読み込む
			cont = standardInput.nextInt();
		//0か1以外が入力されれば処理を繰り返す
		} while(cont != 0 && cont != 1);
		//1が入力されれば処理を返却する
		return cont == 1;
	}


	/*
	 * 関数名：questionCalculation
	 * 概要：「+」「-」の二種類の演算子を、
	        3つの整数の項と組み合わせた4パターンの数式をランダムに出題する
	 * 引数：計算式における3つの項(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/23
	*/
	static void questionCalculation(int firstIntegral, int secondIntegral, int thirdIntegral) {
		//Randomクラスの変数の定義
		Random randomNumber = new Random();

		//生成する乱数の範囲を定数で定義
		final int RANDOM_RANGE = 4;

		//計算式の4パターン(乱数の0～3で区別)をランダムに決定
		int caliculationMethod = randomNumber.nextInt(RANDOM_RANGE);

		//乱数の値によって4種類の計算式を出題
		switch (caliculationMethod) {
		//乱数が0の場合
		case 0: {
			//演算子が「+」「+」の順に現れる計算式を表示
			System.out.print(firstIntegral + " + " + secondIntegral + " + " + thirdIntegral + " = ");
			//入力された暗算結果を格納
			mentalArithmetic = standardInput.nextInt();
			//計算の正解を定義
			caliculationAnswer = firstIntegral + secondIntegral + thirdIntegral;
		}
		//乱数が1の場合
		case 1: {
			//演算子が「+」「-」の順に現れる計算式を表示
			System.out.print(firstIntegral + " + " + secondIntegral + " - " + thirdIntegral + " = ");
			//入力された暗算結果を格納
			mentalArithmetic = standardInput.nextInt();
			//計算の正解を定義
			caliculationAnswer = firstIntegral + secondIntegral - thirdIntegral;
		}
		//乱数が2の場合
		case 2: {
			//演算子が「-」「+」の順に現れる計算式を表示
			System.out.print(firstIntegral + " - " + secondIntegral + " + " + thirdIntegral + " = ");
			//入力された暗算結果を格納
			mentalArithmetic = standardInput.nextInt();
			//計算の正解を定義
			caliculationAnswer = firstIntegral - secondIntegral + thirdIntegral;
		}
		//乱数が3の場合
		case 3: {
			//演算子が「-」「-」の順に現れる計算式を表示
			System.out.print(firstIntegral + " - " + secondIntegral + " - " + thirdIntegral + " = ");
			//入力された暗算結果を格納
			mentalArithmetic = standardInput.nextInt();
			//計算の正解を定義
			caliculationAnswer = firstIntegral - secondIntegral - thirdIntegral;
		}
		}
	}

	/*
	 * 関数名：main
	 * 概要：暗算力トレーニング
	         4パターンの数式を出力し、暗算によって正解するまで解答させる
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	public static void main(String[] arg) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//数式の第一項目の整数の入力を促す
		//入力された整数を読み込む
		//数式の第二項目の整数の入力を促す
		//入力された整数を読み込む
		//数式の第三項目の整数の入力を促す
		//入力された整数を読み込む
		//関数questionCalculationを呼び出し、3項による計算式をランダムで出力
		//関数confirmRetryを呼び出し、暗算トレーニングの終了・続行を
	}
}
