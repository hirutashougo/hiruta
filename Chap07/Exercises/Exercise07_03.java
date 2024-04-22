package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_03
* 概要:入力される3つの整数の中から中央値を表示する
* 作成者:S.Hiruta
* 作成日:2024/04/22
*/
public class Exercise07_03 {

	/*
	 * 関数名：med
	 * 概要:３つのint型引数の中央値を求める
	 * 引数：整数(int型)
	 * 戻り値：中央値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	static int med(int a, int b, int c) {
		
		//まず最小値を求める
		//仮に引数a(教科書準拠)を最小値と仮定する
		int minimumIntegral = a;
		//引数b(教科書準拠)が最小値よりも小さい場合
		if (b < minimumIntegral) {
			//最小値を引数b(教科書準拠)とする。
			minimumIntegral = b;
		}
		//引数c(教科書準拠)が最小値よりも小さい場合
		if (c < minimumIntegral) {
			//最小値を引数c(教科書準拠)とする。
			minimumIntegral = c;
		}

		//次に最大値を求める
		//仮に引数a(教科書準拠)を最大値と仮定する
		int maximumIntegral = a;
		//引数b(教科書準拠)が最大値よりも大きい場合
		if (b > maximumIntegral) {
			//最大値を引数b(教科書準拠)とする。
			maximumIntegral = b;
		}
		//引数c(教科書準拠)が最大値よりも大きい場合
		if (c > maximumIntegral) {
			//最大値を引数c(教科書準拠)とする。
			maximumIntegral = c;
		}
		
		//全ての引数を合計する
		int integralSum = a + b + c;
		//全体の合計から最小値と最大値を引き、中央値を求める
		int medianIntegral = integralSum - (minimumIntegral + maximumIntegral);
		
		//中央値を返却する
		return medianIntegral;
	}

	/*
	 * 関数名：main
	 * 概要:入力される3つの整数の中から中央値を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	public static void main(String[] arg) {
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//最初の整数値の入力を促す
		System.out.print("最初の整数値を入力：");
		//入力された整数値の読み込み
		int firstIntegral = standardInput.nextInt();

		//2番目の整数値の入力を促す
		System.out.print("2番目の整数値を入力：");
		//入力された整数値の読み込み
		int secondIntegral = standardInput.nextInt();

		//3番目の整数値の入力を促す
		System.out.print("3番目の整数値を入力：");
		//入力された整数値の読み込み
		int thirdIntegral = standardInput.nextInt();

		//3つの整数の中央値を求める
		System.out.print("中央値は" + med(firstIntegral, secondIntegral, thirdIntegral) + "です。");
	}

}
