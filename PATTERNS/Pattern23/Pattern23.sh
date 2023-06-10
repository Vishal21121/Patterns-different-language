echo -n "Enter the number:"
read n
for((i=1;i<=2*n;i++))
do
    if [ $i -le $n ]
    then
    spaceCount=i
    colCount=n
    else
    spaceCount=`expr 2 \* $n - $i + 1`
    colCount=`expr 2 \* $i - $n - 1`
    fi
    for((j=i;j<=colCount;j++))
    do
        echo -n "*"
    done
    for ((col = 2; col <= spaceCount; col++))
    do
        echo -n "  "
    done
    for((j=i;j<=colCount;j++))
    do
        echo -n "*"
    done
    echo
done