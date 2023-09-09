package org.example.stepDefs;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.*;
import org.testng.asserts.SoftAssert;

public class D0_checkout {

    // Creating instances of the page classes and the SoftAssert class for assertions.
    loginPage loginPage=new loginPage();
    homePage inventoryPage=new homePage();
    checkoutPage checkoutPage=new checkoutPage();
    Faker fake=new Faker();
    informationScreen info=new informationScreen();
    overviewPage overview=new overviewPage();
    checkoutCompletePage completePage=new checkoutCompletePage();
    SoftAssert soft =new SoftAssert();

    // Step: The user login to the Swag Labs website
    @Given("The user login to the website")
    public void the_user_login_to_the_website() {
        loginPage.userName.sendKeys("standard_user");
        loginPage.password.sendKeys("secret_sauce");
        loginPage.loginBtn.click();

    }
    // Step: The user Select lowest price item and add it to cart
    @When("The user Select lowest price item and add it to cart")
    public void theUserSelectLowestPriceItemAndAddItToCart() {
        inventoryPage.addToCartBtn.click();
    }
    // Step: The user navigate to the shopping cart page and click Checkout button
    @And("The user navigate to the shopping cart page and click Checkout button")
    public void theUserNavigateToTheShoppingCartPageAndClickCheckoutButton() {
        inventoryPage.cartIcon.click();
        checkoutPage.checkoutBtn.click();
    }
    // Step: The user adds required data in the information screen
    @And("The user adds required data in the information screen:{string},{string}and {string}")
    public void theUserAddsRequiredDataInTheInformationScreenAnd(String firstName, String lastName, String postalCode) {
        // Generating random values for firstName, lastName, and postalCode using Faker library
        firstName=fake.name().firstName();
        info.firstName.sendKeys(firstName);

        lastName=fake.name().lastName();
        info.lastName.sendKeys(lastName);

        postalCode=fake.address().zipCode();
        info.postalCode.sendKeys(postalCode);

        info.continueBtn.click();
    }
// Step: The user clicks finish to complete the checkout process
    @And("The user click finish to complete checkout process")
    public void theUserClickFinishToCompleteCheckoutProcess() {
        overview.finishBtn.click();
    }
// Step: The order is completed
    @Then("The order is completed")
    public void theOrderIsCompleted() {
        // Verifying the completion message displayed on the completePage
        String actualMsg =completePage.confirmMsg.getText();
        String expectedMsg="Your order has been dispatched, and will arrive just as fast as the pony can get there!";
        boolean result=actualMsg.contains(expectedMsg);
        soft.assertTrue(result);

    }
}