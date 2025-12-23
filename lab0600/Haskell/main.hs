module Main where

import Basics (square, add, absolute, grade)
import Recursion (factorial, sumList, length', fibonacci)
import Patterns (addVectors, first, second, third, describeList)
import HigherOrder (map', filter', foldl', compose)
import Types (Day(..), Point(..), List(..), isWeekend, distance, toStandardList)

main :: IO ()
main = do
    putStrLn "=== Демонстрация работы функций ==="
    
    -- Базовые функции
    putStrLn "\n1. Базовые функции:"
    print $ square 5
    print $ grade 85
    
    -- Рекурсия
    putStrLn "\n2. Рекурсия:"
    print $ factorial 5
    print $ sumList [1, 2, 3, 4, 5]
    print $ fibonacci 10
    
    -- Pattern matching
    putStrLn "\n3. Pattern Matching:"
    print $ addVectors (1, 2) (3, 4)
    print $ describeList [1]
    print $ describeList [1, 2, 3]
    
    -- Функции высшего порядка
    putStrLn "\n4. Функции высшего порядка:"
    print $ map' square [1, 2, 3, 4]
    print $ filter' even [1, 2, 3, 4, 5, 6]
    print $ foldl' (+) 0 [1, 2, 3, 4, 5]
    
    -- Алгебраические типы
    putStrLn "\n5. Алгебраические типы данных:"
    print $ distance (Point 0 0) (Point 3 4)
    print $ isWeekend Saturday
    print $ isWeekend Monday
    
    -- Практические задания
    putStrLn "\n6. Практические задания:"
    print $ countEven [1, 2, 3, 4, 5, 6, 7, 8]
    print $ positiveSquares [-2, -1, 0, 1, 2, 3, 4]
    print $ bubbleSort [5, 2, 8, 1, 9, 3]

-- Задание 1: Количество четных чисел в списке
countEven :: [Int] -> Int
countEven = length . filter even

-- Задание 2: Список квадратов только положительных чисел
positiveSquares :: [Int] -> [Int]
positiveSquares = map (^2) . filter (>0)

-- Задание 3: Пузырьковая сортировка
bubbleSort :: [Int] -> [Int]
bubbleSort [] = []
bubbleSort xs = bubbleSort (init sorted) ++ [last sorted]
    where
        sorted = bubblePass xs
        bubblePass [] = []
        bubblePass [x] = [x]
        bubblePass (x:y:xs)
            | x > y = y : bubblePass (x:xs)
            | otherwise = x : bubblePass (y:xs)

