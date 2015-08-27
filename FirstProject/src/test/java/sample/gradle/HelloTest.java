package sample.gradle;


import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

  @Test
  public void test() {
    Assert.assertEquals("Hello World", new Hello().sayHello("World"));
  }

}
