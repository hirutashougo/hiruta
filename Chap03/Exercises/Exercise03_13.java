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
		
		
		//1つめの整数の入力と読み込み
		System.out.print("1つめの整数:");
		
		//入力された1つめの整数を読み込む
		int fiestIntegralNumber = standedImput.nextInt();
		
		//2つめの整数の入力と読み込み
		System.out.print("2つめの整数:");
		
		//入力された2つめの整数を読み込む
		int secondIntegralNumber = standedImput.nextInt();
		
		//3つめの整数の入力と読み込み
		System.out.print("3つめの整数:");
		
		//入力された3つめの整数を読み込む
		int thirdIntegralNumber = standedImput.nextInt();
		
		
		//3つの整数の合計から最大値と最小値を引くことで中央値を求める
		//まず、3つの整数の中から最大値を選び出す
		//最小値を1つめの整数で初期化
		int minimumNunber = fiestIntegralNumber;
		
		//2つめの整数が最小値( 初期状態:1つめの整数 )よりも小さい場合
		if ( secondIntegralNumber < minimumNunber ) {
			
			//2つめの整数を最小値に更新
			minimumNunber = secondIntegralNumber;
		}
		
		//3つめの整数が最小値よりも小さい場合
		if ( thirdIntegralNumber < minimumNunber ) {
			
			////3つめの整数を最小値に更新
			minimumNunber = thirdIntegralNumber;
		}
		
		
		//次に、3つの整数の中から最大値を選び出す
		//最大値を1つめの整数で初期化する
		int maximumNumber = fiestIntegralNumber;
		
		//2つめの整数が最大値( 初期状態:1つめの整数 )よりも大きい場合
		if ( secondIntegralNumber > maximumNumber ) {
			
			////3つめの整数を最大値に更新
			maximumNumber = secondIntegralNumber;
		}
		//3つめの整数が最大値よりも大きい場合
		if ( thirdIntegralNumber > maximumNumber ) {
			
			////3つめの整数を最大値に更新
			maximumNumber = thirdIntegralNumber;
		}
		
		//3つの整数の合計値から最大値と最小値を引くことで、中央値を求め出力する
		System.out.println("中央値は" + ((fiestIntegralNumber + secondIntegralNumber + thirdIntegralNumber) - minimumNunber - maximumNumber) + "です。");
		

	}

}