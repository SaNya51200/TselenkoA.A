# Лабораторные работы по функциональному программированию

## Описание
Набор лабораторных работ по изучению функционального программирования на различных языках.

## Структура проекта

```
forsanya/
├── Haskell/              # Лабораторная работа 1: Haskell
│   ├── basics.hs
│   ├── recursion.hs
│   ├── patterns.hs
│   ├── higher_order.hs
│   ├── types.hs
│   ├── main.hs
│   ├── Comparison.hs
│   └── README.md
├── Python/               # Лабораторная работа 2: Python
│   ├── functions_as_objects.py
│   ├── lambda_closures.py
│   ├── higher_order.py
│   ├── comprehensions_generators.py
│   ├── decorators.py
│   ├── main.py
│   ├── comparison.py
│   └── README.md
├── JS/                   # Лабораторная работа 3: JavaScript
│   ├── array-methods.js
│   ├── functions-closures.js
│   ├── immutability.js
│   ├── async-fp.js
│   ├── react-functional.js
│   ├── comparison.js
│   ├── index.html
│   └── README.md
├── Scala/                # Лабораторная работа 4: Scala
│   ├── BasicScala.scala
│   ├── Collections.scala
│   ├── ErrorHandling.scala
│   ├── PatternMatching.scala
│   ├── SparkExample.scala
│   ├── Main.scala
│   ├── Comparison.scala
│   ├── build.sbt
│   └── README.md
├── Rust/                 # Лабораторная работа 5: Rust
│   ├── src/
│   │   ├── ownership.rs
│   │   ├── iterators_closures.rs
│   │   ├── pattern_matching.rs
│   │   ├── error_handling.rs
│   │   ├── comparison.rs
│   │   └── main.rs
│   ├── Cargo.toml
│   └── README.md
├── comparison_table.md   # Таблица сравнительного анализа
├── ОТЧЕТ.md             # Итоговый отчет
└── README.md            # Этот файл
```

## Сведения о студенте
- **Студент:** Целенко Александр Андреевич
- **Группа:** ПИН-Б-О-24-2
- **Дисциплина:** Технологии программирования

## Лабораторные работы

### Лабораторная работа 1: Haskell
Изучение основ функционального программирования на чисто функциональном языке.

### Лабораторная работа 2: Python
Изучение функциональных возможностей в Python: функции высшего порядка, замыкания, декораторы.

### Лабораторная работа 3: JavaScript
Изучение функционального программирования в JavaScript и React.

### Лабораторная работа 4: Scala
Изучение ФП в Scala и работа с Apache Spark.

### Лабораторная работа 5: Rust
Изучение ФП в Rust с акцентом на систему владения и безопасность.

### Лабораторная работа 6: Сравнительный анализ
Сравнение реализации ФП концепций во всех изученных языках.

## Запуск проектов

### Haskell
```bash
cd Haskell
ghc -o haskell_demo main.hs basics.hs recursion.hs patterns.hs higher_order.hs types.hs
./haskell_demo
```

### Python
```bash
cd Python
python main.py
```

### JavaScript
```bash
cd JS
# Откройте index.html в браузере или используйте Node.js
node array-methods.js
```

### Scala
```bash
cd Scala
sbt compile
sbt run
```

### Rust
```bash
cd Rust
cargo build
cargo run
```

## Дополнительная информация

Все лабораторные работы содержат:
- Исходный код с примерами
- Практические задания
- README с инструкциями по запуску
- Документацию

Итоговый отчет находится в файле `ОТЧЕТ.md`.

