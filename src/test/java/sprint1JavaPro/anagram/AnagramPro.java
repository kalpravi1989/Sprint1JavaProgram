package sprint1JavaPro.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnagramPro {


	@Test
	public void test1() {
		String str = "kakbab";
		List<String> ans = anagram(str);
		System.out.println(ans);
		List<String> exp = Arrays.asList("kak", "bab");
		for (int i = 0; i < ans.size(); i++) {
			Assert.assertEquals(ans.get(i), exp.get(i));
		}

	}

	@Test
	public void test2() {
		String str = "";
		List<String> ans = anagram(str);
		System.out.println(ans);
		List<String> exp = Arrays.asList();
		for (int i = 0; i < ans.size(); i++) {
			Assert.assertEquals(ans.get(i), exp.get(i));
		}

	}

	@Test
	public void test3() {
		String str = "xyz";
		List<String> ans = anagram(str);
		System.out.println(ans);
		List<String> exp = Arrays.asList();
		for (int i = 0; i < ans.size(); i++) {
			Assert.assertEquals(ans.get(i), exp.get(i));
		}

	}


	private List<String> anagram(String str) {
		List<String> ls = new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			for (int k = 0; k < (str.length() - i); k++) {
				String s = str.substring(k, k + i + 1);
				StringBuffer sb = new StringBuffer(s);
				if (s.contentEquals(sb.reverse()) && s.length() > 2) {
					ls.add(s);
				}
			}
		}

		return ls;
	}

}
