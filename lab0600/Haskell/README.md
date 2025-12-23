# Лабораторная работа 1: Haskell

## Описание
Изучение основ функционального программирования на языке Haskell.

## Структура проекта
- `basics.hs` - базовый синтаксис и простые функции
- `recursion.hs` - рекурсивные функции
- `patterns.hs` - pattern matching
- `higher_order.hs` - функции высшего порядка
- `types.hs` - алгебраические типы данных
- `main.hs` - главный файл с демонстрацией

## Компиляция и запуск
```bash
ghc -o haskell_demo main.hs basics.hs recursion.hs patterns.hs higher_order.hs types.hs
./haskell_demo
```

Или через интерпретатор:
```bash
ghci
:load main.hs
main
```

