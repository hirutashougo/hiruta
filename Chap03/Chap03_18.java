package Chap03;

//スキャナのインポート
import java.util.Scanner;

//クラスの宣言
public class Chap03_18 {
	
	/*
	・関数名：main
	・概要：入力した月に対応する季節を表示するプログラム
	・引数：なし
	・戻り値：なし
	・作成者：hiruta
	・作成日：2024/04/03
	*/
	
	public static void main(String[] arg) {
		
		//入力ストリームの指定
		Scanner stdIn = new Scanner(System.in);
		
		//月の入力を促す
		System.out.print("月を入力してください:");
		
		//入力された数値を読み込む
		int n = stdIn.nextInt();
		
		switch ( n ) {								//switch構文
		 case 1  :                            		//1月の場合
		 case 2  : System.out.print("冬");	  		//2月の場合
		           break;					  		//抜ける
		 case 3  :							  		//3月の場合
		 case 4  :							  		//4月の場合
		 case 5  : System.out.print("春");	  		//5月の場合
		           break;					  		//抜ける
		 case 6  :							  		//6月の場合
		 case 7  :							  		//7月の場合
		 case 8  : System.out.print("夏");	  		//8月の場合
		           break;					  		//抜ける
		 case 9  :							  		//9月の場合
		 case 10 :							  		//10月の場合
		 case 11 : System.out.print("秋");	  		//11月の場合
		           break; 					  		//抜ける
		 case 12 : System.out.print("冬");	  		//12月の場合
		           break;					  		//抜ける
		 default : System.out.print("判定不可");	//1～12以外の数値が入力された場合
                   break;							//抜ける
		}
		
		//季節の表示
		System.out.println();
		
	}
	
}