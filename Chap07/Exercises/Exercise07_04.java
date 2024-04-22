package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_04
* 概要:1から入力された整数までの整数の和を求める
* 作成者:S.Hiruta
* 作成日:2024/04/22
*/
public class Exercise07_04 {

	/*
	 * 関数名：sumUp
	 * 概要:1～引数nまでの全整数の和を求める
	 * 引数：整数(int型)
	 * 戻り値：全整数の和(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	static int sumUp(int n) {

		//全整数の和の計算の初期値0としてint型の変数を宣言
		int integralSum = 0;

		//引数n(教科書準拠)の回数分、1ずつ増加させた整数を足していく
		for (int i = 1; i <= n; i++) {
			//計算の初期値0へ、1ずつ増加させた整数を足していく
			integralSum += i;
		}
		//全整数の和の値を返却する
		return integralSum;
	}

	/*
	 * 関数名：main
	 * 概要:1から入力された整数までの整数の和を求める
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	public static void main(String[] arg) {
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//これから行う計算を説明する
		System.out.println("1～nまでの全整数の和を求めます。");
		
		//整数の入力を促す
		System.out.print("整数nを入力してください\n整数n：");
		//入力された整数値の読み込み
		int integralNumbr = standardInput.nextInt();
		//正の整数が入力されるまで繰り返し入力を促す
		while (integralNumbr <= 0) {
			//正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//改めて整数の入力を促す
			System.out.print("整数nを入力してください\n整数n：");
			//入力された整数値の読み込み
			integralNumbr = standardInput.nextInt();
		}

		//1から入力された整数までの整数の和を求める
		System.out.print("1～" + integralNumbr + "までの全整数の和は" + sumUp(integralNumbr) + "です。");
	}

}
