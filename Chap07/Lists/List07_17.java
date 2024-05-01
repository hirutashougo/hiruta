package Chap07.Lists;

//Scannerの読み込み
import java.util.Scanner;

/*
* クラス名:List07_17
* 概要:配列の要素に値を読み込んで並びを反転する
* 作成者:S.Hiruta
* 作成日:2024/04/30
*/
public class List07_17 {
	
	/*
	 * 関数名：swap
	 * 概要:配列の要素a[idx1]とa[idx2]を交換
	 * 引数：配列(int型)
	 		配列の要素その1(int型),配列の要素その2(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/30
	*/
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; 
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	/*
	 * 関数名：reverse
	 * 概要:配列の要素の並びを反転する
	 * 引数：配列(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/30
	*/
	static void reverse(int[] a) {
		//
		for (int i = 0; i < a.length / 2; i++) {
			//
			swap(a, i, a.length - i - 1);
		}
	}
	
	/*
	 * 関数名：main
	 * 概要:線形探索を行う
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	public static void main(String[] arg) {
		
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//
		System.out.print("要素数：");
		//
		int num = standardInput.nextInt();
		//
		int[] x = new int[num];

		//
		for (int i = 0; i < num; i++) {
			//
			System.out.print("x[" + i + "]：");
			//
			x[i] = standardInput.nextInt();
		}
		
		//
		reverse(x);
		
		//
		System.out.println("要素の並びを逆転しました。");
		//
		for (int i = 0; i < num; i++) {
			//
			System.out.println("x{" + i + "] = " + x[i]);
		}
	}
}















