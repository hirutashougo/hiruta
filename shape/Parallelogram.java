package shape;

/*
* クラス名:Parallelogram
* 概要:平行四辺形を表す
* 作成者:S.Hiruta
* 作成日:2024/05/28
*/
public class Parallelogram extends Shape implements Plane2D{

	//平行四辺形の底辺の幅を表すフィールドを宣言
	private int parallelogramWidth;
	//平行四辺形の高さを表すフィールドを宣言
	private int parallelogramHeight;
	
	/*
	 * コンストラクタ名：Parallelogram
	 * 概要:平行四辺形を生成する
	 * 引数：平行四辺形の高さと幅(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/28
	*/
	public Parallelogram(int parallelogramWidth, int parallelogramHeight) {
		//平行四辺形の幅を初期化
		this.parallelogramWidth = parallelogramWidth;
		//平行四辺形の高さを初期化
		this.parallelogramHeight = parallelogramHeight;
	}
	
	/*
	 * メソッド名：toString
	 * 概要:平行四辺形に関する図形情報を表す文字列を返却
	 * 引数：なし
	 * 戻り値：平行四辺形に関する図形情報を表す文字列(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/28
	*/
	public String toString() {
		//直線に関する図形情報を表す文字列を返却する
		return "Parallelogram(width：" + parallelogramWidth + ", height：" + parallelogramHeight + ")\n面積:" + getArea();
	}
	
	/*
	 * メソッド名：draw
	 * 概要:平行四辺形を描画
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/28
	*/
	public void draw() {
		//平行四辺形の高さ分処理を繰り返す
		for(int i = 0; i < parallelogramHeight; i++) {
			//平行四辺形の横に空白を表示
			for(int j = 0; j < parallelogramHeight - i; j++) {
				//空白を表示
				System.out.print("  ");
			}
			//平行四辺形の実態となる記号を表示
			for(int j = 0; j < parallelogramWidth; j++) {
				//記号を表示
				System.out.print('＃');
			}
			//空白と記号を表示し終えたら改行
			System.out.println();
		}
	}
	
	/*
	 * メソッド名：getArea
	 * 概要:平行四辺形の面積を求める
	 * 引数：なし
	 * 戻り値：平行四辺形の面積(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/28
	*/
	public int getArea() {
		//平行四辺形の面積を求める
		return parallelogramWidth * parallelogramHeight;
	}
}
