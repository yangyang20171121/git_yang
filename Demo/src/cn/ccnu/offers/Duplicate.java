package cn.ccnu.offers;

public class Duplicate {
	public static void main(String[] args){
		int [] num={2,3,1,0,2,5,3};
		int m=getDuplicate(num);
		System.out.println(m);
	}
	public static int getDuplicate(int [] num){
		int m;
		if(num==null || num.length==0)
			return -1;
		for(int i=0;i<num.length;i++){
			while(num[i]!=i){
				if(num[i]==num[num[i]]);
				m=num[i];
				return m;
			}
			int temp=num[i];
			num[i]=num[temp];
			num[temp]=temp;
		}
		return -1;
	}

}
