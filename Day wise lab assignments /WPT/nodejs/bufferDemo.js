//older way
//var buffer = new Buffer("Krupa");
var nwBuffer = Buffer.alloc(50);

for(var i = 0; i < 26; i++)
{
	nwBuffer[i] = i + 97; //store ascii value 97, 98, ....
}

console.log(nwBuffer); //prints data as in UTF-8
console.log("Buffer data: "+nwBuffer);   //prints data in string format as string concatenation done
console.log("Buffer data: "+nwBuffer.toString()); //prints data in string format

//convert data to utf and print it
console.log("Buffer data in UTF-8: "+nwBuffer.toString("utf-8",2,9))

//slice data of buffer
console.log(nwBuffer.slice(5,9).toString());

//length of buffer
console.log("length: " + nwBuffer.length);

