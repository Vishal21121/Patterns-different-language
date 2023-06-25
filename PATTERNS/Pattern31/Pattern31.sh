#!/bin/bash

echo -n "Enter the number: "
read n
n=`expr $n \* 2 - 1`
for((i=1;i<=n;i++))
do
    for((j=1;j<=n;j++))
    do
        if [[ $i -eq $j || $j -eq $(($n+1-$i)) ]]
        then
            echo -n "*"
        else
           echo -n " "
        fi
    done
    echo
done