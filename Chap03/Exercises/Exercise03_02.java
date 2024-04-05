package Chap03.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_02
 * 概要:読み込んだ二つの整数値が約数関係にあるか判定する
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise03_02 {
	
	/*
	 *関数名:main
	 *概要:読み込んだ整数の絶対値を表示する
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/02
	 */
	public static void main(String[] args) {
		
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//整数値Aの入力及び読み込み(変数Aは教科書準拠 )
		System.out.print("整数A:");
		
		//入力された整数値Aの読み込み
		int integralNumberA = standardInput.nextInt();
		
		//整数値Bの入力及び読み込み(変数Bは教科書準拠 )
		System.out.print("整数B:");
		
		//入力された整数値Bの読み込み
		int integralNumberB = standardInput.nextInt();
		
		
		//整数BとAの商の余りが0の場合
		if ( integralNumberA % integralNumberB == 0 ) {
			
			//BはAの約数であることを伝える
			System.out.println("BはAの約数です。");
		}
		
		//整数BとAの商の余りが0以外の場合
		else  {
			
			//BはAの約数ではないことを伝える。
			System.out.println("BはAの約数ではありません。");
		}

	}

}