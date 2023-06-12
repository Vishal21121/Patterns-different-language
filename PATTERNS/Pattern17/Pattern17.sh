#!/bin/bash

echo "Enter the row number:"
read n

for ((i=1; i<=n; i++))
do
    for ((k=i; k<=n; k++))
    do
        echo -n " "
    done

    if [[ $i -lt $n ]]
    then
        col=$i
    else
        col=$((2 * n - 1))
    fi

    for ((j=1; j<=col; j++))
    do
        if [[ $col -lt $((2 * $n - 1)) ]]
        then
            if [[ $j -eq 1 || $j -eq $i ]]
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
