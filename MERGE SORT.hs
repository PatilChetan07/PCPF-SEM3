mergIst [][]z = reverse z
mergIst (x:xs)[] z= mergIst xs [] (x:z)
mergIst[] (y:ys) z= mergIst [] ys (y:z)
mergIst (x:xs) (y:ys) z= if x<=y then mergIst xs (y:ys) (x:z) else mergIst (x:xs) ys (y:z)
main = print(mergIst[1,4,8,20][12,15,18,25,30][])
                   -- enter two SORTED merge list.
                   -- [1,4,8,12,15,18,20,25,30] -output
