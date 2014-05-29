package org.bulldog.core;

import org.bulldog.core.gpio.TestAbstractDigitalOutput;
import org.bulldog.core.gpio.TestPin;
import org.bulldog.core.platform.TestAbstractBoard;
import org.bulldog.core.util.TestBulldogUtil;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
				TestAbstractBoard.class, 
				TestPin.class,
				TestAbstractDigitalOutput.class,
				TestBulldogUtil.class
			  })
public class CompleteTestSuite {

}