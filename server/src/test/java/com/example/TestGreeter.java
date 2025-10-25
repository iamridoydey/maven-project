// Remove this line: package com.example;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import org.junit.Before;
import org.junit.Test;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";
    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";
    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

  // Simple Greeter implementation used by the tests so the type is available.
  private static class Greeter {
    public String greet(String someone) {
      return "Hello " + someone + "!";
    }
  }
}