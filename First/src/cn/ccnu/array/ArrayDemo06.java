package cn.ccnu.array;
//将数组中的元素从小到大排列
public class ArrayDemo06 {
	public static void main(String args[]){
		int score[]={67,89,87,69,90,100,75,90};
		int temp;
		for(int i=0;i<score.length;i++){
			for(int j=i+1;j<score.length;j++){
				if(score[j]<score[i]){
					temp=score[i];
					score[i]=score[j];
					score[j]=temp;
				}
			}	
			System.out.print("第"+i+"次排序结果:");
			for(int a:score){
				System.out.print(" "+a);
			}
			System.out.println();
		}
//		for(int i=0;i<score.length;i++){
//			System.out.print(" "+score[i]);
//		}
		System.out.print("最终的排序结果:");
		for(int i:score){
			System.out.print(" "+i);
		}
			
	}

}
