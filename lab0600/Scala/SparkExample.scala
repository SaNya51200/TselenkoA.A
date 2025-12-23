import org.apache.spark.sql.{SparkSession, DataFrame}
import org.apache.spark.sql.functions._

object SparkExample {
  
  case class SalesRecord(product: String, category: String, amount: Double, date: String)
  
  def createSparkSession(): SparkSession = {
    SparkSession.builder()
      .appName("ScalaFPSparkExample")
      .master("local[*]")
      .getOrCreate()
  }
  
  def demonstrateSparkOperations(spark: SparkSession): Unit = {
    import spark.implicits._
    
    println("=== Apache Spark Operations ===")
    
    // Создание тестовых данных
    val salesData = Seq(
      SalesRecord("iPhone", "electronics", 999.99, "2024-01-15"),
      SalesRecord("MacBook", "electronics", 1999.99, "2024-01-15"),
      SalesRecord("T-shirt", "clothing", 29.99, "2024-01-16"),
      SalesRecord("Jeans", "clothing", 79.99, "2024-01-16"),
      SalesRecord("iPhone", "electronics", 999.99, "2024-01-17"),
      SalesRecord("Book", "education", 15.99, "2024-01-17")
    )
    
    val salesDF = salesData.toDF()
    
    println("Исходные данные:")
    salesDF.show()
    
    // Функциональные преобразования с Spark
    val result = salesDF
      .filter(col("amount") > 50) // Фильтрация
      .groupBy("category") // Группировка
      .agg(
        sum("amount").as("total_sales"),
        avg("amount").as("avg_sale"),
        count("*").as("transaction_count")
      )
      .orderBy(desc("total_sales")) // Сортировка
    
    println("Агрегированные результаты:")
    result.show()
    
    // Использование функций высшего порядка
    val expensiveProducts = salesDF
      .map(row => (row.getAs[String]("product"), row.getAs[Double]("amount")))
      .filter { case (product, amount) => amount > 500 }
      .collect()
    
    println("Дорогие продукты:")
    expensiveProducts.foreach(println)
    
    // Обработка с использованием case classes
    val processedData = salesDF
      .as[SalesRecord]
      .map(record => record.copy(amount = record.amount * 1.1)) // 10% надбавка
      .filter(_.category != "education")
      .collect()
    
    println("Обработанные данные (без образования, +10%):")
    processedData.foreach(println)
  }
  
  // Практическое задание 3: Spark job для анализа данных
  def createSalesReport(df: DataFrame): DataFrame = {
    df
      .groupBy("date")
      .agg(
        sum("amount").as("total_revenue"),
        count("*").as("transaction_count")
      )
      .withColumn("avg_transaction", col("total_revenue") / col("transaction_count"))
      .orderBy(desc("total_revenue"))
  }
  
  def getPopularProducts(df: DataFrame, limit: Int = 5): DataFrame = {
    df
      .groupBy("product")
      .agg(
        sum("amount").as("total_sales"),
        count("*").as("sale_count")
      )
      .orderBy(desc("total_sales"))
      .limit(limit)
  }
  
  def getCategoryStats(df: DataFrame): DataFrame = {
    df
      .groupBy("category")
      .agg(
        sum("amount").as("total_revenue"),
        avg("amount").as("avg_price"),
        count("*").as("product_count")
      )
      .orderBy(desc("total_revenue"))
  }
  
  def main(args: Array[String]): Unit = {
    val spark = createSparkSession()
    
    try {
      demonstrateSparkOperations(spark)
      
      // Практическое задание 3
      import spark.implicits._
      val salesData = Seq(
        SalesRecord("iPhone", "electronics", 999.99, "2024-01-15"),
        SalesRecord("MacBook", "electronics", 1999.99, "2024-01-15"),
        SalesRecord("T-shirt", "clothing", 29.99, "2024-01-16"),
        SalesRecord("Jeans", "clothing", 79.99, "2024-01-16"),
        SalesRecord("iPhone", "electronics", 999.99, "2024-01-17"),
        SalesRecord("Book", "education", 15.99, "2024-01-17")
      )
      val salesDF = salesData.toDF()
      
      println("\n=== Практическое задание 3: Отчеты ===")
      println("Отчет по дням:")
      createSalesReport(salesDF).show()
      
      println("Популярные товары:")
      getPopularProducts(salesDF).show()
      
      println("Статистика по категориям:")
      getCategoryStats(salesDF).show()
    } finally {
      spark.stop()
    }
  }
}

