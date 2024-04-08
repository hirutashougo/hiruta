package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_07
 * 概要：*と+を交互に表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/08
 */
public class Exercise04_07 {
	
	/*
     * 関数名：main
     * 概要：*と+を交互に表示する
     * 引数：なし
     * 戻り値：なし
     * 作成者：hiruta
     * 作成日：2024/04/08
    */
    public static void main(String[] args) {
    	
    	//Scannerクラスの変数の定義
    	Scanner standardInput = new Scanner(System.in);

    	//「*」の個数値の入力を促す
    	System.out.print("*や+を何個を表示しますか : ");
    	//入力された個数値を読み込む(変数nは教科書準拠)
    	int countNumber = standardInput.nextInt();

    	/*インクリメントの為の変数(以下:インクリメント変数)
    	 を初期状態1で宣言*/
    	int incrementVariable = 0;
    	
    	//インクリメント変数が偶数か奇数かで表示する記号を変える
    	//do文の開始
    	do {
    		
    		//インクリメント変数が偶数の場合
    		if (incrementVariable % 2 == 0) {
    			//「*」を表示
    			System.out.print('*');
    			//インクリメント変数を後置増分演算子で増加
    			incrementVariable ++;
    		}
    		
    		//インクリメント変数が奇数の場合
    		else if (incrementVariable % 2 == 1) {
    			//「+」を表示
    			System.out.print('+');
    			//インクリメント変数を後置増分演算子で増加
    			incrementVariable ++;
    		}
    		
    		else {}
    	//インクリメント変数が入力された個数値を上回るまで繰り返される	
    	} while (incrementVariable > countNumber);

    	//改行文字を出力
    	System.out.println();
    }
    
}