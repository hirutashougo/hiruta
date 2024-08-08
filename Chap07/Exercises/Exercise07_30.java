package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise07_30
 * 概要:2つのint型整数・3つのint型整数・.配列の全要素
 		それぞれの最小値を求める
 * 作成者:S.Hiruta
 * 作成日:2024/05/07
 */
public class Exercise07_30 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：createArray
	 * 概要:配列の要素数・各要素の値を入力し、配列を作成する
	 * 引数：なし
	 * 戻り値：配列(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static int[] createArray() {

		//配列の要素数の入力を促す
		System.out.println("配列の要素数を入力してください。");
		//配列の要素数の入力を促す
		System.out.print("要素数:");
		//入力された要素数を読み込む
		int columunCount = standardInput.nextInt();
		//要素数が正の整数で入力されるまで繰り返す処理
		while (columunCount <= 0) {
			//正の整数で入力するように表示
			System.out.println("正の整数で入力してください。");
			//再度、要素数の入力を促す
			System.out.print("要素数:");
			//入力された要素数を読み込む
			columunCount = standardInput.nextInt();
		}

		//入力された要素数の配列を定義
		int[] returnArray = new int[columunCount];

		//各要素の値を入力するように促す
		System.out.println("各要素の値を入力してください。");
		//各行の全ての要素を入力させる
		for (int j = 0; j < columunCount; j++) {
			//行の要素を入力させる
			System.out.print("[" + j + "]：");
			//入力された要素を配列に読み込む
			returnArray[j] = standardInput.nextInt();
		}
		//作成された配列を返却する
		return returnArray;
	}

	/*
	 * 関数名：min
	 * 概要：2つのint型整数の最小値を求める
	 * 引数：2つの整数(int型)
	 * 戻り値:最小の整数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static int min(int a, int b) {
		//2つのint型整数の内、小さいほうの値を返却
		return a < b ? a : b;
	}

	/*
	 * 関数名：min
	 * 概要:3つのint型整数の最小値を求める
	 * 引数：3つの整数(int型)
	 * 戻り値：最小の整数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static int min(int a, int b, int c) {
		//はじめに、整数aを仮に最小値としておく
		int minimumVariable = a;
		//整数bが、最小値よりも小さかった場合
		if (b < minimumVariable) {
			//最小値を整数bに更新
			minimumVariable = b;
		}
		//整数cが、最小値よりも小さかった場合
		if (c < minimumVariable) {
			//最小値を整数cに更新
			minimumVariable = c;
		}
		//最終的に最小値であるものを返却
		return minimumVariable;
	}

	/*
	 * 関数名：min
	 * 概要:配列の全要素の中の最小値を求める
	 * 引数：配列(int型)
	 * 戻り値：最小の要素の値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static int min(int a[]) {
		//はじめに、配列aの最初の要素の値を仮に最小値としておく
		int minimumVariable = a[0];
		//配列の全要素を照合し、最小値を探す
		for (int i = 1; i < a.length; i++) {
			//整数bが、最小値よりも小さかった場合
			if (a[i] < minimumVariable) {
				//最小値を整数bに更新
				minimumVariable = a[i];
			}
		}
		//最終的に最小値であるものを返却
		return minimumVariable;
	}

	/*
	 * 関数名：main
	 * 概要：2つのint型整数・3つのint型整数・.配列の全要素
			それぞれの最小値を求め、表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	 */
	public static void main(String[] arg) {

		//前置きとして処理内容を説明する
		//2つのint型整数・3つのint型整数・.配列の全要素、それぞれの最小値を求め、表示すると伝える
		System.out.println("2つのint型整数・3つのint型整数・.配列の全要素\nそれぞれの最小値を求め、表示します。");

		//1つめの整数の入力を促す
		System.out.print("\n1つめの整数を入力してください。\n1つめの整数:");
		//入力された1つめの整数を読み込む
		int firstIntegralNumber = standardInput.nextInt();
		//2つめの整数の入力を促す
		System.out.print("2つめの整数を入力してください。\n2つめの整数:");
		//入力された2つめの整数を読み込む
		int secondIntegralNumber = standardInput.nextInt();
		//3つめの整数の入力を促す
		System.out.print("3つめの整数を入力してください。\n3つめの整数:");
		//入力された3つめの整数を読み込む
		int thirdIntegralNumber = standardInput.nextInt();

		//関数createArrayを呼び出して、配列の要素数を呼び要素の値を入力させる
		int[] integralMatrix = createArray();

		//2つめまでの整数の最小値を求め、表示する
		System.out.println("\n2つめまでの整数の最小値は" + min(firstIntegralNumber, secondIntegralNumber) + "です。");
		//3つのint型整数の最小値を求め、表示する
		System.out.println("3つの整数の最小値は" + min(firstIntegralNumber, secondIntegralNumber, thirdIntegralNumber) + "です。");
		//配列の全要素の中の最小値を求め、表示する
		System.out.println("配列の全要素の値の最小値は" + min(integralMatrix) + "です。");
	}
}
