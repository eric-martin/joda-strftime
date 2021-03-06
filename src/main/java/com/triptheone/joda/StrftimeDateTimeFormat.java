/*
 *  Copyright 2013 Eric Martin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.triptheone.joda;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * A strftime DateTimeFormat object for the Joda-Time library.
 * 
 * Example:
 * <pre>
 * {@code
 * DateTimeFormatter formatter = StrftimeDateTimeFormat.forPattern(strftimePattern);
 * ...
 * }
 * </pre>
 * 
 * StrftimeDateTimeFormat is thread-safe and immutable.
 * 
 * @author Eric Martin
 */
public class StrftimeDateTimeFormat {

	/**
	 * Shared instance of a StrftimeFormat object
	 */
	private static final StrftimeFormat STRFTIME_FORMAT = new StrftimeFormat();
	
	/**
	 * Creates a DateTimeFormatter given the strftime pattern string
	 * @param pattern strftime pattern string
	 * @return DateTimeFormatter object
	 */
	public static DateTimeFormatter forPattern(final String pattern) {
		if (pattern == null) {
			throw new NullPointerException("Pattern must be non-null");
		}
		
		if (pattern.length() == 0) {
			throw new IllegalArgumentException("Pattern must be non-empty");
		}
		
		return DateTimeFormat.forPattern(STRFTIME_FORMAT.toJodaFormat(pattern));
	}
	
	/**
	 * Hidden to prevent construction
	 */
	private StrftimeDateTimeFormat() {
	}
}
