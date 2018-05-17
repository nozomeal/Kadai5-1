import java.util.Scanner;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("数字を入力してね！");
        int input = sc.nextInt();
        System.out.println(translateEng(input));
        //System.exit();
    }

    
    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	//新しい文字列
    	String s1="";
    	String s10="";
    	//if(n<=10) {//10以下の時
    	s1=onePlace(n%10);
    	if(10 < n && n < 100) {//10より大きいかつ100未満の時
    		s10=tenPlace(n/10);
    		if(s10=="ten") {s10=teen(n%10); s1="";}
    	}
        return s10+s1;
    }
    
    static String onePlace(int n) {
    	switch(n) {
    	case 0:
    		return "zero";
    	case 1:
    		return "one";
    	case 2:
    		return "two";
    	case 3:
    		return "three";
    	case 4:
    		return "four";
    	case 5:
    		return "five";
    	case 6:
    		return "six";
    	case 7:
    		return "sevent";
    	case 8:
    		return "eight";
    	case 9:
    		return "nine";
    	case 10:
    		return "ten";
    	}
    	return "";
    }
    
    static String teen(int n) {
    	switch(n) {
    	case 0:
    		return "ten";
    	case 1:
    		return "eleven";
    	case 2:
    		return "twelve";
    	case 3:
    		return "thirteen";
    	case 4:
    		return "fourteen";
    	case 5:
    		return "fifteen";
    	case 6:
    		return "sixteen";
    	case 7:
    		return "seventeen";
    	case 8:
    		return "eighteen";
    	case 9:
    		return "nineteen";
    	}
    	return "";
    }
    static String tenPlace(int n) {
    	switch(n) {
    	case 1:
    		return "ten";
    	case 2:
    		return "twenty";
    	case 3:
    		return "thirty";
    	case 4:
    		return "forty";
    	case 5:
    		return "fifty";
    	case 6:
    		return "sixty";
    	case 7:
    		return "seventy";
    	case 8:
    		return "eighty";
    	case 9:
    		return "ninety";
    	}
    	return "";
    }
}
