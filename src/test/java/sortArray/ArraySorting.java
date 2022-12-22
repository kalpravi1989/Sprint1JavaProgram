package sortArray;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraySorting {
	private int[] sorting(int[] num) {
		int temp;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		return num;
	}
	@Test
	public void test1() {
		int[] num = { 2, 5, 1, 9, 7 };
		int[] ans = sorting(num);
		int[] exp = { 9, 7, 5, 2, 1 };
		for (int i = 0; i < num.length; i++) {
			System.out.print(ans[i] + "  ");
			Assert.assertEquals(ans[i], exp[i]);
		}
		System.out.println();
	}

	@Test
	public void test2() {
		int[] num = { 1, 1, 1 };
		int[] ans = sorting(num);
		int[] exp = { 1, 1, 1 };
		for (int i = 0; i < num.length; i++) {
			System.out.print(ans[i] + "  ");
			Assert.assertEquals(ans[i], exp[i]);
		}
		System.out.println();
	}

	@Test
	public void test3() {
		int[] num = { 0, 0, 0 };
		int[] ans = sorting(num);
		int[] exp = { 0, 0, 0 };
		for (int i = 0; i < num.length; i++) {
			System.out.print(ans[i] + "  ");
			Assert.assertEquals(ans[i], exp[i]);
		}
		System.out.println();
	}

	@Test
	public void test4() {
		int[] num = { 2 };
		int[] ans = sorting(num);
		int[] exp = { 2 };
		for (int i = 0; i < num.length; i++) {
			System.out.print(ans[i] + "  ");
			Assert.assertEquals(ans[i], exp[i]);
		}
		System.out.println();
	}


}
