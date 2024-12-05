import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class DragAndDropTest {
    @BeforeAll
    static void BeforeAll(){
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void dragAndDropTest(){
        open("https://the-internet.herokuapp.com/drag_and_drop");

        SelenideElement a = $("#column-a");
        SelenideElement b = $("#column-b");

        actions().clickAndHold(a).moveToElement(b).release().build().perform();
        //$(a).dragAndDrop($(b));
        a.$("header").shouldHave(text("B"));

    }
}
