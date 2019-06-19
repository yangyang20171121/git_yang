package cn.ccnu.xunfei;
import java.util.Scanner;
//01串，找出最长的交替子串
public class ZeroOneString {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        
	  
	        while (in.hasNext()) {
	            String str = in.next();
	            int maxLen = 1;
	            int len = 1;
	            for (int i = 1; i < str.length(); i++) {
	                if (str.charAt(i - 1) != str.charAt(i)) {
	                    len++;
	                    if (len > maxLen) {
	                        maxLen = len;
	                    }
	                } else {
	                    len = 1;
	                }
	            }
	            System.out.println(maxLen);
	        }
	    }

}
