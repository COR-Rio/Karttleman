package br.gov.rj.rio.cor.karttleman.controllers

import org.scalatra.test.specs2._

class ScheduleControllerSpec extends MutableScalatraSpec {
  addServlet(classOf[ScheduleController], "/*")

  "GET / on ScheduleController" should {
    "return status 200" in {
      get("/") {
        status must_== 200
      }
    }
  }
  "GET /messages on ScheduleController" should {
  	"return status 200" in {
  	  get("/messages") {
      	status must_== 200
      }
  	}
  }
}