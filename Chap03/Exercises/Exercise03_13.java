package Chap03.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_13
 * 概要:読み込んだ三つの整数のうち、中央値を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise03_13 {
	
	/*
	 *関数名:main
	 *概要:読み込んだ三つの整数のうち、中央値を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/02
	 */
	public static void main(String[] args) {
		
		//Scannerクラスの変数の定義
		Scanner standedImput = new Scanner(System.in);
		
		//整数aの入力と読み込み
		System.out.print("整数a:");
		//入力された整数aを読み込む
		int integralNumberA = standedImput.nextInt();
		//整数bの入力と読み込み
		System.out.print("整数b:");
		//入力された整数bを読み込む
		int integralNumberB = standedImput.nextInt();
		//整数cの入力と読み込み
		System.out.print("整数c:");
		//入力された整数cを読み込む
		int integralNumberC = standedImput.nextInt();
		
		//仮に、最小値を整数Aで初期化
		int minimumNunber = integralNumberA;             
		//整数Bが最小値( 初期状態:整数A )よりも小さい場合
		if ( integralNumberB < minimumNunber ) {
			//整数Bを最小値に更新
			minimumNunber = integralNumberB;
		}
		//整数Cが最小値よりも小さい場合
		if ( integralNumberC < minimumNunber ) {
			////整数Cを最小値に更新
			minimumNunber = integralNumberC;
		}
		
		//仮に、最大値を整数aで初期化する
		int maximumNumber = integralNumberA;             
		//整数Bが最大値( 初期状態:整数A )よりも大きい場合
		if ( integralNumberB > maximumNumber ) {
			////整数Cを最大値に更新
			maximumNumber = integralNumberB;
		}
		//整数Cが最大値よりも大きい場合
		if ( integralNumberC > maximumNumber ) {
			////整数Cを最大値に更新
			maximumNumber = integralNumberC;
		}
		
		//3つの整数の合計値から最大値と最小値を引くことで、中央値を求め出力する
		System.out.println("中央値は" + ((integralNumberA + integralNumberB + integralNumberC) - minimumNunber - maximumNumber) + "です。");
		

	}

}