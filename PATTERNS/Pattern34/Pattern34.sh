#!/bin/bash

echo "Enter the row number: "
read n

for ((i=1; i<2*n; i++))
do
    for ((k=2*n-1; k>=i; k--))
    do
        printf "  "
    done

    for ((j=1; j<=i; j++))
    do
        if [[ $j -eq 1 || $j -eq i || $i -eq 2*n-1 ]]
        then
            printf "* "
        else
            printf "  "
        fi
    done

    printf "\n"
done
