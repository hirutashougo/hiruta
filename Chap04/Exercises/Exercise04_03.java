package Chap04.Exercises;

//スキャナーのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise04_03
 * 概要：入力した二つの整数の間の整数を全て表示するプログラム
 * 作成者:S.Hiruta
 * 作成日:2024/04/08
 */
public class Exercise04_03 {
	
    /*
    ・関数名：main
    ・概要：入力した二つの整数の間の整数を全て表示するプログラム
    ・引数：なし
    ・戻り値：なし
    ・作成者：hiruta
    ・作成日：2024/04/08
    */
    
    public static void main(String[] arg) {

        //入力ストリームの指定
        Scanner standardInput = new Scanner(System.in);
       
        //整数Aの入力を促す
        System.out.print("整数A : ");
        //入力された整数Aを読み込む(変数aは教科書準拠)
        int a = standardInput.nextInt();
        //整数Bの入力を促す
        System.out.print("整数B : ");
        //入力された整数Bを読み込む(変数bは教科書準拠)
        int b = standardInput.nextInt();
        
        //入力された整数を昇順に並べかえる(整数A<)
        //入力された整数Aが整数Bよりも大きい場合
        if ( a > b ) {
        	//代入変数に変数aを代入
        	int assigmentValiable = a ;
        	//変数aに変数bを代入
        	a = b ;
        	//変数bに代入変数を代入
        	b = assigmentValiable ;
        }
        
        /*整数Aが整数B以下の場合、
         整数Aに1つ追加した値を表示する処理を繰り返す*/
        
        //インクリメントの増加幅の定数
        final int increaseNumer = 1;
        
        //do分の開始
        do  {
        	//整数Aと空白を表示
        	System.out.print( a + " " );
        	//整数Aに1を追加
        	a = a + increaseNumer;
        	
        //変数aが変数b以下になるまで処理を繰り返す
        } while ( a <= b );
    }
    
}