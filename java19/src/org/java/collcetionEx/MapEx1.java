package org.java.collcetionEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		System.out.println("Map");
		
	Map<Integer,String> map1	=new HashMap<Integer,String>();
		
	//Key는 중복되면 안된다.(결과출력이 안 나옴)
	//value(값)는 중복해도됨 결과가나옴 
		map1.put(1, "java");
		map1.put(2, "oracle");
		map1.put(3, "mysql");
		map1.put(4, "servlet");
		map1.put(5, "jsp");
		
		System.out.println(map1);
		//get() ->조회
		System.out.println(map1.get(1)); //get(key) -> 키값으로 조회 
		
		//key -> 별도의 keySet()-> 저장 
		
	Set<Integer> set1=	map1.keySet();
	// key -> Iterator 
	Iterator<Integer> iter=set1.iterator(); //keySet-> Iterator
	while(iter.hasNext()) {
		Integer key=iter.next();
		System.out.println("key:"+key+",value:"+map1.get(key));
	}
		
		
		
		
		
		
		
	}
}
