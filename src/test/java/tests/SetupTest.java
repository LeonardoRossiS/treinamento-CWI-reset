package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.Browser;
import utils.Utils;
import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTest{
    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseURL()));
        System.out.println("Abrimos o navegador e carregamos a URL");
    }
    @Test
    public void testLogIn(){
        Browser.getCurrentDriver().findElement(By.className("login")).click();
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getLoginURL()));
        System.out.println("Acessamos a página de login");
        Browser.getCurrentDriver().findElement(By.id("email")).sendKeys(Utils.getLoginEmail());
        System.out.println("Preenchemos o e-mail");
        Browser.getCurrentDriver().findElement(By.id("passwd")).sendKeys(Utils.getLoginPassword());
        System.out.println("Preenchemos a senha");
        Browser.getCurrentDriver().findElement(By.id("SubmitLogin")).click();
        System.out.println("Clicamos em Sign In");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getMyAccountURL()));
        System.out.println("Acessamos a página do usuário");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading"))
                .getText().contains("MY ACCOUNT"));
        System.out.println("Confirmamos o heading da página do usuário");

    }
}
