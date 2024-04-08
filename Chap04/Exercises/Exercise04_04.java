package Chap04.Exercises;

//スキャナーのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise04_04
 * 概要：List4-4のwhile文終了時にxの値が-1になることを確認する
 * 作成者:S.Hiruta
 * 作成日:2024/04/08
 */
public class Exercise04_04 {
	
    /*
     * 関数名：main
     * 概要：List4-4のwhile文終了時にxの値が-1になることを確認する
     * 引数：なし
     * 戻り値：なし
     * 作成者：hiruta
     * 作成日：2024/04/08
    */
    
    public static void main(String[] args) {
    	
    	//Scannerクラスの変数の設定
        Scanner standardInput = new Scanner(System.in);
        
        //カウントダウン開始の表示
        System.out.println("カウントダウンします。");
        
        //変数xの初期状態を0で設定(変数xは教科書準拠)
        int x = 0 ;
        
        /*変数xが0以下である限り、
         正の整数値の入力を促し続ける処理*/
        //do文の開始
        do {
        	
        	//正の整数の入力を促す
        	System.out.print("正の整数値：");
        	//入力された正の整数を読み込む
        	x = standardInput.nextInt();
        
        	//xが0以下である限りこの処理は繰り返す
        } while (x <= 0 );
        
        /*変数xが0以上である限り、入力した正の整数から0までの
        カウントダウンを表示し続ける処理*/
        //while文の開始
        while (x >= 0) {
        	
        	//変数xを表示する
        	System.out.println(x);
        	//変数xから1ずつ引いていく
        	x--;
        	
        }
        
        //while文終了後、変数xの値が-1で終わっている事を確認
        System.out.println( "変数xの中身は" + x + "で終わっています。");

    }
    
}