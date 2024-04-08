package Chap04.Exercises;

/*
 * クラス名:Exercise04_05
 * 概要：式の評価順が左→右であることを確認(前置増分演算子を用いて
 * 作成者:S.Hiruta
 * 作成日:2024/04/08
 */
public class Exercise04_05 {
	
	/*
     * 関数名：main
     * 概要：式の評価順が左→右であることを確認(前置増分演算子を用いて
     * 引数：なし
     * 戻り値：なし
     * 作成者：hiruta
     * 作成日：2024/04/08
    */
    
    public static void main(String[] args) {
    	
    	//変数aを初期状態3で定義(変数aは教科書準拠)
    	int a = 3;
    	/*変数xの式を定義
    	 (変数xは教科書準拠,後置増分演算子から前置増分演算子に変更)*/
    	int x = (++a) * (2 + a);
    	
    	//変数aの値を表示
    	System.out.println("a = " + a);
    	//変数xの値を表示
    	System.out.println("x = " + x);
    }
    /*式の評価が左から右に行われているため、
     変数xの値が4*(2+4)=24となっている*/
    
}