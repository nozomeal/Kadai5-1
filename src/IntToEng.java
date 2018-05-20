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
    	//新しい文字列生成
    	//1の位
    	String s1="";
    	//10の位
    	String s10="";
    	//100の位
    	String s100="";
    	//1000の位
    	String s1000="";
    	
    	//if(n<=10) {//10以下の時
    	s1=onePlace(n%10);
    	if(10 < n && n < 100) {//10より大きいかつ100未満の時
    		s10=tenPlace(n/10);
    		if(s10=="ten") {//11,12...などイレギュラーな場合
    			s10=teen(n%10); 
    			s1="";
    		}
    		if(s10!="" && s1!="") s10+="-";
    		return s10+s1;
    		 
    	}else if(n >= 100 && n < 1000) {//100<=n<1000のとき
    		s100=onePlace(n/100)+" hundred ";
    		n=n-(n/100*100);
    		s10=tenPlace(n/10);
    		if(s10=="ten") {//11,12...などイレギュラーな場合
    			s10=teen(n%10); 
    			s1="";
    		}else if(s1 == "zero") {
    			s1="";
    		}
    		if(s10!="" && s1!="") s10+="-";
    		return s100+s10+s1;
    	}else if(n >= 1000 && n <= 10000) {//1000<=n<10000のとき
    		s1000=onePlace(n/1000)+" thousand";
    		s100=onePlace((n%1000)/100);
    		if(s100=="zero") {//イレギュラーな場合
    			s100="";
    		}else s100+=" hundred ";
    		n=n-(n/100*100);
    		s10=tenPlace(n/10);
    		if(s10=="ten") {//11,12...などイレギュラーな場合
    			s10=teen(n%10); 
    			s1="";
    			//if(n>10) s10="";
    		}else if(s10=="zero") {
    			s10="";
    		}
    		if(s10 != "ten" && s1 == "zero") {
    			s1="";
    		}
    		
    		if(s10!="" && s1!="") s10+="-";
    		if(s100!="") s1000+=" ";
    		else if(s10!="" | s1!="") s1000+=" ";
    		//return s1000+","+s100+","+s10+","+s1;
    		return s1000+s100+s10+s1;
    	}
        return "";
    	
    }
    
    static String onePlace(int n) {
    	String[] onePlace= {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
    	return onePlace[n];
    	/*switch(n) {
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
    	}*/
    }
    static String teen(int n) {
    	String teen[] = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eightteen","nineteen"};
    	for(int i=0;i<=9;i++) {
    		if(n==i) {
    			return teen[i];
    		}
    	}
    	/*switch(n) {
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
    	}*/
    	return "";
    }
    static String tenPlace(int n) {
    	String tenPlace[] = {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","ten"};
    	if(n==0) return "";
    	else return tenPlace[n-1];
    	/*switch(n) {
    	case 1:
    		return "ten";
    	case 2:
    		return "twenty-";
    	case 3:
    		return "thirty-";
    	case 4:
    		return "forty-";
    	case 5:
    		return "fifty-";
    	case 6:
    		return "sixty-";
    	case 7:
    		return "seventy-";
    	case 8:
    		return "eighty-";
    	case 9:
    		return "ninety-";
    	}*/
    }
}