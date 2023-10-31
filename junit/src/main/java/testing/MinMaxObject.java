package testing;

public class MinMaxObject {
	 static private int min;
	 static private int max;
 public MinMaxObject(int min,int max) {
	this.min=min;
	this.max=max;
 }
 public int getMin() {
	 return min;
 }
 public int getMax() {
	 return max;
 }
 public static MinMaxObject FindMinMax(int [] array) {
	  if (array == null || array.length == 0) {
         return null;
     }
	 min=array[0];
	 max=array[0];
	for(int i=0;i<array.length;i++) {
		if(array[i]<min) {
			min=array[i];
		}
		if(array[i]>max) {
			max=array[i];
			}
		}
	return new MinMaxObject(min,max);
}
}
