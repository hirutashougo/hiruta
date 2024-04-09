package Chap03.Exercises;

//スキャナのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise03_18  
 * 概要:入力した月に対応する季節を表示するプログラム
 * 作成者:S.Hiruta
 * 作成日:2024/04/18
 */
public class Exercise03_18 {
	
	/*
	・関数名：main
	・概要：入力した月に対応する季節を表示するプログラム
	・引数：なし
	・戻り値：なし
	・作成者：hiruta
	・作成日：2024/04/03
	*/
	
	public static void main(String[] arg) {
		
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//月の数値の入力を促す
		System.out.print("月の数値( 1～12 )を入力してください:");
		
		//入力された数値を読み込む
		int monthNumber = standardInput.nextInt();
		
		//入力された数値が1～12に収まっている場合
		if ( 1 <= monthNumber && monthNumber <= 12 ) {  
		
			//switch構文
			switch ( monthNumber ) {
			//1月の場合
			case 1  :
				//2月の場合
			case 2  : System.out.print("冬です。");
			//抜ける
			break;
			//3月の場合           
			case 3  :
				//4月の場合
			case 4  :
				//5月の場合
			case 5  : System.out.print("春です。");
			//抜ける
			break;
			//6月の場合
			case 6  :
				//7月の場合
			case 7  :
				//8月の場合
			case 8  : System.out.print("夏です。");
			//抜ける
			break;
			//9月の場合
			case 9  :
				//10月の場合
			case 10 :
				//11月の場合
			case 11 : System.out.print("秋です。");
			//抜ける
			break;
			//12月の場合
			case 12 : System.out.print("冬です。");
			//抜ける
			break;
			//1～12以外の数値が入力された場合
			default : System.out.print("判定不可");
			//抜ける
			break;
			
			}
		
		}
		
		else {
			//1～12の数値を入力するように促す
			System.out.println("1～12の月の値を入力してください。");
		}
		
		//季節の表示
		System.out.println();
		
	}
	
}