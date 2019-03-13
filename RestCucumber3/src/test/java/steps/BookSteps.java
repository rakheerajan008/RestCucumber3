package steps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static io.restassured.RestAssured.given;
public class BookSteps {
	protected String url = "http://jsonplaceholder.typicode.com/posts";
	@Given("^I execute a API Place Holder with URL <url>$")
	public void i_execute_a_API_Place_Holder_with_URL_url() throws Throwable {
		System.out.println("API NAME: " + "\n" + url);
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}

	@When("^the system returns a cookie$")
	public void the_system_returns_a_cookie() throws Throwable {
		System.out.println("COOKIE NAME:");
		given()
		.get(url)
		.then()
		.statusCode(200)
		.log()
		.cookies();
		System.out.println("------------------------------------------------------------------------------------------------------------------");
	}

	@Then("^I get the response code <responseCode>$")
	public void i_get_the_response_code_responseCode() throws Throwable {
		System.out.println("RESPONSE CODE:");
		given()
		.get(url)
		.then()
		.statusCode(200)
		.log()
		.status();
		System.out.println("------------------------------------------------------------------------------------------------------------------");

	}

	@Then("^the response body <responseBody>$")
	public void the_response_body_responseBody(DataTable arg1) throws Throwable {
		System.out.println("RESPONSE BODY:");
		given().get(url).then().statusCode(200).log().body();
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}

}
