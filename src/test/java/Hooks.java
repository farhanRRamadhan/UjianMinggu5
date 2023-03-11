import com.juaracoding.ujian5.drivers.DriverSingleton;
import com.juaracoding.ujian5.utils.Constans;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;


public class Hooks {
public static WebDriver driver;
    @Before
    public static void setUp(){
        DriverSingleton.getInstance(Constans.CHROME);
        driver = DriverSingleton.getDriver();

    }
    @AfterAll
    public static void quitBrowser(){
        delay(3);
        DriverSingleton.closeObjectInstance();
    }

    public static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
