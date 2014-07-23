package br.gov.rj.rio.cor.karttleman.controllers

import org.json4s.{DefaultFormats, Formats}
import org.scalatra.json._
import org.scalatra._
import br.gov.rj.rio.cor.karttleman.repositories.MessageRepository._
import com.mongodb.util.JSON

class ScheduleController extends ScalatraServlet with ScalatraBase with JacksonJsonSupport {

  protected implicit val jsonFormats: Formats = DefaultFormats

  case class Message(body: String)

  before() {
    contentType = formats("json")
  }

  get("/") {
  	contentType = "text/html"
  	"""
  	<p>Check out RESTful API at <a href="http://localhost:8080/messages">http://localhost:8080/messages</a>
  	"""
  }

   
  get("/messages") {
    val messages = fetch
    if (messages.isEmpty) {
      List(Message("Great job!"), Message("Scalatra project generated by Yeoman!"))
    } else {
      JSON.serialize(messages)
    }
  }
}