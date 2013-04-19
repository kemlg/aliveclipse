package edu.bath.alivetemplates;

import org.slf4j.helpers.MessageFormatter;

class MessageHelper {

	public static String formatMessage(String fmt, Object... args) {
		return MessageFormatter.arrayFormat(fmt,args);
	}
}
