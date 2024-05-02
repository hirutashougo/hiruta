package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise07_26
 * 概要:入力された配列の、指定要素に指定の値を挿入し、
	 	それ以降の要素に1つずつ値をスライドさせた配列を表示する
 * 作成者:S.Hiruta
 * 作成日:2024/05/02
 */
public class Exercise07_26 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	//配列のインデックス数を調整するための定数1を定義
	static final int ADJUSTMENT_NUMBER = 1;

	/*
	 * 関数名：arrayInsOf
	 * 概要:入力された配列の、指定要素に指定の値を挿入し、
	 		それ以降の要素に1つずつ値をスライドさせた配列を生成する
	 * 引数：配列(int型),処理の基点となる要素のインデックス(int型)
	 		挿入する値(int型)
	 * 戻り値：値の挿入後の配列(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/02
	 */
	static int[] arrayInsOf(int[] a, int idx, int x) {

		//挿入された要素数を表わす定数1を定義
		final int INSERTION_ELEMENT_COUNT = 1;
		//指定要素に挿入後の配列の要素数を変数にまとめる
		int insertedArrayCount = a.length + INSERTION_ELEMENT_COUNT;

		//返却する、値を挿入した後の配列を定義
		int[] insertedArray = new int[insertedArrayCount];

		//配列の要素の値を一時的に格納する変数を宣言
		int assignmentVariable = 0;
		//値を挿入した要素から、1つずつ要素の値を後ろにスライドさせていく
		for (int i = 0; i < insertedArrayCount; i++) {
			//処理する要素が、値を挿入する要素より手前の場合
			if (i < idx) {
				//入力された配列の要素の値を変数に一時格納
				assignmentVariable = a[i];
				//変数の値を返却する配列の要素にそのまま代入
				insertedArray[i] = assignmentVariable;
			//処理する要素が、値を挿入する要素より後の場合
			} else if (i > idx) {
				/*入力された配列の要素の、
				削除された部分より後ろからの要素の値を変数に一時格納*/
				assignmentVariable = a[i - ADJUSTMENT_NUMBER];
				//変数の値を返却する配列の要素に代入
				insertedArray[i] = assignmentVariable;
			}
		}
		//指定された値を、指定された要素に挿入
		insertedArray[idx] = x;

		//値の挿入後の配列を返却
		return insertedArray;
	}

	/*
	 * 関数名：main
	 * 概要：入力された配列の、指定要素に指定の値を挿入し、
	 		 それ以降の要素に1つずつ値をスライドさせた配列を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/02
	 */
	public static void main(String[] arg) {

		//前置きとして行う処理の説明を行う
		System.out.println("配列aに指定値を挿入した配列bを生成します。");

		//配列の要素数の入力を促す
		System.out.print("\n配列の要素数：");
		//入力された要素数を読み込む
		int elementCount = standardInput.nextInt();
		//配列の要素数として正の整数が入力されるまで繰り返し促す
		while (elementCount <= 0) {
			//正の整数で入力するように促す
			System.out.println("\n正の整数で入力してください。");
			//再度配列の要素数を入力を促す
			System.out.print("配列の要素数：");
			//入力された配列の要素数を読み込む
			elementCount = standardInput.nextInt();
		}

		//入力された要素数を持つ配列を定義
		int[] integralArray = new int[elementCount];

		//配列aの入力を促す
		System.out.println("\n配列a：");
		//各要素の値を入力させる
		for (int i = 0; i < elementCount; i++) {
			//値を入力する要素を表示
			System.out.print("a[" + i + "]：");
			//入力された要素の値を読み込む
			integralArray[i] = standardInput.nextInt();
		}

		//値を挿入する要素のインデックスの入力を促す
		System.out.print("\n値を挿入する要素のインデックス：");
		//入力された値を読み込む
		int targetIndex = standardInput.nextInt();
		//値を挿入する要素のインデックスとして、範囲内の値が入力されるまで繰り返し促す
		while (targetIndex < 0 || targetIndex >= integralArray.length) {
			//配列のインデックス数で入力するように促す
			System.out.println("配列のインデックス数を入力してください。");
			//再度、処理の起点の要素のインデックスを入力を促す
			System.out.print("値を挿入する要素のインデックス：");
			//入力された値を挿入する要素のインデックスを読み込む
			targetIndex = standardInput.nextInt();
		}

		//挿入する値の入力を促す
		System.out.print("\n挿入する値：");
		//入力された値を読み込む
		int insertionNumber = standardInput.nextInt();

		//関数arrayRmvOfを呼び出し、指定値を挿入した配列bを生成する
		int[] deletedArray = arrayInsOf(integralArray, targetIndex, insertionNumber);

		//指定値を挿入したことを伝える
		System.out.println("指定値を挿入しました。");

		//配列bの生成を伝える
		System.out.println("\n配列b:");
		//指定値を挿入した後の配列の表示を行う
		for (int i = 0; i < deletedArray.length; i++) {
			//配列の各要素を表示していく
			System.out.println("b{" + i + "] = " + deletedArray[i]);
		}
	}
}
