package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_12
* 概要:整数(2進数表記)のビット数を左右に回転させた値を表示する
* 作成者:S.Hiruta
* 作成日:2024/04/25
*/
public class Exercise07_12 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：printBits
	 * 概要:int型のビット構成を表示
	 		シフト演算子とともに指定された数分、整数(2進数)を左右にシフトさせる
	 * 引数:なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	static void printBits(int inegralNumber) {
		//二進数表記の整数のビットを左右にシフトさせる
		for (int i = 31; i >= 0; i--) {
			//各ビットが1か0か判断し、表示していく
			System.out.print(((inegralNumber >>> i & 1) == 1) ? '1' : '0');
		}
	}

	/*
	 * 関数名：shiftLeft
	 * 概要:指定された数分、整数(2進数)を左にシフトさせた値(10進数表記)を算出する
	 * 引数::整数(int型),シフトさせるビット数(int型)
	 * 戻り値：左にシフトさせた値(10進数表記)(int型)
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
		//左にシフトさせた値(10進数)を返却する
		return multiplicationNumber;
	}

	/*
	 * 関数名：shiftRight
	 * 概要:指定された数分、整数(2進数)を右にシフトさせた値(10進数表記)を算出する
	 * 引数:整数(int型),シフトさせるビット数(int型)
	 * 戻り値：右にシフトさせた値(10進数表記)(int型)
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
		//右にシフトさせた値(10進数)を返却する
		return divisionNumber;
	}

	/*
	 * 関数名：calculateUpperDigits
	 * 概要:2進数において、指定された下桁、対応する上桁へ変換する
	 		下桁は0～15桁、上桁は16～31桁を指すものとする
	 * 引数：変換する下桁の数(int型),変換する下桁数(int型)
	 * 戻り値：下桁の数値を上桁に移した数値(10進数)(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	static int calculateUpperDigits(int digitNumber, int digitCount) {
		//2のべき乗を格納しておく変数を宣言
		int powerTwo = 0;
		//int型における桁数の限界である31を定数化
		final int DIGITS_LIMIT = 31;
		//桁数を超セするための定数を定義
		final int ADJUSTMENT_NUMBER = 1;
		//1が存在する下部の桁数と対を成す上部の桁分、2を乗算していく
		for (int j = DIGITS_LIMIT; j > (digitCount - ADJUSTMENT_NUMBER); j--) {
			//1のある桁と対応する、上部の桁数分の2のべき乗を作成
			powerTwo *= 2;
		}
		//変換した数値を返却する
		return powerTwo;
	}

	/*
	 * 関数名：calculateLowerDigits
	 * 概要:2進数において、指定した上桁の1を、対応する下桁の1へ変換する
	 		下桁は0～15桁、上桁は16～31桁を指すものとする
	 * 引数:変換する上桁の数(int型),変換する上桁数(int型)
	 * 戻り値：上桁の数値を下桁に移した数値(10進数)(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	static int calculateLowerDigits(int digitNumber, int digitCount) {
		//2のべき乗を格納しておく変数を宣言
		int powerTwo = 0;
		//int型における桁数の限界である31を定数化
		final int DIGITS_LIMIT = 31;
		//桁数を超セするための定数を定義
		final int ADJUSTMENT_NUMBER = 1;
		//1が存在する上部の桁数と対を成す下部の桁分、2を乗算していく
		for (int j = DIGITS_LIMIT; j < (digitCount - ADJUSTMENT_NUMBER); j++) {
			//1のある桁と対応する、上部の桁数分の2のべき乗を作成
			powerTwo *= 2;
		}
		//変換した数値を返却する
		return powerTwo;
	}

	/*
	 * 関数名：rRotate
	 * 概要:整数(2進数表記)を、指定されたビット数分右回転させる
	 * 引数:整数(int型),回転させるビット数(int型)
	 * 戻り値：回転後の整数(10進数)(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	static int rRotate(int x, int n) {
		//下桁を対応する上桁へ変換した数値の合計を格納しておく変数を宣言
		int adjustmentSum = 0;
		while (x != 0) {
			//整数の下桁部のどこのビットに1があるか調べる
			for (int i = 0; i > n; i++) {
				//整数との理論積によって、最下位ビットに1があるか判定
				if ((x & 1) == 1) {
					//関数calculateUpperDigitsを呼び出して、下桁を対応する上桁に変換する
					calculateUpperDigits(i, n);
				}
				//回転の仕上げに加算する数値を格納
				adjustmentSum += calculateUpperDigits(i, n);
				//処理の終わった最下位ビットを弾き出す
				x >>>= 1;
			}
		}
		/*2進数を指定ビット数分、右へスライドした後、
		  上桁部に出来た空白を埋めるために、
		  対応する上桁へ変換した数値の合計を加算する*/
		return (shiftRight(x, n) + adjustmentSum);
	}

	/*
	 * 関数名：lRotate
	 * 概要:整数(2進数表記)を、指定されたビット数分左回転させる
	 * 引数:整数(int型),回転させるビット数(int型)
	 * 戻り値：回転後の整数(10進数)(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	static int lRotate(int x, int n) {
		//int型における最大桁数である31を定数化
		final int DIGITS_LIMIT = 31;
		//下桁を対応する上桁へ変換した数値の合計を格納しておく変数を宣言
		int adjustmentSum = 0;
		//整数の下桁部のどこのビットに1があるか調べる
		for (int i = DIGITS_LIMIT; i > (DIGITS_LIMIT - n); i--) {
			while (x != 0) {
				//整数との理論積によって、最下位ビットに1があるか判定
				if ((x & 1) == 1) {
					//関数calculateLowerDigitsを呼び出して、下桁を対応する上桁に変換する
					calculateLowerDigits(i, n);
				}
				//回転の仕上げに加算する数値を格納
				adjustmentSum += calculateLowerDigits(i, n);
				//処理の終わった最下位ビットを弾き出す
				x >>>= 1;
			}
		}
		/*2進数を指定ビット数分、左へスライドした後、
		  下桁部に出来た空白を埋めるために、
		  対応する下桁へ変換した数値の合計を加算する*/
		return (shiftLeft(x, n) + adjustmentSum);
	}

	/*
	* 関数名：main
	* 概要：整数(2進数表記)のビット数を左右に回転させた値を表示する
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
		//入力された整数を読み込む(整数xは教科書準拠)
		int x = standardInput.nextInt();
		//0以上の整数が入力されるまで繰り返し促す
		while (x < 0) {
			//0以上の整数が入力するように促す
			System.out.println("0以上の整数で入力してください。");
			//再度0以上の整数の入力を促す
			System.out.print("整数：");
			//入力された整数を読み込む
			x = standardInput.nextInt();
		}

		/*
		 * シフトさせる回数の入力
		 */
		//シフトさせる個数(シフト数)入力を促す
		System.out.print("シフトさせる数を入力してください。\nシフト回数：");
		//入力されたシフト数を読み込む
		int shiftCount = standardInput.nextInt();
		//シフトさせる回として正の整数が入力されるまで繰り返し促す
		while (shiftCount <= 0) {
			//正の整数が入力するように促す
			System.out.println("正の整数で入力してください。");
			//再度シフトさせる個数(シフト数)入力を促す
			System.out.print("シフト回数：");
			//入力されたシフト数を読み込む
			shiftCount = standardInput.nextInt();
		}

		/*
		 * 2進数表記による出力
		 */
		//入力した整数を、二進数表記で表示すると伝える
		System.out.println("\n二進数に変換した場合：");
		//入力した整数を、二進数表記で表示する
		printBits(x);

		//入力した整数を、二進数表記において左に回転させた結果を表示すると伝える
		System.out.println("\n\n左に" + shiftCount + "ビット分回転させた値：");
		//入力した整数を、二進数表記において左に回転させた結果を表示する
		printBits(lRotate(x, shiftCount));

		//入力した整数を、二進数表記において右に回転させた結果を表示すると伝える
		System.out.println("\n\n右に" + shiftCount + "ビット分回転させた値：");
		//入力した整数を、二進数表記において右に回転させた結果を表示する
		printBits(rRotate(x, shiftCount));
	}
}
