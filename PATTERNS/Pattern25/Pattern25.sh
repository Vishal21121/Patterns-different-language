echo -n "Enter the number of rows:"
read n
start=1
for (( i = 1; i <= n; i++))
do
	if [ `expr $i % 2` -eq 0 ]
	then
	start=0
	else
	start=1
	fi
	for (( j = 1; j <= i; j++))
	do
	    echo -n $start " "
	    if [ $start -eq 1 ]
	    then
	    start=0
	    else
	    start=1
	    fi
	    
	done
	echo
done
