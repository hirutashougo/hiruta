package Chap09.Lists.Car;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:CarTester3
* 概要:車の情報と購入日を表示
* 作成者:S.Hiruta
* 作成日:2024/05/15
*/
public class CarTester3 {

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
		System.out.println("車のデータを入力せよ");
		//
		System.out.print("名前；");
		//
		String carName = standardInput.next();
		//
		System.out.print("幅：");
		//
		int carWidth = standardInput.nextInt();
		//
		System.out.print("高さ：");
		//
		int carHeight = standardInput.nextInt();
		//
		System.out.print("長さ：");
		//
		int carLength = standardInput.nextInt();
		//
		System.out.print("ガソリン量：");
		//
		double carFuel = standardInput.nextDouble();
		//
		System.out.print("購入年：");
		//
		int purchaseYear = standardInput.nextInt();
		//
		System.out.print("購入月：");
		//
		int purchaseMonth = standardInput.nextInt();
		//
		System.out.print("購入日：");
		//
		int purchaseDate = standardInput.nextInt();
		
		//
		Car myCar = new Car(carName, "12345", carWidth, 
				carHeight, carLength, carFuel, 2, 100, new Day(purchaseYear, purchaseMonth, purchaseDate));
		//
		myCar.putSpec();
		System.out.println("購入日" + myCar.getPurchaseDay());
	}

}