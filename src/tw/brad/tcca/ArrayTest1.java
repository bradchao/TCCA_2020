package tw.brad.tcca;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] a = new int[3];	// a[0]=0, a[1]=0, a[2]=0
		int[] b = new int[] {1,2,3,4};
		int[] c = {100, 102, 102, 103};
		
		int[] d;
		d = new int[] {3,4,5,6};
		
//		int[] e;
//		e = {3,4,5,6};
		
		for (int i=0; i<d.length; i++) {
			System.out.println(d[i]);
		}
		
	}

}
