package shape;

/*
* クラス名:Point
* 概要:点を表す
* 作成者:S.Hiruta
* 作成日:2024/05/27
*/
public class Point extends Shape{
	
	/*
	 * コンストラクタ名：Point
	 * 概要:何もしない
	 * 引数：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public Point() {
		
	}
	
	/*
	 * メソッド名：toString
	 * 概要:点に関する図形情報を表す文字列を返却
	 * 引数：なし
	 * 戻り値：点に関する図形情報を表す文字列(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public String toString() {
		//文字列"Point"を返却する
		return "Point";
	}
	
	/*
	 * メソッド名：draw
	 * 概要:点を描画する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public void draw() {
		//'+'を表示
		System.out.println('+');
	}

}
