package Chap06.Exercises;

/*
 * クラス名:Exercise06_01
 * 概要:構成要素型がint型の配列(構成要素は５：newによって本体を生成)
 * 作成者:S.Hiruta
 * 作成日:2024/04/16
 */
public class Exercise06_01 {

	/*
	 * 関数名：main
	 * 概要:構成要素型がint型の配列(構成要素は５：newによって本体を生成 
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/16
	*/
	public static void main(String[] arg) {
		
		//要素数5のdouble型配列を宣言
		double [] doubleNumber = new double[5];
		
		//インデックス1に37を代入
		doubleNumber[1] = 37;
		//インデックス2に51を代入
		doubleNumber[2] = 51;
		//インデックス4に、インデックス1に2をかけた値を代入
		doubleNumber[4] = doubleNumber[1] * 2;
		
		//インデックス0に代入された値を表示
		System.out.println("doubleNumber[" + 0 + "] = " + doubleNumber[0]);
		//インデックス1に代入された値を表示
		System.out.println("doubleNumber[" + 1 + "] = " + doubleNumber[1]);
		//インデックス2に代入された値を表示
		System.out.println("doubleNumber[" + 2 + "] = " + doubleNumber[2]);
		//インデックス3に代入された値を表示
		System.out.println("doubleNumber[" + 3 + "] = " + doubleNumber[3]);
		//インデックス4に代入された値を表示
		System.out.println("doubleNumber[" + 4 + "] = " + doubleNumber[4]);
	}
}