#!/bin/bash

n=7
for ((i = 1; i <= n; i++))
do
		for(( j = 1; j <= n; j++)) 
        do
			if [[ $i -le $(( ($n + 1) / 2)) ]]
            then
				if [[ $i -eq 1 && ( $j -eq 1 || $j -ge $((( $n + 1 ) / 2))) ]] 
                then
					echo -n "* "
				elif [[ $i -gt 1 && $j -eq $((($n + 1) / 2)) || $j -eq 1 ]]
                then
					echo -n "* "
				elif [[ $i -eq $((( $n + 1) / 2)) ]]
                then
					echo -n "* "
				else 
					echo -n "  "
                fi
				
			else
				if [[ $i -lt $n && ( $j -eq $((( $n + 1 ) / 2 )) || $j -eq $n )]] 
                then
					echo -n "* "
				elif [[ $i -eq $n && ( $j -le $((( $n + 1 ) / 2 ))) || $j -eq $n ]]
                then
					echo -n "* "
				else 
					echo -n "  "
				fi
			fi
		done
		echo 
done