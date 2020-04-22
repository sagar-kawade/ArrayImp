package lockdown.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMethods {
/*arrays method
 * sort()
 * toString()
 * equals()
 * aslist()
 * fill()
*/	

public static void main(String[] args) {
	//sort()
	int ary[]={1,2,4,15,11,5};	

	Arrays.sort(ary);
	//toString()
	String str1=Arrays.toString(ary);
	System.out.println(str1);
	
	List<int[]> list=new ArrayList<>();
	list=Arrays.asList(ary);
	
	
	for(int[] a:list){
		System.out.print(a+" ");
	}
	System.out.println();
		//asList() array to List
	String strary[]={"Ram","amr","Piya","Riya"};
	ArrayList<String> arylist= new ArrayList<String>(Arrays.asList(strary));
	
	for(String al:arylist){
		System.out.print(al+" ");
	}
	
	//list to array 
	String arry[]= new String[arylist.size()];
	arylist.toArray(arry);
	System.out.println();
	for(String s:arry){
		
		System.out.print(s+" ");
	}
	
	
}
}
