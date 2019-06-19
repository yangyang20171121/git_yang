package cn.ccnu.xunfei;
//简单选择排序
public class XZSort {
	public static void main(String[] args){
		int []a={62,35,77,55,14,35,98};
		int n=a.length;
		SelectSort(a,n);
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		String s1=new String("xyz");
		String s2=new String("xyz");
		Boolean b1=s1.equals(s2);
		Boolean b2=(s1==s2);
		System.out.println(b1+" "+b2);
		
		String s="hello";
		String t="hello";
		char c[]={'h','e','l','l','o'};
		System.out.println(s.equals(t));
		System.out.println(t.equals(c));
		System.out.println(s==t);
		System.out.println(t.equals(new String("hello")));
	}
	public static void SelectSort(int [] num,int n){
		int temp;
		for(int i=0;i<n-1;i++){
			int k=i;
			for(int j=i+1;j<n;j++)
				if(num[j]<num[k])
					k=j;
			if(k!=i){
			temp=num[i];
			num[i]=num[k];
			num[k]=temp;
			}				
		}
	}

}
