package Chap04.Lists;

//スキャナーのインポート
import java.util.Scanner;

/*
 * クラス名:List4_9
 * 概要：正の整数を読み込んで逆順に表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/08
 */
public class List4_9 {
	
    /*
     * 関数名：main
     * 概要：正の整数を読み込んで逆順に表示
     * 引数：なし
     * 戻り値：なし
     * 作成者：hiruta
     * 作成日：2024/04/08
    */
    public static void main(String[] args) {
    	
    	//Scannerクラスの変数の定義
        Scanner standardInput = new Scanner(System.in);
        
        //説明の表示
        System.out.print("正の整数値を逆順に表示します。 : ");
        
        int x = 0;
        
        do {
        	System.out.print("正の整数値：");
        	x = standardInput.nextInt();
        } while (x <= 0);
        
        System.out.print("逆から読むと");
        while (x > 0) {
        	System.out.print(x % 10);
        	x /= 10;
        }
        System.out.println("です。");
    }
}
