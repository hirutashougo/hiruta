package Chap07.Lists;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:List07_06
* 概要:入力する実数値を、入力する整数値でべき乗する
* 作成者:S.Hiruta
* 作成日:2024/04/22
*/
public class List07_06 {

	/*
	 * 関数名：power
	 * 概要:double型引数を、int型引数でべき乗する
	 * 引数:実数(double型),整数(int型)
	 * 戻り値：べき乗値(double型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	static double power(double x, int n) {

		//べき乗計算の初期値としてdouble型の変数temp(教科書準拠)を宣言
		double tmp = 1.0;

		//引数n(教科書準拠)の回数分引数x(教科書準拠)をかける
		while (n-- > 0) {
			//変数tempに引数nをかけていく
			tmp *= x;
		}
		//最終的な変数tempの値を返却する
		return tmp;
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

		//実数a(教科書準拠)の整数b(教科書準拠)乗を求めると伝える
		System.out.println("aのb乗を求めます。");
		//実数aの値の入力を促す
		System.out.print("実数a：");
		//入力された値を読み込む
		double a = standardInput.nextDouble();
		//整数bの値の入力を促す
		System.out.print("実数b：");
		//入力された値を読み込む
		int b = standardInput.nextInt();
		
		//aのb乗の値を表示する
		System.out.print(a + "の" + b + "乗は" + power(a, b) +  "です。");
	}

}
