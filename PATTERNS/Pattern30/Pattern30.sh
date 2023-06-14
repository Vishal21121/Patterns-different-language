#!/bin/bash

echo "Enter the number of rows"
read num
val=$((num+64))
for ((i=num; i>=1; i--))
do
    print1=$val
    for ((j=1; j<=i; j++))
    do
        char_value=$print1
        char1=$char_value
        char=$(printf "\\$(printf '%03o' "$char1")")
        printf "%s " "$char"
        print1=$((print1-1))
    done
    val=$((val-1))
    echo " "
done
