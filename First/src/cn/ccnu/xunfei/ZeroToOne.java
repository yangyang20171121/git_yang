package cn.ccnu.xunfei;
import java.util.Scanner;
/**
 * 
 * 给定一个数组metrix，数组中只包含1和0，且数组中的1都不相邻，输入一个数n，
 * 问能否在将数组中n个0替代换成1后不破坏1都不相邻的条件。
例1 metrix=[1,0,0,0,1],n=1输出true
例2 metrix=[1,0,0,0,1],n=2输出false
输入一个数m(1≤m≤100000)表示metrix的长度
第二行m个数 0或1 表示改位置数组中的元素是0还是1
第三行输入一个数n

输出true或false
 *
 */
public class ZeroToOne {
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] num=new int[m];
        for(int i=0;i<m;i++){
            num[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<num.length-1;i++){
            if(num[i]==0){
                if(num[i-1]==0 && num[i+1]==0)
                    count++;
            }
        }
        if(n<=count)
            System.out.println("true");
        else
            System.out.println("false");
    }

}
