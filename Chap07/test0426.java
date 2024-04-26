package Chap07;

//Scannerのインポート
import java.util.Scanner;

public class test0426 {
	
	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	//int型の最高ビット数32を定数化
	static final int BITS_LIMIT = 32;
	//最上位ビット桁の31を定数化
	static final int MAXIMUM_BITS = 31;

	/*
	 * 関数名：printBits
	 * 概要:int型のビット構成を表示
	 * 引数:整数(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/25
	*/
	static void printBits(int inegralNumber) {
		//ビットの表記「1」を定数化
		final int BIT_ONE = 1;
		//ビットの表記「0」を定数化
		final int BIT_ZERO = 0;
		//ビット構成において0か1かを判別する、論理積に用いる1を定数化
		final int PRODUCT_CONSTANT = 1;
		//二進数表記の整数のビット構成を表示
		for (int i = MAXIMUM_BITS; i >= 0; i--) {
			//各ビットが1か0か判断し、表示していく
			System.out.print(((inegralNumber >>> i & PRODUCT_CONSTANT) == BIT_ONE) ? BIT_ONE : BIT_ZERO);
		}
	}

	/*
	* 関数名：main
	* 概要：整数のビット数を左右に回転させた値を表示する
	* 引数：なし
	* 戻り値：なし
	* 作成者：S.Hiruta
	* 作成日：2024/04/25
	*/
	public static void main(String[] arg) {
		
		System.out.print("整数:");
		
		int A = standardInput.nextInt();
		
		System.out.println("A");
		printBits(A);
		
		System.out.println("\n~A");
		printBits(~A);
		
		System.out.println("\nA >> 1");
		printBits(A >> 1);
		
		System.out.println("\n~A >> 1");
		printBits(~A >> 1);
		
		System.out.println("\nA(A >> 1)");
		printBits(A^(A >> 1));
		
		System.out.println("\n~A^(~A >> 1)");
		printBits(~A^(~A >> 1));
		
		System.out.println("\nA^(~A >> 1)");
		printBits(A^(~A >> 1));
		
		System.out.println("\nA^(~A >> 1)");
		printBits(A^(~A >> 1));
		
		System.out.println("\n~A^(A >> 1)");
		printBits(~A^(A >> 1));
	}
}
