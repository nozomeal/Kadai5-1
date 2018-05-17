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
    	String s="";
    	if(n<=10) {
    		s=onePlace(n);
    	}else if(n%10<10) {
    		
    	}
    	
        return s;
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
}
