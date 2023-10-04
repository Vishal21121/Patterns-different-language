echo -n "enter the number:"
read n

for((i=1;i<=2*n;i++))
do
     if [ $i -le $n ]
     then
     flag=i
     else
     flag=`expr 2 \* $n - $i + 1`
     fi
     flag1=n
    for(( k =1;k<=flag;k++))
    do
       echo -n " "
    done
    for((j=flag1;j>=flag;j--))
    do
        echo -n "* "
    done
    echo
done