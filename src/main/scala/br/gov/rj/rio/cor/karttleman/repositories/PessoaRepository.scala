package br.gov.rj.rio.cor.karttleman.repositories

import org.joda.time.DateTime
import com.mongodb.casbah.Imports._
import com.mongodb.util.JSON

object PessoaRepository {

  val mongoClient = MongoClient()
  val pessoas = mongoClient("Karttleman")("pessoas")

  def allPessoas = pessoas.find().toList

}
