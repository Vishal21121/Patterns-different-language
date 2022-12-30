echo -n "Enter the number:"
read n
for ((row = 1; row <= 2*n-1; row++)) 
do
    if [ $row -le $n ]
    then
    Corep=row
    spaceChange=n-row+1
    else
    Corep=2*n-row
    spaceChange=(row-n)+1
    fi
    for ((space = 1; space <= spaceChange; space++)) 
    do
        echo -n " "
    done
    for ((col = 1; col <= Corep; col++)) 
    do
        echo -n "* "
    done
    echo
done