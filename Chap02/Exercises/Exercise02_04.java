package Chap02.Exercises;
//Scannerライブラリの読み込み
import java.util.Scanner;
/*
 * クラス名:Exercise02_04
 * 概要:読み込んだ整数の±10の値を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/01
 */
public class Exercise02_04 {
	/*
	 *関数名:main
	 *概要:読み込んだ整数の±10の値を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/01
	 */
	public static void main(String[] args) {
		//Scannerクラスの変数を宣言
    	Scanner standerdImput = new Scanner(System.in);
    	
    	//整数値の入力を促す
		System.out.print("整数値:");
		//loadedNumberに整数値を読み込む
		int loadedNumber = standerdImput.nextInt();
		
		// loadedNumber + 10の値を表示
		System.out.println("10を加えた値は" + ( loadedNumber + 10 ) + "です。");
		// loadedNumber - 10の値を表示
		System.out.println("10を減じた値は" + ( loadedNumber - 10 ) + "です。");
				
	}

}