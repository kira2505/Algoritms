Итеративный или рекурсивный подход
Итеративный подход - это наш обычный цикл (закончится в любом случае)

Рекурсивный подход - это процесс когда метод вызывает сам себя
1) Рекуррентный случай - то действие когда мы вызываем нашу рекурсию
2) Базовый случай - то действие когда нужно перестать вызывать рекурсию


    public static void printDigitReverse(int k) {

        if (k == 0) {
            return;
        }
        //recurrent case
        System.out.println(k);
        printDigitReverse(k - 1);
    }

{  // k = 3;
      if(k == 0) return;
      // print 3
      { // k = 2;
           if(k == 0) return;
           // print 2
           { // k = 1;
                if(k == 0) return;
                // print 1
                { // k = 0;
                     if(k == 0) return;
                }
           }
      }
}

    public static void printDigitReverseTwo(int k) {
        if (k == 0) {
            return;
        }
        printDigitReverseTwo(k - 1);
        System.out.println(k);
        //сначала метод вызывает сам себя до 0 потом возвращает значения в
        //обратном порядке
    }

{ // k = 3;
     if (k == 0) return;
     { // k = 2;
          if (k == 0) return;
          { // k = 1;
               if (k == 0) return;
               { // k = 0;
                    if (k == 0) return;
               }
               // print 1
          }
          // print 2
     }
     // print 3
}

