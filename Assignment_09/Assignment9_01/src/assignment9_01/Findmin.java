package assignment9_01;
public class Findmin {
	static <T extends Number> T findmin(T[] arr)
	{
		T min=arr[0];
		for (T t : arr) {
			if(t.doubleValue()<min.doubleValue())
			{
				min=t;
			}
		}
		return min;
	}
	 static void main(String[] args) {
		Integer[] arr1= {12,33,54,44,55,2};
		Integer min1=findmin(arr1);
		System.out.println("Minimum in arr1:"+min1);
		
		System.out.println("-----------------------");
		
		Double[] arr2= {1.2,3.3,5.4,4.4,5.5,1.23};
		Double min2=findmin(arr2);
		System.out.println("Minimum in arr2:"+min2);
	}

}
