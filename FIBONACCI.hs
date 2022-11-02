--Fibonacci Series print
-- 1) input is int and returns int
fib :: Int -> Int
fib 0 = 0
fib 1 = 1
fib n = fib (n-1) + fib (n - 2)

--works like array to store multiple values
fibList n = map fib[0..n-1]

main =
    do
    putStrLn "Enter number of elements you want of fibonacci : "
    x <- readLn
    putStrLn "fibonacci series is :"
    print (fibList x)
