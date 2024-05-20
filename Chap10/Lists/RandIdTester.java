package Chap10.Lists;

/*
* クラス名:RandIdTester
* 概要:クラスRandIdをテストする
* 作成者:S.Hiruta
* 作成日:2024/05/20
*/
public class RandIdTester {

	/*
	* クラス名:main
	* 概要:クラスRandIdをテストする
	* 作成者:S.Hiruta
	* 作成日:2024/05/20
	*/
	public static void main(String[] args) {
		
		//
		RandId a = new RandId();
		//
		RandId b = new RandId();
		//
		RandId c = new RandId();
		
		//
		System.out.println("aの識別番号" + a.getId());
		//
		System.out.println("bの識別番号" + b.getId());
		//
		System.out.println("cの識別番号" + c.getId());
	}

}
