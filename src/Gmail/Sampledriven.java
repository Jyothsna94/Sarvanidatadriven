package Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampledriven {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
	Xls_Reader reader = new Xls_Reader("C:\\Users\\RAMER\\eclipse-workspace\\Sarvanidatadriven\\document.xlsx");
	int rowcount = reader.getRowCount("Sheet1");
	for(int rownum=2;rownum<=rowcount; rownum++) {
	String email = reader.getCellData("Sheet1", "email", rownum);
	String password = reader.getCellData("Sheet1", "password", rownum);
	System.out.println(email);
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(email);
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div[2]/div/a/span")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[@id=\"profileIdentifier\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div/div/form/span/section/div/div/div/div/ul/li[2]/div/div/div[2]")).click();
	Thread.sleep(3000);
	driver.close();
}}}
