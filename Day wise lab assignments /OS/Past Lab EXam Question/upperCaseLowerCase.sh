#!/bin/bash
read -p "Enter the string:" string
if [[ $string == [A-Z]* ]]
then
echo "String is in Upper case"
elif [[ $string == [a-z]* ]]
then 
echo "String is in Lower case"
else
echo "String in Mixed case"
fi
