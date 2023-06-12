#!/bin/bash

echo "enter the number:"
read n
for ((i=1;i<=n;i++))
do
    for((k=1;k<=i;k++))
    do
        echo -n " "
    done
    if [[ $i -eq 1 ]]
    then
    col=$((2 * $n - 1))
    else
    col=$n
    fi
    for((j=i;j<=col;j++))
    do
        if [[ $col -lt $((2 * $n - 1)) ]]
        then
            if [[ $j -eq $i || $j -eq $n ]]
            then
                echo -n "* "
            else
                echo -n "  "
            fi
        
        else
            echo -n "*"
        fi

    done
    echo
done