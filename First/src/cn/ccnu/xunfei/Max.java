package cn.ccnu.xunfei;

import java.util.ArrayList;
//滑动窗口的最大值
public class Max {
	public static void main(String[] args){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int []n={2,3,4,2,6,2,5,1};
		int i=0,size=3,max;
        for(int j=i;j<i+size;j++){
            if(i+size<=n.length){
            max=getMax(n,i,i+size);
            arr.add(max);
            i++;
                }
        }
		System.out.println(arr);
	}
	public static int getMax(int [] num,int start,int end){
        int max=num[start];
        for(int i=start;i<end;i++){
            if(num[i]>max)
                max=num[i];
        }
        return max;
    }

}
