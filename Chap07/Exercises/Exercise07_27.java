package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise07_27
 * 概要:2つの行列の、行列の要素数が等しくない場合、falseを表示する。
 		2つの行列の、行列の要素数が等しい場合、加算を行った後、trueを表示する。
 		また、その結果の確認のため各行列の表示を行う
 * 作成者:S.Hiruta
 * 作成日:2024/05/02
 */
public class Exercise07_27 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：createMatrix
	 * 概要:二次元配列の行数・列数・各要素の値を入力し、行列を作成する
	 * 引数：行列(int型)
	 * 戻り値：行列(2次元配列)(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/02
	*/
	static int[][] createMatrix(int inputMatrix[][]) {

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
				//入力された要素を配列に読み込む
				returnMatrix[i][j] = standardInput.nextInt();
			}
		}
		//作成された行列を返却する
		return returnMatrix;
	}

	/*
	 * 関数名：addMatrix
	 * 概要:配列xと配列y、その和を代入する配列zの行数・列数が等しい場合、
	 		行列xとyの和をzに代入
	 * 引数：配列x(int型),配列y(int型),配列z(int型)
	 * 戻り値：true,false
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/02
	*/
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		//戻り値を格納するboolean型の変数を初期値falseで定義
		boolean returnValue = false;
		//行列の要素数が等しいか判定
		JudgeElementCount:
		//3つの配列の行数が等しい場合
		if (x.length == y.length && y.length == z.length) {
			//行列xとyの各行の要素数が等しいか判定
			for (int i = 0; i < x.length; i++) {
				//行の要素数が等しくない場合
				if (x[i].length != y[i].length || y[i].length != z[i].length) {
					//戻り値falseのまま繰り返し処理を抜ける
					break JudgeElementCount;
				}
			}
			//行数も列数も等しい場合
			//行ごとに加算処理を始める
			for (int i = 0; i < x.length; i++) {
				//各行の列ごと(要素ごと)に加算する
				for (int j = 0; j < x[i].length; j++) {
					//各要素を合計して、結果を格納する
					z[i][j] = x[i][j] + y[i][j];
				}
			}
			//戻り値をtrueにする。
			returnValue = true;
		}
		//戻り値として、trueまたはfalseを返却する
		return returnValue;
	}

	/*
	 * 関数名：printMatrix
	 * 概要:行列mの全要素を表示
	 * 引数：行列m(int型)
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
	 * 概要：2つの行列の、行列の要素数が等しくない場合、falseを表示する。
			2つの行列の、行列の要素数が等しい場合、加算を行った後、trueを表示する。
			また、その結果の確認のため各行列の表示を行う
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/02
	 */
	public static void main(String[] arg) {

		//配列aと配列b、その和を代入する配列cの行数・列数・要素数が等しいか判定すると伝える
		System.out.println("3つの配列の行数・列数・要素数が等しければtrue、等しくなければfalseを返却します。");
		//行数・列数・要素数が等しい場合、各行列を表示すると伝える
		System.out.println("等しかった場合、2つの行列aとbの和となる行列を行列cに代入し、表示します。");

		//行列aを、初期状態として行数・列数を0として宣言する
		int[][] firstMatrix = new int[0][0];
		//行列bを、初期状態として行数・列数を0として宣言する
		int[][] secondMatrix = new int[0][0];

		//行列aの行数・列数・各要素の値の入力を促す
		System.out.println("\n行列aの行数・列数・各要素の値の入力:");
		//関数createMatrixを呼び出し、行列aの行数・列数・各要素の値の入力させる
		firstMatrix = createMatrix(firstMatrix);
		//行列bの行数・列数・各要素の値の入力を促す
		System.out.println("\n行列bの行数・列数・各要素の値の入力:");
		//関数createMatrixを呼び出し、行列bの行数・列数・各要素の値の入力させる
		secondMatrix = createMatrix(secondMatrix);
		
		//行列cの行数・列数・各要素の値の入力を促す
		System.out.println("\n行列cの行数・列数・各要素の値の入力:");
		//行列の行数cの入力を促す
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
		int[][] sumMatrix = new int[columunCount][];

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
			sumMatrix[i] = new int[lineCount];
		}

		//配列aと配列b、その和である配列cの行数・列数・要素数が等しいか判定する
		System.out.println("\n判定結果:" + addMatrix(firstMatrix, secondMatrix, sumMatrix));

		//配列aと配列b、その和を代入する配列cの行数・列数・要素数が等しいかった場合
		if (addMatrix(firstMatrix, secondMatrix, sumMatrix)) {
			//行列aを表示すると伝える
			System.out.println("\n行列a:\n");
			//行列aを表示する
			printMatrix(firstMatrix);
			//行列bを表示すると伝える
			System.out.println("\n行列b:\n");
			//行列bを表示する
			printMatrix(secondMatrix);
			//行列aと行列bの和である行列cを表示すると伝える
			System.out.println("\n2行列の和を代入した行列c:\n");
			//行列aと行列bの和である行列cを表示する
			printMatrix(sumMatrix);
		}
	}
}
