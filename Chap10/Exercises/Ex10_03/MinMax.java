package Chap10.Exercises.Ex10_03;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:MinMax
* 概要:二値/三値/配列の最小値・最大値を求める
* 作成者:S.Hiruta
* 作成日:2024/05/17
*/
public class MinMax {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * メソッド名：returnMaximumNumber
	 * 概要:2つの実数のうち大きいほうの実数を返却する
	 * 引数：2つの実数(double型)
	 * 戻り値：大きい方の実数(double型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	static double returnMaximumNumber(double firstNumber, double secondNumber) {
		//2つの実数のうち大きいほうの実数を返却する
		return (firstNumber > secondNumber) ? firstNumber : secondNumber;
	}
	
	/*
	 * メソッド名：returnMinimumNumber
	 * 概要:2つの実数のうち小さいほうの実数を返却する
	 * 引数：2つの実数(double型)
	 * 戻り値：小さい方の実数(double型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	static double returnMinimumNumber(double firstNumber, double secondNumber) {
		//2つの実数のうち小さいほうの実数を返却する
		return (firstNumber < secondNumber) ? firstNumber : secondNumber;
	}

	/*
	 * メソッド名：returnMaximumNumber
	 * 概要:3つの実数のうち最大の実数を返却する
	 * 引数：3つの実数(double型)
	 * 戻り値：最大の実数(double型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	static double returnMaximumNumber(double firstNumber, double secondNumber, double thirdNumber) {
		//3つの実数のうち大きいほうの実数を返却する
		return returnMaximumNumber(returnMaximumNumber(firstNumber, secondNumber), thirdNumber);
	}
	
	/*
	 * メソッド名：returnMinimumNumber
	 * 概要:3つの実数のうち最小の実数を返却する
	 * 引数：3つの実数(double型)
	 * 戻り値：最小の実数(double型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	static double returnMinimumNumber(double firstNumber, double secondNumber, double thirdNumber) {
		//3つの実数のうち小さいほうの実数を返却する
		return returnMinimumNumber(returnMinimumNumber(firstNumber, secondNumber), thirdNumber);
	}

	/*
	 * メソッド名：getMaximumElementValue
	 * 概要:double[]型配列の中の最大の要素の値を返却する
	 * 引数：配列(double[]型)
	 * 戻り値：最大の要素の値(double型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	static double getMaximumElementValue(double realNumberarray[]) {
		//最大の要素の値を格納する変数を宣言
		double maximumValue = 0;
		//各配列の要素を前後で比較していく
		for (int i = 0; i < realNumberarray.length; i++) {
			//最初の要素の処理
			if (i == 0) {
				//最初の要素の値は、仮に最大値とする
				maximumValue = realNumberarray[i];
			}
			//前後の要素を比較し、大きいほうを最大値の変数に格納する
			maximumValue = (maximumValue > realNumberarray[i]) ? maximumValue : realNumberarray[i];
		}
		//最大の要素の値を返却する
		return maximumValue;
	}
	
	/*
	 * メソッド名：getMinimumElementValue
	 * 概要:double[]型配列の中の最小の要素の値を返却する
	 * 引数：配列(double[]型)
	 * 戻り値：最小の要素の値(double型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	static double getMinimumElementValue(double realNumberarray[]) {
		//最小の要素の値を格納する変数を宣言
		double minimumValue = 0;
		//各配列の要素を前後で比較していく
		for (int i = 0; i < realNumberarray.length; i++) {
			//最初の要素の処理
			if (i == 0) {
				//最初の要素の値は、仮に最小値とする
				minimumValue = realNumberarray[i];
			}
			//前後の要素を比較し、小さいほうを最小値の変数に格納する
			minimumValue = (minimumValue < realNumberarray[i]) ? minimumValue : realNumberarray[i];
		}
		//最小の要素の値を返却する
		return minimumValue;
	}
}
