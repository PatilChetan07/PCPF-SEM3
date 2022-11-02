 rect:-
         write('enter length of rectangle'),nl,
         read(L),
         write('enter breadth of rectangle'),nl,
         read(B),
         Area is L*B,
         Perimeter is 2*(L+B),
         write('area of rect is:'),
         write(Area),nl,
         write('perimeter of rect is: '),
         write(Perimeter).
         
/* output we have to type rect. , 10 . , 5. 
?- rect.
enter length of rectangle
|: 10.
enter breadth of rectangle
|: 5.
area of rect is:50
perimeter of rect is: 30
true. 
*/
