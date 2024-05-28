package shape;

/*
* クラス名:Rectangle
* 概要:長方形を表す
* 作成者:S.Hiruta
* 作成日:2024/05/27
*/
public class Rectangle extends Shape implements Plane2D{

	//長方形をの幅を表すフィールドを宣言
	private int width;

	//長方形をの高さを表すフィールドを宣言
	private int height;

	/*
	 * コンストラクタ名：Rectangle
	 * 概要:長方形を生成する
	 * 引数：長方形の幅(int型),長方形の高さ(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public Rectangle(int width, int heigth) {
		//長方形の幅を表すフィールドを初期化
		this.width = width;
		//長方形の高さを表すフィールドを初期化
		this.height = heigth;
	}

	/*
	 * メソッド名：toString
	 * 概要:長方形に関する図形情報を表す文字列を返却
	 * 引数：なし
	 * 戻り値：長方形に関する図形情報を表す文字列(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public String toString() {
		//長方形に関する図形情報を表す文字列を返却する
		return "Rectangle(width：" + width + ", height：" + height + ")\n面積:" + getArea();
	}

	/*
	 * メソッド名：draw
	 * 概要:長方形を描画する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public void draw() {
		//指定高さ分、改行する
		for (int i = 0; i < height; i++) {
			//指定幅の分、記号を表示
			for (int j = 0; j < width; j++) {
				//長方形の描画のための記号を表示
				System.out.print("*");
			}
			//一列記号を表示して改行
			System.out.println();
		}
	}

	/*
	 * メソッド名：getArea
	 * 概要:長方形の面積を求める
	 * 引数：なし
	 * 戻り値：長方形の面積(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/28
	*/
	public int getArea() {
		//長方形の面積を求める
		return width * height;
	}
	
}
