package shape;

/*
* クラス名:Shape
* 概要:図形の概念を表わす
* 作成者:S.Hiruta
* 作成日:2024/05/27
*/
public abstract class Shape {
	
	/*
	 * メソッド名：toString
	 * 概要:図形情報を表す文字列を返却
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public abstract String toString();
	
	/*
	 * メソッド名：draw
	 * 概要:図形を描画する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public abstract void draw();
	
	/*
	 * メソッド名：print
	 * 概要:図形情報の表示と図形の描画を行う
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public void print() {
		//図形情報を表示
		System.out.println(toString());
		//図形を描画
		draw();
	}
}
