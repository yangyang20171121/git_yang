package cn.ccnu.array;
//求最大值，最小值
public class ArrayDemo05 {
	public static void main(String args[]){
		int score[]={67,89,87,69,90,100,75,90};
		int max;
		int min;
		max=min=score[0];
		for(int i=1;i<score.length;i++){
			max=max>score[i]?max:score[i];
			min=min<score[i]?min:score[i];
		}
		System.out.println("最大值为:"+max);
		System.out.println("最小值为:"+min);
	}

}
