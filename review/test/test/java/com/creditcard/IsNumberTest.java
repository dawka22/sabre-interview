package test.java.com.creditcard;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;
import junitparams.JUnitParamsRunner;

import junitparams.Parameters;
import main.java.com.creditcard.IsNumber;

@RunWith(JUnitParamsRunner.class)
public class IsNumberTest {
	
	private Object[] validNumericParam() {
		return $("123", "0", "5");
	}
	
	private Object[] nonValidNumericParam() {
		return $("-123", "asbsd", "$%&123");
	}
	
	@Test(expected = NullPointerException.class)
	public void checkShouldThrowNullExceptionForNullValue() {
		IsNumber.check(null);	
	}
	
	@Test
	@Parameters(method = "validNumericParam")
	public void checkShouldReturnTrueForNumericParameter(String validNumericParam) {
		assertTrue(IsNumber.check(validNumericParam));
	}
	
	@Test
	@Parameters(method = "nonValidNumericParam")
	public void checkShouldReturnFalseForNonNumericParametr(String nonValidNumericParam) {
		assertFalse(IsNumber.check(nonValidNumericParam));
	}
}
