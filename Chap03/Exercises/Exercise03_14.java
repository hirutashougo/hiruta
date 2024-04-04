package Chap03.Exercises;

//二つの整数値の小さいほうと大きいほうの両方を表示

import java.util.Scanner;

//クラスの宣言
public class Exercise03_14 {
	//mainメソッドの宣言
	public static void main(String[] arg) {
		//入力ストリームの指定
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a:");  int a = stdIn.nextInt();  //整数aの入力を促し、読み込む
		System.out.print("整数b:");  int b = stdIn.nextInt();  //整数bの入力を促し、読み込む
		
		int min, max;                  //小さいほうの値/大きいほうの値
		
		if ( a != b ) {
			
			if ( a < b ) {                 //aがbより小さい場合
				min = a;                   //minにaを代入 
				max = b;                   //maxにbを代入 
			} else {                       //bがaより小さい場合
				min = b;                   //minにbを代入 
				max =a;                    //maxにaを代入
			}
			
			//min
			System.out.println("小さいほうの値は" + min + "です。" );
			System.out.println("大きいほうの値は" + max + "です。" );
			
		} 	
		else {
			//結果の表示
			System.out.println("二つの値は同じです" );
			
		}
		
	}
	
}