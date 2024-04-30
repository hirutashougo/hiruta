package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_14
* 概要:整数のbit目から、連続するいくつかのビットを
	   1にした値を返すメソッドsetN
	   0にした値を返すメソッドresetN
	   反転した値を返すメソッドinverseN、を作成し確認する
* 作成者:S.Hiruta
* 作成日:2024/04/26
*/
public class Exercise07_14 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	//posビット目数を調整するための定数を定義
	static final int BIT_ADJUSTMENT = 1;
	//整数への乗算・除算に用いる定数2を定義
	static final int BINARY_NUMBER = 2;
	//第0ビットのみに1を持つ整数1を定数化
	static final int ONE_SET_CONSTANT = 1;
	//第0ビット目を0にするための定数-2を定義
	static final int ZERO_SET_CONSTANT = -2;
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
	 * 概要:指定されたposビット目未満の値を保存する
	 * 引数:整数(int型),posビット目(int型)
	 * 戻り値：指定したposビット目未満の値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/30
	*/
	static int saveLessBits(int integralNumber, int bitCount) {
		//処理する整数を格納する変数を定義
		int processVariable = 0;
		//整数を指定posビット目を含まないで右シフト
		processVariable = integralNumber >>> bitCount;
		//右シフトした分、左シフトを行う
		//元の整数から、指定posビット目未満が全て0の状態
		processVariable = processVariable << bitCount;
		//元の整数との排他的論理和をとる
		//指定posビット目未満のみの状態
		processVariable = processVariable ^ integralNumber;
		//指定posビット目未満の値を返却する
		return processVariable;
	}

	/*
	 * 関数名：setN
	 * 概要:整数の指定したposビット目を最下位として、
	  		連続するいくつかのビットを1にして返す
	 * 引数:整数(int型),処理を始めるposビット目(int型)
	 * 		posビット目から連続して処理を行う連続ビット数(int型)
	 * 戻り値：連続して1にした後の値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/30
	*/
	static int setN(int integralNumber, int bitCount, int continuousCount) {
		//処理する整数を格納する変数を定義
		int processVariable = 0;
		//まず、変化を開始するposビット目未満が全て0となる状態を作る
		//整数を、変化させるposビット目全体を含めて右シフトする
		processVariable = integralNumber >> (bitCount + continuousCount);
		/*第0ビットから変化対象のビット部分を扱えるようにするため、、
			1にしたい連続ビット数の分だけ、左シフトして戻す*/
		processVariable = processVariable << continuousCount;
		//次に、変化させたいビット部分を1にする
		//以下の計算で用いる定数1を宣言
		final int ADJUSTMENT_NUMBER = 1;
		//連続ビット数だけ1が連続する値を格納する変数を定義
		int continuousVariable = ADJUSTMENT_NUMBER;
		//連続ビット数だけ1が連続する値を作成する
		for (int i = 0; i < continuousCount; i++) {
			//2のべき乗を作成
			continuousVariable *= BINARY_NUMBER;
		}
		//作成した2のべき乗から1を引くことで、ビット構成において1が連続する値を作成
		continuousVariable -= ADJUSTMENT_NUMBER;
		//処理してきた値と1が連続する値の排他的論理和を取る
		processVariable = processVariable ^ continuousVariable;
		//当初の指定posビット目のビット数まで左シフトで戻す
		processVariable = processVariable << bitCount;
		//最後に指定posビット目未満の値を戻す
		//指定posビット目未満の値と排他的論理和を取る
		processVariable = processVariable ^ saveLessBits(integralNumber, bitCount);
		//処理をした値を返却する
		return processVariable;
	}

	/*
	 * 関数名：resetN
	 * 概要:整数の指定したposビット目を最下位として、
	  		連続するいくつかのビットを0にして返す
	 * 引数:整数(int型),処理を始めるposビット目(int型)
	 * 		posビット目から連続して処理を行う連続ビット数(int型)
	 * 戻り値：連続して1にした後の値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/30
	*/
	static int resetN(int integralNumber, int bitCount, int continuousCount) {
		//処理する整数を格納する変数を定義
		int processVariable = 0;
		//まず、変化を開始するposビット目未満が全て0となる状態を作る
		//整数を、変化させるposビット目全体を含めて右シフトする
		processVariable = integralNumber >> (bitCount + continuousCount);
		/*第0ビットから変化対象のビット部分を扱えるようにするため、、
			0にしたい連続ビット数の分だけ、左シフトして戻す*/
		processVariable = processVariable << continuousCount;
		//次に、変化させたいビット部分を0にする
		//以下の計算で用いる定数1を宣言
		final int ADJUSTMENT_NUMBER = -1;
		//連続ビット数だけ1が連続する値を格納する変数を定義
		int continuousVariable = ADJUSTMENT_NUMBER;
		//連続ビット数だけ1が連続する値を作成する
		for (int i = 0; i < continuousCount; i++) {
			//2のべき乗を作成
			continuousVariable *= BINARY_NUMBER;
		}
		//処理してきた値と1が連続する値の排他的論理和を取る
		processVariable = processVariable & continuousVariable;
		//当初の指定posビット目のビット数まで左シフトで戻す
		processVariable = processVariable << bitCount;
		//最後に指定posビット目未満の値を戻す
		//指定posビット目未満の値と排他的論理和を取る
		processVariable = processVariable ^ saveLessBits(integralNumber, bitCount);
		//処理をした値を返却する
		return processVariable;
	}

	/*
	 * 関数名：inverseN
	 * 概要:整数の指定したposビット目を最下位として、
	  		連続するいくつかのビットの1と0を反転して返す
	 * 引数:整数(int型),処理を始めるposビット目(int型)
	 * 		posビット目から連続して処理を行う連続ビット数(int型)
	 * 戻り値：連続して1にした後の値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/30
	*/
	static int inverseN(int integralNumber, int bitCount, int continuousCount) {
		//処理する整数を格納する変数を定義
		int processVariable = 0;
		//まず、変化を開始するposビット目未満が全て0となる状態を作る
		//整数を、変化させるposビット目全体を含めて右シフトする
		processVariable = integralNumber >> (bitCount + continuousCount);
		/*第0ビットから変化対象のビット部分を扱えるようにするため、、
			1にしたい連続ビット数の分だけ、左シフトして戻す*/
		processVariable = processVariable << continuousCount;
		//次に、値を反転する箇所の1と0を反転した値を作成する
		//値を反転する箇所を保存
		int saveVariabe = saveLessBits((integralNumber >> bitCount), continuousCount);
		//保存した値の補数を取る
		saveVariabe = ~saveVariabe;
		//反転させたい部分より上位のビット部を0にしたいので、最大ビット数まで左シフトする
		saveVariabe = saveVariabe << (MAXIMUM_BITS - continuousCount + BIT_ADJUSTMENT);
		//左シフトを行った分、右シフトして戻す
		saveVariabe = saveVariabe >>> (MAXIMUM_BITS - continuousCount + BIT_ADJUSTMENT);
		//次に、対象ビット部の値を反転して反映させる
		//処理すべき値と用意しておいた反転数の排他的論理和を取る
		processVariable = processVariable ^ saveVariabe;
		//最後に指定posビット目未満の値を戻す
		//当初の指定posビット目のビット数まで左シフトで戻す
		processVariable = processVariable << bitCount;
		//指定posビット目未満の値と排他的論理和を取る
		processVariable = processVariable ^ saveLessBits(integralNumber, bitCount);
		//処理をした値を返却する
		return processVariable;
	}

	/*
	* 関数名：main
	* 概要：整数のbit目から、連続するいくつかのビットを
	   		1にした値を返すメソッドsetN
	   		0にした値を返すメソッドresetN
	   		反転した値を返すメソッドinverseN、を作成し確認する
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
		System.out.print("値を変更したいビット目を入力してください。\nposビット目：");
		//入力された値を変更したいビット目を読み込む
		int bitsCount = standardInput.nextInt();
		//ビット目として0～31が入力されるまで繰り返し促す
		while (bitsCount < 0 | bitsCount > MAXIMUM_BITS) {
			//0～31で入力するように促す
			System.out.println("0～31で入力してください。");
			//再度posビット目を入力を促す
			System.out.print("posビット目：");
			//入力されたposビット目を読み込む
			bitsCount = standardInput.nextInt();
		}

		//変更したいビットの連続数を入力させる
		System.out.print("変更したいビットの連続数を入力してください。\n連続ビット数：");
		//入力された値を変更したい連続ビット数を読み込む
		int continuousCount = standardInput.nextInt();
		//連続ビット数として正の整数が入力されるまで繰り返し促す
		while (continuousCount < 0) {
			//正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//再度連続ビット数を入力を促す
			System.out.print("posビット目：");
			//入力された連続ビット数を読み込む
			continuousCount = standardInput.nextInt();
		}
		//連続ビット数が最大ビット数を超えてしまう場合
		if (continuousCount > (MAXIMUM_BITS - bitsCount + BIT_ADJUSTMENT)) {
			//連続ビット数をビット構成の枠内に収めるようにする
			continuousCount = (MAXIMUM_BITS - bitsCount + BIT_ADJUSTMENT);
		}

		//指定したposビット目を1にした値を変数に格納する
		int setNNumber = setN(integralNumber, bitsCount, continuousCount);
		//指定したposビット目を0にした値を変数に格納する
		int resetNNumber = resetN(integralNumber, bitsCount, continuousCount);
		//指定したposビット目を0と1を反転した値を変数に格納する
		int inverseNNumber = inverseN(integralNumber, bitsCount, continuousCount);

		//処理する整数を表示
		System.out.println("\n処理する整数:" + integralNumber);
		//整数のビット構成を表示
		printBits(integralNumber);
		//指定したposビット目を1にした値を表示
		System.out.print("\n\n1にした値を返した値:");
		//指定したposビット目を1にした値を表示
		System.out.println(setNNumber);
		//指定したposビット目を1にした値のビット構成を表示
		printBits(setNNumber);
		//指定したposビット目を0にした値を表示
		System.out.print("\n\n0にした値を返した値:");
		//指定したposビット目を0にした値を表示
		System.out.println(resetNNumber);
		//指定したposビット目を0にした値のビット構成を表示
		printBits(resetNNumber);
		//指定したposビット目の1と0を逆にした値を表示
		System.out.print("\n\n1と0を逆にした値を返した値:");
		//指定したposビット目の1と0を逆にした値を表示
		System.out.println(inverseNNumber);
		//指定したposビット目を1と0を逆にした値のビット構成を表示
		printBits(inverseNNumber);
	}
}
