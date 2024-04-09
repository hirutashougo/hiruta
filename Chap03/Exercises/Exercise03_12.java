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
		
		
		//1つめの整数の入力を促す
		System.out.print("1つめの整数:");
		
		//入力された1つめの整数を読み込む
		int firsIntegralNumber = standerdImput.nextInt();
		
		//2つめの整数の入力を促す
		System.out.print("2つめ整数:");
		
		//入力された2つめの整数を読み込む
		int secondIntegralNumber = standerdImput.nextInt();
		
		//3つめの整数の入力を促す
		System.out.print("3つめの整数:");
		
		//入力された3つめの整数を読み込む
		int thirdIntegralNumber = standerdImput.nextInt();
		
		//3つの整数の大小関係に応じて処理を行う
		//作業用の変数を1つめの整数で初期化する
		int replaceVariable = firsIntegralNumber;
		
		//2つめの整数が最小値( 初期状態:1つめの整数 )以下の場合
		if ( secondIntegralNumber <= replaceVariable ) {
			
			//2つめの整数を最小値に更新
			replaceVariable = secondIntegralNumber;
		}
		
		//3つめの整数が最小値以下の場合
		if ( thirdIntegralNumber <= replaceVariable ) {
			
			//3つめの整数を最小値に更新
			replaceVariable = thirdIntegralNumber;
		}
		
		//最小値を表示する
		System.out.println("最小値は" + replaceVariable + "です。");
		

	}

}