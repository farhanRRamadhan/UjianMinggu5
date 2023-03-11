package com.juaracoding.ujian5.Pages;

import com.juaracoding.ujian5.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
    private WebDriver driver;
    public AddToCart(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Dashboard']")
    WebElement dashBoard;
    public String getDashboard(){
        return dashBoard.getText();
    }

    @FindBy(xpath = "//a[@class='custom-logo-link']//img[@alt='ToolsQA Demo Site']")
    WebElement btnMenushop;
    public void setBtnMenushop(){

        btnMenushop.click();
    }

    @FindBy(xpath="//div[@id='slide-6-layer-4']")
    WebElement tShirtmenu;
    public void settShirtmenu(){
        tShirtmenu.getText();
    }

    @FindBy(xpath = "//div[@class='noo-product-inner noo-product-inner2']//a[normalize-space()='black lux graphic t-shirt']")
    WebElement btnTshirt;
    public void setBtnTshirt(){
        btnTshirt.click();
    }

    @FindBy(xpath ="//h1[@class='page-title']")
    WebElement showTshirt;
    public void setShowTshirt(){
        showTshirt.getText();
    }

    @FindBy(xpath = "//select[@id='pa_color']")
    WebElement color;
    public void setColor(){
        color.sendKeys("Black");
    }

    @FindBy(xpath = "//select[@id='pa_size']")
    WebElement size;
    public void setSize(){
        size.sendKeys("36");
    }

    @FindBy(xpath = "//input[@id='noo-quantity-4908']")
    WebElement qty;
    public void setQty(){
        qty.sendKeys("3");
    }

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement btnAddToCart;
    public void setBtnAddToCart(){
        btnAddToCart.click();
    }

    @FindBy(xpath = "//form[@action='https://shop.demoqa.com/cart/']")
    WebElement menuCart;
    public void getMenuCart(){
        menuCart.getText();
    }
}