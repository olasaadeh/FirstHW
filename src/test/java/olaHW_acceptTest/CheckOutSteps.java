package olaHW_acceptTest;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import olaHW1.checkClass;

public class CheckOutSteps {

	private int price;
	private int count;
	private checkClass k =  new checkClass();
	
	@Given("the price of a {string} is {int}")
	public void thePriceOfAIs(String string, Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		price = int1;
		k.Addnewitem(count, price, string);
	}
	
	@When("I checkout {int} {string}")
	public void iCheckout(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new io.cucumber.java.PendingException();
		k.countItems(string, int1);
		}

	@Then("the total price should be {int}")
	public void theTotalPriceShouldBe(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new io.cucumber.java.PendingException();
		assertEquals(int1.intValue(), k.total());
	}
	
	

}
