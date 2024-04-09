package Chap03.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_15
 * 概要:二つの変数を大きい順にソート
 * 作成者:S.Hiruta
 * 作成日:2024/04/03
 */
public class Exercise03_15 {
	
	/*
	 *関数名:main
	 *概要:二つの変数を大きい順にソート
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/03
	 */
	public static void main(String[] arg) {
		
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//1つめの整数を入力
		System.out.print("1つめの整数:");
		
		//入力された1つめの整数を読み込む
		int firstNumber = standardInput.nextInt();
		
		//2つめの整数
		System.out.print("2つめの整数:");
		//入力された整数を読み込む
		int secondNumber = standardInput.nextInt();
		
		
		/*1つめの整数が2つめの整数よりも小さい場合
		  作業用変数を用いて二値の交換を行う*/
		if ( firstNumber < secondNumber ) {
			
			//1つめの整数を作業用変数に代入
			int assignmentValue = firstNumber;
			
			//2つめの整数を1つめの整数に代入
			firstNumber = secondNumber; 
			
			//作業用変数を2つめの整数に代入
			secondNumber = assignmentValue;
		}
		
		
		//降順の説明を表示
		System.out.println("大きい順になるようにソートしました。" );
		//大きい値の表示
		System.out.println("大きい整数は" + firstNumber + "です。" );
		//小さい値の表示
		System.out.println("小さい整数は" + secondNumber + "です。" );
		
	}
	
}