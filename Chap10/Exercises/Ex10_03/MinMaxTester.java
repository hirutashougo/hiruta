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
	 * 作成日：2024/05/15
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
		System.out.println("配列を作成します。\n要素数を入力してください。");
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
	 * 関数名：inputRealNumber
	 * 概要:実数を入力させる
	 * 引数：入力内容の文言(String型)
	 * 戻り値：実数(double型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	static double inputRealNumber(String desplayIssue) {

		//選択の文言を表示
		System.out.print(desplayIssue);

		//入力される実数を格納する変数を宣言
		double integralNumber = 0;
		//入力された実数を読み込む
		integralNumber = standardInput.nextDouble();
		
		//入力された実数を返却
		return integralNumber;
	}

	/*
	 * 関数名：isTrueFalse
	 * 概要:0か1での入力をさせる。0ならfalse、1ならtrueを返却
	 * 引数：選択の文言(String型)
	 * 戻り値：true,false(booolean型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	static boolean isTrueFalse(String desplayIssue) {

		//選択の文言を表示
		System.out.print(desplayIssue + "[0…No/1…Yes]：");

		//選択結果を格納する変数を定義
		boolean judgeBoolean = true;

		//trueを返却する選択を表す定数を定義
		final int RETURN_TRUE = 1;
		//trueを返却する選択を表す定数を定義
		final int RETURN_FALSE = 0;

		//入力された選択を読み込む
		int judgementValue = standardInput.nextInt();
		//0か1が入力されるまで選択を迫る
		while (judgementValue != RETURN_TRUE && judgementValue != RETURN_FALSE) {
			//0か1での入力を促す
			System.out.print("0か1で入力してください。");
			//入力された選択を読み込む
			judgementValue = standardInput.nextInt();
		}
		//0が入力された場合、falseを返却値に格納
		if (judgementValue == RETURN_FALSE) {
			//falseを返却値に格納
			judgeBoolean = false;
		}

		//0か1(falseかtrue)の選択結果を返却する
		return judgeBoolean;
	}

	/*
	* クラス名:main
	* 概要:入力された、二値/三値/配列の最小値・最大値を求めて表示
	* 作成者:S.Hiruta
	* 作成日:2024/05/17
	*/
	public static void main(String[] args) {
		
		//比較に用いる配列を生成
		double realNumberArray[] = createArray();
		
		//比較検討に用いる実数の個数を定数化
		final int REAL_NUMBER_COUNT = 3;
		//比較検討に用いる実数の順番を格納する変数を定義
		int realNumberCount = 1;
		//比較検討に用いる三つの実数の入力を促す
		for (int i = 0; i < REAL_NUMBER_COUNT; i++, realNumberCount++) {
			//順番に入力される実数の値を読み込む
			double firsyRealNumber = inputRealNumber(realNumberCount + "番目の実数：");
		}
	}
}
