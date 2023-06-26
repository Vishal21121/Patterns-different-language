#!/bin/bash

echo -n "Enter the number:"
read n

for ((i = 1; i <= 2*n-1; i++)) 
do
		if [[ $i -le $n ]] 
        then
			flag=$i
		else
			flag=$((2 * $n - $i ))
		fi
		flag1=$n
		for (( k = 1; k <= flag; k++))
        do 
			echo -n " "
        done
		for ((j = flag; j <= flag1; j++)) 
        do
			echo -n $j" "
		done
		echo
done