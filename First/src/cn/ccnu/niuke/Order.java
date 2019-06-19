package cn.ccnu.niuke;
//把数组中的奇数放在前半部分，偶数放在后半部分,
//没管奇数和奇数的相对位置，偶数和偶数的相对位置
public class Order {
	public static void main(String[] args){
		int arr[]={2,3,4,5,6,1};
		int i=0;
		int j=arr.length-1;
		int temp;
		while(i<j){
			if(arr[i]%2==1){
				i++;
				continue;
			}
			if(arr[j]%2==0){
				j--;
				continue;
			}
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		for(int n=0;n<arr.length;n++){
			System.out.print(arr[n]+"、");
		}

	}
}
