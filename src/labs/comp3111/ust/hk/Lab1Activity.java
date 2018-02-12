package labs.comp3111.ust.hk;

public class Lab1Activity {
	public static void main(String[]args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int k:arr) sum+=k;	
		int min=arr[0],max=arr[0];
		for(int k:arr) {
			if(min>k)min=k;
			if(max<k)max=k;
			}
		System.out.println(String.format("Sum of the numbers is %d", sum));
		System.out.println("Min = "+min+"; Max = "+max);
	}
	
}
