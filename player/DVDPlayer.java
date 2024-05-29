package player;

/*
* クラス名:DVDPlayer
* 概要：DVDを再生・停止・スロー再生する
* 作成者:S.Hiruta
* 作成日:2024/05/29
*/
public class DVDPlayer implements ExVideoPlayer{

	/*
	 * メソッド名：playVideo
	 * 概要: DVDの再生開始を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public void playVideo() {
		//DVDの再生開始を表示
		System.out.println("■DVD再生開始!");
	}

	/*
	 * メソッド名：stopVideo
	 * 概要:DVDの再生終了を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public void stopVideo() {
		//DVDの再生終了を表示
		System.out.println("■DVD再生終了!");
	}

	/*
	 * メソッド名：playSlow
	 * 概要:DVDのスロー再生開始を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public void playSlow() {
		//DVDのスロー再生開始を表示
		System.out.println("■DVDスロー再生開始!");
	}
}
