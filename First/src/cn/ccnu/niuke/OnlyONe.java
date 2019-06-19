package cn.ccnu.niuke;

public class OnlyONe {
	public static void main(String args[]){
	int a[]={1,2,3,2,5};
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]!=a[j])
				continue;	
		}
		System.out.print(a[i]+" ");
	}
	}

}
