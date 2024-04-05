package Chap03.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_09
 * 概要:読み込んだ二つの実数のうち、大きいほうの値を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise03_10 {
	
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
		Scanner standerdImput = new Scanner(System.in);
		
		//実数aの入力を促す
		System.out.print("整数a:"); 
		//入力された実数aを読み込む
		int integralNumberA = standerdImput.nextInt();
		//実数bの入力を促す
		System.out.print("整数b:"); 
		//入力された実数bを読み込む
		int integralNumberB = standerdImput.nextInt();
		
		//整数の値の差を求めるため、整数aと整数bのうち大きい値から小さい値を引く処理
		int numberDifference = integralNumberA >= integralNumberB ? integralNumberA - integralNumberB : integralNumberB - integralNumberA;
		//整数aと整数bの値の差を表示
		System.out.println("二つの整数の差は" + numberDifference + "です。" );
	}

}
