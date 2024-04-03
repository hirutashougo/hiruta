package Chap04.Exercise;

//スキャナーのインポート
import java.util.Scanner;

public class Exercise4_1 {
	
  /*
  ・関数名：main
  ・概要：整数値の符号の判断
  ・引数：なし
  ・戻り値：なし
  ・作成者：hiruta
  ・作成日：2024/04/03
  */
  
  public static void main(String[] arg) {
      
      //入力ストリームの指定
      Scanner stdIn = new Scanner(System.in);
      
      int retry;
      
      do {
      	System.out.print("符号を求めます。\n整数を入力してください。：");
      	int month = stdIn.nextInt();
      	
      	if (month > 0 )
      		System.out.println("正です。");
      	else if (month < 0 )
      		System.out.println("負です。");
      	else 
      		System.out.println("符号はありません。");
      	System.out.print("もう一度？　1…Yes/0…No：");
      	retry = stdIn.nextInt();
      } while (retry == 1);
  }
  
}