package Chap07.Lists;

//Scannerの読み込み
import java.util.Scanner;

/*
* クラス名:List07_14
* 概要:int型整数中の1であるビット数をカウント
* 作成者:S.Hiruta
* 作成日:2024/04/25
*/
public class List07_14 {
	
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
	 * 関数名：countBits
	 * 概要:int型整数x中の1であるビット数をカウント
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	static int countBits(int x) {
		//
		int bits = 0;
		//
		while (x != 0) {
		//最下位ビットは1であるか?
			if ((x & 1) == 1)  bits++;
		//調べ終わった最下位ビットを弾き出す
			x >>>= 1;
		}
		//
		return bits;
	}
	
	/*
	 * 関数名：main
	 * 概要:int型整数中の1であるビット数をカウント
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
		System.out.print("構成するビット数：");
		//
		printBits(x);
		//
		System.out.println("\n1であるビット数 = " + countBits(x));
	}
}















