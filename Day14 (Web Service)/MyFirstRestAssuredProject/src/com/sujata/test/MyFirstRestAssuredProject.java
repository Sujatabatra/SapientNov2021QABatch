package com.sujata.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
/*
 * syntax:
 * give().
 * param("key","value").header("key","value").
 * method().then().statusCode(XXX). body("x","y",equalTo("z"))
 * 
 */
public class MyFirstRestAssuredProject {
  
  String baseUri="https://simple-books-api.glitch.me";
  
  @Test
  public void demoTest() {
	  Response response=given().get("https://simple-books-api.glitch.me/status");
	  System.out.println("response:"+response.asString());
	  System.out.println("response body :"+response.getBody().asString());
	  System.out.println("response status code : "+response.getStatusCode());
	  System.out.println("response status line : "+response.getStatusLine());
	  assertEquals(response.getStatusCode(), 200);
	  
  }
//  @Test
  public void checkingForStatusTestCase() {
	  given().
	  get("https://simple-books-api.glitch.me/status")
	  .then()
	  .statusCode(200)
	  .log()
	  .all();
  }
}
