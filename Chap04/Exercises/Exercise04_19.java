package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_19
 * 概要：List4-1の変更。1～12以外の値が入力された場合、再入力させる。
 * 作成者:S.Hiruta
 * 作成日:2024/04/11
 */
public class Exercise04_19 {

	/*
	 * 関数名：main
	 * 概要：入力された月の季節を出力。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/11
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);

        //1月を表す定数を定義
        final int JANUARY_NUMBER = 1;
        //2月を表す定数を定義
        final int FEBRUARY_NUMBER = 2;
        //3月を表す定数を定義
        final int MARCH_NUMBER = 3;
        //5月を表す定数を定義
        final int MAY_NUMBER = 5;
        //6月を表す定数を定義
        final int JUNE_NUMBER = 6;
        //8月を表す定数を定義
        final int AUGUST_NUMBER = 8;
        //9月を表す定数を定義
        final int SEPTEMBER_NUMBER = 9;
        //11月を表す定数を定義
        final int NOBEMBER_NUMBER = 11;
        //12月を表す定数を定義
        final int DECEMBER_NUMBER = 12;
        //繰り返しを選択するための定数を定義
        final int RETRY_CHOICE = 1;
        //処理を終了するための定数を定義
        final int END_CHOICE = 0;
        //入力された月を表わす変数を宣言
        int monthNumber = 0;
        //再度実行するかの確認の為の変数を宣言
        int retryCount = 0;
        
        //入力された月の季節を表示。繰り返し実行することも可能
        do {
        	//月の入力を促す
        	System.out.println("季節を求めます。");
        	
        	//1～12の月を入力させる処理
        	do {
        		//1～12の月を入力するように促す
        		System.out.print("1～12の月を入力してください。\n何月ですか：");
        		//入力された月を読み込む
            	monthNumber = standardInput.nextInt();
            //1～12の月が入力されない限り繰り返す
        	} while (monthNumber < JANUARY_NUMBER || monthNumber > DECEMBER_NUMBER);
        	
        	//入力された月が3以上5以下の場合
        	if (monthNumber >= MARCH_NUMBER && monthNumber <= MAY_NUMBER) {
        		//季節は春であると表示
        		System.out.println("それは春です。");
        	//入力された月が6以上8以下の場合
        	} else if (monthNumber >= JUNE_NUMBER && monthNumber <= AUGUST_NUMBER) {
        		//季節は夏であると表示
        		System.out.println("それは夏です。");
        	//入力された月が9以上11以下の場合
        	} else if (monthNumber >= SEPTEMBER_NUMBER && monthNumber <= NOBEMBER_NUMBER) {
        		//季節は秋であると表示
        		System.out.println("それは秋です。");
        	//入力された月が12・1・2の場合
        	} else if (monthNumber == DECEMBER_NUMBER || monthNumber == JANUARY_NUMBER || monthNumber == FEBRUARY_NUMBER) {
        		//季節は冬であると表示
        		System.out.println("それは冬です。");
        	}
        	
        	//再度実行するか確認。1なら再度実行、0なら終了
        	System.out.print("もう一度？　1…Yes/0…No：");
        	//入力された数値を読み込む
        	retryCount = standardInput.nextInt();
        	//1か0が入力されない限り繰り返される処理
        	while (retryCount != RETRY_CHOICE && retryCount != END_CHOICE) {
        		//1か0を入力するように求める。
            	System.out.print("1か0を入力してください。\nもう一度？　1…Yes/0…No：");
            	//入力された数値を読み込む
            	retryCount = standardInput.nextInt();
        	}
        	
        //1が入力された場合、再度実行
        } while (retryCount == RETRY_CHOICE);
        
        //0が選択された場合、終了を告げる
        System.out.print("終了します。");
    }
    
}