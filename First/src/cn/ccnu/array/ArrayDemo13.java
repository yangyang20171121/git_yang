package cn.ccnu.array;
//将一个数插入排序好的数组中的合适的位置
public class ArrayDemo13 {
	public static void main(String args[]){
		int a[]=new int[7];
		int n=a.length;
		int b=12,count;
		for(int i=0;i<6;i++){
			a[i]=i*2+1;
		}
		System.out.println("插入前：");
		for(int i=0;i<n-1;i++){
			System.out.print(a[i]+"、");
		}
		for(count=0;count<n-1;count++){
			if(b<a[count])
				break;				
		}
		for(int j=n-2;j>=count;j--){
			a[j+1]=a[j];
		}
		a[count]=b;
		System.out.println("\n插入后:");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+"、");
		}
	}

	}
