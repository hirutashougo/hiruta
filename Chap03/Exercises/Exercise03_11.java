package Chap03.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_11
 * 概要:読み込んだ二つの整数の差が10以上かどうか判定
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise03_11 {
	
	/*
	 *関数名:main
	 *概要:読み込んだ二つの整数の差が10以上かどうか判定
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/02
	 */
	public static void main(String[] args) {
		
		//Scannerクラスの変数の定義
		Scanner standerdImput = new Scanner(System.in);
		
		//整数aの入力を促す
		System.out.print("整数a:"); 
		//入力された整数aを読み込む
		int integralNumberA = standerdImput.nextInt();
		///整数bの入力を促す
		System.out.print("整数b:"); 
		//入力された整数bを読み込む
		int integralNumberB = standerdImput.nextInt();
		
		
		//整数AとBの値の差が10以下であるとき
		if ( integralNumberA - integralNumberB >= 10 && integralNumberA - integralNumberB <= -10 ) {
			//整数AとBの値の差が10以下であると伝える
			System.out.println("それらの差は10以下です。");
		}
		//整数AとBの値の差が10以上であるとき
		else {
			//整数AとBの値の差が10以上であると伝える
			System.out.println("それらの差は10以上です。");
		}
		
	}

}
