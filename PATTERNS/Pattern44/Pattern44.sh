#!/bin/bash

echo -n "Enter the number:"
read n

for (( i = 1; i <= 2*n-1; i++))
do
		if [[ $i -eq 1 || $i -eq $n || $i -eq $(( 2 * $n - 1)) ]]
        then
			echo -n " "
		fi
		for (( j = 1; j <= n; j++))
        do
			if [[ $i -eq 1 || $i -eq $n || $i -eq $(( 2 * $n - 1)) ]]
            then
				if [[ $j -gt 1 && $j -lt $n ]]
                then
					echo -n "*"
				fi
			else
				if [[ $j -eq 1 || $j -eq $n ]]
                then
					echo -n "*"
				else
					echo -n " "
				fi
			fi
		done
		echo 
done