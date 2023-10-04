// 1
// 2  3
// 4  5  6
// 7  8  9  10
// 11 12 13 14 15
n = 5
count = 0
for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= i; j++)
        {
            count++;
            process.stdout.write(`${count}`+ " ");
        }
        console.log()
    }