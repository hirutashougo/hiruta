package Chap04.Exercises;

//Randomライブラリの読み込み
import java.util.Random;
//スキャナーのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise04_02
 * 概要：数当てゲーム(10～99を当てさせる)
 * 作成者:S.Hiruta
 * 作成日:2024/04/08
 */
public class Exercise04_02 {
	
    /*
    ・関数名：main
    ・概要：数当てゲーム(10～99を当てさせる)
    ・引数：なし
    ・戻り値：なし
    ・作成者：hiruta
    ・作成日：2024/04/08
    */
    public static void main(String[] arg) {
    	
    	//ランダムの範囲を表す定数を定義
    	final int RANDOM_RANGE = 90;
        //乱数の調整用の定数を定義
        final int adjustmentNumber = 10;

        //Scannerクラスの変数を定義
        Scanner standerdInput = new Scanner(System.in);
        //Randomクラスの変数を定義
        Random randomValiable = new Random();/////////////////
        
        //10～99の乱数を生成
        int randomNumber = randomValiable.nextInt(RANDOM_RANGE) + adjustmentNumber;/////////////
        
        //ゲームへ誘導する表示
        System.out.println("数当てゲーム開始！！");
        //ゲームへ誘導する表示
        System.out.println("0～99の数を当ててください。");
        
        //変数xを宣言(変数xは教科書準拠)
        int x ;
        
        //数値を入力し、生成された整数を当てる処理
        //do文の開始
        do {
        	
        	//文字の表示
        	System.out.print("いくつかな：");
        	//入力された数値を読み込み、変数xに代入
        	x = standerdInput.nextInt();
        	
        	//変数xが生成された整数( 正解 )よりも小さい場合
        	if ( x > randomNumber )
        		//もっと小さいと表示
        		System.out.println("もっと小さいよ：");
        	//正解よりも大きい場合
        	else if ( x < randomNumber )
        		//もっと大きいと表示
        		System.out.println("もっと大きいよ：");
        	
        //生成された整数を入力しない限り、繰り返し
        } while ( x != randomNumber );
        
        //正解であると表示
        System.out.println("正解です。");       
        
    }
    
}