package curriculum.b;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {

		//Q1	
		//int 型の配列 を作成し、1, 2, 3, 4, 5 を格納する
		int[] numbersQ1 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(numbersQ1));
		//配列の全要素を 順番に表示 
		//要素は１つ目が"0"
		for (int i = 0; i < numbersQ1.length; i++) {
			int j = numbersQ1[i];
			System.out.println(j);
		}

		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();

		//		Q2 int 型の配列 {10, 20, 30, 40, 50} を用意する
		int[] numbersQ2 = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(numbersQ2));
		//		配列の要素を 逆順 に表示
		for (int i = numbersQ2.length - 1; i >= 0; i--) {
			int k = numbersQ2[i];
			System.out.println(k);
		}

		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();

		//		Q3 int 型の配列 {3, 5, 7, 9, 11} を用意する
		int[] numbersQ3 = { 3, 5, 7, 9, 11 };
		System.out.println(Arrays.toString(numbersQ3));
		//初期値　合計(sumQ3)=0
		int sumQ3 = 0;
		////	配列の全要素の 合計値 を計算し、表示
		for (int i = 0; i < numbersQ3.length; i++) {
			int k = numbersQ3[i];
			sumQ3 = sumQ3 + k;
		}
		System.out.println("合計値:" + sumQ3);

		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();

		//		Q4 int 型の配列 {12, 7, 9, 21, 5, 18} を用意する
		int[] numbersQ4 = { 12, 7, 9, 21, 5, 18 };
		System.out.println(Arrays.toString(numbersQ4));
		//		配列の 最大値と最小値 を求めて表示
		int maxQ4 = numbersQ4[0];
		int minQ4 = numbersQ4[0];
		for (int i = 1; i < numbersQ4.length; i++) {
			if (numbersQ4[i] > maxQ4) {
				maxQ4 = numbersQ4[i];
			}
			if (numbersQ4[i] < minQ4) {
				minQ4 = numbersQ4[i];
			}
		}
		System.out.println("最大値:" + maxQ4 + " 最小値:" + minQ4);

		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();

		//		Q5 int 型の配列 {1, 2, 3, 4, 5} を用意する
		int[] numbersQ5 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(numbersQ5));
		//		配列のすべての要素を 2 倍 し、結果を表示
		//		結果を表示する際の処理に拡張for文を使用してください
		for (int numQ5 : numbersQ5) {
			numQ5 *= 2;
			System.out.println(numQ5);
		}

		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();

		//		Q6 int 型の配列 {4, 7, 10, 15, 20} を用意する
		int[] numbersQ6 = { 4, 7, 10, 15, 20 };
		System.out.println(Arrays.toString(numbersQ6));
		//		ユーザーがコンソール入力した数が 配列に含まれているか を判定し、結果を表示
		Scanner scanner = new Scanner(System.in);
		System.out.println("数を入力してください");
		int num = scanner.nextInt();
		//		結果：（”入力した値”は配列に含まれています／含まれていません）
		boolean isContained = false;
		for (int numQ6 : numbersQ6) {
			if (numQ6 == num) {
				// 含まれていた場合
				isContained = true;
				break;
			}
		}
		//		//１回のコンソール入力のみの場合
		//		if (isContained == true) {
		//			System.out.println(num + "は配列に含まれています");
		//			//			scanner.close();
		//		} else {
		//			System.out.println(num + "は配列に含まれていません");
		//		}

		// もし含まれていなかった際に繰り返す場合
		while (isContained == false) {
			System.out.println(num + "は配列に含まれていません");
			System.out.println("別の数値を入力してください");
			num = scanner.nextInt();
			for (int numQ6 : numbersQ6) {
				if (numQ6 == num) {
					// 含まれていた場合
					isContained = true;
					break;
				}
			}

		}
		if (isContained == true) {
			System.out.println(num + "は配列に含まれています");
			scanner.close();
		}

		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();

		//		Q7 2次元配列 int[][] array = {{1, 2}, {3, 4}, {5, 6}}; を用意する
		//		配列の すべての要素を表示
		int[][] arrayQ7 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		System.out.println(Arrays.deepToString(arrayQ7));
		// 外側のループで「行」を取り出す
		for (int i = 0; i < arrayQ7.length; i++) {
			// 内側のループで「列」（個々の要素）を取り出す
			for (int j = 0; j < arrayQ7[i].length; j++) {
				// array[i][j] が個々の要素にアクセスしている
				System.out.print(arrayQ7[i][j] + " ");
			}
			//  array[i][j] + " "
			//　↑↑並べて表示　+　文字同士の空間
			// 1行の表示が終わったら改行する
			System.out.println();
		}

		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();

		//		Q8 2次元配列 int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; を用意する
		int[][] arrayQ8 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		System.out.println(Arrays.deepToString(arrayQ8));
		//		配列の すべての要素の合計値を表示
		int sum = 0;
		for (int[] row : arrayQ8) { // 各行を取り出す
			for (int element : row) { // 行から各要素を取り出す
				sum += element; // 
			}
		}
		// 4. 結果の表示
		System.out.println("配列のすべての要素の合計値 : " + sum);

		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();

		//		Q9 2次元配列 int[][] array = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}}; を用意する
		int[][] arrayQ9 = { { 12, 15, 8 }, { 6, 19, 25 }, { 30, 2, 10 } };
		System.out.println(Arrays.deepToString(arrayQ9));
		int max = arrayQ9[0][0];
		int min = arrayQ9[0][0];
		//		配列内の 最大値と最小値 を求めて表示
		// 各行を取り出す
		for (int[] row : arrayQ9) {
			// 行から各要素を取り出す
			for (int element : row) {
				// 最大値
				if (element > max) {
					max = element;
				}
				// 最小値
				if (element < min) {
					min = element;
				}
			}
		}
		System.out.println("配列内の最大値 : " + max);
		System.out.println("配列内の最小値 : " + min);

		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();

		//		Q10 3次元配列 int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}; を用意する
		int[][][] arrayQ10 = { { { 1, 2 }, { 3, 4 } },
				{ { 5, 6 }, { 7, 8 } } };

		System.out.println(Arrays.deepToString(arrayQ10));
		//		配列内のすべての要素を 表示
		for (int[][] black : arrayQ10) {
			// 行から各要素を取り出す
			for (int[] row : black) {
				for (int element : row) {
					System.out.println(element);
				}
			}

		}
	}
}
