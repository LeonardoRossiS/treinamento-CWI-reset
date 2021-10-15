package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import pageObject.HomePage;
import pageObject.LogInPage;
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
        HomePage home = new HomePage();
        home.clickButtonSignIn();
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getLoginURL()));
        System.out.println("Acessamos a página de login");

        LogInPage login = new LogInPage();
        login.fillEmail();
        System.out.println("Preenchemos o e-mail");
        login.fillPassword();
        System.out.println("Preenchemos a senha");
        login.clickSubmitLogin();
        System.out.println("Clicamos em Sign In");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getMyAccountURL()));
        System.out.println("Acessamos a página do usuário");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading"))
                .getText().contains("MY ACCOUNT"));
        System.out.println("Confirmamos o heading da página do usuário");

    }
}
