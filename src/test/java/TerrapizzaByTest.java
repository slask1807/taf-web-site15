import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TerrapizzaByTest extends BaseTest {

    @Test
    public void checkPizzaInbasket() throws InterruptedException {
        TerrapizzaByPage terrapizzaByPage = new TerrapizzaByPage(driver);
        driver.navigate().to("https://terrapizza.by/");
        terrapizzaByPage.clickButtonCookiesClose();
        terrapizzaByPage.clickButtonPizza();
        terrapizzaByPage.clickAddToBasket();
        terrapizzaByPage.clickButtonBar();
        terrapizzaByPage.clickAddBartoBasket();
        terrapizzaByPage.clickButtonBusket();
        Assertions.assertEquals("Пицца Маргарита 32 см", terrapizzaByPage.getTextPizza());
        Assertions.assertEquals("Облепиховый чай", terrapizzaByPage.getTextBar());
    }

}
