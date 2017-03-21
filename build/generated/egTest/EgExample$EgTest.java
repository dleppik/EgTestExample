import java.lang.Exception;
import org.junit.Test;

public final class EgExample$EgTest {
  @Test
  public void testReturns$$java_lang_Float$java_lang_Float() throws Exception {
    org.junit.Assert.assertEquals("multiply(7f, 5f)", 35f, EgExample.multiply(7f, 5f), 0.0f);
    org.junit.Assert.assertEquals("multiply(null, 5f)", null, EgExample.multiply(null, 5f));
    org.junit.Assert.assertEquals("multiply(1f, (Float) null)", null, EgExample.multiply(1f, (Float) null));
  }

  @Test
  public void testReturns$parameterName() throws Exception {
    org.junit.Assert.assertEquals("parameterName(56)", 0, new EgExample().parameterName(56));
  }

  @Test
  public void testReturns$CheckStringArrays() throws Exception {
    org.junit.Assert.assertEquals("CheckStringArrays(\"a\")", new String [] {"a", "a", "a", "a"}, new EgExample().CheckStringArrays("a"));
  }

  @Test
  public void testReturns$greet() throws Exception {
    org.junit.Assert.assertEquals("greet(\"World\")", "Hello, World!", EgExample.greet("World"));
    org.junit.Assert.assertEquals("greet(\"Earth\")", "Hello, Earth!", EgExample.greet("Earth"));
  }

  @Test
  public void testReturns$$java_lang_Double$java_lang_Double() throws Exception {
    org.junit.Assert.assertEquals("multiply(null, 5.0)", null, EgExample.multiply(null, 5.0));
    org.junit.Assert.assertEquals("multiply(1.0, (Double) null)", null, EgExample.multiply(1.0, (Double) null));
  }

  @Test
  public void testReturns$add() throws Exception {
    org.junit.Assert.assertEquals("add(2, 1)", 3, EgExample.add(2, 1));
    org.junit.Assert.assertEquals("add(-1, Integer.MIN_VALUE)", Integer.MAX_VALUE, EgExample.add(-1, Integer.MIN_VALUE));
  }

  @Test
  public void testReturns$checkIntArrays() throws Exception {
    org.junit.Assert.assertEquals("checkIntArrays(1)", (new int [] {1, 1, 1, 1}), new EgExample().checkIntArrays(1));
  }

  @Test
  public void testReturns$longParameterList() throws Exception {
    org.junit.Assert.assertEquals("longParameterList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1)", 0, new EgExample().longParameterList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1));
  }

  @Test
  public void testReturns$$int$int$_A() throws Exception {
    org.junit.Assert.assertEquals("multiply(5)", 5, EgExample.multiply(5));
    org.junit.Assert.assertEquals("multiply(2, 3, 5)", 30, EgExample.multiply(2, 3, 5));
  }

  @Test
  public void testReturns$$double$double$_A() throws Exception {
    org.junit.Assert.assertEquals("multiply(5.0)", 5.0, EgExample.multiply(5.0), 0.0d);
    org.junit.Assert.assertEquals("multiply(2.0, 3.0, 5.0)", 30.0, EgExample.multiply(2.0, 3.0, 5.0), 0.0d);
  }

  @Test
  public void testReturns$divide() throws Exception {
    org.junit.Assert.assertEquals("divide(1.0, 2.0)", 0.5, EgExample.divide(1.0, 2.0), 0.0d);
    org.junit.Assert.assertEquals("divide(1.0, 3.0)", 0.33333, EgExample.divide(1.0, 3.0), 0.001d);
    org.junit.Assert.assertEquals("divide(1.0, 0.0)", Double.POSITIVE_INFINITY, EgExample.divide(1.0, 0.0), 0.0d);
    org.junit.Assert.assertEquals("divide(0.0, 0.0)", Double.NaN, EgExample.divide(0.0, 0.0), 0.0d);
  }

  @Test
  public void testReturns$decrement() throws Exception {
    org.junit.Assert.assertEquals("decrement(Integer.MIN_VALUE)", Integer.MAX_VALUE, new EgExample().decrement(Integer.MIN_VALUE));
    org.junit.Assert.assertEquals("decrement(1)", 0, new EgExample().decrement(1));
  }

  @Test
  public void testReturns$whatShouldWeNameOurMethodIAmSoConfusedddddddWillThisWorkIHopeItDoesWaitYouWantItEvenLongerrrrrrrrrrrrrrrrrrrr()
      throws Exception {
    org.junit.Assert.assertEquals("whatShouldWeNameOurMethodIAmSoConfusedddddddWillThisWorkIHopeItDoesWaitYouWantItEvenLongerrrrrrrrrrrrrrrrrrrr()", "", new EgExample().whatShouldWeNameOurMethodIAmSoConfusedddddddWillThisWorkIHopeItDoesWaitYouWantItEvenLongerrrrrrrrrrrrrrrrrrrr());
  }
}
