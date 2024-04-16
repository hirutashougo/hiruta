package Chap05.Exercises;

//Scannerパッケージの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise05_05
 * 概要:読み込んだ三つの整数値の合計と平均(キャスト演算子を用いた実数値)で表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/15
 */
public class Exercise05_05 {

	/*
	 * 関数名：main
	 * 概要:読み込んだ三つの整数値の合計と平均(キャスト演算子を用いた実数値)で表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/15
	*/
	public static void main(String[] args) {

		//Scannerのクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//処理の説明
		System.out.println("3つの整数値の平均値を求めます。");
		//1つめの整数値を促す
		System.out.print("1つめの整数値：");
		//入力された整数値を読み込む
		int fistIntegral = standardInput.nextInt();
		//2つめの整数値を促す
		System.out.print("2つめの整数値：");
		//入力された整数値を読み込む
		int secondIntegral = standardInput.nextInt();
		//3つめの整数値を促す
		System.out.print("3つめの整数値：");
		//入力された整数値を読み込む
		int thirdIntegral = standardInput.nextInt();
		
		//平均値の算出に用いる定数
		final int AVERAGE_CONSTANT = 3;
		//合計値をint型で算出
		int integralSum = fistIntegral + secondIntegral + thirdIntegral;
		//平均値をdouble型で算出
		double integralAverage =(double) (fistIntegral + secondIntegral + thirdIntegral) / AVERAGE_CONSTANT;
		
		//合計値を表示
		System.out.print("合計値は" + integralSum + "です。");
		//平均値を表示
		System.out.print("平均値は" + integralAverage + "です。");
	}
}