#!/bin/bash

echo "Enter a number:"
read num
for((i=0;i<=num;i++))
do
    for((j=0;j<=i;j++))
    do
        char_value=$((j + 65))
        char=$(printf "\\$(printf '%03o' $char_value)")
        printf "%s " "$char"
    done
    echo " "
done    