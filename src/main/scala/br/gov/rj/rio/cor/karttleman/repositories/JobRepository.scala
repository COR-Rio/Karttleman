package br.gov.rj.rio.cor.karttleman.repositories

import org.joda.time.DateTime
import com.mongodb.casbah.Imports._
import com.mongodb.util.JSON

object JobRepository {

  val mongoClient = MongoClient()
  val jobs = mongoClient("Karttleman")("jobs")

  def allJobs = jobs.find().toList

}
