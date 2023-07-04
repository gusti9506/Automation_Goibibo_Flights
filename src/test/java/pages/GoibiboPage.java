package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Calendar;
import java.util.List;

public class GoibiboPage extends BasePage{
    private String alerts2 = "//p[@class='sc-jlwm9r-1 dRQhOp']";
    private String alerts = "//span[@class='logSprite icClose']";
    private String searchCity = "//p[@class='sc-12foipm-27 bhYNaI fswWidgetPlaceholder']";
    private String enterCity = "//input[@type='text']";
    private String selectCity = "//div[@class='sc-12foipm-44 etmZgr']/p/span";
    //private String enterCityTwo = "//div[@class='sc-12foipm-37 godvBN']/span";
    private String selectCityTwo = "//div[@class='sc-12foipm-44 etmZgr']/p/span";
    private String selectDay = "//div[@class='DayPicker-Day']";
    private String clickReturnDay = "//p[contains(text(),'Click to add a return flight for better discounts')]";//p[@class='gr_fswFld__info']";//div[@class='gr_fswFld']/p
    private String buttomDone = "//span[@class='fswTrvl__done']";

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
                System.out.println("********  Se selecciona :  " + listAll + "  ************\n");
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
                System.out.println("********  Se selecciona :  " + listAll + "  ************\n");
                break;
            }
        }
    }

    public void clickDayOn() {
        Calendar calendar = Calendar.getInstance();
        System.out.println("********  Fecha Actual :  " + calendar.getTime() + "  ************\n");
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) + 10);
        int lunes = calendar.get(Calendar.DAY_OF_MONTH);
        String numCadena = Integer.toString(lunes);

        List<WebElement> list = driver.findElements(By.xpath(selectDay));
        for (int j = 0; j < list.size(); j++) {
            String listAll = list.get(j).getText();
            //System.out.println(listAll);
            if (listAll.contains(numCadena)) {
                list.get(j).click();
                System.out.println("********  Se seleccionan 10 dias despues de la fecha ACTUAL :  " + calendar.getTime() + "  ************\n");
                break;
            }
        }
    }
    public void clickReturnDay() {
        returnDay(clickReturnDay);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) + 15);
        int lunes = calendar.get(Calendar.DAY_OF_MONTH);
        String numeCadena = Integer.toString(lunes);
        List<WebElement> list = driver.findElements(By.xpath(selectDay));

        for (int j=0; j<list.size(); j++) {
            String listAll = list.get(j).getText();
            if(listAll.contains(numeCadena)) {
                list.get(j).click();
                System.out.println("********  Fecha de retorno (5 dias despues) :  " + calendar.getTime() + "  ************\n");
                break;
            }
        }
    }



}
