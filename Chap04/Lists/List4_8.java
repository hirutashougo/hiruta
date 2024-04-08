package Chap04.Lists;

//スキャナーのインポート
import java.util.Scanner;

/*
 * クラス名:List4_8
 * 概要：読み込んだ数だけ*を表示(その2)
 * 作成者:S.Hiruta
 * 作成日:2024/04/08
 */
public class List4_8 {
	
    /*
     * 関数名：main
     * 概要：読み込んだ数だけ*を表示(その2)
     * 引数：なし
     * 戻り値：なし
     * 作成者：hiruta
     * 作成日：2024/04/08
    */
    
    public static void main(String[] args) {
    	
    	//入力ストリームの指定
        Scanner standardInput = new Scanner(System.in);
        
        //「*」の個数値の入力を促す
        System.out.print("何個*を表示しますか : ");
        //入力された個数値を読み込む(変数nは教科書準拠)
        int n = standardInput.nextInt();
        
        //変数iを初期条件1で設定(変数iは教科書準拠)
        int i = 1;
        //入力した個数値を変数が1以下になるまで繰り返し処理
        while (i <= n)
        {
        	//「*」を表示
        	System.out.print('*');
        	//変数iを後置増分演算子で増加
        	i ++;		
        }
        
       //改行文字の出力
        System.out.println();
    }
}
