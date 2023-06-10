#!/bin/bash

echo "Enter the value of rows"
read num

for ((i=1; i<=num; i++))
do
    for ((j=1; j<=num-1; j++))
    do
        if [[ $i -eq 1 || $i -eq $num ]]
        then
            printf "*"
        else
            if [[ $j -eq 1 || $j -eq $num-1 ]]
            then
                printf "*"
            else
                printf " "
            fi
        fi
    done
    printf "\n"
done
