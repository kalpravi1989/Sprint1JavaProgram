package mathChallenge;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathChallenge {
	@Test
	public void test1() {
		String equ = "3x+12=46";
		int x = findX(equ);
		Assert.assertEquals(x, 11);
		System.out.println(x);
	}

	@Test
	public void test2() {
		String equ = "2+4x=46";
		int x = findX(equ);
		Assert.assertEquals(x, 11);
		System.out.println(x);
	}

	@Test
	public void test3() {
		String equ = "3+12=3x";
		int x = findX(equ);
		Assert.assertEquals(x, 5);
		System.out.println(x);
	}
	private int findX(String equ) {
		int ans = 0;
		String[] eq = equ.split("[+=]");
		for (int i = 0; i < eq.length; i++) {
			System.out.println(eq[i]);
		}
		if (eq[0].contains("x")) {
			String s = eq[0].replace("x", "");
			ans = (Integer.valueOf(eq[2]) - Integer.valueOf(eq[1])) / Integer.valueOf(s);
		} else if (eq[2].contains("x")) {
			String s = eq[2].replace("x", "");
			ans = (Integer.valueOf(eq[0]) + Integer.valueOf(eq[1])) / Integer.valueOf(s);
		} else if (eq[1].contains("x")) {
			String s = eq[1].replace("x", "");
			ans = (Integer.valueOf(eq[2]) - Integer.valueOf(eq[0])) / Integer.valueOf(s);
		}
		return ans;
	}
}
