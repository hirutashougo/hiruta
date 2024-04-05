package Chap03.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_09
 * 概要:読み込んだ二つの実数のうち、大きいほうの値を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise03_09 {
	
	/*
	 *関数名:main
	 *概要:読み込んだ二つの実数のうち、大きいほうの値を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/02
	 */	 
	public static void main(String[] args) {
		
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//実数aの入力を促す
		System.out.print("実数a:"); 
		//入力された実数aを読み込む
		double realNumberA = standardInput.nextDouble();
		//実数bの入力を促す
		System.out.print("実数b:"); 
		//入力された実数bを読み込む
		double realNuuberB = standardInput.nextDouble();
		
		//実数Aと実数Bのうち大きいほうの数値をmaximumNumberとする。
		double maximumNumber = realNumberA > realNuuberB ? realNumberA : realNuuberB;
		//大きいほうの実数の値を表示する
		System.out.println("大きいほうの値は" + maximumNumber + "です。" );
		
	}

}
