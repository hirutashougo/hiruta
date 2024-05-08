package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise07_31
 * 概要:int型の整数、long型の整数、float型の実数、double型の実数
 		それぞれの絶対値を求める
 * 作成者:S.Hiruta
 * 作成日:2024/05/07
 */
public class Exercise07_31 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	//整数及び実数の符号を変換するための定数を宣言
	static final int CHANGE_SIGN = -1;

	/*
	 * 関数名：absolute
	 * 概要：int型整数の絶対値を求める
	 * 引数：整数(int型)
	 * 戻り値:入力された整数の絶対値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static int absolute(int x) {
		//入力されたint型整数が負の場合
		if (x < 0) {
			//符号を正にする
			x *= CHANGE_SIGN;
		}
		//入力された整数の絶対値を返却
		return x;
	}

	/*
	 * 関数名：absolute
	 * 概要：long型整数の絶対値を求める
	 * 引数：整数(long型)
	 * 戻り値:入力された整数の絶対値(long型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static long absolute(long x) {
		//入力されたlong型整数が負の場合
		if (x < 0) {
			//符号を正にする
			x *= CHANGE_SIGN;
		}
		//入力された整数の絶対値を返却
		return x;
	}

	/*
	 * 関数名：absolute
	 * 概要：float型実数の絶対値を求める
	 * 引数：実数(float型)
	 * 戻り値:入力された実数の絶対値(float型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static float absolute(float x) {
		//入力されたfloat型実数が負の場合
		if (x < 0) {
			//符号を正にする
			x *= CHANGE_SIGN;
		}
		//入力された実数の絶対値を返却
		return x;
	}

	/*
	 * 関数名：absolute
	 * 概要：double型実数の絶対値を求める
	 * 引数：実数(double型)
	 * 戻り値:入力された実数の絶対値(double型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static double absolute(double x) {
		//入力されたdouble型実数が負の場合
		if (x < 0) {
			//符号を正にする
			x *= CHANGE_SIGN;
		}
		//入力された実数の絶対値を返却
		return x;
	}

	/*
	 * 関数名：main
	 * 概要：int型の整数、long型の整数、float型の実数、double型の実数
	 		それぞれの絶対値を求める
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	 */
	public static void main(String[] arg) {

		//前置きとして処理内容を説明する
		//int型の整数、long型の整数、float型の実数、double型の実数それぞれの絶対値を求めると伝える
		System.out.println("int型の整数、long型の整数、float型の実数、double型の実数\nそれぞれの絶対値を求めます。");

		//int型整数の入力を促す
		System.out.print("\nint型整数を入力してください。\nint型整数:");
		//入力されたint型整数を読み込む
		int intIntegralNumber = standardInput.nextInt();
		//long型整数の入力を促す
		System.out.print("\nlong型整数を入力してください。\nlong型整数:");
		//入力されたlong型整数を読み込む
		long longIntegralNumber = standardInput.nextLong();
		//float型実数の入力を促す
		System.out.print("\nfloat型実数を入力してください。\nfloat型実数:");
		//入力されたfloat型実数を読み込む
		float floatRealNumber = standardInput.nextFloat();
		//double型実数の入力を促す
		System.out.print("\ndouble型実数を入力してください。\ndouble型実数:");
		//入力されたdouble型実数を読み込む
		double doubleRealNumber = standardInput.nextDouble();

		//int型整数の絶対値を求め、表示する
		System.out.println("\nint型整数の絶対値は" + absolute(intIntegralNumber) + "です。");
		//long型整数の絶対値を求め、表示する
		System.out.println("\nlong型整数の絶対値は" + absolute(longIntegralNumber) + "です。");
		//float型実数の絶対値を求め、表示する
		System.out.println("\nfloat型実数の絶対値は" + absolute(floatRealNumber) + "です。");
		//double型実数の絶対値を求め、表示する
		System.out.println("\ndouble型実数の絶対値は" + absolute(doubleRealNumber) + "です。");

	}
}
