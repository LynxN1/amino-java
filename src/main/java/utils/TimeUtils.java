package utils;

public final class TimeUtils {

  public static int unixInstant() {
    return (int) (System.currentTimeMillis() / 1000);
  }
}
