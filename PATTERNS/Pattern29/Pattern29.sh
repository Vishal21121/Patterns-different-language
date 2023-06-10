#!/bin/bash

echo "Enter the number:"
read num
val=97
flag=0

for ((i=1; i<=num; i++))
do
    for ((j=1; j<=i; j++))
    do
        if [[ flag -eq 0 ]]
        then
            char_value=$val
            char=$(printf "\\$(printf '%03o' "$char_value")")
            printf "%s " "$char"
            flag=1
        else
            val=$((val - 32))
            char_value=$val
            char=$(printf "\\$(printf '%03o' "$char_value")")
            printf "%s " "$char"
            flag=0
            val=$((val + 32))
        fi
        val=$((val + 1))
    done
    printf "\n"
done
