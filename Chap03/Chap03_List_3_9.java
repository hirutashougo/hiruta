package Chap03;

//読み込んだ月の季節を表示

import java.util.Scanner;

public class Chap03_List_3_9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("季節を求めています。\n何月ですか:");  //月の数の入力
		int month = stdIn.nextInt();     //入力値の読み込み
		
		if ( month >= 3 && month <= 5 )                       //3月・4月・5月
			System.out.println("それは春です");
		else if ( month >= 6 && month <= 8 )                  //6月・7月・8月
			System.out.println("それは夏です。");
		else if ( month >= 9 && month <= 11 )                 //9月・10月・11月
			System.out.println("それは秋です。");
		else if ( month == 12 || month == 1 || month == 2 )   //12月・1月・2月
			System.out.println("それは冬です。");

	}

}
