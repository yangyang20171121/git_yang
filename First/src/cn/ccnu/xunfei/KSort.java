package cn.ccnu.xunfei;

//快速排序，升序{48,62,35,77,55,14,35,98}
public class KSort {
	public static void main(String[]args){
		int []a={1,2,3,4,8,7,6,10,32};
		int n=a.length;
		QKSort(a,0,n-1);
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void QKSort(int []num,int low,int high){
		if(low<high){//这句判断不能掉
		int pos=QKPass(num,low,high);//升序时，基准以左小于等于基准；基准以右大于等于基准
		QKSort(num,low,pos-1);//对左边序列调用快排
		QKSort(num,pos+1,high);//对右边序列调用快排
		}
		
	}
	//快速排序核心
	public static int QKPass(int []num,int low,int high){
		int x=num[low];//保存基准
		while(low<high){
			while(low<high && num[high]>=x)
				high--;	//从右往左找到比基准小的
			if(low<high){
			num[low]=num[high];//赋值给空单元
			low++;
			}
			
			while(low<high && num[low]<x)
				low++;//从左往右找到比基准大的
			if(low<high){
			num[high]=num[low];
			high--;
			}
			
		}
		num[low]=x;//将基准记录保存到low=high的位置
		return low;//返回基准的位置
	}

}

