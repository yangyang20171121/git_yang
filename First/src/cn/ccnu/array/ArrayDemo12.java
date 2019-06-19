package cn.ccnu.array;
//数组赋值并倒置输出
public class ArrayDemo12 {
	public static void main(String args[]){
		int a[]=new int[10];
		for(int i=0;i<a.length;i++){
			a[i]=i;
			System.out.print(a[i]+"、");
		}
		System.out.println("\n倒置数组之后：");
		for(int i=a.length-1;i>=0;i--){
			System.out.print(a[i]+"、");
		}
	}

}
