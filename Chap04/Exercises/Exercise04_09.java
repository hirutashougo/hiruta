package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_09
 * 概要：1から入力した値までの積の値を表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/09
 */
public class Exercise04_09 {
	
	/*
     * 関数名：main
     * 概要：1から入力した値までの積の値を表示する
     * 引数：なし
     * 戻り値：なし
     * 作成者：hiruta
     * 作成日：2024/04/09
    */
    public static void main(String[] args) {
    	
    	//Scannerクラスの変数の宣言
    			Scanner standardInput = new Scanner(System.in);
    			
    			//整数の入力を促す
    			System.out.println("1からnまでの積を求めます。");
    			
    			//変数nを宣言
    			int n;
    			
    			//do文の開始
    			do {
    				
    				//入力を促す
    				System.out.print("nの値：");
    				//読み込む
    				n = standardInput.nextInt();
    				
    				//
    				if (n <= 0) {
    					//
    					System.out.println("正の整数を入力してください。");
    				}
    				
    			//nが0以下になるまでループ
    			} while (n <= 0);
    			
    			//積を行っていく変数を初期状態0で宣言
    			int multipleSum = 1;
    			//ループ用の変数を初期状態1で宣言
    			int repeatVariable = 1;
    			
    			//変数iが変数n以下になった場合
    			while (repeatVariable <= n) {
    				//複合代入演算子を用いて変数sumに変数iを追加していく
    				multipleSum *= repeatVariable;
    				//後置増分演算子を用いて変数iに1ずつ追加
    				repeatVariable++;
    			}
    			
    			//while文終了後、1から入力した整数までの和を表示
    			System.out.println("1から" + n + "までの積は" + multipleSum + "です。");
    }
    
}