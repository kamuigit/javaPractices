package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

		public static WebDriver driver;

		public static void loadBrowserChrome() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		public static void loadBrowserEdge() {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		public static void loadBrowserFireFox() {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		public static void launchUrl(String url) {
			driver.get(url);
		}
		public static String pageTitle() {
			String title = driver.getTitle();
			System.out.println("Title :"+title);
			return title;
		}
		public static String pageUrl() {
			String url = driver.getCurrentUrl();
			System.out.println("URL :"+url);
			return url;
		}
		public static void maxWindow() {
			driver.manage().window().maximize();
		}
		public static void fill(WebElement element,String text) {
			element.sendKeys(text);
		}
		public static String retriveFilledText(WebElement element) {
			String text = element.getAttribute("value");
			System.out.println(text);
			return text;
		}
		public static void retriveExistingText(WebElement element) {
			String text = element.getText();
			System.out.println(text);
		}
		public static void btnClick(WebElement element) {
			element.click();
		}
		public static void closeBrowser() {
			driver.quit();
		}
		public static void refreshBrowser() {
			driver.navigate().refresh();
		}
		public static String toGetAttribute(WebElement element) {
			String att = element.getAttribute("value");
			return att;
		}
		public static void applyWaitForAllLocators() {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		public static void copyContent() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
		}
		public static void cutContent() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_X);
			r.keyRelease(KeyEvent.VK_X);
			r.keyRelease(KeyEvent.VK_CONTROL);
		}
		public static void pasteContent() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
		}	
		public static void selectAllContent() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_CONTROL);
		}
		public static void unDo() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_Z);
			r.keyRelease(KeyEvent.VK_Z);
			r.keyRelease(KeyEvent.VK_CONTROL);
		}
		public static void reDo() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_Y);
			r.keyRelease(KeyEvent.VK_Y);
			r.keyRelease(KeyEvent.VK_CONTROL);
		}
		public static void toSaveContent() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_CONTROL);
		}
		public static void clickTab(int numberoftimes) throws AWTException {
			Robot r = new Robot();
			for (int i = 1; i < numberoftimes; i++) {
				r.keyPress(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_TAB);
			}
		}
		public static void reOpenClosedTab() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_SHIFT);
			r.keyRelease(KeyEvent.VK_CONTROL);
		}
		public static void scrollDown(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)", element);	
		}
		public static void scrollUp(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(false)", element);
		}
		public static void doubleClick(WebElement element) {
			Actions ac = new Actions(driver);
			ac.doubleClick(element).perform();
		}
		public static void rightClick(WebElement element) {
			Actions ac = new Actions(driver);
			ac.contextClick(element).perform();
		}
		public static void mouseHoverAction(WebElement element) {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
		}
		public static void dragAndDropAction(WebElement src , WebElement dest) {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(src, dest).perform();
		}
		public static void acceptAlert() {
			Alert a = driver.switchTo().alert();
			a.accept();
		}
		public static void allCaptialLetters(String text) {
			Actions ac = new Actions(driver);
			ac.keyDown(Keys.SHIFT).sendKeys(text).keyUp(Keys.SHIFT).build().perform();
		}
		public static void debugIn(long sec) throws InterruptedException {
			Thread.sleep(sec);	
		}
		public static void dismissAlert() {
			Alert a = driver.switchTo().alert();
			a.dismiss();
		}
		public static void fillAlert(String text) {
			Alert a = driver.switchTo().alert();
			a.sendKeys(text);
		}
		public static void retriveFillAlert() {
			Alert a = driver.switchTo().alert();
			String text = a.getText();
			System.out.println(text);
		}
		public static void toSelectOptionByText(WebElement element,String text) {
			Select s = new Select(element);
			s.selectByVisibleText(text);
		}
		public static void toPrintAllOptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> opt = s.getOptions();
			for (WebElement txtop : opt) {
				System.out.println(txtop);
			}
		}
		public static void toDeselectOptionByText(WebElement element,String txtopt) {
			Select s = new Select(element);
			s.deselectByVisibleText(txtopt);
		}
		public static void toGetAllSelectedOptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> alop = s.getAllSelectedOptions();
			for (WebElement w : alop) {
				System.out.println(w);
			}
		}
		public static void toGetFirstSelected(WebElement element) {
			Select s = new Select(element);
			String text = s.getFirstSelectedOption().getText();
			System.out.println(text);
		}
		public static void toDeselectAll(WebElement element) {
			Select s = new Select(element);
			s.deselectAll();
		}
		public static void reteiveTextEntered(WebElement element) {
			String text = element.getText();
			System.out.println(text);
		}
		public static void toSelectOptionByIndex(WebElement element, int num) {
			Select s = new Select(element);
			s.selectByIndex(num);
		}
		public static void toDeselectOptionByIndex(WebElement element, int num) {
			Select s = new Select(element);
			s.deselectByIndex(num);
		}
		public static void toSelectOptionByValue(WebElement element,String text) {
			Select s = new Select(element);
			s.deselectByValue(text);
		}
		public static void toDeselectOptionByValue(WebElement element, String text) {
			Select s = new Select(element);
			s.deselectByValue(text);
		}
		public static void toOptionsAvailable(WebElement element) {
			Select s = new Select(element);
			boolean mul = s.isMultiple();
			if (mul == true) {
				System.out.println("The options are available.");
			} else {
				System.out.println("No options are available.");
			}
		}
		public static void frameByIdOrName(String text) {
			driver.switchTo().frame(text);
		}
		public static void frameByIndex(int num) {
			driver.switchTo().frame(num);
		}
		public static void frameByWebElement(WebElement element) {
			driver.switchTo().frame(element);
		}
		public static void switchToParentOrOuterFrame() {
			driver.switchTo().parentFrame();
		}
		public static void toSwitchFromFrameToHtmlControl() {
			driver.switchTo().defaultContent();
		}
	
}
