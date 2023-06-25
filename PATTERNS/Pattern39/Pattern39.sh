#!/bin/bash

echo -n "Enter the number:"
read n

for ((i = 1; i <= n+(n-3); i++)) 
do
		for ((k = i; k <= n; k++)) 
        do
			echo -n " "
		done
		if [[ $i -lt $n ]] 
        then
			col=$i
		else 
			col=$n
		fi
		for ((j = 1; j <= col; j++))
        do
			if [[ $col -lt $n ]]
            then
				if [[ $j -eq 1 || $j -eq $i ]]
                then
					echo -n "* "
				else
					echo -n "  "
				fi
			elif [[ $i -eq $n && $j -le $col ]]
            then
				echo -n "* "
			else
				if [[ $j -eq 1 || $j -eq $col ]]
                then
					echo -n " *"
				else 
					echo -n "  "
				fi
			fi
		done
		echo 
done