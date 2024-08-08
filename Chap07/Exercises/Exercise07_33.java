package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise07_33
 * 概要:入力された1次元配列と2次元配列、それぞれの全要素の値を表示する
 * 作成者:S.Hiruta
 * 作成日:2024/05/07
 */
public class Exercise07_33 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：createArray
	 * 概要:配列の要素数・各要素の値を入力し、配列を作成する
	 * 引数：なし
	 * 戻り値：配列(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static int[] createArray() {

		//配列の要素数の入力を促す
		System.out.println("配列の要素数を入力してください。");
		//配列の要素数の入力を促す
		System.out.print("要素数:");
		//入力された要素数を読み込む
		int columunCount = standardInput.nextInt();
		//要素数が正の整数で入力されるまで繰り返す処理
		while (columunCount <= 0) {
			//正の整数で入力するように表示
			System.out.println("正の整数で入力してください。");
			//再度、要素数の入力を促す
			System.out.print("要素数:");
			//入力された要素数を読み込む
			columunCount = standardInput.nextInt();
		}

		//入力された要素数の配列を定義
		int[] returnMatrix = new int[columunCount];

		//各要素の値を入力するように促す
		System.out.println("各要素の値を入力してください。");
		//各行の全ての要素を入力させる
		for (int j = 0; j < columunCount; j++) {
			//行の要素を入力させる
			System.out.print("[" + j + "]：");
			//入力された要素を配列に読み込む
			returnMatrix[j] = standardInput.nextInt();
		}
		//作成された配列を返却する
		return returnMatrix;
	}

	/*
	 * 関数名：createMatrix
	 * 概要:二次元配列の行数・列数・各要素の値を入力し、行列を作成する
	 * 引数：なし
	 * 戻り値：2次元配列(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static int[][] createMatrix() {

		//行列の行数の入力を促す
		System.out.println("表示したい行列の行数を入力してください。");
		//行列の行数の入力を促す
		System.out.print("行数:");
		//入力された行数を読み込む
		int columunCount = standardInput.nextInt();
		//行数が正の整数で入力されるまで繰り返す処理
		while (columunCount <= 0) {
			//正の整数で入力するように表示
			System.out.println("正の整数で入力してください。");
			//再度、行数の入力を促す
			System.out.print("行数:");
			//入力された行数を読み込む
			columunCount = standardInput.nextInt();
		}

		//入力された行数の行列を定義
		int[][] returnMatrix = new int[columunCount][];

		//列数表記の為の調整数を、定数で定義
		final int ADJUSTMENT_NUMBER = 1;
		//各列の列数を入力させる処理
		for (int i = 0; i < columunCount; i++) {
			//行列の列数の入力を促す
			System.out.println("各行の列数を入力してください。");
			//行列の列数の入力を促す
			System.out.print((i + ADJUSTMENT_NUMBER) + "行目の列数:");
			//入力された列数の読み込み
			int lineCount = standardInput.nextInt();
			//列数が正の整数で入力されるまで繰り返す処理
			while (lineCount <= 0) {
				//正の整数で入力するように表示
				System.out.println("正の整数で入力してください。");
				//再度、行列の入力を促す
				System.out.print((i + ADJUSTMENT_NUMBER) + "行目の列数:");
				//入力された行数を読み込む
				lineCount = standardInput.nextInt();
			}
			//入力された列数の列を宣言
			returnMatrix[i] = new int[lineCount];

			//各要素の値を入力するように促す
			System.out.println("各要素の値を入力してください。");
			//各行の全ての要素を入力させる
			for (int j = 0; j < lineCount; j++) {
				//行の要素を入力させる
				System.out.print("[" + i + "][" + j + "]：");
				//入力された要素を行列に読み込む
				returnMatrix[i][j] = standardInput.nextInt();
			}
		}
		//作成された行列を返却する
		return returnMatrix;
	}

	/*
	 * 関数名：printArray
	 * 概要:1次元配列の全要素を表示
	 * 引数：1次元配列(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/06
	*/
	static void printArray(int[] integralArray) {
		//各行の列ごと(要素ごと)に表示する
		for (int i = 0; i < integralArray.length; i++) {
			//個々の要素の値を表示する
			System.out.print(integralArray[i] + " ");
		}
		//1行表示し終わったら改行する
		System.out.println();
	}

	/*
	 * 関数名：printArray
	 * 概要:2次元配列の全要素を表示
	 * 引数：2次元配列(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/06
	*/
	static void printArray(int[][] integralMatrix) {

		//----各列の、要素の値の表示に必要なスペースを測る----//
		//行列の各要素の値の文字数を格納する配列を宣言
		int[][] lengthMatrix = new int[integralMatrix.length][];
		//仮に、第一行目の列数を引数の行列における最大列数とする
		int maximumColumnCount = integralMatrix[0].length;
		//引数である配列の最大列数を求める
		for (int i = 0; i < integralMatrix.length; i++) {
			//その行が以前までの最大列数よりも大きい場合
			if (integralMatrix[i].length > maximumColumnCount) {
				//最大列数を更新する
				maximumColumnCount = integralMatrix[i].length;
			}
		}
		//各列の、要素の値の最大文字数を格納する配列を宣言
		int[] maximumLength = new int[maximumColumnCount];

		//行列の要素の文字数を計測する
		for (int i = 0; i < integralMatrix.length; i++) {
			//各行の要素数が確定した、行列の各要素の値の文字数を格納する配列を宣言
			lengthMatrix[i] = new int[integralMatrix[i].length];
			//各行の要素の文字数を計測する
			for (int j = 0; j < integralMatrix[i].length; j++) {
				//要素の値の文字数を格納する変数を宣言
				int valueLength = 0;
				//要素の値の桁数を格納する変数を宣言
				int decimalRemainder = integralMatrix[i][j];
				//要素の値が負の場合
				if (integralMatrix[i][j] < 0) {
					//マイナスを表わす符号があるため、1文字分多く文字数をカウント
					valueLength++;
				}

				//要素の値の桁数を1つ下げるために使う定数10を宣言
				final int DECIMAL_CONSTANT = 10;
				//要素の桁数を数える
				do {
					//要素の値を10で割って、桁を1つずつ下げる
					decimalRemainder /= DECIMAL_CONSTANT;
					//文字数をカウントする
					valueLength++;
					//要素の値を0になるまで割り切ったら処理を終了
				} while (decimalRemainder != 0);

				//要素の文字数を配列に格納する
				lengthMatrix[i][j] = valueLength;
				//カウントされた文字数が、その列の最大値である場合
				if (valueLength > maximumLength[j]) {
					//列ごとの、要素の値の最大文字数を格納する配列の要素の値を更新する
					maximumLength[j] = valueLength;
				}
			}
		}

		//----行列の表示----//
		//各行の要素を表示する
		for (int i = 0; i < integralMatrix.length; i++) {
			//各行の列ごと(要素ごと)に表示する
			for (int j = 0; j < integralMatrix[i].length; j++) {
				//個々の要素の値を表示する
				System.out.print(integralMatrix[i][j]);
				//その列において必要なスペースまでの残り数を算出する
				int remainingSpace = maximumLength[j] - lengthMatrix[i][j];
				//各列で必要なスペースと、間をあける為の間隔分、空白を表示する
				for (int k = 0; k <= remainingSpace; k++) {
					//空白を表示する
					System.out.print(" ");
				}
			}
			//1行表示し終わったら改行する
			System.out.println();
		}
	}

	/*
	 * 関数名：main
	 * 概要：入力された1次元配列と2次元配列、それぞれの全要素の値を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	 */
	public static void main(String[] arg) {

		//前置きとして処理内容を説明する
		//入力された1次元配列と2次元配列、それぞれの全要素の値を表示すると伝える
		System.out.println("入力された1次元配列と2次元配列、それぞれの全要素の値を表示します。");

		//1次元配列の要素数・要素数の値の入力を促す
		System.out.println("\n1次元配列の要素数・要素数の値を入力してください。");
		//1次元配列の要素数・要素数の値の入力を行わせる
		int[] integralArray = createArray();

		//2次元配列の行数・要素数・要素数の値の入力を促す
		System.out.println("\n2次元配列の行数・要素数・要素数の値を入力してください。");
		//2次元配列の行数・要素数・要素数の値の入力を行わせる
		int[][] integralMatrix = createMatrix();

		//1次元配列の値の表示を行うと伝える
		System.out.println("\n1次元配列の値の表示：\n");
		//1次元配列の値を表示
		printArray(integralArray);
		//2次元配列の値の表示を行うと伝える
		System.out.println("\n2次元配列の値の表示：\n");
		//2次元配列の値を表示
		printArray(integralMatrix);
	}
}
