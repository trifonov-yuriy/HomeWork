package assertions;

public class Assertions
{
    public static void assertEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError(String.format("Expected %d = %d", expected, actual));
        }
    }

    public static void assertEquals(long expected, long actual) {
        if (expected != actual) {
            throw new AssertionError(String.format("Expected %d = %d", expected, actual));
        }
    }

    public static void assertEquals(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError(String.format("Expected \"%s\" = \"%s\"", expected, actual));
        }
    }

    public static void assertRange(int expected, int actualMin, int actualMax)
    {
        if(expected < actualMin || expected > actualMax)
        {
            throw new AssertionError(String.format("Expected %s is not in the range [%s-%s]", expected, actualMin, actualMax));
        }
    }

    public static void assertNotNull(Object obj)
    {

    }

}
