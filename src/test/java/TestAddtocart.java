import com.juaracoding.ujian5.Pages.AddToCart;
import com.juaracoding.ujian5.Pages.LoginPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestAddtocart {
    public static WebDriver driver;
    public static LoginPage loginPage = new LoginPage();
    public static AddToCart addToCart = new AddToCart();

    public TestAddtocart(){
        driver = Hooks.driver;
    }

    @Given("User open browser and url")
    public void User_open_browser_and_url() {
        driver.get("https://shop.demoqa.com/my-account/");
        loginPage.login("farhan_ramadhany", "Farhanramadhany_98");
        System.out.println("User open browser and url");
    }
    @When("User click menu shop tools")
    public void User_click_menu_shop_tools(){
        addToCart.setBtnMenushop();
        System.out.println("User click menu shop tools");
    }
    @And("User click tshirt")
    public void User_click_tshirt(){
        addToCart.setBtnTshirt();
        System.out.println("User click tshirt");
    }
    @And("User add color")
    public void User_add_color(){
        addToCart.setColor();
        System.out.println("User add color");
    }
    @And("User add size")
    public void User_add_size(){
        addToCart.setSize();
        System.out.println("User add size");
    }

    @And("User add qty")
    public void User_add_qty(){
        addToCart.setQty();
        System.out.println("User add qty");
    }

    @And("User click button add to cart")
    public void User_click_button_add_to_cart(){
        addToCart.setBtnAddToCart();
        System.out.println("User click button add to cart");
    }

    @Then("User go to main menu cart")
    public void User_go_to_main_menu_cart(){
        Hooks.delay(1);
        addToCart.getMenuCart();
        System.out.println("User go to main menu cart");
    }
}
