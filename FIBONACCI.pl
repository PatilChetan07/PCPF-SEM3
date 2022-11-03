      fib(0,0).
      fib(1,1).
      fib(N,Ans):-
      N >1,
      N1 is N-1,
      N2 is N-2,
      fib(N1,A1),
      fib(N2,A2),
      Ans is A1+A2.

# fib(6,Ans).
# Ans=8.
