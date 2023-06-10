echo -n "Enter the number of rows:"
read n
for ((i = 1; i <= n; i++))
do
	for ((j = 1; j <= i; j++))
	do
	    echo -n $j
	done
	for ((k = i; k <= n - 1; k++))
	do
	    echo -n "  "
	done
	for (( j = i; j >= 1; j--))
	do
	    echo -n $j
	done
	echo 
done
