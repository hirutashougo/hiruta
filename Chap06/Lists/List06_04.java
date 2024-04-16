package Chap06.Lists;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:List06_04
 * 概要:配列の全要素に値を組み込んで表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/16
 */
public class List06_04 {

	/*
	 * 関数名：main
	 * 概要:配列の全要素に値を組み込んで表示 
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/16
	*/
	public static void main(String[] arg) {
		
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		System.out.print("要素数:");
		int n = standardInput.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = standardInput.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print('＊');
			System.out,println();
		}
	}
}