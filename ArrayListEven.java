import java.util.*;

public class ArrayListEven{
    ArrayList<Integer> list;
    public ArrayListEven (int[] ar){
        list = new ArrayList<Integer>();
		for(int i = 0; i < ar.length; i++){
	    	list.add(ar[i]);
		}
    }

    public boolean isEven(){
        for(int i = 0; i < list.size(); i++){
	    	if(list.get(i) % 2 != 0){
	        	return false;
	    	}
		}
		return true;
    }
}
