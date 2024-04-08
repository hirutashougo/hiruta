package Chap04.Exercises;

//スキャナーのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise04_01
 * 概要：整数値の符号の判断
 * 作成者:S.Hiruta
 * 作成日:2024/04/08
 */
public class Exercise04_01 {
	
  /*
  ・関数名：main
  ・概要：整数値の符号の判断
  ・引数：なし
  ・戻り値：なし
  ・作成者：hiruta
  ・作成日：2024/04/08
  */
  
  public static void main(String[] arg) {
      
      //入力ストリームの指定
      Scanner standardInput = new Scanner(System.in);
      
      //もう一度処理を行う
      int retrySelection;
      
      //入力された整数の符号を求める処理のループ
      do {
    	
    	//整数値の入力を求める
      	System.out.print("符号を求めます。\n整数を入力してください。：");
      	//入力された整数値の読み込み
      	int integralNumber = standardInput.nextInt();
      	
      	//入力された整数値が0より大きい場合
      	if (integralNumber > 0 )
      		//正であることを伝える
      		System.out.println("正です。");
      	//入力された整数値が0より小さい場合
      	else if (integralNumber < 0 )
      		//負であることを伝える
      		System.out.println("負です。");
      	//入力された整数が0の場合
      	else
      		//符号はないことを伝える
      		System.out.println("符号はありません。");
      	
      	//1か0の入力を求める
      	System.out.print("もう一度？　1…Yes/0…No：");
      	//入力された1か0を読み込む
      	retrySelection = standardInput.nextInt();
      	
      	//1であればもう一度ループする
      } while (retrySelection == 1);
  }
  
}