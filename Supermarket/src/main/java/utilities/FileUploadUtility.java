package utilities;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtility {
	
	public void sendKeysForFileUpload(WebElement element,String path)
	{
		element.sendKeys(path);
	}
	
	public void robotClassForFileUpload(WebElement element,String path) throws Exception
	{
		StringSelection string=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string,null); //toolkit inbuilt class and setcontents method  used to pass the path copy to clipboard
		Robot robot=new Robot();
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); //keypress is method inside robot class //keyevent- class to pass keys
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
