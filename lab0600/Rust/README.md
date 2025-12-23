# Лабораторная работа 5: Rust и системное программирование

## Описание
Изучение применения функционального программирования в Rust.

## Структура проекта
- `src/ownership.rs` - система владения и заимствования
- `src/iterators_closures.rs` - итераторы и замыкания
- `src/pattern_matching.rs` - pattern matching с enum
- `src/error_handling.rs` - обработка ошибок с Result и Option
- `src/main.rs` - главный файл
- `Cargo.toml` - конфигурация проекта

## Компиляция и запуск
```bash
cargo build
cargo run
```

Или для release версии:
```bash
cargo build --release
cargo run --release
```

## Практические задания
1. ✅ `analyze_products` - анализ продуктов (средняя цена, количество доступных, дорогие продукты)
2. ✅ `validate_orders` - валидация цепочки заказов
3. ✅ `Fibonacci` - итератор для генерации чисел Фибоначчи (в отдельном файле, если требуется)

