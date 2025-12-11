package curriculum_B;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		
		//Q1
		
		// int 型の変数 score に 75 を代入
		int score = 75;
		//score が 60 以上なら "合格です！" と表示
		if (score >= 60) {System.out.println("合格です！");}
		
		/*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
		//Q2
		//int 型の変数 age に 25 を代入
		int age = 25;
		//age が 20 以上 30 以下なら "適正年齢です" と表示
		if (age >= 20 && age <= 30) {System.out.println("適正年齢です");}
		//それ以外の場合は "対象外です" と表示
		else {System.out.println( "対象外です" );}
		
		/*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
		//Q3
		//3 int 型の変数 age に 18 を代入
		age = 18;
		//age が 20 以上なら "成人です" と表示
		if (age >= 20) {System.out.println("成人です");}
		//age が 13 以上 19 以下なら "ティーンエイジャーです" と表示
		else if (age >= 13 && age <= 19) {System.out.println("ティーンエイジャーです");}
		//age が 12 以下なら "子供です" と表示
		else {System.out.println( "子供です" );}
		
		/*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
		//Q4
		//int 型の変数 x, y, z に 30, 15, 50 を代入
		 int x = 30;
		 int y = 15;
		 int z = 50;
		 //xとyで大きい砲をmaxに代入
		 int preMax = (x > y) ? x : y ;
		 //preMaxとzの大きいほうをmaaxに代入
		 int max = (preMax > z) ? preMax : z ;
		//一番大きい数値を判定して表示
		System.out.println("xyzの中で一番大きい数："+ max);
		 
		/*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
		//Q5
		//int 型の変数 num を用意　コンソール入力でいずれかの値を代入し
		int num = 1 ;
		//num の値が 0 より大きければ "正の数です" と表示
		if (num > 0) {System.out.println("正の数です");
		}
		//num の値が 0 なら "0 です" と表示
		else if (num == 0) {System.out.println("0です");
		}
		//num の値が 0 より小さければ "負の数です" と表示
		else  {System.out.println("負の数です");}
		
		/*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
		//Q6
		//int 型の変数 value を用意　コンソール入力でいずれかの値を代入し
		int value = 5;
		//value が 偶数 なら "偶数です" と表示
		if (value % 2 == 0) {System.out.println("偶数です");}
		//value が 奇数 なら "奇数です" と表示
		else {System.out.println("奇数です");}
		
		/*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
		//Q7
		// int 型の変数 score にコンソール入力で 0 から 100 のいずれかの数値を代入し
		System.out.println("0～100で点数を入力してください");
		Scanner scanner = new Scanner(System.in); 
		score = scanner.nextInt();  
		//90 以上なら "優"
		if (score >= 90) {System.out.println( "優");} 
		//70 以上なら "良"
		else if (score >= 70) {System.out.println( "良");}
		//50 以上なら "可"
		else if (score >= 50) {System.out.println( "可");}
		//50 未満なら "不可"　を表示
		else {System.out.println("不可");}
		
		/*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
		//Q8
		//コンソール入力が null または空文字（""）のとき「入力が無効です」と表示する
		System.out.println("コンソール入力してください");
		Scanner scanner1 = new Scanner(System.in); 
		String input = scanner1.nextLine();  
		//「入力が無効です」と表示する
		if (input == null || input.isEmpty()) {System.out.println("入力が無効です");}
		// int 型の変数 day を用意（コンソール入力で1～7 のいずれかの数値を代入）
		System.out.println("1～7の数値を入力してください");
		Scanner scanner2 = new Scanner(System.in); 
		int day = scanner2.nextInt(); 
		//day の値に応じて曜日を表示
		switch (day) {
		case 1 :
			System.out.println("月曜日");
			break;
		case 2 :
			System.out.println("火曜日");
			break;
		case 3 :
			System.out.println("水曜日"); 
			break;
		case 4 :
			System.out.println("木曜日"); 
			break;
		case 5 :
			System.out.println("金曜日");
			break;
		case 6 :
			System.out.println("土曜日");
			break;
		case 7 :
			System.out.println("日曜日");
			break;
		default :
			System.out.println("無効な入力です");
			break;
		}
		
		/*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
		//Q10 
		//int 型の変数 month を用意（コンソール入力で1～12 のいずれかの数値を代入）
		System.out.println("1～12のいずれかの数値をコンソール入力してください");
		Scanner  scanner3  = new Scanner(System.in); 
		int month  =  scanner3 .nextInt();  
		//month の値に応じて季節を表示
		switch (month){
			case 12 :
			case 1 :
			case 2 :
				System.out.println("冬");
			    break;
			case 3 :
			case 4 :
			case 5 :
				System.out.println("春");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("夏");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("秋");
				break;}
		
			}
}


