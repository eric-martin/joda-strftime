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

/**
 * A strftime format converter. 
 * 
 * @author Eric Martin
 */
public class StrftimeFormat {
	
	/**
	 * TODO
	 * @param pattern TODO
	 * @return TODO
	 */
	public static String toJodaFormat(final String pattern) {
		if (pattern == null) {
			throw new NullPointerException("Pattern must be non-null");
		}
		
		if (pattern.length() == 0) {
			throw new IllegalArgumentException("Pattern must be non-empty");
		}

		// TODO
		
		return pattern;
	}
	
	/**
	 * Hidden to prevent construction
	 */
	private StrftimeFormat() {
	}
}
