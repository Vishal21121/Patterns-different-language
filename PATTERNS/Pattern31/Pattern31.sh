#!/bin/bash

echo "Enter the number of rows:"
read num
n=$((2*num-1))
for ((i=1; i<=n; i++))
do
    for ((j=1; j<=n; j++))
    do
        if [[ $i -eq $j || $j -eq $((n+1-i)) ]]
        then
            printf "*"
        else
            printf " "
        fi
    done    
    echo
done
