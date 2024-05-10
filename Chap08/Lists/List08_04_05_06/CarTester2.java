package Chap08.Lists.List08_04_05_06;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:CarTester2
* 概要:自動車のクラス【第一版】の利用例(その2：対話的に自動車を移動)
* 作成者:S.Hiruta
* 作成日:2024/05/09
*/
public class CarTester2 {

	/*
	 * 関数名：main
	 * 概要:入力された2種類の車の車幅・車高・車長の情報を元に
	 		燃料が切れるまで移動させる
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	public static void main(String[] args) {
		
		//Scannerクラスの変数の定義
		 Scanner standardInput = new Scanner(System.in);
		
		//
		System.out.println("車のデータを入力せよ。");
		//
		System.out.print("名前は：");
		//
		String name = standardInput.next();
		//
		System.out.print("車幅は：");
		//
		int width = standardInput.nextInt();
		//
		System.out.print("高さは：");
		//
		int heigth = standardInput.nextInt();
		//
		System.out.print("長さは：");
		//
		int length = standardInput.nextInt();
		//
		System.out.print("ガソリン量は：");
		//
		double fuel = standardInput.nextDouble();
		
		//
		Car myCar = new Car(name, width, heigth, length, fuel);
		
		//
		while (true) {
			//
			System.out.println("現地(" + myCar.getX() + ", " + myCar.getY() + ")残り燃料" + myCar.getFuel());
			//
			System.out.println("移動しますか[0…No/1…Yes]：");
			//
			if (standardInput.nextInt() == 0) {
				//
				break;
			}
			
			//
			System.out.print("X方向の移動距離：");
			//
			double dx = standardInput.nextDouble();
			//
			System.out.print("Y方向の移動距離：");
			//
			double dy  = standardInput.nextDouble();
			
			//
			if (!myCar.move(dx,dy)) {
				//
				System.out.println("燃料がありません!");
			}
					
		}
		
	}

}