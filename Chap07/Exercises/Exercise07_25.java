package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise07_25
 * 概要:入力された配列の、指定要素からいくつかの連続する要素を削除した配列を表示する
 * 作成者:S.Hiruta
 * 作成日:2024/05/02
 */
public class Exercise07_25 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	//配列のインデックス数を調整するための定数1を定義
	static final int ADJUSTMENT_NUMBER = 1;

	/*
	 * 関数名：arrayRmvOfN
	 * 概要:入力された配列の、指定要素からいくつかの連続する要素を削除した配列を生成する
	 * 引数：配列(int型),処理の基点となる要素のインデックス(int型)
	 		削除する要素の連続数(int型)
	 * 戻り値：指定要素削除後の配列(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/02
	 */
	static int[] arrayRmvOfN(int[] a, int x, int n) {

		//指定要素部分削除後の配列の要素数を変数にまとめる
		int deletedArrayCount = a.length - n;

		//返却する配列を定義
		int[] deletedArray = new int[deletedArrayCount];

		//配列の要素の値を一時的に格納する変数を宣言
		int assignmentVariable = 0;
		//削除する要素部分を埋めるように削除部分以降の要素の値で埋めていく
		for (int i = 0; i < deletedArrayCount; i++) {
			//処理する要素が、処理基点の要素より手前の場合
			if (i < x) {
				//入力された配列の要素の値を変数に一時格納
				assignmentVariable = a[i];
				//変数の値を返却する配列の要素にそのまま代入
				deletedArray[i] = assignmentVariable;
				//処理する要素が、処理基点の要素以降の場合
			} else {
				/*入力された配列の要素の、
				削除された部分より後ろからの要素の値を、変数に一時格納*/
				assignmentVariable = a[i + n];
				//変数の値を返却する配列の要素に代入
				deletedArray[i] = assignmentVariable;
			}
		}

		//指定要素削除後の配列を返却
		return deletedArray;
	}

	/*
	 * 関数名：main
	 * 概要：入力された配列の、指定要素からいくつかの連続する要素を削除した配列を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/02
	 */
	public static void main(String[] arg) {

		//前置きとして行う処理の説明を行う
		System.out.println("配列aから指定要素部分を削除した配列bを生成します。");

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

		//削除を開始する要素のインデックスの入力を促す
		System.out.print("\n削除を開始する要素のインデックス：");
		//入力された値を読み込む
		int targetIndex = standardInput.nextInt();
		//削除を開始する要素のインデックとして、範囲内の値が入力されるまで繰り返し促す
		while (targetIndex < 0 || targetIndex >= integralArray.length) {
			//配列のインデックス数で入力するように促す
			System.out.println("配列のインデックス数を入力してください。");
			//再度、削除を開始する要素のインデックスを入力を促す
			System.out.print("削除を開始する要素のインデックス：");
			//入力された処理の起点の要素のインデックスを読み込む
			targetIndex = standardInput.nextInt();
		}

		//連続して削除する要素数の入力を促す
		System.out.print("\n連続して削除する要素数：");
		//入力された値を読み込む
		int consecutiveDeleteNumber = standardInput.nextInt();
		//連続して削除する要素数のインデックとして、範囲内の値が入力されるまで繰り返し促す
		while (consecutiveDeleteNumber <= 0 || consecutiveDeleteNumber > integralArray.length - targetIndex) {
			//配列のインデックスの範囲内で入力するように促す
			System.out.println("配列のインデックスの範囲内で入力してください。");
			//再度、連続して削除する要素数を入力を促す
			System.out.print("連続して削除する要素数：");
			//入力された連続して削除する要素数を読み込む
			consecutiveDeleteNumber = standardInput.nextInt();
		}

		//関数arrayRmvOfを呼び出し、指定した要素部分を削除した配列bを生成する
		int[] deletedArray = arrayRmvOfN(integralArray, targetIndex, consecutiveDeleteNumber);

		//指定要素部分を削除しましたと伝える
		System.out.println("\n指定要素部分を削除しました。");

		//配列bの生成を伝える
		System.out.println("\n配列b:");
		//生成された配列の要素数が0の場合
		if (deletedArray.length == 0) {
			//削除後の要素はないことを伝える
			System.out.print("削除後の要素はありません。");
		//生成された配列の要素数が0出ない場合
		} else {
			//指定要素部分削除後の配列の表示を行う
			for (int i = 0; i < deletedArray.length; i++) {
				//配列の各要素を表示していく
				System.out.println("b{" + i + "] = " + deletedArray[i]);
			}
		}
	}
}
