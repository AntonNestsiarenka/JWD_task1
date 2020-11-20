package com.epam.jwd.app;

import com.epam.jwd.model.Person;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private final static Logger LOGGER = LogManager.getLogger(Main.class);

	public static void main(String[] args) {
		LOGGER.info("Application is running");
		Person[] people = new Person[] {new Person("Andrew", 22), new Person("Jordan", 35), new Person("Michael", 17), new Person("Joel", 48), new Person("John", 33)};
		Arrays.stream(people).forEach(LOGGER::debug);
		LOGGER.info("Application is ending");
	}
}