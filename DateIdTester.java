//idパッケージのDateIdクラスを単一インポート宣言
import id.DateId;

/*
* クラス名:RandIdTester
* 概要:クラスDateIdをテストする
* 作成者:S.Hiruta
* 作成日:2024/05/23
*/
public class DateIdTester {

	/*
	* クラス名:main
	* 概要:クラスDateIdをテストする
	* 作成者:S.Hiruta
	* 作成日:2024/05/23
	*/
	public static void main(String[] args) {
		
		//1つめのインスタンスを宣言
		DateId firstInstance = new DateId();
		//1つめのインスタンスを宣言
		DateId secondInstance = new DateId();
		//1つめのインスタンスを宣言
		DateId thirdInstance = new DateId();
		
		//1つめのインスタンスの識別番号を取得して表示
		System.out.println("aの識別番号" + firstInstance.getId());
		//1つめのインスタンスの識別番号を取得して表示
		System.out.println("bの識別番号" + secondInstance.getId());
		//1つめのインスタンスの識別番号を取得して表示
		System.out.println("cの識別番号" + thirdInstance.getId());
		
	}

}
