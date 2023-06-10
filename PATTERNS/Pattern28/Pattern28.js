// E
// D E
// C D E
// B C D E
// A B C D E

n = 5
for (i = 0; i <n; i++)
{
    val = n-i;
    for (j = 0; j <=i; j++)
    {   
        process.stdout.write(`${String.fromCharCode(64+val+j)} `);
    }
    process.stdout.write("\n");
}