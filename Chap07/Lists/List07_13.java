package Chap07.Lists;

//Scannerの読み込み
import java.util.Scanner;

/*
* クラス名:List07_13
* 概要:int型の値を左右にシフトした値を表を表示
* 作成者:S.Hiruta
* 作成日:2024/04/25
*/
public class List07_13 {
	
	/*
	 * 関数名：printBits
	 * 概要:int型のビット構成を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	static void printBits(int x) {
		//
		for (int i = 31; i >= 0; i--) {
		//
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	
	/*
	 * 関数名：main
	 * 概要:int型の値を左右にシフトした値を表を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	public static void main(String[] arg) {
		
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//
		System.out.print("整数：");
		//
		int x = standardInput.nextInt();
		//
		System.out.print("シフトするビット数：");
		//
		int n = standardInput.nextInt();
		
		//
		System.out.print(  "整数     =");
		//
		printBits(x);
		//
		System.out.print("\nx <<   n =");
		//
		printBits(x << n);
		//
		System.out.print("\nx >>   n =");
		//
		printBits(x >> n);
		//
		System.out.print("\nx >>>  n =");
		//
		printBits(x >>> n);
	}
}















