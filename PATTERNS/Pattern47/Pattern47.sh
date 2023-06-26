#!/bin/bash

echo -n "Enter the number:"
read n
for (( i = 1; i<=n;i++))
do
		for ((j=n;j>=1;j--))
        do
			if [[ $i -eq $j ]]
            then
				echo -n "*"
			else
				echo -n $j
			fi
		done
		echo
done