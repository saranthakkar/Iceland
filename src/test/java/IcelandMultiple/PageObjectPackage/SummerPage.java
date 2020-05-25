package IcelandMultiple.PageObjectPackage;

import IcelandMultiple.BaseClassObjecct.DriverFactory;
import gherkin.lexer.Sr_cyrl;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummerPage extends DriverFactory {
    @FindBy(xpath = "//div[@class='header-nav-links-desktop']//li[5]//a[1]")
    WebElement summerIcon;

    public void summerIconMethod(){
        summerIcon.click();
    }

    public void summerPageAssertion(){
        String actualSummerPage = driver.getCurrentUrl();
        Assert.assertThat(actualSummerPage, Matchers.containsString("summer"));
    }
}
