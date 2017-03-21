import java.lang.Exception;
import org.junit.Test;

public final class EgExceptionExample$EgTest {
  @Test
  public void testException$anotherMethodWhichCannotHandleNulls() throws Exception {
    try {
        EgExceptionExample.anotherMethodWhichCannotHandleNulls(null, "hello");
        org.junit.Assert.fail("anotherMethodWhichCannotHandleNulls(null, \"hello\") should throw java.lang.Throwable, returned without error");
    } catch (Throwable ex) {
        if (ex instanceof java.lang.AssertionError)
            throw ex;
        org.junit.Assert.assertTrue("anotherMethodWhichCannotHandleNulls(null, \"hello\") should throw java.lang.Throwable"+", instead threw "+ex, ex instanceof java.lang.Throwable);
    }
    try {
        EgExceptionExample.anotherMethodWhichCannotHandleNulls("hello", null);
        org.junit.Assert.fail("anotherMethodWhichCannotHandleNulls(\"hello\", null) should throw java.lang.Throwable, returned without error");
    } catch (Throwable ex) {
        if (ex instanceof java.lang.AssertionError)
            throw ex;
        org.junit.Assert.assertTrue("anotherMethodWhichCannotHandleNulls(\"hello\", null) should throw java.lang.Throwable"+", instead threw "+ex, ex instanceof java.lang.Throwable);
    }
  }

  @Test
  public void testException$methodWhichCannotHandleNulls() throws Exception {
    try {
        EgExceptionExample.methodWhichCannotHandleNulls(null);
        org.junit.Assert.fail("methodWhichCannotHandleNulls(null) should throw java.lang.NullPointerException, returned without error");
    } catch (Throwable ex) {
        if (ex instanceof java.lang.AssertionError)
            throw ex;
        org.junit.Assert.assertTrue("methodWhichCannotHandleNulls(null) should throw java.lang.NullPointerException"+", instead threw "+ex, ex instanceof java.lang.NullPointerException);
    }
  }
}
