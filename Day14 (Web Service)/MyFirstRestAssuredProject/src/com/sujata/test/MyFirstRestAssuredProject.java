package com.sujata.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import javax.xml.crypto.Data;

import org.hamcrest.Matchers;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
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
  @Test
  public void checkingForStatusTestCase() {
	  given().
	  get("https://simple-books-api.glitch.me/status")
	  .then()
	  .statusCode(200);
//	  .log()
//	  .all();
  }
  
  @Test
  public void testForBookList1() {
	  given()
	  .get("https://simple-books-api.glitch.me/books")
	  .then()
	  .statusCode(200);
  }
  
  @Test
  public void testForBookList2() {
	  Response response=given().get("https://simple-books-api.glitch.me/books");
	  String books=response.getBody().asString();
	  
	  JSONParser parser = new JSONParser();
	  
	  JSONArray arr=null;
	  try {
		arr = (JSONArray) parser.parse(books);
	} catch (ParseException e) {
		
		e.printStackTrace();
	}
	  assertTrue(arr.size()>0);
//	  assertEquals(arr.size(), 6);
	  
	  
	  
  }
  @Test
  public void checkBookIdPositive() {
	  given()
	  .get("https://simple-books-api.glitch.me/books/4")
	  .then()
	  .statusCode(200);
  }
  
  @Test
  public void checkBookIdNegative() {
	  given()
	  .get("https://simple-books-api.glitch.me/books/9")
	  .then()
	  .statusCode(404);
  }
  
  @Test
  public void createOrderCheck() {
	  JSONObject data=new JSONObject();
	  
	  data.put("bookId", 3);
	  data.put("customerName", "Tufel");
	  
//	  System.out.println(data.toJSONString());
	  given()
	  .header("Authorization","Bearer 96377109fb456620170e539fdccbd350a623759707bec61663b6fb5c099b5c23")
	  .contentType(ContentType.JSON)
	  .body(data.toJSONString())
	  .when()
	  .post("https://simple-books-api.glitch.me/orders")
	  .then()
	  .statusCode(201)
	  .log()
	  .all();
  }
  @Test
  public void testCaseForReqRes() {
	  given()
	  .param("page", 2)
	  .get("https://reqres.in/api/users")
	  .then()
	  .statusCode(200)
	  .body("data.size()", Matchers.greaterThan(0));
  }
}
