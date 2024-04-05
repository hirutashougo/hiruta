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
		Scanner standedInput = new Scanner(System.in);
		
		//整数aの入力と読み込み( 変数aは教科書準拠 )
		System.out.print("整数a:");
		
		//入力された整数aを読み込む
		int a = standedInput.nextInt();
		
		//整数bの入力と読み込み( 変数bは教科書準拠 )
		System.out.print("整数b:");
		
		//入力された整数bを読み込む
		int b = standedInput.nextInt();
		
		
		/*大小関係を明らかにするため、
		  まず「小さい値」と「大きい値」を0で初期設定*/
		int smallValue, largerValue = 0 ;
		
		
		//2つの条件による分岐
		//①整数aと整数bの値が異なる場合
		if ( a != b ) {
			
			//２つの条件による分岐
			//①整数aが整数bよりも小さい場合
			if ( a < b ) { 
				
				//整数aを「小さい値」に代入する
				smallValue = a;    
				
				//整数bを「大きい値」に代入する
				largerValue = b;  
				
			//②整数aが整数bよりも大きい場合
			} else {
				
				//整数bを「小さい値」に代入する
				smallValue = b;
				
				//整数aを「大きい値」に代入する
				largerValue =a;
			}
			
			//「小さい値」を表示する
			System.out.println("小さいほうの値は" + smallValue + "です。" );
			
			//「大きい値」を表示する
			System.out.println("大きいほうの値は" + largerValue + "です。" );
			
		}
		
		//②整数aと整数bの値が同じである場合
		else {
			
			//整数aと整数bが同じであることを表示
			System.out.println("二つの値は同じです" );
			
		}
		
	}
	
}