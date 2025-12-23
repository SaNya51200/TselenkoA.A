from functions_as_objects import square, apply_function, create_multiplier
from lambda_closures import create_counter
from higher_order import product, analyze_students, students
from comprehensions_generators import even_squares, prime_generator
from decorators import greet, logger

def main():
    print("=== Демонстрация функционального программирования в Python ===")
    
    # Функции как объекты
    print("\n1. Функции как объекты:")
    print(f"apply_function(square, 5) = {apply_function(square, 5)}")
    
    # Lambda и замыкания
    print("\n2. Lambda и замыкания:")
    counter = create_counter()
    print(f"Счетчик: {counter()}, {counter()}, {counter()}")
    
    # Функции высшего порядка
    print("\n3. Функции высшего порядка:")
    print(f"Произведение чисел: {product}")
    
    # Генераторы и включения
    print("\n4. Генераторы и включения:")
    print(f"Четные квадраты: {even_squares}")
    
    # Декораторы
    print("\n5. Декораторы:")
    greet("Мария")
    
    # Практические задания
    print("\n6. Практические задания:")
    analysis = analyze_students(students)
    print(f"Анализ студентов: {analysis}")
    
    print("\n7. Генератор простых чисел:")
    prime_gen = prime_generator()
    primes = [next(prime_gen) for _ in range(10)]
    print(f"Первые 10 простых чисел: {primes}")

if __name__ == "__main__":
    main()

