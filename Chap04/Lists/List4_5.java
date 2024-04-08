package Chap04.Lists;

//スキャナーのインポート
import java.util.Scanner;

/*
 * クラス名:List4_5
 * 概要：入力した正の整数が0になるまでカウントする
 * 作成者:S.Hiruta
 * 作成日:2024/04/08
 */
public class List4_5 {
	
    /*
     * 関数名：main
     * 概要：入力した正の整数が0になるまでカウントする
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
       while ( x >= 0 ) {
    	   //変数xの値を表示してデクリメント
    	   System.out.println(x--);
       }
    }
    
}
