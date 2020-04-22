package lockdown.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversArray {
	public static void main(String[] args) {
	int ary[]={32,14,56,12,31,65};
	//for loop	

	for(int i=ary.length-1;i>=0;i--){
		System.out.print(ary[i]+" ");
		
		//By using list
		List <int[]> list= new ArrayList<>();
		list=Arrays.asList(ary);
		
		Collections.reverse(list);
		
		
		
	}
	}
}
