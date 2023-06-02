package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class GoibiboPage extends BasePage{
    private String alerts2 = "//p[@class='sc-jlwm9r-1 dRQhOp']";
    private String alerts = "//span[@class='logSprite icClose']";
    private String searchCity = "//p[@class='sc-12foipm-27 bhYNaI fswWidgetPlaceholder']";
    private String enterCity = "//input[@type='text']";
    private String selectCity = "//div[@class='sc-12foipm-44 etmZgr']/p/span";
    private String enterCityTwo = "//div[@class='sc-12foipm-37 godvBN']/span";
    private String selectCityTwo = "//div[@class='sc-12foipm-44 etmZgr']/p/span";

    public GoibiboPage() {
        super(driver);
    }
    public void navigate() {
        navigateTo("https://www.goibibo.com/");
        closeAlerts(alerts);
    }
    public void clickInSearch() {
        closeAlerts(alerts2);
        clickCity(searchCity);
    }

    public void listAll() throws InterruptedException {
        enterCity(enterCity, "Par");
        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.xpath(selectCity));
        for (int j=0; j<list.size(); j++) {
            String listAll = list.get(j).getText();
            System.out.println(listAll);
            if(listAll.contains("Paros, Greece")) {
                list.get(j).click();
                System.out.println("**********  Se selecciona :  " + listAll + "  ************\n");
                break;
            }
        }
    }

    public void listAllTwo() throws InterruptedException {
        enterCity(enterCity, "Mad");
        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.xpath(selectCityTwo));
        for (int j=0; j<list.size(); j++) {
            String listAll = list.get(j).getText();
            System.out.println(listAll);
            if(listAll.contains("Madrid, Spain")) {
                list.get(j).click();
                System.out.println("**********  Se selecciona :  " + listAll + "  ************\n");
                break;
            }
        }
    }

}
