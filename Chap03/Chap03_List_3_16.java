package Chap03;

//スキャナのインポート
import java.util.Scanner;

//クラスの宣言
public class Chap03_List_3_16 {
	/*
	・関数名：main
	・概要：読み込んだ値に応じてジャンケンの手を表示(その2：switch文)
	・引数：なし
	・戻り値：なし
	・作成者：hiruta
	・作成日：2024/04/03
	*/
	public static void main(String[] arg) {
		//入力ストリームの指定
		Scanner stdIn = new Scanner(System.in);
		
		//ジャンケンの入力を促す
		System.out.print("手を選べ(0…グー/1…チョキ/2…パー/):");
		//入力されたジャンケンを読み込む
		int hand = stdIn.nextInt();
		
		switch ( hand ) {
		
		case 0: System.out.println("グー");   break;  //グーを選択した場合の表示
		case 1: System.out.println("チョキ"); break;  //チョキを選択した場合の表示
		case 2: System.out.println("パー");   break;  //パーを選択した場合の表示
		
		}
		
	}
	
}