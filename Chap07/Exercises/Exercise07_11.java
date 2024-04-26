package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_11
* 概要:・整数の左右をシフトさせる
       ・整数に2のべき乗の乗算・除算を行う
       上記の二つが同じ結果をもたらすと確認する
* 作成者:S.Hiruta
* 作成日:2024/04/25
*/
public class Exercise07_11 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	//int型の最高ビット数32を定数化
	static final int BITS_LIMIT = 32;

	/*
	 * 関数名：printBits
	 * 概要:int型のビット構成を表示
	 * 引数:なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	static void printBits(int inegralNumber) {
		//ビットの表記「1」を定数化
		final int BIT_ONE = 1;
		//ビットの表記「0」を定数化
		final int BIT_ZERO = 0;
		//ビット構成において0か1かを判別する、論理積に用いる1を定数化
		final int PRODUCT_CONSTANT =  1;
		//二進数表記の整数のビット構成を表示
		for (int i = 31 ; i >= 0; i--) {
			//各ビットが1か0か判断し、表示していく
			System.out.print(((inegralNumber >>> i & PRODUCT_CONSTANT) == BIT_ONE) ? BIT_ONE : BIT_ZERO);
		}
	}

	/*
	 * 関数名：shiftLeft
	 * 概要:指定された数分、整数を左にシフトさせた値を算出する
	 * 引数::整数(int型),シフトさせるビット数(int型)
	 * 戻り値：左にシフトさせた値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	static int shiftLeft(int integralNumber, int shiftCount) {
		//整数への乗算・除算に用いる定数2を定義
		final int BINARY_NUMBER = 2;
		//入力した整数に、2のべき乗を乗算した値を格納する変数を定義
		int multiplicationNumber = integralNumber;
		//入力された回数分、2のべき乗の乗算を行う
		for (int i = 0; i < shiftCount; i++) {
			//入力した整数に、シフト数分の2のべき乗を乗算していく
			multiplicationNumber *= BINARY_NUMBER;
		}
		//左にシフトさせた値を返却する
		return multiplicationNumber;
	}

	/*
	 * 関数名：shiftRight
	 * 概要:指定された数分、整数を右にシフトさせた値を算出する
	 * 引数:整数(int型),シフトさせるビット数(int型)
	 * 戻り値：右にシフトさせた値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	static int shiftRight(int integralNumber, int shiftCount) {
		//整数への乗算・除算に用いる定数2を定義
		final int BINARY_NUMBER = 2;
		//入力した整数に、2のべき乗を除算した値を格納する変数を定義
		int divisionNumber = integralNumber;
		//入力された回数分、2のべき乗の除乗を行う
		for (int i = 0; i < shiftCount; i++) {
			//入力した整数に、シフト数の2のべき乗を除算する
			divisionNumber /= BINARY_NUMBER;
		}
		//右にシフトさせた値を返却する
		return divisionNumber;
	}

	/*
	 * 関数名：main
	 * 概要：・整数の左右をシフトさせる
	   		 ・整数に2のべき乗の乗算・除算を行う
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	public static void main(String[] arg) {

		/*
		 * 整数の入力
		 */
		//整数の入力を促す
		System.out.print("0以上の整数を入力してください。\n整数：");
		//入力された整数を読み込む
		int integralNumber = standardInput.nextInt();
		//0以上の整数が入力されるまで繰り返し促す
		while (integralNumber < 0) {
			//0以上の整数が入力するように促す
			System.out.println("0以上の整数で入力してください。");
			//再度0以上の整数の入力を促す
			System.out.print("整数：");
			//入力された整数を読み込む
			integralNumber = standardInput.nextInt();
		}

		/*
		 * シフトさせる回数の入力
		 */
		//最上位ビット桁の31を定数化
		final int MAXIMUM_BITS = 31;
		//シフトさせる個数(シフト数)入力を促す
		System.out.print("シフトさせる数を入力してください。\nシフト回数：");
		//入力されたシフト数を読み込む
		int shiftCount = standardInput.nextInt();
		//シフトさせる回として1～31が入力されるまで繰り返し促す
		while (shiftCount <= 0 || shiftCount >= BITS_LIMIT) {
			//正の整数が入力するように促す
			System.out.println("1～31の値で入力してください。");
			//再度シフトさせる個数(シフト数)入力を促す
			System.out.print("シフト回数：");
			//入力されたシフト数を読み込む
			shiftCount = standardInput.nextInt();
		}

		/*
		 * 結果の出力
		 */
		//入力した整数を、二進数表記で表示すると伝える
		System.out.println("\n二進数に変換した場合：");
		//入力した整数を、二進数表記で表示する
		printBits(integralNumber);

		//入力した整数を、二進数表記において右にシフトさせた結果を表示すると伝える
		System.out.println("\n\n右に" + shiftCount + "シフトさせた値：" + (integralNumber >> shiftCount));
		//入力した整数を、二進数表記において右にシフトさせた結果を表示する
		printBits(integralNumber >> shiftCount);

		//入力した整数を、二進数表記において左にシフトさせた結果を表示すると伝える
		System.out.println("\n\n左に" + shiftCount + "シフトさせた値：" + (integralNumber << shiftCount));
		//入力した整数を、二進数表記において左にシフトさせた結果を表示する
		printBits(integralNumber << shiftCount);

		//入力した整数に、シフト数回分、2のべき乗を除算した数値を表示する
		System.out.print("\n\n" + integralNumber + "を" + shiftCount + "回、2のべき乗で乗じた値:" + shiftRight(integralNumber, shiftCount) + "\n");
		//2のべき乗を除算した数値を2進数表記にする
		printBits(shiftRight(integralNumber, shiftCount));

		//入力した整数に、シフト数回分、2のべき乗を乗算した数値を表示する
		System.out.print("\n\n" + integralNumber + "を" + shiftCount + "回、2のべき乗で除した値:" + shiftLeft(integralNumber, shiftCount) + "\n");
		//2のべき乗を乗算した数値を2進数表記にする
		printBits(shiftLeft(integralNumber, shiftCount));
	}
}
