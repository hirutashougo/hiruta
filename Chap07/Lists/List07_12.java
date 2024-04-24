package Chap07.Lists;

//Scannerの読み込み
import java.util.Scanner;

/*
* クラス名:List07_12
* 概要:int型整数のビット単位の論理積・論理和・排他的論理和・補数を表示
* 作成者:S.Hiruta
* 作成日:2024/04/24
*/
public class List07_12 {
	
	/*
	 * 関数名：printBits
	 * 概要:
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/24
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
	 * 概要:数値と式を表示し、その計算を行う暗算トレーニング
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/23
	*/
	public static void main(String[] arg) {
		
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//
		System.out.println("二つの整数を入力してください。");
		//
		System.out.print("a：");
		//
		int a = standardInput.nextInt();
		//
		System.out.print("b：");
		//
		int b = standardInput.nextInt();
		
		//
		System.out.print(  "a      = ");
		//
		printBits(a);
		//
		System.out.print("\nb      = ");
		//
		printBits(b);
		//
		System.out.print("\na  & b = ");
		//
		printBits(a & b);
		//
		System.out.print("\na  | b = ");
		//
		printBits(a | b);
		//
		System.out.print("\na  ^ b = ");
		//
		printBits(a ^ b);
		//
		System.out.print("\n~a     = ");
		//
		printBits(~a);
		//
		System.out.print("\n~b     = ");
		//
		printBits(~b);
	}
}
