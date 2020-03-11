package ykb.com.ykb.java.train.generics;

import java.util.Calendar;
import java.util.Date;

public class GenericMain {
	public static void main(final String[] args) {
		// Generic
		GenericHolder<Date, Integer> dateGen = new GenericHolder<>();
		Date value = dateGen.getValue();
		Integer value22 = dateGen.getValue2();

		// Old way of Generics
		ObjectHolder objectHolder = new ObjectHolder();
		objectHolder.setValue(new Date());
		objectHolder.setValue(new Integer(100));

		Object value2 = objectHolder.getValue();
		if (value2 instanceof Date) {
			Date dateVal = (Date) value2;
		} else if (value2 instanceof Calendar) {
			Calendar cal = (Calendar) value2;
		} else if (value2 instanceof Integer) {
			Integer intVal = (Integer) value2;
			System.out.println(intVal);
		}

	}
}
