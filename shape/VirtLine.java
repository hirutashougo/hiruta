package shape;

/*
* クラス名:VirtLine
* 概要:垂直直線を表す
* 作成者:S.Hiruta
* 作成日:2024/05/27
*/
public class VirtLine extends AbstLine{
	
	/*
	 * コンストラクタ名：VirtLine
	 * 概要:垂直直線を生成する
	 * 引数：垂直直線の長さ(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public VirtLine(int length) {
		//指定された長さの直線を生成
		super(length);
	}
	
	/*
	 * メソッド名：toString
	 * 概要:垂直直線に関する図形情報を表す文字列を返却
	 * 引数：なし
	 * 戻り値：垂直直線に関する図形情報を表す文字列(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public String toString() {
		//垂直直線に関する図形情報を表す文字列を返却する
		return "VirtLine(length：" + getLength() + ")";
	}
	
	/*
	 * メソッド名：draw
	 * 概要:垂直直線を描画する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public void draw() {
		//指定長さ分、垂直直線を描画する
		for (int i = 0; i < getLength(); i++) {
			//垂直直線を描写していく
			System.out.println('|');
		}
	}

}
