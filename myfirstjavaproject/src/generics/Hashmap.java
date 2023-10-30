package generics;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class Hashmap {

	public static void main(String[] args) {
		Map<Integer,Double> obj=new HashMap<Integer,Double>();
        for(int i=0;i<=10;i++) {
        	Random obj1=new Random();
        	int key=obj1.nextInt(10);
        	double value=obj1.nextDouble(10);
        	obj.put(key,value);
        }
        for(Map.Entry<Integer,Double> e :obj.entrySet()) {
        	System.out.println("["+e.getKey()+":"+e.getValue()+"]");
        }
	}

}
