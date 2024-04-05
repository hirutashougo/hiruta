package Chap03.Exercises;

//スキャナのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise03_16
 * 概要：三つの変数を小さい順にソートする
 * 作成者:S.Hiruta
 * 作成日:2024/04/3
 */
public class Exercise03_16_re {
	
	/*
	 *関数名:main
	 *概要：三つの変数を小さい順にソートする
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/3
	 */
	public static void main(String[] arg) {
		
		///Scannerクラスの変数の定義
		Scanner stdIn = new Scanner(System.in);
		
		
		//1つめの整数を入力
		System.out.print("整数a:");
		
		//1つめの整数を読み込み
		int firstIntegralNumber = stdIn.nextInt();
		
		//2つめの整数を入力
		System.out.print("整数b:");
		
		//2つめの整数を読み込み
		int secondIntegralNumber = stdIn.nextInt();
		
		//3つめの整数を入力
		System.out.print("整数c:");
		
		//3つめの整数を読み込み
		int thirdIntegralNumber = stdIn.nextInt();
		
		//3つの整数の順番と大小関係によって処理を分岐
		//
		/*111が222よりも大きい場合
		  s1を用いて二値の交換を行う*/
		if ( firstIntegralNumber > secondIntegralNumber ) {   
			
			//111を作業用変数1に代入
			int firstReplacedValue = firstIntegralNumber;
			
			//222を111代入
			firstIntegralNumber = secondIntegralNumber;
			
			//作業用変数1を222に代入
			secondIntegralNumber = firstReplacedValue;					
		} 
		
		/*111が333よりも大きい場合
		  s1を用いて二値の交換を行う*/
		else if ( firstIntegralNumber > thirdIntegralNumber ) { 
			
			//111を作業用変数1に代入
			int firstReplacedValue = firstIntegralNumber;
			
			//333を111代入
			firstIntegralNumber = thirdIntegralNumber;
			
			//作業用変数1を333に代入
			thirdIntegralNumber = firstReplacedValue;			
		}
		
		/*222が333よりも大きい場合
		  s1を用いて二値の交換を行う*/
		if ( secondIntegralNumber > thirdIntegralNumber )  {
			
			//s2を222に代入
			int secondReplacedValue = secondIntegralNumber;
			
			//333を222に代入
			secondIntegralNumber = thirdIntegralNumber;
			
			//s2を333に代入
			thirdIntegralNumber = secondReplacedValue;
		}
		
		/*111が222よりも大きい場合
		  s1を用いて二値の交換を行う*/
		if ( firstIntegralNumber > secondIntegralNumber )  {
			
			//111をs2に代入
			int secondReplacedValue = firstIntegralNumber;
			
			//222をs1に代入
			firstIntegralNumber = secondIntegralNumber;
			
			//s2を222に代入
			secondIntegralNumber = secondReplacedValue;
		}
		
		
		//文字の表示
		System.out.println("a≦b≦cとなるようにソートしました。" );
		
		//
		System.out.println("変数aは" + firstIntegralNumber + "です。" );
		
		//
		System.out.println("変数bは" + secondIntegralNumber + "です。" );
		
		//
		System.out.println("変数cは" + thirdIntegralNumber + "です。" );
		
	}
	
}