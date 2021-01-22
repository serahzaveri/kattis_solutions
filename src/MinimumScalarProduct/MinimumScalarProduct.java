package MinimumScalarProduct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinimumScalarProduct {

	public static void main(String[] args) {
		// Kattis: Minimum Scalar Product
		
		Scanner scan = new Scanner(System.in);
		int testcases = scan.nextInt();
		for(int i=1; i<=testcases; i++) {
			int vectorSize = scan.nextInt();
			//we will store the vectors in 2 separate arraylists of Integer type
			ArrayList<Integer> v1 = new ArrayList<>();
			for(int m=0; m<vectorSize; m++) {
				v1.add(scan.nextInt());
			}
			ArrayList<Integer> v2 = new ArrayList<>();
			for(int n=0; n<vectorSize; n++) {
				v2.add(scan.nextInt());
			}
			//we not sort v1 and v2 in such a way that will produce the minimum scalar product when calculating
			Collections.sort(v1);
			Collections.sort(v2, Collections.reverseOrder());
			
			//we now calculate the minimum scalar product
			//we use BigInteger since the range of the values will be very high in this scenario
			BigInteger msp = new BigInteger("0");
			BigInteger first = new BigInteger("0");
			BigInteger second = new BigInteger("0");;
			for(int u=0; u<vectorSize; u++) {
				first = BigInteger.valueOf(v1.get(u));
				second = BigInteger.valueOf(v2.get(u));
				msp = msp.add(first.multiply(second));
			}
			System.out.println("Case #"+i+ ": "+msp);
		}
		scan.close();

	}

}
