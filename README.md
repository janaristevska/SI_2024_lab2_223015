# SI_2024_lab2_223015
**Јана Ристевска 223015**

**Control Flow Graph**
![graph](https://github.com/janaristevska/SI_2024_lab2_223015/assets/138867404/c2ca74a1-41be-40c6-b76e-970fbd3b7554)

**Цикломатска комплексност**

Цикломатската комплесност на кодот е 10. Ја пресметав со формулата: број на предикатни јазли + 1. Во кодот имаме 9 предикатни јазли, па според формулата 9 + 1 = 10.

**Тест случаи според критериумот Every Branch**

![image](https://github.com/janaristevska/SI_2024_lab2_223015/assets/138867404/b33d107e-fedd-403b-9b02-7c36768d945a)

1) No barcode

allItems = [item1, item2, item3 ] payment = 700

allItems = [[“item1”, “456789”, 200, 0.5], [“item2”, “0694512”, 450, 0.6], [“item3”, null, 300, 0.1]]

Од листата allitems имаме производ кој не содржи barcode. Поради тоа ќе фрли исклучок со порака „No barcode” и програмата ќе заврши. 

2) Invalid character, barcode starts at 0, item with no name

allItems = [item1, item2, null ] payment = 700

allItems = [[“item1”, “456789”, 200, 0], [“item2”, “0694512”, 150, 0.5], [null, “a8f5d1f5”, 320, 0]]

Од листата allitems имаме производи кои немаат име, прозиводи каде баркодот им започнува со 0 и производи кои во баркодот содржат букви. Поради тоа програмата ќе фрли исклучок со порака „Invalid character in item barcode!” и ќе заврши. 

3) All valid sum > payment

allItems = [item1, item2, item3 ] payment = 700

allItems = [[“item1”, “456789”, 200, 0], [“item2”, “0694512”, 450, 0.1], [“item3”, “964823”, 500, 0]]

Од листата allitems сите производи се валидни во овој тест. Сумата sum ќе биде поголема од payment и така програмата враќа false.

4) All valid sum < payment

allItems = [item1, item2, item3 ] payment = 700

allItems = [[“item1”, “456789”, 200, 0], [“item2”, “0694512”, 310, 0.1], [“item3”, “964823”, 220, 0]]

Од листата allitems сите производи се валидни во овој тест. Сумата sum ќе биде помала од payment и така програмата враќа true.

5) allItems = null, payment = anything

Во овој случај листата allitems ни е празна и затоа програмата ќе заврши веднаш со што ќе фрли исклучок со порака „RuntimeException”.

**Тест случаи според критериумот Multiple Condition**

![image](https://github.com/janaristevska/SI_2024_lab2_223015/assets/138867404/4cbb0d73-b130-4d70-a522-2d0cb8ce484f)

1)  T && T && T = T    
Резултатот на целиот израз ќе биде True, доколку сите услови се True.
2) T && F && X = F     
Доколку првиот услов е True и вториот е False, oвај случај секогаш ќе враќа False, без разлика која е вредноста на X. 
3) T && T && F = F
Овај случај ќе враќа False затоа што барем една од вредностите на случаите е  False.      
4) F && X && X = F     
Без разлика кои се резултатите од вториот и третиот услов, овај случај ќе врати Falsе. 


