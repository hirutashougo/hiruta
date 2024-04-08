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
		
		
		//1つめの実数の入力を促す
		System.out.print("1つめの実数:");
		
		//入力された1つめの実数を読み込む
		double firstRealNumber = standardInput.nextDouble();
		
		//2つめ実数の入力を促す
		System.out.print("２つめの実数:"); 
		
		//入力された実数bを読み込む ////
		double secondRealNuuber = standardInput.nextDouble();
		
				
		//入力された2つの実数のうち大きいほうの実数を選択する
		double largerValue = firstRealNumber > secondRealNuuber ? firstRealNumber : secondRealNuuber;
		
		//大きいほうの実数の値を表示する
		System.out.println("大きいほうの値は" + largerValue + "です。" );
		
	}

}
