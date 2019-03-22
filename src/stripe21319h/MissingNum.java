package stripe21319h;

import java.util.stream.IntStream;

public class MissingNum {
	
	public MissingNum(){}
	
	public int search(int[] numArray) {
		
		for(int x = 1; x < numArray.length+1; x++) {
			final int y = x;
			if(!IntStream.of(numArray).anyMatch(a -> a == y)) {
				return x;
			}
		}
		return numArray.length+1;
	}

}
