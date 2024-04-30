package Chap07.Lists;

//Scannerの読み込み
import java.util.Scanner;

/*
* クラス名:List07_15
* 概要:背が最も高い人の身長と、もっとも太っている人の体重を表示する
* 作成者:S.Hiruta
* 作成日:2024/04/30
*/
public class List07_15 {
	
	/*
	 * 関数名：maxOf
	 * 概要:配列aの最大値を求めて返却
	 * 引数：配列(int型)
	 * 戻り値：最大値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/30
	*/
	static int maxOf(int[] a) {
		//
		int max = a[0];
		//
		for (int i = 0; i < a.length; i++) {
			//
			if (a[i] > max) {
				//
				max = a[i];
			}
		}
		//
		return max;
	}
	
	/*
	 * 関数名：main
	 * 概要:背が最も高い人の身長と、もっとも太っている人の体重を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	public static void main(String[] arg) {
		
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//
		System.out.print("人数は：");
		//
		int ninzu = standardInput.nextInt();
		
		//
		int[] height = new int[ninzu];
		//
		int[] weight = new int[ninzu];
		
		//
		System.out.println(ninzu + "人の身長と体重を入力せよ");
		
		//
		for (int i = 0; i < ninzu; i++) {
			//
			System.out.print((i + 1) + "番目の身長：");
			//
			height[i] = standardInput.nextInt();
			//
			System.out.print((i + 1) + "番目の体重：");
			//
			weight[i] = standardInput.nextInt();
		}
		
		//
		System.out.println("最も背が高い人の身長：" + maxOf(height) + "cm");
		//
		System.out.println("最も太っている人の体重：" + maxOf(weight) + "kg");
	}
}















