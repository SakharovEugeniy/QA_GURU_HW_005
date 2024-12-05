import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubEnterpriseTest {

    @BeforeAll
    static void BeforeAll(){
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = false;
    }

    @Test
    void gitHubEnterpriseTest(){
        open("https://github.com");

        $("li.HeaderMenu-item").sibling(0).hover().find(byText("Enterprises")).click();
        $("h1.Primer_Brand__Heading-module__Heading___IVpmp").shouldHave(text("The AI-powered"));
    }
}
