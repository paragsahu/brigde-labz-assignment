
#!/bin/bash
n=11
r=10
i=1
while [ $i -le $r ]
do
    arr=`expr $n \* $i`
    echo ${arr[@]}
    i=`expr $i + 1`
done
