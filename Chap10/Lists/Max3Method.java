package Chap10.Lists;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Max3Method
* 概要：3つの整数の中から最大のものを表示
* 作成者:S.Hiruta
* 作成日:2024/05/16
*/
public class Max3Method {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	* クラス名:DayPeriodTester
	* 概要:3つの整数の中から最大のものを表示
	* 作成者:S.Hiruta
	* 作成日:2024/05/16
	*/
	static int max(int firstInteger, int secondInteger, int thirdInteger) {
		//
		int maximumInteger = firstInteger;
		//
		if (secondInteger > maximumInteger) {
			//
			maximumInteger = secondInteger;
		}
		//
		if (thirdInteger > maximumInteger) {
			//
			maximumInteger = thirdInteger;
		}
		//
		return maximumInteger;
	}

	/*
	* クラス名:main
	* 概要:3つの整数の中から最大のものを表示
	* 作成者:S.Hiruta
	* 作成日:2024/05/16
	*/
	public static void main(String[] args) {
		
		//
		System.out.print("整数a：");
		//
		int firstInteger = standardInput.nextInt();
		
		//
		System.out.print("整数b：");
		//
		int secondInteger = standardInput.nextInt();
		
		//
		System.out.print("整数c：");
		//
		int thirdInteger = standardInput.nextInt();
		
		//
		System.out.println("最大値は" + max(firstInteger, secondInteger, thirdInteger) + "です。");
	}
}
