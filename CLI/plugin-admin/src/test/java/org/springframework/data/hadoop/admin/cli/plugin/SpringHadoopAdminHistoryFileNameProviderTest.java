/*
 * Copyright 2011-2012 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.hadoop.admin.cli.plugin;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Jarred Li
 *
 */
public class SpringHadoopAdminHistoryFileNameProviderTest {

	private SpringHadoopAdminHistoryFileNameProvider fileNameProvider;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		fileNameProvider = new SpringHadoopAdminHistoryFileNameProvider(); 
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		fileNameProvider = null;
	}

	/**
	 * Test method for {@link org.springframework.data.hadoop.admin.cli.plugin.SpringHadoopAdminHistoryFileNameProvider#getHistoryFileName()}.
	 */
	@Test
	public void testGetHistoryFileName() {
		String fileName = fileNameProvider.getHistoryFileName();
		Assert.assertNotNull(fileName);
	}

	/**
	 * Test method for {@link org.springframework.data.hadoop.admin.cli.plugin.SpringHadoopAdminHistoryFileNameProvider#name()}.
	 */
	@Test
	public void testName() {
		String name = fileNameProvider.name();
		Assert.assertNotNull(name);
	}

}
