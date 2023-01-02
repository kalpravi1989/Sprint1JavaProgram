package gradeGenerator;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class GradeGenerator {
	@Test
	public void test1() {
		Map<String, Integer> actualGrade = actualGrade();
		Map<String, Integer> makeupGrade = makeupGrade();
		Map<String, Integer> finalGrade = generateGrade(actualGrade, makeupGrade);
		System.out.println(finalGrade);

	}

	public Map<String, Integer> generateGrade(Map<String, Integer> actualGrade, Map<String, Integer> makeupGrade) {
		Map<String, Integer> finalmark = new HashMap<String, Integer>();
		for (Entry<String, Integer> entry : actualGrade.entrySet()) {
			String name = entry.getKey();
			if (actualGrade.get(name) <= makeupGrade.get(name)) {
				finalmark.put(name, makeupGrade.get(name));
			} else if (actualGrade.get(name) > makeupGrade.get(name)) {
				finalmark.put(name, actualGrade.get(name));
			}
		}
		return finalmark;
	}

	public Map<String, Integer> makeupGrade() {
		Map<String, Integer> mk = new HashMap<String, Integer>();
		mk.put("lizzy", 80);
		mk.put("rose", 67);
		mk.put("trace", 70);
		return mk;
	}

	public Map<String, Integer> actualGrade() {
		Map<String, Integer> ac = new HashMap<String, Integer>();
		ac.put("lizzy", 59);
		ac.put("rose", 90);
		ac.put("trace", 70);
		return ac;
	}

}
