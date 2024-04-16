package Chap05.Lists;

/*
 * クラス名:List05_02
 * 概要:float型とdouble型の精度が有限であることを確認
 * 作成者:S.Hiruta
 * 作成日:2024/04/15
 */
public class List05_02 {
	
	/*
	 * 関数名：main
	 * 概要:float型とdouble型の精度が有限であることを確認
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/15
	*/
    public static void main(String[] arg) {
    	float a = 123456789;
    	double b = 1234567890123456789L;
    	
    	System.out.println("a = " + a);
    	System.out.println("b = " + b);
    }
}