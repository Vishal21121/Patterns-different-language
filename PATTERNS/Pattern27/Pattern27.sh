#!/bin/bash

min() {
    if (( $1 < $2 )); then
        echo $1
    else
        echo $2
    fi
}

echo "Enter the number:"
read n

for ((i=0; i<2*n-1; i++))
do
    for ((j=0; j<2*n-1; j++))
    do
        val=$((n-$(min $(min $j $((2*(n-1)-j))) $(min $i $((2*(n-1)-i))))))

        printf "%d " $val
    done
    printf "\n"
done
