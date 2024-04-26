package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_12
* 概要:整数のposビット目(最下位から0, 1, 2,…と数える)を、
	   1にした値を返すメソッドset
	   0にした値を返すメソッドreset
	   反転した値を返すメソッドinverse、を作成し確認する
* 作成者:S.Hiruta
* 作成日:2024/04/26
*/
public class Exercise07_13 {

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
	 * 作成日：2024/04/26
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
	 * 関数名：set
	 * 概要:整数のposビット目を1にした値を返す
	 * 引数:整数(int型),値を1にして返すposビット目(int型)
	 * 戻り値：値を返した後の値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/26
	*/
	static int set(int integralNumber, int bitCount) {
	}

	/*
	 * 関数名：reset
	 * 概要:整数のposビット目を1にした値を返す
	 * 引数:整数(int型),値を0にして返すposビット目(int型)
	 * 戻り値：値を返した後の値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/26
	*/
	static int reset(int integralNumber, int bitCount) {
	}
	
	/*
	 * 関数名：inverse
	 * 概要:整数のposビット目を1にした値を返す
	 * 引数:整数(int型),反転した値を返すposビット目(int型)
	 * 戻り値：値を返した後の値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/26
	*/
	static int inverse(int integralNumber, int bitCount) {
	}

	/*
	* 関数名：main
	* 概要：整数のbit目(最下位から0, 1, 2,…と数える)を、
	   		1にした値を返すメソッドset
	   		0にした値を返すメソッドreset
	   		反転した値を返すメソッドinverse、を作成し確認する
	* 引数：なし
	* 戻り値：なし
	* 作成者：S.Hiruta
	* 作成日：2024/04/25
	*/
	public static void main(String[] arg) {

		//整数の入力を促す
		System.out.print("整数：");
		//入力された整数を読み込む(整数xは教科書準拠)
		int integralNumber = standardInput.nextInt();

		//値を変更したいビット目の入力を促す
		System.out.print("値を変更したいビット目を入力してください。\nビット目数：");
		//入力された値を変更したいビット目を読み込む
		int bitsCount = standardInput.nextInt();
		//ビット目として正の整数が入力されるまで繰り返し促す
		while (bitsCount < 0) {
			//正の整数が入力するように促す
			System.out.println("正の整数で入力してください。");
			//再度ビット目数を入力を促す
			System.out.print("ビット回転回数：");
			//入力されたビット目数を読み込む
			bitsCount = standardInput.nextInt();
		}
	}
}
