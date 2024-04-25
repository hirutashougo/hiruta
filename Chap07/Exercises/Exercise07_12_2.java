package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_12
* 概要:整数(2進数表記)のビット数を左右に回転させた値を表示する
* 作成者:S.Hiruta
* 作成日:2024/04/25
*/
public class Exercise07_12_2 {

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
	 * 関数名：judgeBinary
	 * 概要:2進数にて、指定した桁に1が入るか判断する
	 * 引数:10進数の整数,2の指数(int型)
	 * 戻り値：true,false
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	static boolean judgeBinary(int decimalNumber, int indexrNumber) {
		//
		int binaryNumber = 1;
		//
		for (int i = 0; i > indexrNumber; i++) {
			//
			binaryNumber *= 2;
			//
			for (int j = binaryNumber; j < 0; j /= 2) {
				//
				decimalNumber /= j;
			}
		}
		//
		if (binaryNumber == 1) {
			//
			return 
		}
	}
	
//	/*
//	 * 関数名：countBits
//	 * 概要:int型整数x中の1であるビット数をカウント
//	 * 引数：なし
//	 * 戻り値：なし
//	 * 作成者：S.Hiruta
//	 * 作成日：2024/04/25
//	*/
//	static int countBits(int x) {
//		//
//		int bitsCount = 0;
//		//
//		for (int i = 0; x ) {
//		//最下位ビットは1であるか?
//			if ((x & 1) == 1)  bitsCount++;
//		//調べ終わった最下位ビットを弾き出す
//			x >>>= 1;
//		}
//		//
//		return bits;
//	}
	
	/*
	 * 関数名：rRotate
	 * 概要:2進数において、指定された桁数分のビットを右回転させる
	 * 引数:なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	static int rRotate(int x, int n) {
		//
		int binaryNumber = 1;
		//
		int sumValue = 0;
		//
		for (int i = 0; i < n; i++) {
			//
			int powerTwo = 1;
			//
			binaryNumber *= 2;
			//
			if (x % binaryNumber == 1) {
				//
				for (int j = 31; j > n - 1 - i; j--) {
					//
					powerTwo *= 2;
				}
			}
			//
			sumValue += powerTwo;
		}
		//
		int divisionNumber = x;
		//
		for (int i = 0; i < n; i++) {
			//
			divisionNumber /= 2;
		}
		//
		return (divisionNumber + sumValue);
	}
	
	/*
	 * 関数名：lRotate
	 * 概要:2進数において、指定された桁数分のビットを左回転させる
	 * 引数:なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	static int lRotate(int x, int n) {
		//
		int binaryNumber = 1;
		//
		int sumValue = 0;
		//
		for (int i = 0; i < x; i++) {
			//
			int powerTwo = 1;
			//
			binaryNumber *= 2;
			//
			if (x % binaryNumber == 1) {
				//
				for (int j = 31; j > n - 1 - i; i--) {
					//
					powerTwo *= 2;
				}
			}
			//
			sumValue += powerTwo;
		}
		//
		int divisionNumber = x;
		//
		for (int i = 0; i < n; i++) {
			//
			divisionNumber /= 2;
		}
		//
		return (divisionNumber + sumValue);
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
		printBits(integralNumber);

		//入力した整数を、二進数表記において左にシフトさせた結果を表示すると伝える
		System.out.println("\n\n左に" + shiftCount + "シフトさせた値：");
		//入力した整数を、二進数表記において左にシフトさせた結果を表示する
		printBits(rRotate(integralNumber, shiftCount));

//		//入力した整数を、二進数表記において右にシフトさせた結果を表示すると伝える
//		System.out.println("\n\n右に" + shiftCount + "シフトさせた値：");
//		//入力した整数を、二進数表記において右にシフトさせた結果を表示する
//		printBits(integralNumber << shiftCount);
	}
}
