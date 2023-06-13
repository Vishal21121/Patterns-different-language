#!/bin/bash

echo "enter the number:"
read n

for ((i=1; i <=n; i++)) 
do
    for((k=i;k<=n;k++))
    do
        echo -n "  "
    done
    for((j = i;j>=1;j--))
    do
        echo -n "$j "
    done
    for((p = 2;p<=i;p++))
    do
        echo -n "$p "
    done
    echo
done