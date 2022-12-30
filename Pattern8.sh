echo -n "enter the value:"
read n
i=1
count=0
while [ $i -le $n ]
do
	j=1
	while [ $j -le $i ]
	do
		count=`expr $count + 1`
		echo -n $count " "
		j=`expr $j + 1`
		
	done
	i=`expr $i + 1`
	echo
done
		