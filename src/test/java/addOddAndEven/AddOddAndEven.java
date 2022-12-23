package addOddAndEven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddOddAndEven {
	@Test
	public void test1() {
		int num = 2345678;
		int[] ans = addnum(num);
		int[] exp = { 20, 15 };
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
			Assert.assertEquals(ans[i], exp[i]);
		}
	}

	@Test
	public void test2() {
		int num = 24682;
		int[] ans = addnum(num);
		int[] exp = { 22, 0 };
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
			Assert.assertEquals(ans[i], exp[i]);
		}
	}

	@Test
	public void test3() {
		int num = 375311;
		int[] ans = addnum(num);
		int[] exp = { 0, 20 };
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
			Assert.assertEquals(ans[i], exp[i]);
		}
	}

	@Test
	public void test4() {
		int num = 0;
		int[] ans = addnum(num);
		int[] exp = { 0, 0 };
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
			Assert.assertEquals(ans[i], exp[i]);
		}
	}
	private int[] addnum(int num) {
		String n = String.valueOf(num);
		String[] x = n.split("");
		System.out.println(n);
		int[] ans = new int[2];
		int sumeven = 0;
		int sumodd = 0;
		for (int i = 0; i < x.length; i++) {

			if (Integer.valueOf(x[i]) % 2 == 0) {

				sumeven = sumeven + Integer.valueOf(x[i]);
			} else {
				sumodd = sumodd + Integer.valueOf(x[i]);
			}
		}
		ans[0] = sumeven;
		ans[1] = sumodd;
		return ans;
	}
}
