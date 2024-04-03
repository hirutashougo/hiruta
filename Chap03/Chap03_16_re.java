package Chap03;

//スキャナのインポート
import java.util.Scanner;

//クラスの宣言
public class Chap03_16_re {
	
	/*
	・関数名：main
	・概要：三つの変数を小さい順にソートする
	・引数：なし
	・戻り値：なし
	・作成者：hiruta
	・作成日：2024/04/03
	*/
	
	public static void main(String[] arg) {
		//入力ストリームの指定
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a:");  int a = stdIn.nextInt();  //整数aの入力を促し、読み込む
		System.out.print("整数b:");  int b = stdIn.nextInt();  //整数bの入力を促し、読み込む
		System.out.print("整数c:");  int c = stdIn.nextInt();  //整数bの入力を促し、読み込む
		
		if ( a > b ) {   //①aがbより大きい場合
			//aとbを入れ替える
			int t1 = a;   //aをt1に代入
			a = b;        //bをaに代入
			b = t1;       //tをb1に代入
				
		} else if ( a > c ) {  //①aがcより大きい場合
			//aとcを入れ替える
			int t1 = a;   //aをt1に代入
			a = c;        //cをaに代入
			c = t1;       //t1をcに代入
			
		}
		
		if ( b > c )  {  //②bがcより大きい場合
			//bとcを入れ替える
			int t2 = b;   //bをt2に代入
			b = c;        //cをbに代入
			c = t2;       //t2をcに代入
		}
		
		if ( a > b )  {  //③aがbより大きい場合
			//aとbを入れ替える
			int t2 = a;   //aをt2に代入
			a = b;        //bをaに代入
			b = t2;       //t2をbに代入
		}
		
		
		//文字の表示
		System.out.println("a≦b≦cとなるようにソートしました。" );
		System.out.println("変数aは" + a + "です。" );
		System.out.println("変数bは" + b + "です。" );
		System.out.println("変数cは" + c + "です。" );
		
	}
	
}