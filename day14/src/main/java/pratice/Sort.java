package pratice;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {
	public static void main(String[] args) {
		Integer[] arr = {21,11,31,3,10,5};
		Arrays.sort(arr, new MySort(false));
		System.out.println(Arrays.toString(arr));
	}
}

class MySort implements Comparator{
	private boolean flag;
	
	public MySort(boolean flag) {
		super();
		this.flag = flag;
	}

	@Override
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Integer)){
			throw new ClassCastException();
		}
		
		if(!(o2 instanceof Integer)){
			throw new ClassCastException();
		}
		
		Integer a1 = (Integer)o1;
		Integer a2 = (Integer)o2;
		return flag ? a1 - a2 : a2 - a1;
	}
}
