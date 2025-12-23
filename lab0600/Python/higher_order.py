from functools import reduce

# Данные для работы
students = [
    {'name': 'Alice', 'grade': 85, 'age': 20},
    {'name': 'Bob', 'grade': 92, 'age': 22},
    {'name': 'Charlie', 'grade': 78, 'age': 19},
    {'name': 'Diana', 'grade': 95, 'age': 21},
    {'name': 'Eve', 'grade': 88, 'age': 20}
]

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

# map - преобразование данных
student_names = list(map(lambda student: student['name'], students))
print(f"Имена студентов: {student_names}")

# filter - фильтрация данных
top_students = list(filter(lambda student: student['grade'] >= 90, students))
print(f"Студенты с оценкой >= 90: {top_students}")

# reduce - свертка данных
product = reduce(lambda x, y: x * y, numbers)
print(f"Произведение чисел от 1 до 10: {product}")

# Комбинирование функций
def process_student_data(students):
    """Обработка данных студентов с использованием ФП"""
    # Цепочка преобразований
    result = list(
        map(lambda s: {
            'name': s['name'].upper(),
            'status': 'Excellent' if s['grade'] >= 90 else 'Good'
        },
        filter(lambda s: s['grade'] >= 80, students))
    )
    return result

processed_data = process_student_data(students)
print(f"Обработанные данные: {processed_data}")

# Практическое задание 1: Анализ данных студентов
def analyze_students(students):
    """Анализ данных студентов"""
    if not students:
        return {
            'average_grade': 0,
            'excellent_students': [],
            'total_count': 0
        }
    
    total_grade = reduce(lambda acc, s: acc + s['grade'], students, 0)
    average_grade = total_grade / len(students)
    
    excellent_students = list(
        map(lambda s: s['name'],
            filter(lambda s: s['grade'] >= 90, students))
    )
    
    return {
        'average_grade': average_grade,
        'excellent_students': excellent_students,
        'total_count': len(students)
    }

analysis = analyze_students(students)
print(f"\nАнализ студентов: {analysis}")

