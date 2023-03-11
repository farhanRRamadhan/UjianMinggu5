package com.juaracoding.ujian5.Pages;

import com.juaracoding.ujian5.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //sebelum deklar isi
    @FindBy(xpath = "//input[@id='username']")
    WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    WebElement btnLogin;
    @FindBy(xpath = "//a[normalize-space()='Dashboard']")
    WebElement txtDashboard;
    @FindBy(xpath = "//h2[normalize-space()='Login']")
    WebElement loginTitle;

//    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
//    WebElement dropdownProfile;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement btnLogout;

//    @FindBy(xpath = "//input[@placeholder='Username']")
//    WebElement invalidusername;
//    @FindBy(xpath = "//input[@placeholder='Password']")
//    WebElement invalidpassword;

//    @FindBy(xpath = "//input[@placeholder='Password']")
//    WebElement nullpassword;
//
//    @FindBy(xpath = "//div[@class='oxd-alert-content oxd-alert-content--error']")
//    WebElement Invalidcredential;

    public String getLoginTitle(){

        return loginTitle.getText();
    }
    public String getTxtDashboard(){

        return txtDashboard.getText();
    }

//    public String getTxtInvalid(){
//        return Invalidcredential.getText();
//    }



    //isiannya
//    public void login(){
//        username.sendKeys("farhanramadhany98@gmail.com");
//        password.sendKeys("Farhanramadhany98!");
//        btnLogin.click();
//    }

//    public void invalidLogin(){
//        invalidusername.sendKeys("Adminn");
//        invalidpassword.sendKeys("admin1234");
//        btnLogin.click();
//    }


    //eksekusivalid
    public void enterUsername(String username){

        this.username.sendKeys(username);
    }

    public void enterPassword(String password){

        this.password.sendKeys(password);
    }
 public  void buttonLogin(){

        btnLogin.click();
 }

 //public void ddProfile(){
//        dropdownProfile.click();
// }
    public void buttonLogout(){

        btnLogout.click();
    }

    public void login(String farhan_ramadhany, String Farhanramadhany_98) {
        username.sendKeys("farhanramadhany@gmail.com");
        password.sendKeys("Farhanramadhany_98");
        btnLogin.click();
    }
}
