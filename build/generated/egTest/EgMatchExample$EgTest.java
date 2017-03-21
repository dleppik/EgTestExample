import java.lang.Exception;
import org.junit.Test;

public final class EgMatchExample$EgTest {
  @Test
  public void testMatch$numberRe() throws Exception {
    org.junit.Assert.assertTrue("EgMatch -0.77E77", new EgMatchExample().numberRe.matcher("-0.77E77").matches());
    org.junit.Assert.assertFalse("EgNoMatch -.Infinity", new EgMatchExample().numberRe.matcher("-.Infinity").matches());
  }

  @Test
  public void testMatch$SIMPLE_EMAIL_RE() throws Exception {
    org.junit.Assert.assertFalse("EgNoMatch sone", EgMatchExample.SIMPLE_EMAIL_RE.matcher("sone").matches());
    org.junit.Assert.assertFalse("EgNoMatch sone@example@example.com", EgMatchExample.SIMPLE_EMAIL_RE.matcher("sone@example@example.com").matches());
    org.junit.Assert.assertFalse("EgNoMatch Some One <sone@example.com>", EgMatchExample.SIMPLE_EMAIL_RE.matcher("Some One <sone@example.com>").matches());
    org.junit.Assert.assertTrue("EgMatch someone@example.com", EgMatchExample.SIMPLE_EMAIL_RE.matcher("someone@example.com").matches());
    org.junit.Assert.assertTrue("EgMatch sone@example.example.com", EgMatchExample.SIMPLE_EMAIL_RE.matcher("sone@example.example.com").matches());
  }

  @Test
  public void testMatch$isEmail() {
    org.junit.Assert.assertFalse("EgNoMatch sone", EgMatchExample.isEmail("sone"));
    org.junit.Assert.assertFalse("EgNoMatch sone@example@example.com", EgMatchExample.isEmail("sone@example@example.com"));
    org.junit.Assert.assertFalse("EgNoMatch Some One <sone@example.com>", EgMatchExample.isEmail("Some One <sone@example.com>"));
    org.junit.Assert.assertTrue("EgMatch sone@example.com", EgMatchExample.isEmail("sone@example.com"));
    org.junit.Assert.assertTrue("EgMatch sone@example.example.com", EgMatchExample.isEmail("sone@example.example.com"));
  }

  @Test
  public void testMatch$isNumber() {
    org.junit.Assert.assertTrue("EgMatch -0.77E77", new EgMatchExample().isNumber("-0.77E77"));
    org.junit.Assert.assertFalse("EgNoMatch -.Infinity", new EgMatchExample().isNumber("-.Infinity"));
  }
}
