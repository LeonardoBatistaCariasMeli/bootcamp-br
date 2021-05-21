package com.digitalhouse.bootcamp.aula2.domain;

public class Counter {

	private Integer value;
	
	public Counter() {
		
	}

	public Counter(Integer value) {
		this.value = value;
	}
	
	public Counter(Counter counter) {
		this.value = counter.getValue();
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
	public void increase() {
		this.value += 1;
	}
	
	public void decrease() {
		this.value -= 1;
	}
	
}
