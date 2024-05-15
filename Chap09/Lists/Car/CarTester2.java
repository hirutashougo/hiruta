package Chap09.Lists.Car;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:CarTester2
* 概要:車の情報と購入日を表示
* 作成者:S.Hiruta
* 作成日:2024/05/15
*/
public class CarTester2 {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：main
	 * 概要:車の情報と購入日を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public static void main(String[] args) {
		
		//
		Car myCar = new Car("愛車", "12345", 1885, 1490, 5220,  50, 2, 100, new Day(2010, 10, 15));
		
		//
		myCar.putSpec();
		//
		System.out.println("購入日:" + myCar.getPurchaseDay());
	}

}