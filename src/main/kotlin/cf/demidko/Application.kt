package cf.demidko

import io.github.bonigarcia.wdm.WebDriverManager
import io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import java.io.BufferedInputStream
import java.io.Closeable
import java.io.InputStream
import java.lang.Thread.sleep

fun main() {
  firefoxdriver().setup()
  val driver = FirefoxDriver()
  driver.get("https://google.com")
  Thread.sleep(1000 * 3)
  driver.close()
}