#!/bin/bash
read -p "Enter The basic salary" bsal
if [ $bsal -lt 1500 ] 
then
grossSal=$((bsal+((bsal/100)*10)+(bsal/100)*90))
else
grossSal=$(((bsal+500)+(bsal/100)*98))
fi
echo "Gross salary: $grossSal"
