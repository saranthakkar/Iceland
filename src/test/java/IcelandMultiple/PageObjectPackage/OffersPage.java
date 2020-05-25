package IcelandMultiple.PageObjectPackage;

import IcelandMultiple.BaseClassObjecct.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OffersPage extends DriverFactory {
    @FindBy(xpath = "//div[@class='header-nav-links-desktop']//li[3]//a[1]")
    WebElement offersIcon;

    public void offersMethod(){
        offersIcon.click();
    }

    public void homepageAssertion(){
        String actualURL = driver.getCurrentUrl();
        Assert.assertThat(actualURL, Matchers.containsString("iceland"));
    }

    @FindBy(xpath = "//h1[@class='search-header-with-subtitle']")
    WebElement offerTitle;

    public void offerspageAssertion(){
        String actualOfferTitle = offerTitle.getText();
        Assert.assertThat(actualOfferTitle,Matchers.containsString("Offers"));
    }
}
