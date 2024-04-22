package Chap07.Lists;

//Scannerの読み込み
import java.util.Scanner;

/*
* クラス名:List07_03
* 概要:3つの整数値の中から、最大値を求める
* 作成者:S.Hiruta
* 作成日:2024/04/19
*/
public class List07_03 {
	
	/*
	 * 関数名：max
	 * 概要:３つのint型引数の最小値を求める
	 * 引数：整数
	 * 戻り値：最大値
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	static int maximumNumber (int firstIntegral, int secondIntegral, int thirdIntegral) {
		//仮に最初の引数を最大値と仮定する
		int maximumIntegral = firstIntegral;
		//２番目の引数が最初の引数よりも大きい場合
		if (secondIntegral > maximumIntegral) {
			//最大値を２番目の引数とする。
			maximumIntegral = secondIntegral;
		}
		//3番目の引数が２番目の引数よりも大きい場合
		if (thirdIntegral > maximumIntegral) {
			//最大値を3番目の引数とする。
			maximumIntegral = thirdIntegral;
		}
		//最終的に最大値となったものを返却する
		return maximumIntegral;
	}

	/*
	 * 関数名：main
	 * 概要:3つの整数値の中から、最大値を求める
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/18
	*/
	public static void main(String[] arg) {
		//Randomクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//整数a(整数aは教科書準拠)の入力を促す
		System.out.print("整数a：");
		//入力された整数値を読み込む
		int firstIntegral = standardInput.nextInt();
		//整数b(整数bは教科書準拠)の入力を促す
		System.out.print("整数b：");
		//入力された整数値を読み込む
		int secondIntegral = standardInput.nextInt();
		//整数c(整数cは教科書準拠)の入力を促す
		System.out.print("整数c：");
		//入力された整数値を読み込む
		int thirdIntegral = standardInput.nextInt();
	}
}
