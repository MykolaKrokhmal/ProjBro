package com.krokhmal.lessons;


public class Lesson002 {
    public static void main(String[] args) {
        /*****************************************************************************************************************
                                                         ЭТИ ПРАВИЛА ВАЖНО ПОМНИТЬ
        ******************************************************************************************************************/
        // 1
        // Это откомпилируется корректно, т.к. числовые значения ясны и компилятор понимает, что выхода за диапазон не будет.
        byte b = 1 + 2;
        byte b1 = 1;
        // 2
        // А вот уже с выражением b1 + 1 необходимо приведение типов, т.к. тут значение b1 уже не известно компилятору
        b = (byte)(b1 + 1);
        b = (byte)(b + b1);

        System.out.println("b = " + b);
        // 3
        // константу можно присвоить без приведения типов, т.к. компилятор знает значение.
        // Если мы в константу забъем значение 128 (макс. значение типа), то компилятор отругается на В + 1,
        // т.к. результат уже будет выходить за диапазон.
        final byte B = 126;
        b = B + 1;
        System.out.println("b = " + b);
        // 4
        // Если мы ставим перед q знак "-", то надо делать приведение типов.
        byte q = 1;
        q = (byte)-q;
        System.out.println("q = " + q);
        // 5
        // Чтобы присвоить int в byte необходимо делать приведение типа.
        int i = 158;
        b = (byte)i;
        System.out.println("b = " + b);

        // 6
        // Не надо делать приведение типа для константы типа int при присвоении в переменную byte,
        // когда ее значение парадает в диапазон типа byte.
        final int D = 3;
        b = D; System.out.println("b = " + b);
        //потеря точности при присвоении int -> float and long -> float and long -> double
        int n = 123456789;
        float f1 = n;
        n = (int)f1;
        System.out.println("int to float and back " + f1);

        // 7
        // Следующие выражения компилятор не проверяет. Просто так решили создатели.
        b += i++; System.out.println("b = " + b);
        b += 1000; System.out.println("b = " + b);
        b *= 2; System.out.println("b = " + b);
        float f = 1.1f;
        b /= f;
        // Конец 7-го.

        //только так пройдет запись цифры, что выходит за диапазон
        // буква L пишется только, когда цифра выходит за диапазон int
        int i1 = (int)2_200_000_000L;
        // Следующая операция пройдет и компилятор не заметит, что результат сложения будет выходить за диапазон.
        // Надо это контролировать самому
        int a1 = 1_100_000_000;
        int a2 = 1_100_000_000;
        int a3 = a1 + a2;
        System.out.println("a3 = " + a3);

        // Проблемы деления

        int i5 = 3/2; // получится 1.
        double d = 3/2.; // после 2. ноль писать не обязательно. Он и так понимает. Хотя с нулем читабельней.

        // Унарные ++,--, +=, -=, *=, /=
        // Бинарные операции: +,-,*,/
        // Тернарные ?:

        int i6 = 1;
        i6++;
        System.out.println(i6);

        int i7 = i6++; // вначале i6 присваивается i7, а потот итолько ++
        System.out.println(i7);

        char c = 'A'; System.out.println(c);

        char c1 = 45; System.out.println(c1);

        int  i8 = c;
        System.out.println(i8);
        i8 = Character.getNumericValue(c); // Если тут преобразовывать не числа или буквы, то будет -1. Это значит ошибка
        System.out.println(i8);

        // Операции с логическим типом
        // ==, >, <, >=, <=, !=
        // &&, || прерывает как только находит первый, что не удовлетворяет условию
        // &, | в любом случае проверяет все до конца.

        /*
        Приоритеты арифметических операций
        --------------------------------------------------------------------------------
        Категория                               Оператор	            Ассоциативность
        --------------------------------------------------------------------------------
        Постфикс	                            () [] . (точка)	        Слева направо
        Унарный	                                ++ - - ! ~	            Справа налево
        Мультипликативный	                    * / %	                Слева направо
        Аддитивный	                            + -	                    Слева направо
        Сдвиг	                                >> >>> <<	            Слева направо
        Реляционный	                            > >= < <= instanceof    Слева направо
        Равенство	                            == !=	                Слева направо
        Побитовое «И» («AND»)	                &	                    Слева направо
        Побитовое исключающее «ИЛИ» («XOR»)	    ^	                    Слева направо
        Побитовое «ИЛИ» («OR»)	                |                       Слева направо
        Логическое «И» («AND»)	                &&	                    Слева направо
        Логическое «ИЛИ» («OR»)	                ||	                    Слева направо
        Условный	                            ?:	                    Справа налево
        Присваивание	                        = += -= *= /= %=        Справа налево
                                                >>= <<= &= ^= |=
        Запятая	                                ,	                    Слева направо
        */


/*

        //Var. 2 Best variant
        x = x + y - (y = x);
        //Var. 3 Second best variant
        x = x ^ y ^ (y = x);
        System.out.print("x = " + x);
        System.out.println("; y = " + y);
        // End of homework

        int fourthBitFromRight = (56 & (1 << 3)) >> 3;
*/

    }
}
