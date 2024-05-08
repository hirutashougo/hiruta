package Chap07.Lists;

//Scannerの読み込み
import java.util.Scanner;

/*
* クラス名:List07_21
* 概要:二値・三値の最大値を求める(多重定義)
* 作成者:S.Hiruta
* 作成日:2024/05/07
*/
public class List07_21 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：
	 * 概要:二値の最大値を求める
	 * 引数：2つの整数(int型)
	 * 戻り値：大きいほうの整数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static int max(int a, int b) {
		//
		return a > b ? a : b;
	}
	

	/*
	 * 関数名：
	 * 概要:三値の最大値を求める
	 * 引数：3つの整数(int型)
	 * 戻り値：大きいほうの整数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	static int max(int a, int b, int c) {
		//
		int max = a;
		//
		if (b > max) max = b;
		//
		if (c > max) max = c;
		//
		return max;
	}

	/*
	 * 関数名：main
	 * 概要:二値・三値の最大値を求める
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	public static void main(String[] arg) {
		
		//
		System.out.print("xの値：");
		//
		int x = standardInput.nextInt();
		//
		System.out.print("yの値：");
		//
		int y = standardInput.nextInt();
		//
		System.out.print("zの値：");
		//
		int z = standardInput.nextInt();
		
		//
		System.out.println("x, yの最大値は" + max(x,y) + "です。");
		//
		System.out.println("x, y, zの最大値は" + max(x,y,z) + "です。");
	}
}
