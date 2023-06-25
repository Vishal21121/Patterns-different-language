#!/bin/bash

echo -n "Enter the number:"
read n

for ((row= 1; row <= 2*n-1; row++))
do
    if [[ $row -le $n ]]
    then
        limit=$(( $n - $row + 1))
    else
        limit=$(( $row - $n  + 1 ))
    fi
    for ((space= 1; space <= limit; space++))
    do
        echo -n " "
    done
    for ((col= 1; col <= limit; col++))
    do
        echo -n "*"
    done
    echo
done