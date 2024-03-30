#!/bin/bash

echo -n "Enter the number of rows:"
read n
alphabet=(A B C D E F G H I J K L M N O P Q R S T U V W X Y Z)
    
    for ((i=n; i>=1; i--)); 
    do
        for ((j=i; j<=n; j++)); 
	do
            echo -n "${alphabet[j-1]} "
        done
        echo
    done
