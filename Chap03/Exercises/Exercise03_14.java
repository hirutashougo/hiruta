package Chap03.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_14
 * 概要:二つの整数値の小さいほうと大きいほうの両方を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/03
 */
public class Exercise03_14 {
	
	/*
	 *関数名:main
	 *概要:二つの整数値の小さいほうと大きいほうの両方を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/03
	 */
	public static void main(String[] arg) {
		
		//入力ストリームの指定
		Scanner standedImput = new Scanner(System.in);
		
		//整数aの入力と読み込み
		System.out.print("整数a:");  
		//入力された整数aを読み込む
		int integralNumberA = standedImput.nextInt();
		//整数bの入力と読み込み
		System.out.print("整数b:");  
		//入力された整数bを読み込む
		int integralNumberB = standedImput.nextInt();
		
		//大小関係を明らかにするために、まず最小値と最大値を0で初期設定
		int minimumNumber, maximumNumber = 0 ;
		
		//整数aと整数bの値が異なる場合
		if ( integralNumberA != integralNumberB ) {
			//整数aが整数bよりも小さい場合
			if ( integralNumberA < integralNumberB ) { 
				//整数aを最小値に代入する
				minimumNumber = integralNumberA;                    
				//整数bを最大値に代入する
				maximumNumber = integralNumberB;                    
			//整数aが整数bよりも大きい場合
			} else {                       
				//整数bを最小値に代入する
				minimumNumber = integralNumberB;                    
				//整数aを最大値に代入する
				maximumNumber =integralNumberA;                    
			}
			
			//比較的小さい値として最小値を表示する
			System.out.println("小さいほうの値は" + minimumNumber + "です。" );
			//比較的大きい値として最大値を表示する
			System.out.println("大きいほうの値は" + maximumNumber + "です。" );
			
		}
		//整数aと整数bの値が同じである場合
		else {
			//整数aと整数bが同じであることを表示
			System.out.println("二つの値は同じです" );
			
		}
		
	}
	
}