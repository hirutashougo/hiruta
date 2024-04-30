package Chap07.Lists;

//Scannerの読み込み
import java.util.Scanner;

/*
* クラス名:List07_16
* 概要:線形探索を行う
* 作成者:S.Hiruta
* 作成日:2024/04/30
*/
public class List07_16 {
	
	/*
	 * 関数名：linearSearch
	 * 概要:配列aの最大値を求めて返却
	 * 引数：配列(int型), キー値(int型)
	 * 戻り値：keyと一致する最も先頭の要素(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/30
	*/
	static int linearSearch(int[] a, int key) {
		//
		int max = a[0];
		//
		for (int i = 0; i < a.length; i++) {
			//
			if (a[i] == key) {
				//
				return i;
			}
		}
		//
		return -1;
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
		System.out.print("探す値：");
		//
		int key = standardInput.nextInt();
		
		//
		int idx = linearSearch(x, key);
		
		//
		if (idx == -1) {
			//
			System.out.println("その値の要素は存在しません。");
			//
		} else {
			//
			System.out.println("その値はx[" + idx + "]にあります。");
		}
	}
}















