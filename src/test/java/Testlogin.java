import com.juaracoding.ujian5.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class Testlogin {

    public static WebDriver driver;
    public static LoginPage loginPage = new LoginPage();

    public Testlogin(){
        driver = Hooks.driver;
    }


    //-----------VALID USERNAME AND PASSWORD-----------//
    @Given("User open browser and url")
    public void User_open_browser_and_url(){
        driver.get("https://shop.demoqa.com/my-account/");
        System.out.println("User open browser and url");
    }

    @When("User enter valid username")
    public void User_enter_valid_username(){
        loginPage.enterUsername("farhanramadhany98@gmail.com");
        System.out.println("User enter valid username");
    }

    @And("User Enter Valid password")
    public void User_Enter_Valid_password(){
        loginPage.enterPassword("Farhanramadhany98!");
        System.out.println("User Enter Valid password");
    }

    @And("User click button login")
    public void User_click_button_login(){
        loginPage.buttonLogin();
        System.out.println("User click button login");
    }

    @Then("User go to page Dashboard")
    public void User_go_to_page_Dashboard(){
        Assert.assertEquals(loginPage.getTxtDashboard(),"Dashboard");
        System.out.println("User go to page Dashboard");
    }

    //----------INVALID USERNAME AND PASSWORD--------------------//
    @When("Click button logout")
    public void Click_button_logout(){
        //loginPage.ddProfile();
        loginPage.buttonLogout();
        System.out.println("Click button logout");
    }

    @And("User enter invalid username")
    public void User_enter_invalid_username(){
        loginPage.enterUsername("Adminn");
        System.out.println("User enter invalid username");
    }
    @And("User Enter invalid password")
    public void User_Enter_invalid_password(){
        loginPage.enterPassword("admin1234");
        System.out.println("User Enter invalid password");
    }

    @Then("Invalid credential")
    public void Invalid_credential(){
        loginPage.buttonLogin();
        Assert.assertEquals(loginPage.getLoginTitle(),"Login");
        System.out.println("Invalid credential");
    }
    //-------------------Null--------------//
//    @When("invalid credential")
//    public void invalid_credential(){
//        System.out.println("invalid credential");
//    }
//
//    @And("User enter valid usernamereq")
//    public void User_enter_valid_usernamereq(){
//        loginPage.enterUsername("Admin");
//        System.out.println("User enter valid usernamereq");
//    }
//   @And("User Enter null password")
//   public void User_Enter_null_password(){
//
//        loginPage.enterPassword("");
//       System.out.println("User Enter null password");
//   }
//
//   @Then("Required")
//   public void Required(){
//        Hooks.delay(1);
//        loginPage.buttonLogin();
//        Assert.assertEquals(loginPage.getLoginTitle(),"Login");
//       System.out.println("Required");
//   }
}
