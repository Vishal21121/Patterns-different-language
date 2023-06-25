#!/bin/bash

echo -n "Enter the number:"
read n
flag
for ((i= 1; i < 2*n; i++))
do
   if [[ $i -le $n ]]
        then
			flag=$i
		else 
			flag=$(( 2 * $n - $i))
		fi
		flag1=$n
		for(( k=flag1; k >= 1; k--)) 
        do
			echo -n " "
		done
		for ((j=flag1; j >= flag; j--)) 
        do
			if [[ $j -eq $flag1 || $j -eq $flag ]]
            then
				echo -n "* "
			else 
				echo -n "  "
			fi

		done
		echo 
done