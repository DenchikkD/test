import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Onlin on 05.03.2017.
 */
public class FirstTest {


   @Test
   @Step
    public void myTest(){
       SoftAssert softAssert = new SoftAssert();

       softAssert.assertEquals("test1","test","BLA-BLA");
       softAssert.assertAll();

    }
    @Test
    public void testTwo(){
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals("test","test","BLA-BLA");
        softAssert.assertAll();
    }
}
