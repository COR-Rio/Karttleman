package br.gov.rj.rio.cor.karttleman.repositories

import org.joda.time.DateTime
import com.mongodb.casbah.Imports._
import com.mongodb.util.JSON

object MessageRepository {

  val mongoClient = MongoClient()
  val messages = mongoClient("Karttleman")("messages")

  def fetch = messages.find().toList
}
