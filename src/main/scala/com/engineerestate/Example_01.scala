package com.engineerestate

import org.apache.spark.sql.SparkSession

object Example_01 {
  def main(args: Array[String]): Unit = {

    val spark: SparkSession = SparkSession.builder()
      .master("local[*]")
      .appName("Databricks And Airflow Integration")
      .getOrCreate()

    val conf = spark.sparkContext.getConf

    println("Here, we will orchestrate this job databricks job with Airflow")


  }
}
