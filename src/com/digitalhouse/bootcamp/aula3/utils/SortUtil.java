package com.digitalhouse.bootcamp.aula3.utils;

import com.digitalhouse.bootcamp.aula3.domain.interfaces.Precedente;

public class SortUtil {

	public static <T, K> T[] sort(Precedente<T, K> arr[], K k) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (!arr[i].precedeA((T)arr[j], k)) {
					var temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return (T[]) arr;
	}

}