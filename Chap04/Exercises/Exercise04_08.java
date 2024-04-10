package Chap04.Exercises;
//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise04_09
 * 概要:入力された整数値の桁数を出力する
 * 作成者:S.Hiruta
 * 作成日:2024/04/10
 */
public class Exercise04_08 {

	/*
     * 関数名：main
     * 概要:入力された整数値の桁数を出力する
     * 引数：なし
     * 戻り値：なし
     * 作成者：hiruta
     * 作成日：2024/04/10
    */
    public static void main(String[] args) {
    	
    	//Scannerクラスの変数の定義
    	Scanner standardInput = new Scanner(System.in);
    	
    	//整数値の入力を促す
    	System.out.print("整数値：");
    	//入力された整数値を読み込む
    	int integralNumber = standardInput.nextInt();
    	
    	//整数値の桁数を減らすための定数を初期状態10で設定
    	final int decimalNumber = 10; 
    	//整数値の桁数を数える変数を初期状態0で設定
    	int digitCount = 0;
    	
    	//整数値を10で割っていき、0以下になるまで処理を行う
    	while ( integralNumber > 0) {
    		//正数値の桁数を1カウントする
    		digitCount ++ ;
    		//整数値を10で割る
    		integralNumber /= decimalNumber;
    		
    	}
    	
    	//整数値の桁数を出力する
    	System.out.print("その値は" + digitCount + "桁です。");
    }
    
}