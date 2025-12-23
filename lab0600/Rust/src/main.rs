mod ownership;
mod iterators_closures;
mod pattern_matching;
mod error_handling;
mod comparison;

fn main() {
    println!("=== Rust Функциональное Программирование ===\n");
    
    // Базовые операции и система владения
    ownership::main();
    
    // Итераторы и замыкания
    iterators_closures::demonstrate_iterators();
    iterators_closures::main();
    
    // Pattern matching
    pattern_matching::demonstrate_pattern_matching();
    
    // Обработка ошибок
    error_handling::demonstrate_error_handling();
    error_handling::main();
    
    // Сравнительный анализ
    println!("\n=== Сравнительный анализ ===");
    comparison::main();
}

