echo "Enter the value of rows"
read num

for ((i=1; i<=num; i++))
do
    for ((j=1; j<=num; j++))
    do
        if [[ $((i%2)) -eq 1 && $((j%2)) -eq 1 || $((i%2)) -eq 0 && $((j%2)) -eq 0 ]]
        then
            printf "1"
        else
            printf "0"
        fi
    done
    printf "\n"
done
