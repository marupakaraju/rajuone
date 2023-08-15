
public class urljav {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\marup\\Downloads\\chromedriver_win32\\chromedriver.exe\");
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/"); 
}
}
