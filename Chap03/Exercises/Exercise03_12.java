package Chap03.Exercises;

//読み込んだ三つの整数のうち、最小値を表示
//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_12
 * 概要:読み込んだ三つの整数のうち、最小値を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise03_12 {
	
	/*
	 *関数名:main
	 *概要:読み込んだ三つの整数のうち、最小値を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/02
	 */
	public static void main(String[] args) {
		
		//Scannerクラスの変数の定義
		Scanner standerdImput = new Scanner(System.in);
		
		//整数aの入力を促す
		System.out.print("整数a:");
		//入力された整数aを読み込む
		int integralNumberA = standerdImput.nextInt();
		//整数bの入力を促す
		System.out.print("整数b:");
		//入力された整数bを読み込む
		int integralNumberB = standerdImput.nextInt();
		//整数cの入力を促す
		System.out.print("整数b:");
		//入力された整数cを読み込む
		int integralNumberC = standerdImput.nextInt();
		
		//仮に、最小値を整数aで初期化する
		int minimumNumber = integralNumberA;
		//整数Bが最小値( 初期状態:整数A )よりも小さい場合
		if ( integralNumberB < minimumNumber ) {
			//整数Bを最小値に更新
			minimumNumber = integralNumberB;
		}
		//整数Cが最小値よりも小さい場合
		if ( integralNumberC < minimumNumber ) {
			//整数Cを最小値に更新
			minimumNumber = integralNumberC;
		}
		
		//最小値を表示する
		System.out.println("最小値は" + minimumNumber + "です。");
		

	}

}