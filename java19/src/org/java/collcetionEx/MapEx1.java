package org.java.collcetionEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		System.out.println("Map");
		
	Map<Integer,String> map1	=new HashMap<Integer,String>();
		
	//Key�� �ߺ��Ǹ� �ȵȴ�.(�������� �� ����)
	//value(��)�� �ߺ��ص��� ��������� 
		map1.put(1, "java");
		map1.put(2, "oracle");
		map1.put(3, "mysql");
		map1.put(4, "servlet");
		map1.put(5, "jsp");
		
		System.out.println(map1);
		//get() ->��ȸ
		System.out.println(map1.get(1)); //get(key) -> Ű������ ��ȸ 
		
		//key -> ������ keySet()-> ���� 
		
	Set<Integer> set1=	map1.keySet();
	// key -> Iterator 
	Iterator<Integer> iter=set1.iterator(); //keySet-> Iterator
	while(iter.hasNext()) {
		Integer key=iter.next();
		System.out.println("key:"+key+",value:"+map1.get(key));
	}
		
		
		
		
		
		
		
	}
}
