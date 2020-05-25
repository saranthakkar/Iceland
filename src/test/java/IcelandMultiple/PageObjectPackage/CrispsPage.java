package IcelandMultiple.PageObjectPackage;

import IcelandMultiple.BaseClassObjecct.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CrispsPage extends DriverFactory {

    @FindBy(id = "header-search")
    WebElement searchBar;

    @FindBy(xpath = "//h1[@class='search-header-title']")
    WebElement crispsTitle;

    public void doSearch(){
        searchBar.sendKeys("crisps");
        searchBar.sendKeys(Keys.ENTER);
    }

    public void crispsAssertion(){
        String actualCrisps = crispsTitle.getText();
        Assert.assertThat(actualCrisps, Matchers.containsString("Nuts"));
    }
}
