package Chap10.Exercises.Ex10_03;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:MinMaxTester
* 概要：入力された、二値/三値/配列の最小値・最大値を求めて表示
* 作成者：S.Hiruta
* 作成日:2024/05/17
*/
public class MinMaxTester {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：inputPlusInteger
	 * 概要:1以上の整数を入力させる
	 * 引数：入力条件の文言(String型)
	 * 戻り値：1以上の整数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	static int inputPlusInteger(String desplayIssue) {

		//選択の文言を表示
		System.out.print(desplayIssue);

		//入力される整数を格納する変数を宣言
		int integralNumber = 0;
		//入力された整数を読み込む
		integralNumber = standardInput.nextInt();
		//入力された整数が0以下である場合
		while (integralNumber <= 0) {
			//1以上の整数での入力を促す
			System.out.print("1以上の整数で入力してください;");
			//入力された整数を読み込む
			integralNumber = standardInput.nextInt();
		}
		//1以上の整数を返却
		return integralNumber;
	}

	/*
	 * 関数名：createArray
	 * 概要:配列の要素数・各要素の値を入力し、配列を作成する
	 * 引数：なし
	 * 戻り値：配列(double型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static double[] createArray() {

		//配列の要素数の入力を促す
		System.out.println("配列を作成します。\n要素数を入力してください。\n");
		//配列の要素数の入力を促す
		int columunCount = inputPlusInteger("要素数:");

		//入力された要素数の配列を定義
		double[] returnArray = new double[columunCount];

		//各要素の値を入力するように促す
		System.out.println("各要素の値を入力してください。");
		//各行の全ての要素を入力させる
		for (int i = 0; i < columunCount; i++) {
			//行の要素を入力させる
			System.out.print("[" + i + "]：");
			//入力された要素を配列に読み込む
			returnArray[i] = standardInput.nextDouble();
		}
		//作成された配列を返却する
		return returnArray;
	}

	/*
	* クラス名:main
	* 概要:入力された、二値/三値/配列の最小値・最大値を求めて表示
	* 作成者:S.Hiruta
	* 作成日:2024/05/17
	*/
	public static void main(String[] args) {

		//実数の比較において行う処理の説明をする
		System.out.println("3つの実数を入力してください。"
				+ "\n1つめと2つめで大きさを比較した後、"
				+ "\n3つの実数で大きさを比較します。");

		//比較に用いる実数を入力させる
		//1つめの実数の入力を促す
		System.out.print("\n1つめの実数：");
		//入力された実数を読み込む
		double firstRealNumber = standardInput.nextDouble();
		//2つめの実数の入力を促す
		System.out.print("2つめの実数：");
		//入力された実数を読み込む
		double secondRealNumber = standardInput.nextDouble();
		//3つめの実数の入力を促す
		System.out.print("3つめの実数：");
		//入力された実数を読み込む
		double thirdRealNumber = standardInput.nextDouble();

		//2つの実数で大きいほうを表示する
		System.out.println("\n1つめと2つめの実数で大きい方の値："
				+ MinMax.returnMaximumNumber(firstRealNumber, secondRealNumber));
		//2つの実数で小さいほうを表示する
		System.out.println("1つめと2つめの実数で小さい方の値："
				+ MinMax.returnMinimumNumber(firstRealNumber, secondRealNumber));
		//3つの実数で最大の値を表示する
		System.out.println("3つの実数で最大値："
						+ MinMax.returnMaximumNumber(firstRealNumber, secondRealNumber, thirdRealNumber));
		//3つの実数で最小の値を表示する
		System.out.println("3つの実数で最小値："
						+ MinMax.returnMinimumNumber(firstRealNumber, secondRealNumber, thirdRealNumber));

		//配列の要素の比較において、行う処理の説明をする
		System.out.println("\n配列の要素の値の最大値・最小値を出力します。");

		//比較に用いる配列を生成
		double realNumberArray[] = createArray();

		//配列の最大値を表示
		System.out.println("\n配列の最大値："
				+ MinMax.getMaximumElementValue(realNumberArray));
		//配列の最小値を表示
		System.out.println("配列の最小値："
				+ MinMax.getMinimumElementValue(realNumberArray));
	}
}
