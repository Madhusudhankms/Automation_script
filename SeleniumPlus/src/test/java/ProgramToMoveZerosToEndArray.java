import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ProgramToMoveZerosToEndArray {

	public static void main(String[] args) {
		

		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		Arrays.sort(arr);
		Integer[] newArray = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArray[i] = Integer.valueOf(arr[i]);
		}
		
		Collections.reverse(Arrays.asList(newArray));
		System.out.println(Arrays.asList(newArray));

	}
}
