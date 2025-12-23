object Main {
  def main(args: Array[String]): Unit = {
    println("=== Scala Функциональное Программирование ===")
    
    // Базовые операции
    println("\n--- Базовые операции ---")
    BasicScala.main(Array())
    
    // Коллекции
    println("\n--- Коллекции ---")
    Collections.demonstrateCollections()
    
    // Обработка ошибок
    println("\n--- Обработка ошибок ---")
    ErrorHandling.demonstrateErrorHandling()
    
    // Pattern matching
    println("\n--- Pattern Matching ---")
    PatternMatching.demonstratePatternMatching()
    
    // Spark (требует установленного Spark)
    // SparkExample.main(Array())
  }
}

