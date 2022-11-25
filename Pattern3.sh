echo -n "Enter the number:"
read n
for((i=1;i<=2*n;i++))
do
if [ $i -le $n ]
then
flag=i
else
flag=`expr 2 \* $n - $i`
fi
for((j=1;j<=flag;j++))
do
echo -n "*"
done
echo
done