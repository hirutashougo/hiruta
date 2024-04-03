package Chap04.List;

//スキャナーのインポート
import java.util.Scanner;

public class List4_2 {
	
    /*
    ・関数名：main
    ・概要：読み込んだ値に応じてジャンケンの手を表示(0,1,2のみを受け付ける)
    ・引数：なし
    ・戻り値：なし
    ・作成者：hiruta
    ・作成日：2024/04/03
    */
    
    public static void main(String[] arg) {

        //入力ストリームの指定
        Scanner stdIn = new Scanner(System.in);
        
        int hand ;		//もう一度？
        
        do {																//do文
        	System.out.print("手を選べ(0…グー/1…チョキ/2…パー)：");		//繰り返しの選択
        	hand = stdIn.nextInt();			//handオブジェクトの作成
        } while (hand < 0 || hand > 2 );	//hand0,1,2以外の場合、繰り返し
        
        //switch構文による分岐
        switch ( hand ) {
        case 0: System.out.println("グー");    break;	//グーの場合
        case 1: System.out.println("チョキ");  break;	//チョキの場合
        case 2: System.out.println("パー");    break;	//パーの場合
        }
    }
    
}
