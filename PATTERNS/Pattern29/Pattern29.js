// a
// B c
// D e F
// g H i J
// k L m N o

n = 5;
val = 97;
flag = 0;
for (i = 1; i <= n; i++)
{
    for (j = 1; j <= i; j++)
    {
        if (flag == 0)
        {
            process.stdout.write(`${String.fromCharCode(val)} `);
            flag = 1;
        }
        else
        {
            val = val - 32;
            process.stdout.write(`${String.fromCharCode(val)} `);
            flag = 0;
            val+=32;
        }
        val += 1;
    }
    process.stdout.write("\n");
}