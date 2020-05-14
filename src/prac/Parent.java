package prac;


import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class Parent {


    public static void main(String[] args) throws Throwable {

        postCreateDefaultProfileXapiCall();

    }

    public static void postCreateDefaultProfileXapiCall() throws Throwable {

        // https://www.mcom-035.tbe.zeus.fds.com/xapi/digital/v1/product/1310

        String baseURI = "https://www.mcom-035.tbe.zeus.fds.com/xapi/digital/v1/product";

        String ccfpService = baseURI + "/1310";
        Response response = RestAssured.given().header("Content-Type", "application/json")
                .when().get(ccfpService)
                .then()
                .statusCode(200).extract().response();
        String resp = response.getBody().prettyPrint();
        System.out.println("Response in String format " + resp);


    }
}