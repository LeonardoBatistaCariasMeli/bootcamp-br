package com.digitalhouse.bootcamp.aula3.domain.interfaces;

import java.util.Comparator;

public interface Sorter<T> {

	public void sort(T arr[], Comparator<T> c);
	
}
