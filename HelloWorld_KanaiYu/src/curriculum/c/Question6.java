package curriculum.c;

import java.util.Random;
import java.util.Scanner;

//Q1
public class Question6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();

		// 手の名称を管理する配列
		String[] hands = { "グー", "チョキ", "パー" };

		System.out.println("じゃんけんゲームスタート！");
		boolean isWin = false;
		while (!isWin) {
			// 1. ユーザーの入力
			System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
			int playerHand = scanner.nextInt();

			// 入力値が0〜2以外の場合は再入力
			if (playerHand < 0 || playerHand > 2) {
				System.out.println("0, 1, 2のいずれかを入力してください。");
				continue;
			}

			// 2. CPUの手をランダムに生成
			//↓↓0～2の三種類の数字がランダムで選ばれる
			int cpuHand = rand.nextInt(3);

			// 3. 双方の手を出力
			System.out.println("あなたの手: " + hands[playerHand]);
			System.out.println("CPUの手: " + hands[cpuHand]);

			// 4. 勝敗判定
			// (自分の手 - 相手の手 + 3) % 3 の結果：
			// 0 = あいこ  1 = 負け  2 = 勝ち
			int result = (playerHand - cpuHand + 3) % 3;

			if (result == 2) {
				System.out.println("あなたの勝ち！");
				// 勝った場合は終了
				break;
			} else if (result == 1) {
				System.out.println("あなたの負け。もう一度！");
			} else {
				System.out.println("あいこです。もう一度！");
			}
			System.out.println("--------------------");
		}
	}
}
