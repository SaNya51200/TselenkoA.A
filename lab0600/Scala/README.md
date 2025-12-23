# Лабораторная работа 4: Scala и большие данные

## Описание
Изучение применения функционального программирования в Scala и работы с Apache Spark.

## Структура проекта
- `BasicScala.scala` - базовый синтаксис и функции
- `Collections.scala` - работа с коллекциями
- `ErrorHandling.scala` - обработка ошибок с Option и Either
- `PatternMatching.scala` - pattern matching и case classes
- `SparkExample.scala` - работа с Apache Spark
- `Main.scala` - главный файл
- `build.sbt` - конфигурация проекта

## Компиляция и запуск

### Без Spark
```bash
scalac *.scala
scala Main
```

### С Spark (требует установленного Spark)
```bash
sbt compile
sbt run
```

Или отдельные модули:
```bash
sbt "runMain BasicScala"
sbt "runMain Collections"
sbt "runMain ErrorHandling"
sbt "runMain PatternMatching"
sbt "runMain SparkExample"
```

## Практические задания
1. ✅ `analyzeSales` - анализ продаж (в Collections.scala)
2. ✅ `processOrderPipeline` - обработка цепочки операций с ошибками
3. ✅ `createSalesReport`, `getPopularProducts`, `getCategoryStats` - Spark отчеты

