echo -n "Enter the number:"
read n
for ((i = 1; i <= (2 * n - 1); i++)) 
do
    if [ $i -le $n ]
    then
    k=i
    spaceChange=`expr $n - $i + 1`
    else
    k=`expr 2 \* $n - $i`
    spaceChange=`expr $i - $n + 1`
    fi
    for ((j = 1; j <= k; j++))
    do
        echo -n "*"
    done
    for((space=1;space<spaceChange;space++))
    do
        echo -n "  "
    done
    for ((j = k; j >= 1; j--))
    do
        echo -n "*"
    done
    echo
done