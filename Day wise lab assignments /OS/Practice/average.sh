#!/bin/bash
read -p "Enter the first Number" num1
read -p "Enter The Seconf Number" num2
read -p "Enter The Third Number" num3

sum=$(( $num1 + $num2 + $num3 ))
echo "Total Marks is : $sum"
avg=$(echo "scale=4; $sum/3" | bc )
echo "Your average is :$avg"
