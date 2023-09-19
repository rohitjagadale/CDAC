#!/bin/bash
read -p "Enter the upper limit : " limit
if [ $limit -lt 0 ] || [ $limit -gt 100 ]
then
echo "Input is Out of range"
else
echo "PID of process is :" $$
for (( i=$limit; i>=1;i-- ))
do
echo $i
done
fi

