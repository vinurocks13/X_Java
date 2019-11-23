package Logical;

import java.util.HashMap;
import java.util.Map;

public class hashmapPro 
{
	public static void main(String[] args)
	{
		System.out.println("hello");
		Map<String,Integer> hash=new HashMap<>();
		
		hash.put("One", 1);
		hash.put("Two", 2);
		hash.putIfAbsent("Two", 5);
		hash.put("Ten", 10);
		hash.put("Three", 3);
		hash.put(null, null);
		hash.put("Six", null);
		hash.put("Five", 2);
		System.out.println(hash.isEmpty());
		System.out.println(hash.size());
		System.out.println(hash.containsValue(10));
		System.out.println(hash.containsKey("Two"));
		System.out.println(hash.get("Two"));
		System.out.println(hash);
		
		
	}

}
