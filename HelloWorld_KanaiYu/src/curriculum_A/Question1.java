package curriculum_A;

public class Question1 {
	
	public static void main(String[] args) {
	    
		//Q1
		//バイト型
		byte byteNum =0;
		//短整数型
		short shortNum = 0;
		//整数型
		int intNum = 0;
		//長整数型
		long longNum = 0L;
		//単精度浮動小数点数型
		float floatNum =0.0f;
		//倍精度浮動小数点数型
		double doubleNum = 0.0;
		//文字型
		char letter = '\u0000';
		//文字列型
		String letters = null;
		//ブーリアン型
		boolean sample  = false;
		
		/*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
		
		//Q2
		//バイト型
		byteNum = 10;
		//短整数型
	    shortNum = 100;
		//整数型
		intNum = 1000;
		//長整数型
		longNum = 10000L;
		//単精度浮動小数点数型
		floatNum = 9.5f;
		//倍精度浮動小数点数型
		doubleNum = 10.5;
		//文字型
		letter = 'a';
		//文字列型
		letters = "ハロー";
		//ブーリアン型
		sample = true;
		
		/*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
		
		
		//Q3
		//11110を出力
		System.out.println(byteNum + shortNum + intNum + longNum);
		//20を出力/
		System.out.println( floatNum + doubleNum ); 
		//a ハロー true　を出力
		System.out.println( letter + letters + sample );
		//11130を出力
		System.out.println( byteNum + shortNum + intNum + longNum + floatNum + doubleNum );
		//小数点以外の数字を全てかける
		//E	（指数表記）のしたい %e%n
	    System.out.printf("%e%n",(double) (long) ( byteNum * shortNum * intNum * longNum));
	    //10.5割る100をする
	    System.out.println( doubleNum / shortNum);
	    //10引く100をする
	    System.out.println( byteNum - shortNum);
	    
	    /*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
	    
	    //Q4
	    // name という String型の変数を宣言
	    String name;
	    // その変数に "山田太郎" という値を代入
	    name = "山田太郎";
	    //こんにちは、山田太郎さん! を出力
	    System.out.println("こんにちは、" + name + "さん！");
	    
	    /*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
	    
	    //Q5
		// age という int型の変数 を宣言
	    int age;
	    //その変数に 25 を代入
	    age = 25;
	    //age変数を使用してコンソールに  年齢: 25歳 出力
	    System.out.println("年齢：" + age +"歳");
	    
	    /*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
	    
	    //Q6
		// num1 という int型の変数 を宣言し、10 を代入
	    int num1 = 10;
	    //num2 という int型の変数 を宣言し、5 を代入
	    int num2 = 5;
	    //num1 と num2 を足した結果を sum 代入
	    int sum = num1 +num2;
	    //num1 と num2 を足した結果を代入し、出力
	    System.out.println(sum);
	    
	    /*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
	    
	    //Q7
		// score という int型の変数 を宣言し、80 を代入
	    int score = 80;
	    //score に 20 を加える
	    score += 20;
	    //最終スコア: 100 を出力
	    System.out.println("最終スコア：" + score);
	    
	    /*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
	    
	    //Q8
		// price という double型の変数 を宣言し、99.99 を代入
	    double price = 99.99; 
	    //price を int型 に変換し、整数価格: 99 と出力
	    System.out.println("整数価格："+(int)price);
	    
	    /*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
	    //Q9
	    // String 型の変数 numStr に "123" を代入
	    String numStr = "123";
	    //numStr を int 型に変換
	    int numInt = Integer.parseInt(numStr);
	    //変換後の値: の後ろにnumStr + 10 した結果をコンソールに出力
	    System.out.println(numInt +":"+(numInt + 10));
	    
	    /*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
		//Q10
		// int 型の変数 num に 50 を代入
		int num =50;
		//num を String 型に変換し、"得点: 50点" の形で出力
		System.out.println("得点：" + String.valueOf(num) + "点");
		
		 /*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
		//Q11
		//int 型の変数 a に 10 を代入
		int a = 10;
		//int 型の変数 b に 20 を代入
		int b = 20;
		//a が b より小さいかどうかを boolean 変数 result に代入
	    boolean result = (a < b);
	    //result の値を出力
	    System.out.println( result );
	    
	    /*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
		//Q12
		//int 型の変数 x に 15 を代入
		int x = 15;
		//x が 10 以上なら "OK"、そうでなければ "NG" を出力
		String okOrNg =(x >= 10) ? "OK" : "NG";
		//結果出力
		System.out.println(okOrNg);
		
		/*
		 * 問題の区切りとなる改行
		 */
		System.out.println();
		
		//Q13
		 String text = "私はJavaが好きです。Javaは楽しい!";
		//「Java」 を 「Python」 に置き換えて出力
		System.out.println(text.replace("Java", "Python"));


	}
}
