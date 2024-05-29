package pet;

/*
* クラス名:RobotPet
* 概要：ロボットペットに関する情報を管理する
* 基底クラス：Pet
* 作成者:S.Hiruta
* 作成日:2024/05/29
*/
public class RobotPet extends Pet implements PetSkinnable {

	/*
	 * コンストラクタ名：RobotPet
	 * 概要:ロボットペットに関する情報を生成
	 * 引数：ロボットペットの名前,飼い主の名前(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public RobotPet(String petName, String masterName) {
		//スーパーコンストラクタを呼び出して情報を初期化
		super(petName, masterName);
	}

	/*
	 * メソッド名：introducePet
	 * 概要:ロボットペットに関する情報を紹介する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public void introducePet() {
		//ペットの名前を紹介
		System.out.println("◇僕の名前は" + getPetName() + "。");
		//飼い主の生を紹介
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}

	/*
	 * メソッド名：doHouseWork
	 * 概要:洗濯に応じて家事を実行する
	 * 引数：実行する家事を表す数字(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public void doHouseWork(int chooseWork) {
		//掃除の実行を表す定数を宣言
		final int CHOOSE_CLEANING = 0;
		//洗濯の実行を表す定数を宣言
		final int CHOOSE_WASHING = 1;
		//炊事の実行を表す定数を宣言
		final int CHOOSE_COOKING = 2;

		//選択に応じて家事を実行する
		switch (chooseWork) {
		//掃除が選択された場合
		case CHOOSE_CLEANING:
			//掃除の実行を宣言
			System.out.println("掃除します。");
			//処理を終了
			break;
		//洗濯が選択された場合
		case CHOOSE_WASHING:
			//洗濯の実行を宣言
			System.out.println("洗濯します。");
			//処理を終了
			break;
		//炊事が選択された場合
		case CHOOSE_COOKING:
			//炊事の実行を宣言
			System.out.println("炊事します。");
			//処理を終了
			break;
		}
	}

	/*
	 * メソッド名：changSkin
	 * 概要:衣装を着せ替える
	 * 引数：着せ替えたい衣装を表す数字(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public void changeSkin(int skinColor) {
		//漆黒の衣装を表す数字を定数化
		final int BLACK_SKIN = 0;
		//深紅の衣装を表す数字を定数化
		final int RED_SKIN = 1;
		//露草の衣装を表す数字を定数化
		final int GREEN_SKIN = 2;
		//柳葉の衣装を表す数字を定数化
		final int BLUE_SKIN = 3;
		//ヒョウ柄の衣装を表す数字を定数化
		final int LEOPARD_SKIN = 4;
		//衣装の着用を予告する
		System.out.print("スキンを");
		//衣装の色に応じた文言を表示する
		switch (skinColor) {
		//漆黒の衣装の場合
		case BLACK_SKIN:
			//漆黒と表示
			System.out.print("漆黒");
			//処理を終了
			break;
		//深紅の衣装の場合
		case RED_SKIN:
			//深紅と表示
			System.out.print("深紅");
			//処理を終了
			break;
		//露草の衣装の場合
		case GREEN_SKIN:
			//露草と表示
			System.out.print("露草");
			//処理を終了
			break;
		//柳葉の衣装の場合
		case BLUE_SKIN:
			//柳葉と表示
			System.out.print("柳葉");
			//処理を終了
			break;
		//ヒョウ柄の衣装の場合
		case LEOPARD_SKIN:
			//ヒョウ柄と表示
			System.out.print("ヒョウ柄");
			//処理を終了
			break;
		//どの衣装も選択しない場合
		default:
			//無地と表示
			System.out.print("無地");
			//処理を終了
			break;
		}
		//衣装の変更を宣言
		System.out.println("に変更しました。");
	}
}
