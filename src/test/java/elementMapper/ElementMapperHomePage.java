package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementMapperHomePage {

    @FindBy(className = "login")
    public WebElement login;
}
