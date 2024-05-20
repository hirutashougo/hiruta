package Chap10.Lists;

import static java.util.Calendar.*;

//
import java.util.GregorianCalendar;

/*
* クラス名:RandId
* 概要:
* 作成者:S.Hiruta
* 作成日:2024/05/20
*/
public class DateId {
	
	//
	private static int counter;
	
	//
	private int id;
	
	/*
	 * 静的初期化子：
	 * 概要：
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	static  {
		//
		GregorianCalendar today = new GregorianCalendar();
		//
		int y = today.get(YEAR);
		//
		int m = today.get(MONTH) + 1;
		//
		int d = today.get(DATE);
		
		//
		System.out.printf("今日は%04d年%02d月%02d日です。\n", y, m, d);
		//
		counter = y * 1000000 + m * 10000 + d * 100;
	}
	
	/*
	 * コンストラクタ名：DateId
	 * 概要：
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public  DateId() {
		//識別番号を1加算する
		id = ++counter;
	}
	
	/*
	 * メソッド名：getId
	 * 概要:識別番号を取得
	 * 引数：なし
	 * 戻り値：識別番号(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public int getId() {
		//識別番号を取得
		return id;
	}

}
