package Chap10.Exercises.Ex10_03;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Math
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
	 * 戻り値：より大きい実数(double型)
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
	 * 戻り値：より小さい実数(double型)
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
	 * 引数：3つの実数(double型
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
	 * 引数：3つの実数(double型
	 * 戻り値：最小の実数(double型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	static double returnMinimumNumber(double firstNumber, double secondNumber, double thirdNumber) {
		//3つの実数のうち小さいほうの実数を返却する
		return returnMinimumNumber(returnMinimumNumber(firstNumber, secondNumber), thirdNumber);
	}

	/*
	 * メソッド名：getMximumElementValue
	 * 概要:double[]型配列の中の最大の要素の値を返却する
	 * 引数：配列(double[]型)
	 * 戻り値：最大の要素の値(double型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	static double getMximumElementValue(double realNumberarray[]) {
		//最大の要素の値を格納する変数を宣言
		double maximumValue = 0;
		//配列のインデックス数を格納する辺陬を宣言
		int indexNumber = 0;
		//各配列の要素を前後で比較していく
		for (int i = 1; i <= realNumberarray.length; i++, indexNumber++) {
			//前後の要素を比較し、大きいほうを最大値の変数に格納する
			maximumValue = (realNumberarray[i] > realNumberarray[indexNumber]) ? realNumberarray[i] : realNumberarray[indexNumber];
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
		//配列のインデックス数を格納する辺陬を宣言
		int indexNumber = 0;
		//各配列の要素を前後で比較していく
		for (int i = 1; i <= realNumberarray.length; i++, indexNumber++) {
			//前後の要素を比較し、小さいほうを最小値の変数に格納する
			minimumValue = (realNumberarray[i] > realNumberarray[indexNumber]) ? realNumberarray[i] : realNumberarray[indexNumber];
		}
		//最小の要素の値を返却する
		return minimumValue;
	}
}
