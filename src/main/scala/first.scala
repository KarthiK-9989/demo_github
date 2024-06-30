import org.apache.spark.sql.{SparkSession, functions => F}
import org.apache.spark.SparkConf

object first {

  def main(args: Array[String]): Unit = {

    // Create a SparkSession
    //    val spark = SparkSession.builder
    //
    //      .appName("Spark Aggregation Example")
    //      .set("spark.ui.enabled", "true")  // Enable Web UI
    //      .set("spark.ui.port", "4050")
    //      .getOrCreate()


    val sparkConf = new SparkConf()
      .setMaster("local[*]")
      .setAppName("Your Spark App")
      .set("spark.ui.enabled", "true")  // Enable Web UI
      .set("spark.ui.port", "4050")     // Set custom port

    val spark = SparkSession.builder.config(sparkConf).getOrCreate()




    val df=spark.read.option("header",true)
      .csv(args(0))





    df.show()



    // Stop the SparkSession
    spark.stop()

  }
}
