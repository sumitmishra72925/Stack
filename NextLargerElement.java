package Stack;

import java.util.Scanner;
/*Given an array A [ ] having distinct elements, the task is to find the next greater element for each element of the 
 * array in order of their appearance in the array. 
 * If no such element exists, output -1
 * 
 *  Input
1
4
1 3 2 4 

Output
3 4 4 -1

Explanation
In the array, the next larger element to 1 is 3 , 3 is 4 , 2 is 4 and for 4 ? since it doesn't exist hence -1.*/

public class NextLargerElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,3,2,4};
		int n = arr.length;
		solution(arr, n);

	}

	// Method 1 Using Stack in O(1) complexity

	public static void solution(int[] arr, int n) {

		Stack st = new Stack(n);

		st.push(arr[0]);

		for (int i = 1; i < n; i++) {

			int curr = arr[i];
			if (!st.Isempty()) {
				int pop = st.pop();
				if (curr > pop) {

					while (curr > pop) {

						System.out.print(curr + " ");

						if (st.Isempty() == true)
							break;
						pop=st.pop();

					}

				}
				if(curr<pop) {
					st.push(pop);
				
				}
			}
			st.push(curr);

		}
		while (st.Isempty() == false) {
			st.pop();
			System.out.print(-1);
		}

	}
	// method 2 Using 2 Loops with O(n^2) complexity

}
