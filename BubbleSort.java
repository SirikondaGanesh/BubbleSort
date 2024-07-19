//implimenting bubble-sort
package apjfsa;
//class declaration
public class BubbleSort {
    //main function
	public static void main(String[] args) {
		//array eliments
		int[] arr= {5,2,6,3,8,7};	
		//checking array eliments in order-wise
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//printing sorted eliments
		System.out.print("Array after sorting :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
