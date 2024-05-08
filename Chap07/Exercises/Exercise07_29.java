package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise07_29
 * 概要:行数・要素数・要素の値が全て等しいもう一つの2次元配列を表示する
 * 作成者:S.Hiruta
 * 作成日:2024/05/07
 */
public class Exercise07_29 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：createMatrix
	 * 概要:2次元配列の行数・要素数・各要素の値を入力し、2次元配列を作成する
	 * 引数：2次元配列(int型)
	 * 戻り値：2次元配列(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static int[][] createMatrix(int inputMatrix[][]) {

		//2次元配列の行数の入力を促す
		System.out.println("表示したい2次元配列の行数を入力してください。");
		//2次元配列の行数の入力を促す
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

		//入力された行数の2次元配列を定義
		int[][] returnMatrix = new int[columunCount][];

		//要素数表記の為の調整数を、定数で定義
		final int ADJUSTMENT_NUMBER = 1;
		//各列の要素数を入力させる処理
		for (int i = 0; i < columunCount; i++) {
			//2次元配列の要素数の入力を促す
			System.out.println("各行の要素数を入力してください。");
			//2次元配列の要素数の入力を促す
			System.out.print((i + ADJUSTMENT_NUMBER) + "行目の要素数:");
			//入力された要素数の読み込み
			int lineCount = standardInput.nextInt();
			//要素数が正の整数で入力されるまで繰り返す処理
			while (lineCount <= 0) {
				//正の整数で入力するように表示
				System.out.println("正の整数で入力してください。");
				//再度、2次元配列の入力を促す
				System.out.print((i + ADJUSTMENT_NUMBER) + "行目の要素数:");
				//入力された行数を読み込む
				lineCount = standardInput.nextInt();
			}
			//入力された要素数の列を宣言
			returnMatrix[i] = new int[lineCount];

			//各要素の値を入力するように促す
			System.out.println("各要素の値を入力してください。");
			//各行の全ての要素を入力させる
			for (int j = 0; j < lineCount; j++) {
				//行の要素を入力させる
				System.out.print("[" + i + "][" + j + "]：");
				//入力された要素を2次元配列に読み込む
				returnMatrix[i][j] = standardInput.nextInt();
			}
		}
		//作成された2次元配列を返却する
		return returnMatrix;
	}

	/*
	 * 関数名：aryClone2
	 * 概要：行数・要素数・要素の値が全て等しいもう一つの2次元配列を生成する
	 * 引数：2次元配列(int型)
	 * 戻り値：複製の2次元配列(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static int[][] aryClone2(int[][] a) {
		//2次元配列の複製を格納する変数を定義
		//行数の初期値として、複製を行う2次元配列と同じ行数で定義
		int[][] cloneMatrix = new int[a.length][];

		//返却する2次元配列の、行ごとの要素数を定義する
		for (int i = 0; i < a.length; i++) {
			//各行の列ごとに要素数の定義を行う
			for (int j = 0; j < a[i].length; j++) {
				//各行の要素数を定義する
				cloneMatrix[i] = new int[a[i].length];
			}
		}

		//行ごとに要素の値の代入を始める
		for (int i = 0; i < a.length; i++) {
			//各行の列ごと(要素ごと)に代入する
			for (int j = 0; j < a[i].length; j++) {
				//各要素の値を代入する
				cloneMatrix[i][j] = a[i][j];
			}
		}
		//行数・要素数・要素の値が全て等しいもう一つの2次元配列を返却する
		return cloneMatrix;
	}

	/*
	 * 関数名：printMatrix
	 * 概要:2次元配列mの全要素を表示
	 * 引数：2次元配列m(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/06
	*/
	static void printMatrix(int[][] integralMatrix) {
		//各行の要素の表示を始める
		for (int i = 0; i < integralMatrix.length; i++) {
			//各行の列ごと(要素ごと)に表示する
			for (int j = 0; j < integralMatrix[i].length; j++) {
				//個々の要素の値を表示する
				System.out.printf("%4d", integralMatrix[i][j]);
				//空白を挿入する
				System.out.print("  ");
			}
			//1行表示し終わったら改行する
			System.out.println();
		}
	}

	/*
	 * 関数名：main
	 * 概要：行数・要素数・要素の値が全て等しいもう一つの2次元配列を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	 */
	public static void main(String[] arg) {

		//前置きとして処理内容を説明する
		//2次元配列aの複製となる2次元配列cを表示すると伝える
		System.out.println("2次元配列aの複製となる2次元配列cを表示します。");

		//2次元配列aを、初期状態として行数・要素数を0として宣言する
		int[][] integralMatrix = new int[0][0];
		//2次元配列cを、初期状態として行数・要素数を0として宣言する
		int[][] copyMatrix = new int[0][0];

		//2次元配列aの行数・要素数・各要素の値の入力を促す
		System.out.println("\n2次元配列aの行数・要素数・各要素の値の入力:");
		//関数createMatrixを呼び出し、2次元配列aの行数・要素数・各要素の値の入力させる
		integralMatrix = createMatrix(integralMatrix);
		
		//関数copyMatrixを呼び出し、2次元配列aの複製の2次元配列を2次元配列cに代入
		copyMatrix = aryClone2(integralMatrix);

		//2次元配列aを表示すると伝える
		System.out.println("\n2次元配列a:\n");
		//2次元配列aを表示する
		printMatrix(integralMatrix);
		//2次元配列aの複製となる2次元配列cを表示すると伝える
		System.out.println("\n2次元配列aの複製となる2次元配列c:\n");
		//2次元配列aの複製となる2次元配列cを表示する
		printMatrix(copyMatrix);
	}
}
