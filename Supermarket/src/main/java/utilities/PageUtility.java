package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
                        //pageutility class used to reuse the codes dropdown,action class,javascriptor
public void selectByIndex(WebElement element,int a)
{
	Select select=new Select(element);
	select.selectByIndex(a);
}
}
