package Tests;

import Pages.HomePage;
import Pages.SubscriptionPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class opendriver extends intitatedriver{
    HomePage homePage;

    @BeforeClass
    public void SubscriptionPageTestBeforeClass() {
        homePage = new HomePage(driver);
    }

    @Test
    public void ValidateSubscriptionPackagsForEachCountry() {
        homePage.ChangeLanguageToEnglish();
    }
}
