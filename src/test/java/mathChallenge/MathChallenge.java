package mathChallenge;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathChallenge {
	@Test
	public void test1() {
		String equ = "3x - 4 = 32";
		String x = findX(equ);
		Assert.assertEquals(x, "6");
		System.out.println(x);
	}

	@Test
	public void test2() {
		String equ = "5 + 4x = 46";
		String x = findX(equ);
		Assert.assertEquals(x, "1");
		System.out.println(x);
	}

	@Test
	public void test3() {
		String equ = "3 - 2 = x";
		String x = findX(equ);
		Assert.assertEquals(x, "1");
		System.out.println(x);
	}

	private String findX(String equ) {
		int ans = 0;
		String x = "";
		String[] eq = equ.split(" ");
		String op1 = eq[0];
		String op = eq[1];
		String op2 = eq[2];
		String res = eq[4];
		for (int i = 0; i < eq.length; i++) {
			System.out.println(eq[i]);
		}
		if (op1.contains("x")) {
			x = op1;
			if (op.contains("+")) {
				ans = (Integer.valueOf(res) - Integer.valueOf(op2));
			} else if (op.contains("-")) {
				ans = (Integer.valueOf(res) + Integer.valueOf(op2));
			} else if (op.contains("*")) {
				ans = (Integer.valueOf(res) / Integer.valueOf(op2));
			} else if (op.contains("/")) {
				ans = (Integer.valueOf(res) * Integer.valueOf(op2));
			}
		} else if (res.contains("x")) {
			x = res;
			if (op.contains("+")) {
				ans = (Integer.valueOf(op1) + Integer.valueOf(op2));
			} else if (op.contains("-")) {
				ans = (Integer.valueOf(op1) - Integer.valueOf(op2));
			} else if (op.contains("*")) {
				ans = (Integer.valueOf(op1) * Integer.valueOf(op2));
			} else if (op.contains("/")) {
				ans = (Integer.valueOf(op1) / Integer.valueOf(op2));
			}
		} else if (op2.contains("x")) {
			x = op2;
			if (op.contains("+")) {
				ans = (Integer.valueOf(res) - Integer.valueOf(op1));
			} else if (op.contains("-")) {
				ans = (Integer.valueOf(res) + Integer.valueOf(op1));
			} else if (op.contains("*")) {
				ans = (Integer.valueOf(res) / Integer.valueOf(op1));
			} else if (op.contains("/")) {
				ans = (Integer.valueOf(res) * Integer.valueOf(op1));
			}
		}
		char[] ans1 = String.valueOf(ans).toCharArray();
		char[] x1 = x.toCharArray();
		int l = 0;
		char result = 0;
		for (char i : x1) {
			if (i == 'x') {
				result = ans1[l];
				break;
			} else {
				l = l + 1;
			}
		}
		return String.valueOf(result);
	}
}
