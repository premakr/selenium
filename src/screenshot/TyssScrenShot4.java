package screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TyssScrenShot4 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File sfile=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./photo/TYSSScreenshot.png");
		FileUtils.copyFile(sfile, dest);
		Thread.sleep(2000);
		WebElement logoele = driver.findElement(By.xpath("//td[@id='loginButtonContainer']"));
		
		Point point=logoele.getLocation();
		int xco=point.getX();
		int yco=point.getY();
		
		int imgWidth=logoele.getSize().getWidth();
		int imgHeight=logoele.getSize().getHeight();
		
		BufferedImage img=ImageIO.read(sfile);
		BufferedImage desc=img.getSubimage(xco, yco, imgWidth, imgHeight);
		ImageIO.write(desc, "png", sfile);
		File dsrc=new File("./photo/logout.png");
		FileUtils.copyFile(sfile, dsrc);
		driver.close();		
	}
}
