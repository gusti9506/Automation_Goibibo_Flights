package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AcadiaPage extends BasePage{
    private String clickIn = "//div[@class='uitk-layout-grid-item uitk-layout-grid-item-has-column-start uitk-layout-grid-item-has-column-start-by-medium']/div";
            //button[@class='uitk-fake-input uitk-form-field-trigger']";
    private String enterText = "//div[@class='uitk-field has-no-visible-label has-placeholder']/input";
                    //input[@id='location-field-destination']";
    private String cityList = "//div[@class='truncate']";
                            //ul[@class='uitk-action-list no-bullet']//li/descendant::div[@class='truncate']";
    public AcadiaPage() {
        super(driver);
    }
    public void navigateToUrl() {
        navigateTo("https://www.expedia.com/");
    }

    public void clickSelect() {
        clickElement(clickIn);

    }
    public void setEnterCity() {
        enterCity(enterText, "Pari");

    }
    public void listAll() throws InterruptedException {
       List<WebElement> list = driver.findElements(By.xpath(cityList));
       System.out.println(list.size() + " Elementos\n");
        for (int j=0; j<list.size(); j++) {
            String listAll = list.get(j).getText();
            System.out.println(listAll);
            Thread.sleep(3000);
            if(listAll.contains("Paris")) {
                list.get(j).click();
                break;
            }
        }
    }


}
