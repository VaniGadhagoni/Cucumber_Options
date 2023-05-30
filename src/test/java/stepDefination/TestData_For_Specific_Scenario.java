package stepDefination;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestData_For_Specific_Scenario {
	

		@Given("User Navigates to Login Page")
		public void user_navigates_to_login_page() {
    
			System.out.println("Navigates to Login Page");
		}

		@When("User enter the following details")
		public void user_enter_the_following_details(DataTable dataTable) {
    

			List<List<String>> data=dataTable.asLists(String.class);
			for(List<String>li:data) {
				System.out.println(li);
				
			}
		}

		@When("clciks on Login button")
		public void clciks_on_login_button() {
			
			System.out.println("Clicks on Login Button");
		}

		@Then("User should get login Scuccessfully")
		public void user_should_get_login_scuccessfully() {
    
			System.out.println("Successfully logged in");
		}

}
