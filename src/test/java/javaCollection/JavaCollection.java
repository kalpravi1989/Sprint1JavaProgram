package javaCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaCollection {

	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> list = new ArrayList<String>();
		map.put("fruit", list);
		map.get("fruit").add("mango");
		map.get("fruit").add("apple");
		System.out.println(map);

	}

}
