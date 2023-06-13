#!/bin/bash

echo "enter the number:"
read n

for ((row = 1; row <= $((2 * $n - 1)); row++))
do
    if [[ $row -le $n ]]
    then
    colCount=$row
    else
    colCount=$(( 2 * $n - $row ))
    fi
    # colCount = row <= n ? row : 2 * n - row
    spaceCount=$(( $n - $colCount + 1 ))
    for((k=1;k<=spaceCount;k++))
    do
        echo -n " "
    done
    for((col=colCount;col>=1;col--))
    do
        echo -n "$col"
    done
    for((col=2;col<=colCount;col++))
    do
        echo -n "$col"
    done
    echo
    # echo "count: $row"
done