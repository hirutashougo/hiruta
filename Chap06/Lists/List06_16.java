package Chap06.Lists;

//乱数生成パッケージの読み込み
import java.util.Random;
//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:List06_16
 * 概要:2次元配列を生成して全要素を乱数で埋めつくす
 * 作成者:S.Hiruta
 * 作成日:2024/04/18
 */
public class List06_16 {

	/*
	 * 関数名：main
	 * 概要:2次元配列を生成して全要素を乱数で埋めつくす
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/18
	*/
	public static void main(String[] arg) {

		//Scannerクラスの変数の定義
		Random randomNumber = new Random();
		//Randomクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		System.out.print("行数：");
		int h = standardInput.nextInt();

		System.out.print("列数：");
		int w = standardInput.nextInt();
		
		int[][] x = new int[h][w];
		
		for (int i = 0; i< h; i++) {
			for (int j = 0; j < h; j++) {
				x[i][j] = randomNumber.nextInt(100);
				System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
			}
		}

	}
}
