package curriculum.b;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		
		//Q1
		//for 文を使って 1 から 10 までの数字を 1 つずつ表示
		for(int i = 1; i <= 10; i++) {System.out.println(i);}
		
		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();
		
		
		//Q2
		//for 文を使って 2 から 20 までの 偶数 を 1 つずつ表示
		for(int i = 2; i <= 20; i = i + 2) {System.out.println(i);}
		
		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();
		
		//Q3 
		//for 文を使って 10 から 1 まで カウントダウンして表示
		for(int i = 10; i >= 1; i--) {System.out.println(i);}
		
		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();
		
		//Q4
		//for 文を使って 1 から 100 までの合計 を表示
		int sum = 0;
		for(int i = 1; i <= 100; i++) { sum = sum + i;}{System.out.println("1～10までの合計:"+ sum);}
		 
		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();
		
		
		//Q5
		//for 文を使って 三角形を出力
		for(int i = 1; i <= 5; i++ ) {
			String star = "";
			for(int j = 1; j <= i; j++) {
				star = star + "*";
			}
			System.out.println(star);
		}
		
		/*
		 * 	String star = "";
		 *  for(int i = 1; i <= 5; i++ ) {
			for(int j = 1; j <= i; j++) {
				star = star + "*";}
			System.out.println(star);
		    }
		    だとおかしい…　なぜ？？
		    →→starがループの外、中によってstarの初期値が変わる
		    外：リセットされない　中：リセットされる
		 */
		
		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();
		
		
		//Q6
		//while 文を使って 1 から 10 まで を 1 つずつ表示
		int i = 1;
		while (i <= 10) {System.out.println(i);
		i++;
		}
		
		
		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();
		
		
		//Q7
		//while 文を使って 2 から 20 までの偶数 を 1 つずつ表示
		int k = 1;
		while (k <= 10) {
		int num = 2 * k ;
		System.out.println( num );	
		k++;
		}
		
		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();
		
		//Q8
		//while 文を使って 10 から 1 まで のカウントダウンを表示
		int j =10;
		while (j >= 1) {
			System.out.println(j);
			j--;
		}
		
		//Q9
		//while 文を使って 1 から 100 までの合計 を表示
		int l = 1;
		int sum2 =0;
		while (l <=100) {
			sum2 = sum2 + l;
			l++;
		}
		System.out.println(sum2);
		
		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();
		
		//Q10
		//ユーザーから 数値をコンソール入力 してもらう
		Scanner scanner = new Scanner(System.in); 
		//入力が 0 になるまで 何度でも入力を受け付ける
		//0が入力されたら「終了しました」と表示
		System.out.println("数値を入力してください");
		int score = scanner.nextInt();  
		while (score != 0) {
		System.out.println("別の数値を入力してください");	
		score = scanner.nextInt();
		//↑※入れないと"別の数値を入力してください"がループする
		}
		if (score == 0) {
			System.out.println("終了しました");
		}
		
		/*
		 *問題の区切りとしての改行 
		 */
		System.out.println();
		
		//Q11
		//九九の左辺　ｍ（1～9）
		for (int m = 1; m <= 9; m++ ) {
			//九九の右辺　ｎ（1～9）
			for (int n = 1; n <= 9; n++) {
				int ququ = m * n;
				//十の位を0にするex)1→01
				String strM = "0" + m;
				String strN = "0" + n;
				//2桁はそのまま、1桁の解は十の位を0にするex)1→01
				String strQuqu = (ququ < 10) ?
				"0" + ququ : String.valueOf(ququ);
			   String output = strM + " * " +  strN + " = " + strQuqu ;
			   //形を整えた掛け算の式を出力 
			   System.out.print(output);
			    ////列の区切り
			   if (j < 9) {
				System.out.print(" || ");
			     }
			}
				//次の段の掛け算になるための改行
			    System.out.println();
			    //行間を開けるための改行
			    System.out.println();
			}
		}
	}
