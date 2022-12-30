echo -n "Enter the number:"
read n
for((i=1;i<=n;i++))
do
for((k=i;k<=n;k++))
do
echo -n " "
done
for((j=1;j<=i;j++))
do
echo -n "*"
done
echo
done