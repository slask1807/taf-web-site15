import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TerrapizzaByPage {
    private String buttonPizza = "//li[@class='menu-navigation__item' ]//a[contains(@href,'catalog/picca')]";
    private String butonBar = "//li[@class='menu-navigation__item' ]//a[contains(@href,'/catalog/bar')]";
    private String buttonCookiesClose = "//*[@class='close-icon']";
    private String addPizzaToBascet = "//*[@id=\"menu-card-364\"]//*[@class='menu-card__footer-btn add-basket-btn']";
    private String addBarToBasket = "//*[@id=\"menu-card-2219\"]//*[contains(text(), 'В корзину')]";
    private String buttonBasket = "//div[@class='basket__btn-top basket__top basket__btn-top--sm']";
    private String textPizza = "//*[@id=\"basket-el-0\"]//*[contains(text(), 'Пицца Маргарита')]";
    private String textBar = "//*[@id=\"basket-el-1\"]//*[contains(text(), 'Облепиховый чай')]";
    WebDriver driver;

    public TerrapizzaByPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonPizza() {
        driver.findElement(By.xpath(buttonPizza)).click();
    }

    public void clickButtonCookiesClose() {
        driver.findElement(By.xpath(buttonCookiesClose)).click();
    }

    public void clickAddToBasket() {
        driver.findElement(By.xpath(addPizzaToBascet)).click();
    }

    public String getTextPizza() {
        return driver.findElement(By.xpath(textPizza)).getText();
    }

    public String getTextBar() {
        return driver.findElement(By.xpath(textBar)).getText();
    }

    public void clickButtonBusket() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(buttonBasket)).click();
    }

    public void clickButtonBar() {
        driver.findElement(By.xpath(butonBar)).click();
    }

    public void clickAddBartoBasket() {
        driver.findElement(By.xpath(addBarToBasket)).click();
    }
}
