package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise07_32
 * 概要:byte型の整数、short型の整数、int型の整数、long型の整数
 		それぞれの値の内部のビットを表示する
 * 作成者:S.Hiruta
 * 作成日:2024/05/07
 */
public class Exercise07_32 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	
	//ビット構成に置ける1を定数化
	static final int BIT_ONE = 1;

	/*
	 * 関数名：printBits
	 * 概要：byte型整数のビット構成を表示する
	 * 引数：整数(byte型)
	 * 戻り値:なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static void printBits(byte x) {
		//byte型の最大桁数を定数化
		final int BYTE_LIMITATION = 7;
		//入力されたbyte型整数をビットで表示
		for (int i = BYTE_LIMITATION; i >= 0; i--) {
			//各桁に、BIT_ONEか0を表記していく
			System.out.print(((x >>> i & BIT_ONE) == BIT_ONE) ? '1' : '0');
		}
	}

	/*
	 * 関数名：printBits
	 * 概要：short型整数のビット構成を表示する
	 * 引数：整数(short型)
	 * 戻り値:なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static void printBits(short x) {
		//short型の最大桁数を定数化
		final int SHORT_LIMITATION = 15;
		//入力されたshort型整数をビットで表示
		for (int i = SHORT_LIMITATION; i >= 0; i--) {
			//各桁に、BIT_ONEか0を表記していく
			System.out.print(((x >>> i & BIT_ONE) == BIT_ONE) ? '1' : '0');
		}
	}

	/*
	 * 関数名：printBits
	 * 概要：int型整数のビット構成を表示する
	 * 引数：整数(int型)
	 * 戻り値:なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static void printBits(int x) {
		//int型の最大桁数を定数化
		final int INT_LIMITATION = 31;
		//入力されたint型整数をビットで表示
		for (int i = INT_LIMITATION; i >= 0; i--) {
			//各桁に、BIT_ONEか0を表記していく
			System.out.print(((x >>> i & BIT_ONE) == BIT_ONE) ? '1' : '0');
		}
	}


	/*
	 * 関数名：printBits
	 * 概要：long型整数のビット構成を表示する
	 * 引数：整数(long型)
	 * 戻り値:なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static void printBits(long x) {
		//long型の最大桁数を定数化
		final int LONG_LIMITATION = 63;
		//入力されたlong型整数をビットで表示
		for (int i = LONG_LIMITATION; i >= 0; i--) {
			//各桁に、BIT_ONEか0を表記していく
			System.out.print(((x >>> i & BIT_ONE) == BIT_ONE) ? '1' : '0');
		}
	}

	/*
	 * 関数名：main
	 * 概要：byte型の整数、short型の整数、int型の整数、long型の整数
			それぞれの値の内部のビットを表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	 */
	public static void main(String[] arg) {

		//前置きとして処理内容を説明する
		//byte型の整数、short型の整数、int型の整数、long型の整数それぞれの値の内部のビットを表示すると伝える
		System.out.println("byte型の整数、short型の整数、int型の整数、long型の整数それぞれの値の内部のビットを表示します。");

		//byte型整数の入力を促す
		System.out.print("\nbyte型整数を入力してください。\nbyte型整数:");
		//入力されたbyte型整数を読み込む
		byte byteIntegralNumber = standardInput.nextByte();
		//short型整数の入力を促す
		System.out.print("short型整数を入力してください。\nshort型整数:");
		//入力されたshort型整数を読み込む
		short shortIntegralNumber = standardInput.nextShort();
		//int型整数の入力を促す
		System.out.print("int型整数を入力してください。\nint型整数:");
		//入力されたint型整数を読み込む
		int intIntegralNumber = standardInput.nextInt();
		//long型整数の入力を促す
		System.out.print("long型整数を入力してください。\nlong型整数:");
		//入力されたlong型整数を読み込む
		long longIntegralNumber = standardInput.nextLong();

		//byte型整数のビット構成を表示すると伝える
		System.out.println("\nbyte型整数のビット構成：");
		//byte型整数のビット構成を表示
		printBits(byteIntegralNumber);
		//short型整数のビット構成を表示すると伝える
		System.out.println("\nshort型整数のビット構成：");
		//short型整数のビット構成を表示
		printBits(shortIntegralNumber);
		//int型整数のビット構成を表示すると伝える
		System.out.println("\nint型整数のビット構成：");
		//int型整数のビット構成を表示
		printBits(intIntegralNumber);
		//long型整数のビット構成を表示すると伝える
		System.out.println("\nlong型整数のビット構成：");
		//lomg型整数のビット構成を表示
		printBits(longIntegralNumber);
	}
}
