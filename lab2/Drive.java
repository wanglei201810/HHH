package lab2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drive {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
     /* WebDriver driver;
        System.setProperty("webdriver.firefox.marionette", "C:\\AppData\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.get("http://121.193.130.195:8800");
        driver.get("http://121.193.130.195:8800");
        driver.findElement(By.name("id")).sendKeys("3016218069");
        driver.findElement(By.name("password")).sendKeys("218069");
        driver.findElement(By.id("btn_login")).click();
        String stuId = driver.findElement(By.id("student-id")).getText();
        String stuName = driver.findElement(By.id("student-name")).getText();
        String stuGit = driver.findElement(By.id("student-git")).getText();
        System.out.println(stuId);
        System.out.println(stuName);
        System.out.println(stuGit);
        driver.close();
      */
		Drive d = new Drive();
		Read r = new Read();
    	d.getResult(0);
    	r.Eresult(0);
    }

    public String getResult(int i) {
    	WebDriver driver;
    	System.setProperty("webdriver.firefox.marionette", "C:\\AppData\\geckodriver.exe");
    	driver=new FirefoxDriver();
    	driver.get("http://121.193.130.195:8800");
        driver.findElement(By.name("id")).sendKeys(Read.login(i));
        driver.findElement(By.name("password")).sendKeys(Read.logpw(i));
        driver.findElement(By.id("btn_login")).click();
        String stuName = driver.findElement(By.id("student-name")).getText();
        String stuGit = driver.findElement(By.id("student-git")).getText();
        String stuId = driver.findElement(By.id("student-id")).getText();
        driver.findElement(By.id("btn_logout")).click();
        driver.findElement(By.id("btn_return")).click();
        driver.close();
        return stuId+","+stuName+","+stuGit;
    }


}