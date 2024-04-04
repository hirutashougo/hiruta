package Chap04.Lists;

//乱数生成器のインポート
import java.util.Random;
//スキャナーのインポート
import java.util.Scanner;

public class List4_3 {
	
    /*
    ・関数名：main
    ・概要：数当てゲーム(0～99を当てさせる)
    ・引数：なし
    ・戻り値：なし
    ・作成者：hiruta
    ・作成日：2024/04/03
    */
    
    public static void main(String[] arg) {

        //入力ストリームの指定
        Scanner stdIn = new Scanner(System.in);
        //乱数生成ストリーム
        Random rand = new Random();
        
        int no = rand.nextInt(100);			//0～99の乱数を生成
        
        //ゲームへ誘導する表示
        System.out.println("数当てゲーム開始！！");	
        System.out.println("0～99の数を当ててください。");
        
        int x ;		//変数xを宣言
        do {	//do文の開始
        	System.out.print("いくつかな：");		//文字の表示
        	//xを入れる
        	x = stdIn.nextInt();
        	
        	//正解よりも小さい
        	if ( x > no )
        		System.out.println("もっと小さいよ：");
        	//正解よりも大きい
        	else if ( x < no )
        		System.out.println("もっと大きいよ：");
        		
        } while ( x != no );	//xがnoでないの場合、繰り返し
        
        System.out.println("正解です。");    //正解の場合
        
        
    }
    
}
