package testing;

public class MinMaxFinder {
	
public int[] FindMinMax(int [] array) {
	  if (array == null || array.length == 0) {
          return null;
      }
	int min=array[0];
	int max=array[0];
	for(int i=0;i<array.length;i++) {
		if(array[i]<min) {
			min=array[i];
		}
		if(array[i]>max) {
			max=array[i];
			}
		}

	int [] resultArray= {min,max};
	return resultArray;
	}
	
}

