package Chap04.Exercises;

import java.util.Random;
//スキャナーのインポート
import java.util.Scanner;

public class Exercise04_02 {
	
    /*
    ・関数名：main
    ・概要：数当てゲーム(10～99を当てさせる)
    ・引数：なし
    ・戻り値：なし
    ・作成者：hiruta
    ・作成日：2024/04/04
    */
    
    public static void main(String[] arg) {

        //入力ストリームの指定
        Scanner stdIn = new Scanner(System.in);
        //乱数生成ストリーム
        Random rand = new Random();
        
        int no = rand.nextInt(90);			//0～89の乱数を生成
        
        //ゲームへ誘導する表示
        System.out.println("数当てゲーム開始！！");	
        System.out.println("0～99の数を当ててください。");
        
        int x ;		//変数xを宣言
        do {	//do文の開始
        	System.out.print("いくつかな：");		//文字の表示
        	//xを入れる
        	x = stdIn.nextInt();
        	
        	//正解よりも小さい場合
        	if ( x > no + 10 )
        		System.out.println("もっと小さいよ：");
        	//正解よりも大きい場合
        	else if ( x < no + 10 )
        		System.out.println("もっと大きいよ：");
        	
        //xがno+10でないの場合、繰り返し
        } while ( x != no + 10 );
        
        System.out.println("正解です。");    //正解の場合
        
        
    }
    
}