package Chap03.Exercises;

//乱数ジェネレータのインポート
import java.util.Random;

/*
 * クラス名:Exercise03_17
 * 概要:生成した乱数に応じてジャンケンをする
 * 作成者:S.Hiruta
 * 作成日:2024/04/03
 */
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
		
		//ランダムの範囲を表す定数を定義
		final int RANDOM_RANGE = 3;
		
		//Randomクラスの変数の定義
		Random randomNumber = new Random();
		
		//0～2の乱数を生成する
		int handNnmber = randomNumber.nextInt(RANDOM_RANGE);
		
		
		//生成される整数により処理を分岐
		switch ( handNnmber ) {
		
		//生成された整数が0の場合、グーを表示
		case 0: System.out.println("グー");   break;
		
		//生成された整数が1の場合、チョキを表示
		case 1: System.out.println("チョキ"); break;
		
		//生成された整数が2の場合、パーを表示
		case 2: System.out.println("パー");   break;
		
		}
		
	}
	
}