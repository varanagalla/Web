/**
 * @author :: 'Vara'
 * This is the script file for JQuery.
 * 
 */
//Power of closures in JavaScript.
/*var x = 42; 
console.log( x ); 
var message = (function( x ){
  return function() {
    console.log( "x is " + x );
  };
})( x ); 
message();
x = 12; 
console.log( x ); 
message();*/

//Hello world.
/*jQuery*/
$( document ).ready( function() {
	
	$.isEmptyObject(''); // returns true
	$.isEmptyObject({}); // returns true
	
	
	$.isPlainObject(""); // false
	$.isPlainObject({}); // true
	$.isPlainObject(new Object); // true
	
	
	//$.extend demo -> combines/merge one or more objects and ties it with target object.
	var targetObj = {'name' : 'VaraPrasad Nagalla'};
	var locationObj = {
		'street' : '2000 CRYSTAL SPRINGS RD',
		'city'   : 'SAN BRUNO',
		'state'  : 'CA',
		'zip'    : '94066'
	};
	var updatedNameObj = {
			'name' : 'VaraPrasad Srinivasa V V Nagalla',
			'nickName' : 'Vara'
	};
	
	//merges all three objects into target object.
	$.extend(targetObj,locationObj,updatedNameObj);
	console.log("Name* :: " + targetObj['name'] + " **Nick name : " + targetObj['nickName']);
	
	
	//$.makeArray demo.
	var clonedObj = $.extend(true,{},targetObj);
	console.log("Type of cloned object -- "+$.type(clonedObj));
	var objArray = $.makeArray(clonedObj);
	if($.type(objArray) == "array"){
		console.log('Object converted into array successfully.');
	}
	var arrayLength = objArray.length;
	for(var i=0; i<arrayLength; i++){
		console.log(objArray[i].name + "\t");
	}
	
	//$.merge(array1,array2) demo
	var names = ["Vara", "Keyur", "Sai"];
	var ids = ["88991","37036","12345"];
	var mergedArray = $.merge(names,ids);
	console.log("Merged Array :: "+mergedArray);
	
	//$.inArray(x,arr) , $.unique(arr)
	var elements = ["Vara","Vara","Vara"];
	console.log("Is 'Vara' in elements array?(-1 means not exists) "+$.inArray('Vara',elements));
	
	console.log("No.of elements before removing duplicates :: "+elements.length);
	elements = $.unique(elements);
	console.log("No.of elements after removing duplicates :: "+elements.length);
	
	
	
	/*$.each(array,function(index,value){
	}); demo - Please note that each method is immutable.*/
	var numbers = [1,2,3,4,5];
	var modNums = $.each(numbers,function(index,value){
			console.log(index*value + ",");
			return (index * value);
	});
	console.log("Is $.each method returns a modified array? "+!$.isEmptyObject(modNums));
	console.log("Is it really modified? Let's print them and see...");
	$.each(modNums,function(index,value){
		console.log(value);
	});
	console.log("Oh, no...it is printing the original array. Immuatble stuff. Please note it down.");
	
	
	
	/*$.map(array,function(value,index){
	});- demo - It is mutable and returns the modified array.
	check the call back function against that of $.each and note the reverse order of arguments*/
	modNums = $.map(numbers,function(value,index){
		console.log(index*value + ",");
		return (index * value);
	});
	console.log("Is $.map method returns a modified array? "+!$.isEmptyObject(modNums) + ","+ $.type(modNums));
	console.log("Is it really modified? Let's print them and see...");
	$.each(modNums,function(index,value){
		console.log(value);
	});
	console.log("Yes...values are modified. Cool!!! i knew good thing today...");
	
	$('#animation').slideUp().fadeIn();
		
});