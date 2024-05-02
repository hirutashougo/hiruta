package Chap07.Lists;

//Scannerの読み込み
import java.util.Scanner;

/*
* クラス名:List07_20
* 概要:二つの行列の和を求める
* 作成者:S.Hiruta
* 作成日:2024/05/02
*/
public class List07_20 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：addMatrix
	 * 概要:行列xとyの和をzに代入
	 * 引数：配列x(int型),配列y(int型),配列z(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/02
	*/
	static void addMatrix(int[][] x, int[][] y, int[][] z) {
		//
		for (int i = 0; i < x.length; i++) {
			//
			for (int j = 0; j < x[i].length; j++) {
				//
				z[i][j] = x[i][j] + y[i][j];
			}
		}
	}

	/*
	 * 関数名：printMatrix
	 * 概要:行列mの全要素を表示
	 * 引数：配列m(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/02
	*/
	static void printMatrix(int[][] m) {
		//
		for (int i = 0; i < m.length; i++) {
			//
			for (int j = 0; j < m[i].length; j++) {
				//
				System.out.print(m[i][j] + "  ");
			}
			//
			System.out.println();
		}
	}

	/*
	 * 関数名：main
	 * 概要:二つの行列の和を求める
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	public static void main(String[] arg) {

		//行列aの行数・列数及び要素の値を定義
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		//行列bの行数・列数及び要素の値を定義
		int[][] b = { { 6, 3, 4 }, { 5, 1, 2 } };
		//行列cの行数・列数を定義
		int[][] c = new int[2][3];

		//
		addMatrix(a, b, c);

		//
		System.out.println("行列a");
		//
		printMatrix(a);
		//
		System.out.println("行列b");
		//
		printMatrix(b);
		//
		System.out.println("行列c");
		//
		printMatrix(c);
	}
}
