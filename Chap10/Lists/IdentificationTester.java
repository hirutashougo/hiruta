package Chap10.Lists;

/*
* クラス名:IdentificationTester
* 概要:クラスIdentificationを利用する
* 作成者:S.Hiruta
* 作成日:2024/05/16
*/
public class IdentificationTester {

	/*
	* クラス名:main
	* 概要:クラスIdentificationを利用する
	* 作成者:S.Hiruta
	* 作成日:2024/05/16
	*/
	public static void main(String[] args) {
		//
		Identification a = new Identification();
		//
		Identification b = new Identification();

		//
		System.out.println("aの識別番号：" + a.getIdentification());
		//
		System.out.println("bの識別番号：" + b.getIdentification());

		//
		System.out.println("Id.counter = " + Identification.countNumber);
		//
		System.out.println("a.counter = " + a.countNumber);
		//
		System.out.println("b.counter = " + b.countNumber);
	}
}
