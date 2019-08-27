package com.stepdefinations.org;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class simple {
	
	@Given("^I open the browser$")
	public void i_open_the_browser() throws Throwable {
	   System.out.println("given");
	}

	@When("^I search for EPAM$")
	public void i_search_for_EPAM() throws Throwable {
		  System.out.println("when");;
	}

	@Then("^The page should get opened$")
	public void the_page_should_get_opened() throws Throwable {
		  System.out.println("then");
	}

}
