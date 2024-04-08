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
		Scanner standardImput = new Scanner(System.in);
		
		
		//1つめの整数を入力
		System.out.print("整数a:");
		
		//1つめの整数を読み込み
		int firstIntegralNumber = standardImput.nextInt();
		
		//2つめの整数を入力
		System.out.print("整数b:");
		
		//2つめの整数を読み込み
		int secondIntegralNumber = standardImput.nextInt();
		
		//3つめの整数を入力
		System.out.print("整数c:");
		
		//3つめの整数を読み込み
		int thirdIntegralNumber = standardImput.nextInt();
		
		//3つの整数の順番と大小関係によって処理を分岐
		
		/*1つめの整数が2つめの整数よりも大きい場合
		  作業用変数1を用いて二値の交換を行う*/
		if ( firstIntegralNumber > secondIntegralNumber ) {   
			
			//1つめの整数を作業用変数1に代入
			int firstReplacedValue = firstIntegralNumber;
			
			//2つめの整数を1つめの整数代入
			firstIntegralNumber = secondIntegralNumber;
			
			//作業用変数1を2つめの整数に代入
			secondIntegralNumber = firstReplacedValue;					
		} 
		
		/*1つめの整数が3つめの整数よりも大きい場合
		  作業用変数1を用いて二値の交換を行う*/
		else if ( firstIntegralNumber > thirdIntegralNumber ) { 
			
			//1つめの整数を作業用変数1に代入
			int firstReplacedValue = firstIntegralNumber;
			
			//3つめの整数を1つめの整数代入
			firstIntegralNumber = thirdIntegralNumber;
			
			//作業用変数1を3つめの整数に代入
			thirdIntegralNumber = firstReplacedValue;			
		}
		
		/*2つめの整数が3つめの整数よりも大きい場合
		  作業用変数1を用いて二値の交換を行う*/
		if ( secondIntegralNumber > thirdIntegralNumber )  {
			
			//作業用変数2を2つめの整数に代入
			int secondReplacedValue = secondIntegralNumber;
			
			//3つめの整数を2つめの整数に代入
			secondIntegralNumber = thirdIntegralNumber;
			
			//作業用変数2を3つめの整数に代入
			thirdIntegralNumber = secondReplacedValue;
		}
		
		/*1つめの整数が2つめの整数よりも大きい場合
		  作業用変数1を用いて二値の交換を行う*/
		if ( firstIntegralNumber > secondIntegralNumber )  {
			
			//1つめの整数を作業用変数2に代入
			int secondReplacedValue = firstIntegralNumber;
			
			//2つめの整数を作業用変数1に代入
			firstIntegralNumber = secondIntegralNumber;
			
			//作業用変数2を2つめの整数に代入
			secondIntegralNumber = secondReplacedValue;
		}
		
		
		//ソートの説明の表示
		System.out.println("a≦b≦cとなるようにソートしました。" );
		
		//整数Aに関する表示
		System.out.println("整数aは" + firstIntegralNumber + "です。" );
		
		//整数Bに関する表示
		System.out.println("整数bは" + secondIntegralNumber + "です。" );
		
		//整数Cに関する表示
		System.out.println("整数cは" + thirdIntegralNumber + "です。" );
		
	}
	
}