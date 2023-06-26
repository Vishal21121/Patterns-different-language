#!/bin/bash

echo -n "Enter the number:"
read n

for (( row= 1; row <= 2*n-1; row++ ))
do
	    if  [[ $row -le $n ]]
        then    
			if [[ $row -gt 1 ]]
            then
				Corep=$(( 2 * $row - 1))
			else
				Corep=$row
			fi
		else
			Corep=$(( 2 *( 2 * $n - $row ) - 1 ))
		fi
		if [[ $row -le $n ]]
        then
			spaceChange=$(( $n - $row + 1))
		else
			spaceChange=$(( $row - $n + 1))
		fi
		for ((space= 1; space <= spaceChange; space++))
        do
			echo -n " "
		done
		for ((col= 1; col <= Corep; col++))
        do
			echo -n "*"
		done
		echo
done