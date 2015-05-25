package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ClientTest.class, FlightTest.class, OptiuneFacTest.class,
		RezervareTest.class })
public class AllTests {

}
