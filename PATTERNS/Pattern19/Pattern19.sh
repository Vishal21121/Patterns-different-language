#!/bin/bash

echo "enter the number:"
read n

for((row=1;row<=2*n-1;row++))
do
    if [[ $row -le $n ]]
    then
    Corep=$row
    spaceChange=$(( $n - $row + 1 ))
    else
    Corep=$(( 2 * $n - $row ))
    spaceChange=$(( $row - $n + 1 ))
    fi
    # Corep = row<=n ? row: 2*n-row;
    # spaceChange = row <= n ? n-row+1: (row-n)+1;
    for((k=1;k<=spaceChange;k++))
    do
        echo -n " "
    done
    for((col=1;col<=Corep;col++))
    do
        if [[ $col -eq 1 || $col -eq $Corep ]]
        then
            echo -n "* "
        else
            echo -n "  "
        fi
    done
    echo
done