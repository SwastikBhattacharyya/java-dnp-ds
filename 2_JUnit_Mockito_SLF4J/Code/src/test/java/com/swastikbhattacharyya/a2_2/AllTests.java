package com.swastikbhattacharyya.a2_2;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({EvenCheckerTest.class, OtherTest.class})
public class AllTests {}
