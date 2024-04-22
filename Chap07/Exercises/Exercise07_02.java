package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_02
* 概要:入力される3つの整数の中から最小値を表示する
* 作成者:S.Hiruta
* 作成日:2024/04/22
*/
public class Exercise07_02 {

	/*
	 * 関数名：min
	 * 概要:３つのint型引数の最小値を求める
	 * 引数：整数(int型)
	 * 戻り値：最小値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	static int min(int a, int b, int c) {
		
		//仮に引数a(教科書準拠)を最小値と仮定する
		int minimumIntegral = a;
		//引数b(教科書準拠)が最小値よりも小さい場合
		if (b < minimumIntegral) {
			//最小値を引数b(教科書準拠)とする
			minimumIntegral = b;
		}
		//引数c(教科書準拠)が最小値よりも小さい場合
		if (c < minimumIntegral) {
			//最小値を引数c(教科書準拠)とする
			minimumIntegral = c;
		}
		
		//最終的に最小値となったものを返却する
		return minimumIntegral;
	}

	/*
	 * 関数名：main
	 * 概要:入力される3つの整数の中から最小値を表示する
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

		//最小の整数値を表示する
		System.out.print("最小値は" + min(firstIntegral, secondIntegral, thirdIntegral) + "です。");
	}

}
