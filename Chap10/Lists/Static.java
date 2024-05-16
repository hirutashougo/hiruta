package Chap10.Lists;

/*
* クラス名:Static
* 概要:クラス/インスタンス フィールドと　クラス/インスタンス メソッド
* 作成者:S.Hiruta
* 作成日:2024/05/14
*/
public class Static {
	
	//
	private static int s;
	//
	private int a;
	
	//
	public static void m1() { }
	//
	public void f1() { }
	
	public static void m2(int x) {
		s = x;
//		a = x;
		m1();
//		f1();
	}
	
	public void f2(int x) {
		s = x;
		a = x;
		m1();
		f1();
		System.out.println("s = " + s + " a = " + a);
	}
}
