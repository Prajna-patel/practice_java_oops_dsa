package DSA_in_90_days;

import java.util.*;

public class Arrays_04 {

	public static void main(String[] args) {
		HashMap<ArrayList, Integer> hashMap = new HashMap<ArrayList, Integer>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				ArrayList<Integer> arr=new ArrayList();
				for(int k=i;k<=j;k++) {
					arr.add(a[k]);
				}
				int sum = 0;
		        for (int element : arr) {
		            sum += element;
		        }
		        hashMap.put(arr,sum);
		        
			}
		}
		int maxValue = Integer.MIN_VALUE;

        for (int value : hashMap.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
//        for (Map.Entry<ArrayList, Integer> entry : hashMap.entrySet()) {
//            ArrayList key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println("Key: " + key + ", Value: " + value);
//        }
//        
//        System.out.println(maxValue);
        ArrayList foundKey = searchKeyByValue(hashMap, maxValue);
//        System.out.println(foundKey);
        Integer[] array = arrayList.toArray(new Integer[0]);
		

	}
	private static ArrayList searchKeyByValue(HashMap<ArrayList, Integer> map, int value) {
        for (Map.Entry<ArrayList, Integer> entry : map.entrySet()) {
            if (entry.getValue() == value) {
                return entry.getKey();
            }
        }
        return null; // Key not found for the given value
    }

}
