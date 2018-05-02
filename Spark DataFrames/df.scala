import org.apache.spark.sql.SparkSession // importing SparkSession

val spark = SparkSession.builder().getOrCreate() // either to build or create a new Session

val df = spark.read.csv("CitiGroup2006_2008") // importing csv file
//df.head(5) // how many sets do you want to print

for(row <- df.head(5)){
  println(row)
}
