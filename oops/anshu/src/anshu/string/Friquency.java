package anshu.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Friquency {
	public static void main(String[] args) {
		String str="treeaabbcccc";
		String ans=sort(str);
		System.out.println(ans);
	}

	private static String sort(String str) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map=new HashMap<>();
		for(char ch:str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		ArrayList <Character> chars=new ArrayList<>(map.keySet());
		Collections.sort(chars,(a,b)->map.get(b)-map.get(a));
		StringBuilder result=new StringBuilder();
		for(char ch:chars) {
			int count=map.get(ch);
			for(int i=0;i<count;i++) {
				result.append(ch);
			}
		}
		
		return result.toString();
	}

}
