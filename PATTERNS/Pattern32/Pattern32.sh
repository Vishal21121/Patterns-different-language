#!/bin/bash

echo "Enter the input n where row = 2*n - 1: "
read n

for ((i=1; i<2*n; i++))
do
    if ((i <= n))
    then
        flag=$i
    else
        flag=$((2*n - i))
    fi

    flag1=$n
    for ((k=flag1; k>0; k--))
    do
        printf " "
    done

    for ((j=flag1; j>=flag; j--))
    do
        if ((j == flag1 || j == flag))
        then
            printf "* "
        else
            printf "  "
        fi
    done

    printf "\n"
done
