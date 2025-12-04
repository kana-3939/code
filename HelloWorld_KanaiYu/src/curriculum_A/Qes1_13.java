package curriculum_A;

public class Qes1_13 {
	
	public static void main(String[] args) {
	    
		/*
		 * 課題1　
		 */
		//バイト型
		byte byteType;
		//短整数型
		short shortType;
		//整数型
		int intType;
		//長整数型
		long longType;
		//単精度浮動小数点数型
		float floatType;
		//倍精度浮動小数点数型
		double doubleType;
		//文字型
		char charType;
		//文字列型
		String StringType;
		//ブーリアン型
		boolean booleanType;
		
		/*
		 * 課題2　
		 */
		//バイト型
		byte a = 10;
		//短整数型
	    short b = 100;
		//整数型
		int c= 1000;
		//長整数型
		long d = 10000L;
		//単精度浮動小数点数型
		float fl = 9.5F;
		//倍精度浮動小数点数型
		double dou = 10.5;
		//文字型
		char ch = 'a';
		//文字列型
		String St = "ハロー";
		//ブーリアン型
		boolean bo = true;
		
		/*
		 * 課題3
		 */
		//バイト型
		a = 10;
		//短整数型
		b = 100;
		//整数型
		c = 1000;
		//長整数型
		d = 10000;
		//単精度浮動小数点数型
		fl = 9.5F;
		//倍精度浮動小数点数型
		dou = 10.5;
		//文字型
		ch = 'a';
		//文字列型
		St = "ハロー";
	    //ブーリアン型
		bo = true;
		
		/*
		 * 課題4
		 */
		//11110を出力
		long e = (a + b + c + d);
		System.out.println( e );
		//20を出力/
		double f =( fl + dou );
		System.out.println( f); 
		//a ハロー true　を出力
		String mozi = ( ch + St + bo);
		System.out.println( mozi);
		//11130を出力
		long sum = ( e + (long )f);
		System.out.println( sum);
		//小数点以外の数字を全てかける
	    long mul = (long) ( a * b * c * d);
		//E	（指数表記）のしたい %e%n
	    System.out.printf("%e%n",(float) mul);
	    //10.5割る100をする
	    double div = ( dou / b);
	    System.out.println( div);
	    //10引く100をする
	    int sub = (a - b);
	    System.out.println( sub);
	    
	    /*
	     * 課題5
	     */
	    //「ハローJAVA43」を表示させる
	    String num="20";
	    int num1=23;
	    //文字型から数値型へ
	    System.out.println("ハローJAVA"+(Integer.parseInt(num)+num1));
	    
	    /*
	     * 課題6
	     */
	    //代入
	    String name = "山田太郎";
	    int age = 18;
	    float height = 170.5F;
	    float weight = 62.2F;
	    String food = "寿司";
	    //出力
	    System.out.println("初めまして" + name + "です");
	    System.out.println("年齢は" + age + "です");
	    System.out.println("身長は"+ height +"㎝です");
	    System.out.println("体重は"+ weight +"㎏です");
	    System.out.println("好きな食べ物は"+ food +"です");
	    
	    /*
	     * 課題7　BMIを出力させる
	     * BMI＝体重（㎏）/身長（ｍ）**２
	     */
	    //まず身長の単位をｃｍからｍに変換する
	    double height_m = (height / 100.0);
	    //BMIの計算
	    double bmi = weight / (height_m * height_m);
	    //小数第二位まで表示させる
	    String formattedBmi = String.format("%.2f", bmi);
	    System.out.println("BMIは" + formattedBmi +"です");
	    
	    
	    /*
	     * 課題8　再代入
	     */
	    //代入
	    name = "鈴木一郎";
	    age = 24;
	    height = 168.5F;
	    weight = 64.2F;
	    food = "オムライス";
	    //まず身長の単位をｃｍからｍに変換する
	    height_m = (height / 100.0);
	    //BMIの計算
	    bmi = weight / (height_m * height_m);
	    //小数第二位まで表示させる
	    System.out.println("BMIは" + formattedBmi +"です");
	    
	   
	    //出力
	    System.out.println("初めまして" + name + "です");
	    System.out.println("年齢は" + age + "です");
	    System.out.println("身長は"+ height +"㎝です");
	    System.out.println("体重は"+ weight +"㎏です");
	    System.out.println("好きな食べ物は"+ food +"です");
	    System.out.println("BMIは" +  formattedBmi +"です");

	    /*
	     * 課題9
	     */
	    age += 24;
	    height += 168.5;
	    weight += 64.2;
	    //まず身長の単位をｃｍからｍに変換する
	    height_m = (height / 100.0);
	    //BMIの計算
	    bmi = weight / (height_m * height_m);
	    //小数第二位まで表示させる
	    System.out.println("BMIは" + formattedBmi +"です");
	   
	     //出力
	    System.out.println("初めまして" + name + "です");
	    System.out.println("年齢は" + age + "です");
	    System.out.println("身長は"+ height +"㎝です");
	    System.out.println("体重は"+ weight +"㎏です");
	    System.out.println("好きな食べ物は"+ food +"です");
	    System.out.println("BMIは" +  formattedBmi +"です");

	    /*
	     * 課題10 25歳以上でtrue
	     */
	    boolean  olderThanTwentyfive = (age >= 25);  //true
	    System.out.println("10.鑑定結果　" + olderThanTwentyfive); 
	    //　↑↑↑System.out.println(age >= 25); でもできる 
	    
	    /*
	     * 課題11　文字型へ
	     */
	    String strAge = String.valueOf(age);
	    String strHeight = String.valueOf(height);
	    String strWeight = String.valueOf(weight);
	    System.out.println( strAge +"・" + strHeight + "・" + strWeight);
	    
	    /*
	     * 課題12　整数型へ
	     * int intAge =  Integer.parseInt(strAge);
	    int intHeight =  Integer.parseInt(strHeight); は NumberFormatException になった
	     */
	    double douAge =  Double.parseDouble(strAge);
	    double douHeight = Double.parseDouble(strHeight);
	    int intAge = (int) douAge;
	    int intHeight = (int) douHeight;
	    System.out.println(intAge + "・" + intHeight);
	    
	    /*
	     * 課題13　条件①’年齢が25’もしくは条件②’身長が160以上’でtrue
	     */
	    boolean result = (intAge == 25)||(intHeight >= 160);
	    System.out.println("13.鑑定結果 " + result);
		    
	}

}
