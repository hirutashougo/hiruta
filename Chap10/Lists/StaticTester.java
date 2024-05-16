package Chap10.Lists;

/*
* クラス名:StaticTester
* 概要:Staticクラスをテストする
* 作成者:S.Hiruta
* 作成日:2024/05/16
*/
public class StaticTester {

	/*
	 * 関数名：main
	 * 概要:Staticクラスをテストする
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/16
	*/
	public static void main(String[] args) {
		
		//
		Static c1 = new Static();
		//
		Static c2 = new Static();
		
		//
		Static.m2(5);
		//
		c1.f2(10);
		//
		c2.f2(20);
	}
}
