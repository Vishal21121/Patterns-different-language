#!/bin/bash

echo -n "Enter the number:"
read n

for(( k=i=1;i<=n;i++))
do
	I=$(($k + $i - 1))
    for ((j=1;j<=i;j++))
    do
        if [[ $(($i % 2)) -eq 1 ]]
        then
            echo -n $k" "
        else
            echo -n $I" "
        fi
        k=$((k+1))
        I=$((I-1))
    done 
    echo
done