#!/bin/bash

echo "Enter a number: "
read rows

for ((i=0; i<rows; i++))
do
    for ((j=0; j<rows-1-i; j++))
    do
        printf " "
    done

    for ((k=0; k<i+1; k++))
    do
        if ((i>1 && i<rows-1 && k>0 && k<i))
        then
            printf "  "
        else
            printf "* "
        fi
    done

    printf "\n"
done

for ((i=0; i<rows-3; i++))
do
    for ((j=0; j<rows; j++))
    do
        if ((j==0 || j==rows-1))
        then
            printf "* "
        else
            printf "  "
        fi
    done

    printf "\n"
done
