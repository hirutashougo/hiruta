package Chap02.Exercises;
/*
 * クラス名:Exercise02_01
 * 概要:int型に実数を代入する試み
 * 作成者:S.Hiruta
 * 作成日:2024/04/01
 */
public class Exercise02_01 {
	/*
	 *関数名:main
	 *概要:int型に実数を代入する試み
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/01
	 */
	public static void main(String[] args) {
		//xを初期値0でint型の変数( 変数xは教科書準拠 )
		int x = 0;
		//yを初期値0でint型の変数( 変数yは教科書準拠 )
		int y = 0;
		
		//xに63.3を代入
		x = 63.3;
		//yに18.2を代入
		y = 18.2;
		//int型変数には整数値しか入らない為エラー
		
		//コンソールにxの値を出力して終了
		System.out.println("xの値は" + x + "です。");
		//コンソールにyの値を出力して終了
		System.out.println("yの値は" + y + "です。"); 
		//コンソールにxとyの合計値を出力して終了
		System.out.println("合計は" + ( x + y ) + "です。");
		//コンソールにxとyの平均値を出力して終了
		System.out.println("平均は" + ( x + y ) / 2 + "です。");
	}

}
        
