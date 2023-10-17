package assignment9_02;
import java.util.*;
public class Genricsort {
    static <T> void selectionSort(T[] arr, Comparator<T> c) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (c.compare(arr[i], arr[j]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
        }
    }

    public static void main(String[] args) {
    	
    	class SelectionSortComprator implements Comparator<Double>
    	{

			@Override
			public int compare(Double S1, Double S2) {
				if(S1>S2)
					return 1;
				else
				return 0;
			}
    		
    	}
        Double[] doubleArray = { 4.5, 2.1, 8.5, 9.4, 7.3 };
        
        SelectionSortComprator Comparator=new SelectionSortComprator();
 
        
        System.out.println("before sort :");
        for (Double e : doubleArray) {
			System.out.println(e);
		}
        selectionSort(doubleArray,Comparator);
        System.out.println("After sort :");
        for (Double e : doubleArray) {
			System.out.println(e);
		}

        
    }
}
