import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Onlin on 05.03.2017.
 */
public class FirstTest {


   @Test
    public void myTest(){
       SoftAssert softAssert = new SoftAssert();

       softAssert.assertEquals("test","test","BLA-BLA");
       softAssert.assertAll();

    }
}
