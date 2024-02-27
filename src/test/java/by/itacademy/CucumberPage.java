package by.itacademy;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberPage {

    @Given("User opens home page")
    public void openHomePage(){
        System.out.println("Домашняя страница открылась");
    }
    @When("User opens Login page")
    public void clickLoginPage(){
        System.out.println("Пользователь открыл форму логина");
    }
    @Then("User sees Login page")
    public void verifyLoginPage(){
        System.out.println("Страница логина открылась");
    }
    @And("User closes login page")
    public void closeLoginPage(){
        System.out.println("Страница логина закрыта");
    }
    @Then("User doesn't see Login page")
    public void verifyPageIsClosed(){
        System.out.println("Пользователь видит что страница закрыта");
    }
}
