package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


// Ingrid made these functions

public class Ingrid {

	public static <T> boolean member(T atm, List<T> lizt) {
		for (T item : lizt) {
			if(item.equals(atm)) {
				return true;
			}
		}
		return false;
	}

	public static <T> List<T> append(List<T> lizt1, List<T> lizt2) {
		List<T> result = new ArrayList<>();

		for (T item : lizt1) {
			result.add(item);
		}

		for (T item : lizt2) {
			result.add(item);

		}

		return result;

	}

	public static <T, R> List<R> map(Function<T, R> fun, List<T> lizt) {
		List<R> result = new ArrayList<>();

		for (T item : lizt) {
			result.add(fun.apply(item));
		}

		return result;

	}

	public static <T> boolean same (List<T> lizt1, List<T> lizt2) {
		if (lizt1.size() != lizt2.size()) {
			return false;
		}

		for (int i = 0; i < lizt1.size(); i++) {
			if (!lizt1.get(i).equals(lizt2.get(i))) {
				return false;
			}
		}

		return true;

	}

	public static <T> List<T> intersect(List<T> lizt1, List<T> lizt2) {
		List<T> result = new ArrayList<>();

		for (T item : lizt1) {
			if (member(item, lizt2)) {
				result.add(item);
			}
		}

		return result;

	}



}