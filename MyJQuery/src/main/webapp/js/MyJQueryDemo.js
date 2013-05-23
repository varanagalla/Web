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
/*jQuery*/$( document ).ready( function() {
	
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
	
});