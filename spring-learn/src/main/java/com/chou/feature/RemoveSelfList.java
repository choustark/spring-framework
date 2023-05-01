package com.chou.feature;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Chou
 * @Description TODO
 * @ClassName RemoveSelfList
 * @Date 2023/4/20 21:09
 * @Version 1.0
 **/
public class RemoveSelfList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("11");
		list.add("12");
		list.add("13");
		list.add("2");
		list.add("3");
		list.add("23");
		list.add("32");
		list.add(null);
		List<String> exitsElement =  new ArrayList<>();
		exitsElement.add("1");
		exitsElement.add(null);
		list.removeIf(exitsElement::contains);
		exitsElement.removeIf(null);
		list.forEach(System.out::println);




	}
}
