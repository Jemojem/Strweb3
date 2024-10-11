package com.domain;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class Staff {

	private String name;
	private int age;
	@ExcludeField
	private String[] position;
	private List<String> skills;
	private Map<String, BigDecimal> salary;
	

}