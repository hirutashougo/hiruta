package Chap06.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise06_16
 * 概要:4行3列の行列と3行4列の行列の積を求める
 * 作成者:S.Hiruta
 * 作成日:2024/04/18
 */
public class Exercise06_16 {

	/*
	 * 関数名：main
	 * 概要:4行3列の行列と3行4列の行列の積を求める
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/18
	*/
	public static void main(String[] arg) {
		//Randomクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//行列の規模を規定する定数の定義その1
		final int FIRST_CONSTANT = 3;
		//行列の規模を規定する定数の定義その2
		final int SECOND_CONSTANT = 4;

		//最初の行列
		//4行3列の行列(行列a)各要素に入力を促す
		System.out.println("4行3列の行列(行列a)の各要素に値を入力してください。");

		//4行3列の行列(行列a)を宣言
		int[][] firstArray = new int[SECOND_CONSTANT][FIRST_CONSTANT];

		//入力された要素を持つ行列を改行する
		for (int i = 0; i < SECOND_CONSTANT; i++) {
			//各行に要素を代入していく
			for (int j = 0; j < FIRST_CONSTANT; j++) {
				//入力する要素を表示
				System.out.print("a[" + i + "][" + j + "] = ");
				//入力された値を読み込む
				firstArray[i][j] = standardInput.nextInt();
			}
		}

		//2番目の行列
		//3行4列の行列(行列b)各要素に入力を促す
		System.out.println("3行4列の行列(行列b)の各要素に値を入力してください。");

		//3行4列の行列(行列b)を宣言
		int[][] secondArray = new int[FIRST_CONSTANT][SECOND_CONSTANT];

		//入力された要素を持つ行列を改行する
		for (int i = 0; i < FIRST_CONSTANT; i++) {
			//各行に要素を代入していく
			for (int j = 0; j < SECOND_CONSTANT; j++) {
				//入力する要素を表示
				System.out.print("b[" + i + "][" + j + "] = ");
				//入力された値を読み込む
				secondArray[i][j] = standardInput.nextInt();
			}
		}

		//2つの行列の積を格納する配列の宣言
		int[][] thirdArray = new int[SECOND_CONSTANT][SECOND_CONSTANT];

		//計算結果である4行4列の要素を代入し終わった行列を改行する
		for (int i = 0; i < SECOND_CONSTANT; i++) {
			//計算した要素を含む行列を改行する
			for (int j = 0; j < SECOND_CONSTANT; j++) {
				/*最初の行列(行列a)の行と2番目の行列(行列b)の列
				 の積の和を格納する数列の変数を定義*/
				int arraySum = 0;
				//2つの配列の対応する各要素の積を求める
				for (int k = 0; k < FIRST_CONSTANT; k++) {
					//計算を行う2つの行列の,、対応する要素を掛け合わせる
					arraySum += firstArray[i][k] * secondArray[k][j];
				}
				//計算結果の数列の要素に値を代入
				thirdArray[i][j] = arraySum;
			}
		}

		//計算結果の配列の表示
		System.out.println("\n2つの配列の積(行列c)：\n\n行列c\n");
		//計算結果である4行4列の行列を改行する
		for (int i = 0; i < SECOND_CONSTANT; i++) {
			//各行の要素を表示していく
			for (int j = 0; j < SECOND_CONSTANT; j++) {
				//各要素を表示していく
				System.out.printf("%6d", thirdArray[i][j]);
			}
			//行列を改行する
			System.out.println();
		}
	}
}
