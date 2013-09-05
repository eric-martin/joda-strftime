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

import org.joda.time.format.DateTimeFormatter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

/**
 * StrftimeDateTimeFormat JUnit Test
 * 
 * @author Eric Martin
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(StrftimeDateTimeFormat.class)
public class StrftimeDateTimeFormatTest {

	/**
	 * testForPatternWithNullPattern
	 */
	@Test(expected = NullPointerException.class)
	public void testForPatternWithNullPattern() {
		StrftimeDateTimeFormat.forPattern(null);
	}
	
	/**
	 * testForPatternWithNullPattern
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testForPatternWithEmptyPattern() {
		StrftimeDateTimeFormat.forPattern("");
	}
	
	/**
	 * testForPatternWithNullPattern
	 * @throws Exception 
	 */
	@Test
	public void testForPattern() throws Exception {
		StrftimeFormat strftimeFormat = Mockito.mock(StrftimeFormat.class);
		Mockito.when(strftimeFormat.toJodaFormat("%c")).thenReturn("EEE MMM d HH:mm:ss yyyy");		
		Whitebox.setInternalState(StrftimeDateTimeFormat.class, strftimeFormat);
		
		DateTimeFormatter formatter = StrftimeDateTimeFormat.forPattern("%c");
		Assert.assertNotNull(formatter);
		Mockito.verify(strftimeFormat).toJodaFormat("%c");
	}	
}
