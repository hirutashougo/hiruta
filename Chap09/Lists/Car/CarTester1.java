package Chap09.Lists.Car;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:CarTester1
* 概要:車の購入日を表示
* 作成者:S.Hiruta
* 作成日:2024/05/15
*/
public class CarTester1 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：main
	 * 概要:車の購入日を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public static void main(String[] args) {
		
		//
		Day someDay = new Day(2010, 10, 15);
		//
		Car myCar = new Car("愛車", "12345", 1885, 1490, 5220,  50, 2, 100, someDay);
		
		//
		Day firstRewriteDay = myCar.getPurchaseDay();
		//
		System.out.println("愛車の購入日:" + firstRewriteDay);
		
		//
		firstRewriteDay.setData(1999, 12, 31);
		
		//
		Day secondRewriteDay = myCar.getPurchaseDay();
		//
		System.out.println("愛車の購入日:" + secondRewriteDay);
	}

}