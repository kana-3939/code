package curriculum.d;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		// 1. プレイヤーの設定
		System.out.print("Playerの名前を入力してください ");
		String pName = sc.nextLine();

		// ステータスをランダム設定
		int pHp = rand.nextInt(51) + 50;
		int pAt = rand.nextInt(11) + 10;
		int pSp = rand.nextInt(10) + 1;

		// 2. loadDaemonメソッドで配列 [名前, HP, AT, SP] が返ってくる想定
		String[] daemonData = loadDaemon();

		if (daemonData == null) {
			System.out.println("デーモンデータの読み込みに失敗しました。");
			return;
		}
		//[名前, HP, AT, SP]からデーモンのそれぞれの値に代入する
		String dName = daemonData[0];
		int dHp = Integer.parseInt(daemonData[1]);
		int dAt = Integer.parseInt(daemonData[2]);
		int dSp = Integer.parseInt(daemonData[3]);

		//　\n　は改行
		System.out.println("\n--- ステータス発表 ---");
		System.out.println(pName + " P[HP:" + pHp + " AT:" + pAt + " SP:" + pSp + "]");
		System.out.println(dName + " D[HP:" + dHp + " AT:" + dAt + " SP:" + dSp + "]");

		// 3. 先攻決定
		//ブーリアン　プレイヤーのターン＝isPlayerTurn
		boolean isPlayerTurn;
		//プレイヤーのほうがSPが高いとき
		if (pSp > dSp) {
			isPlayerTurn = true;
			//プレイヤーのほうがSPが低いとき
		} else if (dSp > pSp) {
			isPlayerTurn = false;
			// SPが同じならランダム
		} else {
			isPlayerTurn = rand.nextBoolean();
		}
		//ブーリアンで先攻側の名前を表示(三項演算子)
		System.out.println("先攻は " + (isPlayerTurn ? pName : dName) + " です！");

		// 4. バトルループ
		int turn = 1;
		//どちらかのHPが0になるまで繰り返す
		while (pHp > 0 && dHp > 0) {
			writeLog("\n--- Turn " + turn + " ---");
			if (isPlayerTurn) {
				// プレイヤーの攻撃
				dHp = dHp - pAt;
				if (dHp < 0)
					dHp = 0;
				writeLog(pName + " の攻撃！ " + dName + " に " + pAt + " のダメージ。 (残りHP: " + dHp + ")");
			} else {
				// デーモンの攻撃
				pHp = pHp - dAt;
				if (pHp < 0)
					pHp = 0;
				writeLog(dName + " の攻撃！ " + pName + " に " + dAt + " のダメージ。 (残りHP: " + pHp + ")");
			}
			if (pHp <= 0 || dHp <= 0)
				break;
			isPlayerTurn = !isPlayerTurn;
			turn = turn + 1;
		}

		// 5. 結果出力
		String winner = (pHp > 0) ? pName : dName;
		writeLog("\n勝者: " + winner + " !!");

		sc.close();
	}

	/**
	 * Daemonのステータスをテキストファイルから読み込むメソッド
	 */
	public static String[] loadDaemon() {
		// パスは画像に合わせて src/curriculum/d/ を指定（環境に合わせて調整してください）
		String path = "src/curriculum/d/daemon_status.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String name = br.readLine();
			String hp = br.readLine();
			String at = br.readLine();
			String sp = br.readLine();

			// 全てのデータが揃っているか確認
			if (name == null || hp == null || at == null || sp == null)
				return null;

			return new String[] { name, hp, at, sp };
		} catch (IOException e) {
			return null;
		}
	}

	/**
	 * バトルの結果をテキストファイルに出力するメソッド
	 * writeLogとは→コンソール（画面）への表示　+　ファイル（battle_log.txt）への追記
	 */
	public static void writeLog(String message) {
		//コンソール表示
		System.out.println(message);
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("src/curriculum/d/battle_log.txt", true)))) {
			//	ファイル（battle_log.txt）への追記
			pw.println(message);
			// ログ出力エラー
		} catch (IOException e) {
			System.err.println("ログの書き込みエラー: " + e.getMessage());
		}
	}
}