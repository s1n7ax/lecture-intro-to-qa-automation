/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  @Test
  void appHasAGreeting() {
    var browser = new FirefoxDriver();
    browser.get("https://www.google.com");
    browser.close();
  }
}
