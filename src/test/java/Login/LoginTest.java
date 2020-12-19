package Login;

import PageObjects.DashboardPage;
import Setup.SetupTest;
import org.testng.annotations.Test;

public class LoginTest extends SetupTest {

    @Test
    public void testLogin() throws InterruptedException
    {
        String username = "faviedee";
        loginpage.enterUsername(username);
        loginpage.enterUserPassword("favour2020");

        DashboardPage dashboardPage = loginpage.clickLoginBtn();
        dashboardPage.clickfaviedee();
        loginpage = dashboardPage.clickLogout();
    }
}