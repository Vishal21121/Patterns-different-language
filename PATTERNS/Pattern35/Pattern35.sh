#!/bin/bash

echo "Enter the number of rows:"
read num

for((i=0;i<num;i++))
do
    for((k=num-i-1;k>=0;k--))
    do
        printf " "
    done
    printf "*"
    for((k=num-2;k>0;k--))
    do
        if [[ i -eq 0 || i -eq num-1 ]]
        then
            printf "*"
        else
            printf " "
        fi
    done
    printf "*\n"
done    