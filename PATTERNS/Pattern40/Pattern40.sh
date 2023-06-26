#!/bin/bash

echo -n "Enter the number:"
read n

for(( i = 1; i <= n; i++)) 
do
		for(( j = 1; j <= n; j++)) 
        do
			if [[ $(($i % 2)) -ne 0 ]] 
            then
				if [[ $(($j % 2)) -ne 0 ]] 
                then
					echo -n "1"
				else
					echo -n "0"
				fi
			else
				if [[ $(($j % 2)) -ne 0 ]]
                then
					echo -n "0"
				else
					echo -n "1"
                fi
			fi
		done
		echo 
done