import java.util.Arrays;
import java.util.Scanner;

public class BestBubbleTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] ascArr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			ascArr[i] = arr[i];
		}

		int swapsAsc = countSwapsAscending(arr);
		Arrays.sort(ascArr);
		int swapsDesc = countSwapsDescending(arr);

		int minSwaps = Math.min(swapsAsc, swapsDesc);
		System.out.println(minSwaps);
	}

	private static int countSwapsAscending(int[] arr) {
		int[] tempArray = Arrays.copyOf(arr, arr.length);
		Arrays.sort(tempArray);
		int swaps = 0;
		for (int i = 0; i < arr.length; i++) {
			if (tempArray[i] != arr[i]) {
				swaps++;
			}
		}
		return swaps;
	}

	private static int countSwapsDescending(int[] arr) {
		int[] tempArray = Arrays.copyOf(arr, arr.length);
		Arrays.sort(tempArray);
		int swaps = 0;
		for (int i = 0; i < arr.length; i++) {
			if (tempArray[arr.length - i - 1] != arr[i]) {
				swaps++;
			}
		}
		return swaps;
	}
}
