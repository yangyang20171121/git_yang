package cn.ccnu.xuanhuan;
//13-23+33-43+...+973-983+993-1003
public class Sum {
	public static void main(String args[]){
		int sum=0;
		int temp;
		for(int i=1;i<=100;i++){
			temp=i*10+3;
			if(i%2==0)
				temp=-temp;
			sum+=temp;
		}
		System.out.println("13-23+33-43+...+973-983+993-1003="+sum);
	}

}
