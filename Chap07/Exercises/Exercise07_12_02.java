package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_12
* 概要:整数のビット数を左右に回転させた値を表示する
* 作成者:S.Hiruta
* 作成日:2024/04/25
*/
public class Exercise07_12_02 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	//int型の最高ビット数32を定数化
	static final int BITS_LIMIT = 32;
	//最上位ビット桁の31を定数化
	static final int MAXIMUM_BITS = 31;

	/*
	 * 関数名：printBits
	 * 概要:int型のビット構成を表示
	 * 引数:整数(int型)
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
		final int PRODUCT_CONSTANT = 1;
		//二進数表記の整数のビット構成を表示
		for (int i = MAXIMUM_BITS; i >= 0; i--) {
			//各ビットが1か0か判断し、表示していく
			System.out.print(((inegralNumber >>> i & PRODUCT_CONSTANT) == BIT_ONE) ? BIT_ONE : BIT_ZERO);
		}
	}

	/*
	 * 関数名：printConplementBits
	 * 概要:int型の整数の補数のビット構成を表示
	 * 引数:整数(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	static void printConplementBits(int inegralNumber) {
		//ビットの表記「1」を定数化
		final int BIT_ONE = 1;
		//ビットの表記「0」を定数化
		final int BIT_ZERO = 0;
		//ビット構成において0か1かを判別する、論理積に用いる1を定数化
		final int PRODUCT_CONSTANT = 1;
		//二進数表記の整数のビット構成を表示
		for (int i = MAXIMUM_BITS; i >= 0; i--) {
			//各ビットが1か0か判断し、表示していく
			System.out.print(((inegralNumber >>> i & PRODUCT_CONSTANT) == BIT_ONE) ? BIT_ZERO : BIT_ONE);
		}
	}

	/*
	 * 関数名：lRotate
	 * 概要:整数を、指定されたビット数分左回転させる
	 * 引数:整数(int型),回転させるビット数(int型)
	 * 戻り値：回転後の整数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	static int lRotate(int x, int n) {
		/*ビット回転数が32より大きい場合を考慮して、
		  32回を1セットとして、回数を調整する(例:33回→1回)*/
		n %= BITS_LIMIT;
		//整数x(xは教科書準拠)が負の整数の場合
		if (x < 0) {
			//整数xを補数に変換
			x = ~x;
		}
		//整数xが左にシフトした数値と対応して右にシフトした数値の合計を返却
		return ((x << n) + (x >>> (BITS_LIMIT - n)));
	}

	/*
	 * 関数名：rRotate
	 * 概要:整数を、指定されたビット数分右回転させる
	 * 引数:整数(int型),回転させるビット数(int型)
	 * 戻り値：回転後の整数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	static int rRotate(int x, int n) {
		/*ビット回転数が32より大きい場合を考慮して、
		  32回を1セットとして、回数を調整する(例:33回→1回)*/
		n %= BITS_LIMIT;
		//整数x(xは教科書準拠)が負の整数の場合
		if (x < 0) {
			//整数xを補数に変換
			x = ~x;
		}
		//整数xが右にシフトした数値と対応して左にシフトした数値の合計を返却
		return ((x >>> n) + (x << (BITS_LIMIT - n)));
	}

	/*
	* 関数名：main
	* 概要：整数のビット数を左右に回転させた値を表示する
	* 引数：なし
	* 戻り値：なし
	* 作成者：S.Hiruta
	* 作成日：2024/04/25
	*/
	public static void main(String[] arg) {

		//整数の入力を促す
		System.out.print("整数：");
		//入力された整数を読み込む(整数xは教科書準拠)
		int x = standardInput.nextInt();

		//ビット回転させる数を入力を促す
		System.out.print("ビット回転させる数を入力してください。\nビット回転回数：");
		//入力されたビット回転数を読み込む
		int shiftCount = standardInput.nextInt();
		//ビット回転させる回として0以上が入力されるまで繰り返し促す
		while (shiftCount < 0) {
			//0以上で入力するように促す
			System.out.println("0以上で入力してください。");
			//再度ビット回転させる数を入力を促す
			System.out.print("ビット回転回数：");
			//入力されたビット回転数を読み込む
			shiftCount = standardInput.nextInt();
		}

		//入力した整数を、二進数表記で表示すると伝える
		System.out.println("\n二進数に変換した場合：");
		//入力した整数を、二進数表記で表示する
		printBits(x);

		//整数が0以上の場合
		if (x >= 0) {
			//入力した整数を、二進数表記において左に回転させた結果を表示すると伝える
			System.out.println("\n\n左に" + shiftCount + "ビット分回転させた値：" + lRotate(x, shiftCount));
			//入力した整数を、二進数表記において左に回転させた結果を表示する
			printBits(lRotate(x, shiftCount));

			//入力した整数を、二進数表記において右に回転させた結果を表示すると伝える
			System.out.println("\n\n右に" + shiftCount + "ビット分回転させた値：" + rRotate(x, shiftCount));
			//入力した整数を、二進数表記において右に回転させた結果を表示する
			printBits(rRotate(x, shiftCount));
			
		//整数が負の値の場合
		} else {
			/*負の整数を取り扱う際、処理で用いた補数の状態から、正しい
			整数表記へと戻すための定数1を定義*/
			final int ADJUSTMENT_NUMBER = 1;
			//入力した整数を、二進数表記において左に回転させた結果を表示すると伝える
			System.out.println("\n\n左に" + shiftCount + "ビット分回転させた値：" + -(lRotate(x, shiftCount) + ADJUSTMENT_NUMBER));
			//入力した整数を、二進数表記において左に回転させた結果を表示する
			printConplementBits(lRotate(x, shiftCount));

			//入力した整数を、二進数表記において右に回転させた結果を表示すると伝える
			System.out.println("\n\n右に" + shiftCount + "ビット分回転させた値：" + -(rRotate(x, shiftCount) + ADJUSTMENT_NUMBER));
			//入力した整数を、二進数表記において右に回転させた結果を表示する
			printConplementBits(rRotate(x, shiftCount));
		}
	}
}
