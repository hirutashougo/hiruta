package Chap03.Exercises;

//乱数ジェネレータのインポート
import java.util.Random;

//クラスの宣言
public class Exercise03_17 {
	/*
	・関数名：main
	・概要：生成した乱数に応じてジャンケンをする
	・引数：なし
	・戻り値：なし
	・作成者：hiruta
	・作成日：2024/04/03
	*/
	public static void main(String[] arg) {
		//乱数ジェネレータの指定
		Random rand = new Random();
		
		//0～2の乱数を生成する
		int hand = rand.nextInt(3);
		
		switch ( hand ) {
		
		case 0: System.out.println("グー");   break;  //グーを選択した場合の表示
		case 1: System.out.println("チョキ"); break;  //チョキを選択した場合の表示
		case 2: System.out.println("パー");   break;  //パーを選択した場合の表示
		
		}
		
	}
	
}