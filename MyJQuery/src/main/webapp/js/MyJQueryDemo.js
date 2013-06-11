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
	
	//$('#animation').slideUp().fadeIn();
	$("#animation").show("slow");
    $("#animation").queue(function () {
        $(this).animate({width:'+=400'},1000);
        $(this).dequeue();
     });
    
    
    console.log("Is my webpage has title? " + $.contains($("head")[0],$("title")[0]));
    
    //access div with ID. (element followed by '#' followed by ID to match against)
    console.log($("div#1").text());
    var divElements = $("div");
    console.log("My web page has "+divElements.length + " div elements.");
    
    //fetch 'div' elements under 'div' with id 'main'.
    var divMain = $("div","div#main");
    console.log("Main div has " + divMain.length + " div elements. Printed below.");
    $.each(divMain,function(index,value){
    	console.log($(value).text());
    });
    
    //backslash special character matches.
    console.log($('#\\$2').text());
    
    //console.log($("body, div#main, div#\\$").text());
    //$(ancestor descendant)
    console.log($("body div#main div#\\$2").text());
    
    //$("[attributeName='value']")
    console.log('No.of hidden elements -> ' + $("[class ^= 'hid']").length);
   
    //:visible, :hidden based on style="display:none" / "display:block";
	console.log($("div :visible").text());
	
	var wrappedObj = $("div :contains('I am')");
	if(!$.isEmptyObject(wrappedObj)){
		$.each(wrappedObj,function(index,value){
			console.log(value);
		});
	};
	
	//$(selector, [context])
	wrappedObj = $("div#1", "div#main");
	console.log(wrappedObj.text());
	
	//select multiple elements.
	wrappedObj = $("form,div#mainOne,div#one");
	$.each(wrappedObj,function(index,value){
		console.log($(value).text());
	});
	
	console.log($("div#test").text());
	console.log($("div#test").html());
	
	$("#btn1").focus();
	$("#dropDown").select(function(){
		alert("You selected :: " + $(this).value());
	});
	
	$("#txtBox1").click(function(){
		$(this).attr('disabled',false).val("");
	}).focusout(function(){
		if($.isEmptyObject($(this).val().trim())){
			$(this).val("I am text 1");
		}
	}).blur(function(){
		if($(this).val() === ''){
			$(this).val($(this).attr('title'));
		}
	});
	
	//Delegate click.
	/*$(document).delegate("#liveElement","click", function(){
												alert("I am live now...");
												console.log("I am live now...");
			   }).css("color","green");*/
	//bind click on on the fly element.
	//$(document).on("click","#liveElement", function(){	alert("I am live now...");	console.log("I am live now..."); $(this).css("color","green");});
	
	$("<a id='liveElement'> I am anchor </a>").appendTo("div#mainOne");
	
	//Execute click event only once.
	$("#liveElement").one("click",function(){
		alert("I am live now...");
		console.log("I am live now...");
	});
	
	$("#rlo").mouseover(function(){
		$(this).css("text-decoration","underline");
	}).mouseout(function(){
		$(this).css("text-decoration","none");
	});
	
	
});

