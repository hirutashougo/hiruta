package Chap04.Lists;

//スキャナーのインポート
import java.util.Scanner;

public class List4_1 {
	
    /*
    ・関数名：main
    ・概要：入力された月の季節を表示
    ・引数：なし
    ・戻り値：なし
    ・作成者：hiruta
    ・作成日：2024/04/03
    */
    
    public static void main(String[] arg) {

        //入力ストリームの指定
        Scanner stdIn = new Scanner(System.in);
        
        int retry;		//もう一度？
        
        do {													//do文
        	System.out.print("季節を求めています。\n何月ですか：");
        	int month = stdIn.nextInt();
        	
        	if (month >= 3 && month <= 5)						//3月・4月・5月
        		System.out.println("それは春です。");
        	else if (month >= 6 && month <= 8)					//6月・7月・8月
        		System.out.println("それは夏です。");
        	else if (month >= 9 && month <= 11)					//9月・10月・11月
        		System.out.println("それは秋です。");
        	else if (month == 12 || month == 1 || month == 2)	//12月・1月・2月
        		System.out.println("それは冬です。");
        	
        	System.out.print("もう一度？　1…Yes/0…No：");		//繰り返しの選択
        	retry = stdIn.nextInt();
        } while (retry == 1);									//1の場合、繰り返し
    }
    
}
