#!/bin/bash

echo -n "Enter the number:"
read n
flag=1
for(( i = 1; i <= 2*n-1; i++ ))
do
    if [[ $i -eq $n ]]
    then
        flag=$(( 2 * $n - 1))
    fi
    for ((k=1; k <= n-flag; k++)) 
    do
        echo -n " "
    done
    for(( j= 1; j <= flag; j++ ))
    do
        echo -n "+"
    done
    flag=1
    echo
done