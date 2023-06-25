#!/bin/bash

echo -n "Enter the number:"
read n

for(( i = 1; i <= 2*n-1; i++)) 
do
    for ((k= 2*n - 1; k >= i; k--))
    do
        echo -n "  "
    done
    for ((j = 1; j <= i; j++)) 
    do
        if [[ $j -eq 1 || $j -eq $i ]]
        then
            echo -n "* "
        elif [[ $i -eq $((2*$n-1)) ]]
        then
            echo -n "* "
        else
            echo -n "  "
        fi
    done
    echo 
done