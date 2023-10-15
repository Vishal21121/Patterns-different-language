#!/bin/bash

isPrime() {
    num=$1
    if [ $num -le 1 ]; then
        echo 0
    else
        for ((i=2; i*i<=num; i++)); do
            if [ $((num % i)) -eq 0 ]; then
                echo 0
                return
            fi
        done
        echo 1
    fi
}

printLineOfPrimes() {
    offset=$1
    lineDigits=$2
    max=$3

    if [ $lineDigits -ge $max ]; then
        return
    fi

    primesInThisLine=0
    space=$((max - lineDigits))

    for ((i=0; i<space; i++)); do
        echo -n "  "
    done

    while [ $primesInThisLine -lt $lineDigits ]; do
        if [ $(isPrime $offset) -eq 1 ]; then
            echo -n "$offset  "
            ((primesInThisLine++))
        fi

        ((offset++))
    done

    echo
    printLineOfPrimes $offset $((lineDigits+1)) $max
}

echo -n "Enter the number of lines N : "
read n

printLineOfPrimes 1 1 $((n+1))
