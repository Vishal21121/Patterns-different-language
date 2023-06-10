echo -n "Enter the number:"
read n
for((i=1;i<=n;i++))
do
for((j=i;j<=n;j++))
do
echo -n "*"
done
echo
done