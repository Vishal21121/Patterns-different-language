#!/bin/bash

echo -n "Enter the number:"
read n

for ((i = 1; i <= n; i++ ))
do
    for ((k = n; k >= i; k--))
    do
        echo -n " "
    done
    for ((j = 1; j <= n; j++))
    do
        if [[ $i -eq 1 || $i -eq $n ]]
        then
            echo -n "*"
        elif [[ $j -eq 1 || $j -eq $n ]]
        then
            echo -n "*"
        else 
            echo -n " "
        fi
    done
    echo 
done