package shape;

/*
* クラス名:HorzLine
* 概要:水平直線を表す
* 作成者:S.Hiruta
* 作成日:2024/05/27
*/
public class HorzLine extends AbstLine{
	
	/*
	 * コンストラクタ名：HorzLine
	 * 概要:水平直線を生成する
	 * 引数：水平直線の長さ(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public HorzLine(int length) {
		//指定された長さの直線を生成
		super(length);
	}
	
	/*
	 * メソッド名：toString
	 * 概要:水平直線に関する図形情報を表す文字列を返却
	 * 引数：なし
	 * 戻り値：水平直線に関する図形情報を表す文字列(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public String toString() {
		//水平直線に関する図形情報を表す文字列を返却する
		return "HorzLine(length：" + getLength() + ")";
	}
	
	/*
	 * メソッド名：draw
	 * 概要:水平直線を描画する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public void draw() {
		//指定長さ分、水平直線を描画する
		for (int i = 0; i < getLength(); i++) {
			//水平直線を描写していく
			System.out.print('-');
		}
		//描画後に改行
		System.out.println();
	}

}
