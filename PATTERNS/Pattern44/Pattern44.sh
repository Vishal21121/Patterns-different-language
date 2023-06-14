#!/bin/bash

printPattern() {
    local n=$1
    local i j

    # Print top line
    for ((i=0; i<n; i++))
    do
        if ((i==0 || i==n-1))
        then
            printf " "
            continue
        fi
        printf "*"
    done
    printf "\n"

    # Print middle lines
    for ((i=0; i<n-2; i++))
    do
        printf "*"
        for ((j=0; j<n-2; j++))
        do
            printf " "
        done
        printf "*\n"
    done

    # Print bottom line
    for ((i=0; i<n; i++))
    do
        if ((i==0 || i==n-1))
        then
            printf " "
            continue
        fi
        printf "*"
    done
    printf "\n"

    # Print additional lines
    for ((i=0; i<n-2; i++))
    do
        printf "*"
        for ((j=0; j<n-2; j++))
        do
            printf " "
        done
        printf "*\n"
    done

    # Print final line
    for ((i=0; i<n; i++))
    do
        if ((i==0 || i==n-1))
        then
            printf " "
            continue
        fi
        printf "*"
    done
    printf "\n"
}

echo "Enter an Integer: "
read n

printPattern "$n"
