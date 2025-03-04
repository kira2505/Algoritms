Big O notation :
O(1) - постоянная (константная) !!!самая эффективная оценка (О от константы) (код,
который не зависит от размера данных)
O(n) - linear (одинарные циклы с простым кодом внутри, например линейный поиск)
O(nˆ2) - quadratic (цикл в цикле(в зависимости от входных данных), обход 
двумерного массива, сортировка пузырьком)
O(nˆ3) - cubic 
O(log n) - logarithmic (постоянное деление входных данных пополам в цикле,
бинарный поиск(двоичный), поиск по дереву бинарному)
O(n logn) - linear log - сортировка слиянием, сортировка быстрая

Time complexity - временная сложность (описывает то, как растет сложность (время
выполнения) алгоритма с увеличением входных данных)
Space complexity - пространственная сложность выполнения алгоритма (про память и место)

array - n elements
find element in array
[1,2,5,19,8,8,6,5,3,6,12]
find 12 : return true if it exists

for(i = 0; i < array.length; i++) {
    if(k == array[i]) {
        return true;
    }
}
return false;

Time complexity O(n) linear

Big O - верхняя позиция наихудшего выполнения алгоритма


[1,2,5,19,8,8,6,5,3,6,12]

a = array[5];     O(1)
k = 12;           O(1)
k = k + 15;       O(1)
if(k == 12)       O(1)
i++               O(1)
i < array.length  O(1)

* Все что не зависит от входных данных - все имеет константную сложность


Time complexity = O(1) + O(1) = O(1 + 1) = O(2)
Время выполнения - это порядок роста функции, который показывает как растет
функция с изменением количества входных данных
{
k = 10;      O(1)
k = k + 25;  O(1)
}

Бывает константная сложность и сложность зависящая от входных данных 
(O(20) это нормально и так же считается константным временем)

array
Time complexity

for(i = 0; i < array.length; i++) {
    k = array[i];
}
В этом примере время выполнения зависит от количества элементов в массиве (входных данных)
Когда есть зависимость времени выполнения кода, от количества входных данных
то это называется "порядок роста" - который мы оцениваем как Big O

getSum(){
     sun = 0;     //1
     for(i = 0; i < array.length; i++) {    //1, 1 * n, 1 * n
         sum = sum + array[i];    //1
     }
     return sum;
}

sum = 0                : 1
i = 0                  : 1
i < array.length       : 1 * n
i++                    : 1 * n
sum = sum + array[i]   : 1 * n
return sum             : 1

1 + 1 + n + n + n + 1 = 3 + 3n = 3n = n = O(n)
Отдельные константы можно отбросить, потому что они никак не влияют на порядок роста
Когда сложность состоит из нескольких слагаемых, всегда остается самый худший случай
Принято все числа у параметров тоже отбрасывать 

----------------------------------------------
{
sum = 0;
for (i = 10; i < 10; i ++) {
    sum = sum + i;
    }
}
Time complexity = O(1);
Space complexity = O(1);