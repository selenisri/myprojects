package scripts;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;


public class apiautomation {
	
	given().queryParam("CUSTOMER_ID","68195")
    .queryParam("PASSWORD","1234!")
    .queryParam("Account_No","1")
    .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log()
    .body();

}
