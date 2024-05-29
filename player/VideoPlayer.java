package player;

/*
* インターフェース名:VideoPlayer
* 概要:ビデオの再生と停止を行う
* 作成者:S.Hiruta
* 作成日:2024/05/29
*/
public interface VideoPlayer {

	/*
	 * 関数名：playVideo
	 * 概要:ビデオを再生する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public void playVideo();
	
	/*
	 * 関数名：stopVideo
	 * 概要:ビデオを停止する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public void stopVideo();
}
