package Chap06.Lists;

//乱数生成パッケージの読み込み
import java.util.Random;
//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:List06_05
 * 概要:配列の全要素に乱数を代入して横向きのグラスで表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/16
 */
public class List06_05 {

	/*
	 * 関数名：main
	 * 概要:配列の全要素に乱数を代入して横向きのグラスで表示 
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/16
	*/
	public static void main(String[] arg) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		//Randomクラスの変数の定義
		Random randomNumber = new Random();

		System.out.print("要素数:");
		int n = standardInput.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = 1 + randomNumber.nextInt(10);
		}

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] : ");
			for (int j = 0; j < a[i]; j++) {
				System.out.print('＊');
			}
			System.out.println();
		}
	}
}