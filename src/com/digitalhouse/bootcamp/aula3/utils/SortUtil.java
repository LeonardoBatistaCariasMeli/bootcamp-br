package com.digitalhouse.bootcamp.aula3.utils;

import com.digitalhouse.bootcamp.aula3.domain.interfaces.Precedente;

public class SortUtil {

	public static <T> T[] sort(Precedente<T> arr[]) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if(!arr[i].precedeA((T)arr[j])) {
					var temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			
			}
		}

		return (T[]) arr;
	}

}
