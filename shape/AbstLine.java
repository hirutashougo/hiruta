package shape;

/*
* クラス名:AbstLine
* 概要:直線を表す
* 作成者:S.Hiruta
* 作成日:2024/05/27
*/
public abstract class AbstLine extends Shape{
	
	//直線を表すint型のフィールドを宣言
	private int length;
	
	/*
	 * コンストラクタ名：AbstLine
	 * 概要:直線を生成する
	 * 引数：直線の長さ(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public AbstLine(int length) {
		//指定された長さの直線を生成
		setLength(length);
	}
	
	/*
	 * メソッド名：getLength
	 * 概要:直線の長さを取得
	 * 引数：なし
	 * 戻り値：直線の長さ(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public int getLength() {
		//直線の長さを返却する
		return length;
	}
	
	/*
	 * メソッド名：setLength
	 * 概要:直線の長さを設定するメソッド
	 * 引数：設定する直線の長さ(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public void setLength(int length) {
		//直線の長さを設定する
		this.length = length;
	}
	
	/*
	 * メソッド名：toString
	 * 概要:直線に関する図形情報を表す文字列を返却
	 * 引数：なし
	 * 戻り値：直線に関する図形情報を表す文字列(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public String toString() {
		//直線に関する図形情報を表す文字列を返却する
		return "AbstLune(length：" + length + ")";
	}

}
