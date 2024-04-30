package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_12
* 概要:整数のビット(最下位から0, 1, 2,…と数える)を、
	   1にした値を返すメソッドset
	   0にした値を返すメソッドreset
	   反転した値を返すメソッドinverse、を作成し確認する
* 作成者:S.Hiruta
* 作成日:2024/04/26
*/
public class Exercise07_13 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	//ビット数を調整するための定数を定義
	static final int BIT_ADJUSTMENT = 1;
	//整数への乗算・除算に用いる定数2を定義
	static final int BINARY_NUMBER = 2;
	//第0ビットのみに1を持つ整数1を定数化
	static final int ONE_SET_CONSTANT = 1;
	//第0ビット目を0にするための定数-2を定義
	static final int ZERO_SET_CONSTANT = -2;

	/*
	 * 関数名：printBits
	 * 概要:int型のビット構成を表示
	 * 引数:整数(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/26
	*/
	static void printBits(int inegralNumber) {
		//最上位ビット桁の31を定数化
		final int MAXIMUM_BITS = 31;
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
	 * 関数名：saveLessBits
	 * 概要:指定されたビット未満の値を保存する
	 * 引数:整数(int型),ビット(int型)
	 * 戻り値：指定したビット未満の値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/30
	*/
	static int saveLessBits(int integralNumber, int bitCount) {
		//処理する整数を格納する変数を定義
		int processVariable = 0;
		//整数を指定ビットを含まないで右シフト
		processVariable = integralNumber >> bitCount;
		//右シフトした分、左シフトを行う
		//元の整数から、指定ビット未満が全て0の状態
		processVariable = processVariable << bitCount;
		//元の整数との排他的論理和をとる
		//指定ビット未満のみの状態
		processVariable = processVariable ^ integralNumber;
		//指定ビット未満の値を返却する
		return processVariable;
	}

	/*
	 * 関数名：set
	 * 概要:整数の指定したビットを1にした値を返す
	 * 引数:整数(int型),値を1にして返すビット(int型)
	 * 戻り値：値を返した後の値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/26
	*/
	static int set(int integralNumber, int bitCount) {
		//処理する整数を格納する変数を定義
		int processVariable = 0;
		//まず、元の整数から、指定ビットを第0ビットへ持ってくる
		//整数を、指定されたビット未満を右シフトする
		processVariable = integralNumber >> (bitCount);
		//次に、指定ビットの値を1にする
		//第0ビットの値を確認するための変数を定義
		int confirmationValue = 0;
		//第0ビットが1であるか確認するために、処理してきた整数と1を論理積を取る
		confirmationValue = processVariable & ONE_SET_CONSTANT;
		//第0ビットが0である場合
		if (confirmationValue == 0) {
			//指定ビットが第0ビットとなった整数と、1との論理和を取ることで第0ビットを1にする
			processVariable = processVariable | ONE_SET_CONSTANT;
		}
		//処理した整数を、右シフトした分だけ左シフトする
		processVariable = processVariable << (bitCount);
		//最後に、指定ビット未満の値を追加する
		//処理を行ってきた整数と、指定ビット未満の値の排他的論理和を取る
		processVariable = processVariable ^ saveLessBits(integralNumber, bitCount);
		//指定ビットの1にした値を返却
		return processVariable;
	}

	/*
	 * 関数名：reset
	 * 概要:整数の指定したビットを0にした値を返す
	 * 引数:整数(int型),値を0にして返すビット(int型)
	 * 戻り値：値を返した後の値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/26
	*/
	static int reset(int integralNumber, int bitCount) {
		//処理する整数を格納する変数を定義
		int processVariable = 0;
		//まず、元の整数から、指定ビット以下が全て0の状態をつくる
		//整数を、指定されたビットを含めて右シフトする
		processVariable = integralNumber >> (bitCount);
		//次に、指定ビットの値を反転する
		//第0ビットの値を確認するための変数を定義
		int confirmationValue = 0;
		//第0ビットが1であるか確認するために、処理してきた整数と1を論理積を取る
		confirmationValue = processVariable & ONE_SET_CONSTANT;
		//第0ビットが1である場合
		if (confirmationValue == ONE_SET_CONSTANT) {
			//指定ビットが第0ビットとなった整数と、-2との論理積を取ることで第0ビットを0にする
			processVariable = processVariable & ZERO_SET_CONSTANT;
		}
		//処理した整数を、右シフトした分だけ左シフトする
		processVariable = processVariable << (bitCount);
		//最後に、指定ビット未満の値を追加する
		//処理を行ってきた整数と、指定ビット未満の値の排他的論理和を取る
		processVariable = processVariable ^ saveLessBits(integralNumber, bitCount);
		//指定ビットの0にした値を返却
		return processVariable;
	}

	/*
	 * 関数名：inverse
	 * 概要:整数の指定したビットを0と1を反転した値を返す
	 * 引数:整数(int型),反転した値を返すビット(int型)
	 * 戻り値：値を返した後の値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/26
	*/
	static int inverse(int integralNumber, int bitCount) {
		//処理する整数を格納する変数を定義
		int processVariable = 0;
		//まず、元の整数から、指定ビットが第0ビットとなる状態を作る
		//整数を、指定されたビットを含めて右シフトする
		processVariable = integralNumber >> bitCount;
		//次に、指定ビットの値を反転する
		//第0ビットの値を確認するための変数を定義
		int confirmationValue = 0;
		//第0ビットが1であるか確認するために、処理してきた整数と1を論理積を取る
		confirmationValue = processVariable & ONE_SET_CONSTANT;
		//第0ビットが1である場合
		if (confirmationValue == ONE_SET_CONSTANT) {
			//指定ビットが第0ビットとなった整数と、-2との論理積を取ることで第0ビットを0にする
			processVariable = processVariable & ZERO_SET_CONSTANT;
			//第0ビットが0である場合
		} else {
			//指定ビットが第0ビットとなった整数と、1との論理和を取ることで第0ビットを1にする
			processVariable = processVariable | ONE_SET_CONSTANT;
		}
		//値を反転したら、左シフトを行って指定ビットを元のビットに戻す
		processVariable = processVariable << bitCount;
		//最後に、指定ビット未満の値を追加する
		//処理を行ってきた整数と、指定ビット未満の値の排他的論理和を取る
		processVariable = processVariable ^ saveLessBits(integralNumber, bitCount);
		//指定ビットの1にした値を返却
		return processVariable;
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
	* 作成日：2024/04/26
	*/
	public static void main(String[] arg) {

		//整数の入力を促す
		System.out.print("整数：");
		//入力された整数を読み込む(整数xは教科書準拠)
		int integralNumber = standardInput.nextInt();

		//値を変更したいビットの桁数の入力を促す
		System.out.print("値を変更したいビットの桁数を入力してください。\nビットの桁数：");
		//入力された値を変更したいビットの桁数を読み込む
		int bitsCount = standardInput.nextInt();
		//最上位ビット桁の31を定数化
		final int MAXIMUM_BITS = 31;
		//ビットの桁数として0～31が入力されるまで繰り返し促す
		while (bitsCount < 0 | bitsCount > MAXIMUM_BITS) {
			//0～31で入力するように促す
			System.out.println("0～31で入力してください。");
			//再度ビットを入力を促す
			System.out.print("ビットの桁数：");
			//入力されたビットの桁数を読み込む
			bitsCount = standardInput.nextInt();
		}

		//指定したビットを1にした値を変数に格納する
		int setNumber = set(integralNumber, bitsCount);
		//指定したビットを0にした値を変数に格納する
		int resetNumber = reset(integralNumber, bitsCount);
		//指定したビットを0と1を反転した値を変数に格納する
		int inverseNumber = inverse(integralNumber, bitsCount);

		//処理する整数を表示
		System.out.println("\n処理する整数:" + integralNumber);
		//整数のビット構成を表示
		printBits(integralNumber);
		//指定したビットを1にした値を表示
		System.out.print("\n\n第" + bitsCount + "ビット目を1にした値:");
		//指定したビットを1にした値を表示
		System.out.println(setNumber);
		//指定したビットを1にした値のビット構成を表示
		printBits(setNumber);
		//指定したビットを0にした値を表示
		System.out.print("\n\n第" + bitsCount + "ビット目を0にした値:");
		//指定したビットを0にした値を表示
		System.out.println(resetNumber);
		//指定したビットを0にした値のビット構成を表示
		printBits(resetNumber);
		//指定したビットの1と0を逆にした値を表示
		System.out.print("\n\n第" + bitsCount + "ビット目の0と1を反転した値:");
		//指定したビットの1と0を逆にした値を表示
		System.out.println(inverseNumber);
		//指定したビットを1と0を逆にした値のビット構成を表示
		printBits(inverseNumber);
	}
}
