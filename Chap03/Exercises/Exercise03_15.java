package Chap03.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_15
 * 概要:二つの変数を大きい順にソート
 * 作成者:S.Hiruta
 * 作成日:2024/04/03
 */
public class Exercise03_15 {
	
	/*
	 *関数名:main
	 *概要:二つの変数を大きい順にソート
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/03
	 */
	public static void main(String[] arg) {
		
		//入力ストリームの指定
		Scanner standerdImput = new Scanner(System.in);
		//
		System.out.print("整数a:");
		//
		int integralNumberA = standerdImput.nextInt();
		//
		System.out.print("整数b:");
		//
		int integralNumberB = standerdImput.nextInt();
		
		
		if ( integralNumberA < integralNumberB ) {
			//
			int assignmentValue = integralNumberA;   
			//
			integralNumberA = integralNumberB;       
			//
			integralNumberB = assignmentValue;       
		}
		
		
		//
		System.out.println("a≧bとなるようにソートしました。" );
		//
		System.out.println("変数aは" + integralNumberA + "です。" );
		//
		System.out.println("変数bは" + integralNumberB + "です。" );
		
	}
	
}