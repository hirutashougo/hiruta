package Chap03;

//二つの整数値の小さいほうの値と大きいほうの値を求めて表示

import java.util.Scanner;

//クラスの宣言
public class Chap03_List_3_13 {
	//mainメソッドの宣言
	public static void main(String[] arg) {
		//入力ストリームの指定
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a:");  int a = stdIn.nextInt();  //整数aの入力を促し、読み込む
		System.out.print("整数b:");  int b = stdIn.nextInt();  //整数bの入力を促し、読み込む
		
		int min, max;    //小さいほうの値/大きいほうの値
		
		if ( a < b ) {   //aがbより小さい場合
			min = a;
			max = b;
		} else {         //bがaより小さい場合
			min = b;
			max =a;
		}
		
		//結果の表示
		System.out.println("小さいほうの値は" + min + "です。" );
		System.out.println("大きいほうの値は" + max + "です。" );
		
	}
	
}