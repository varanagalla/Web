/**
 * author : Vara
 * This is Java script for Google maps.
 */
var map = null;
var geocoder = null;
var bounds = null;
var places = [];
var keys = [];
var contents = [];
var tempPlace = null;
var infowindow = null;
var markers = {};
var nrow = 5;
var ncol = 20;
var xWidth = 500;
var yWidth = 100;
var height = yWidth/nrow;
var width = xWidth/ncol;
function showAddresses(){
	$('#sidebar ul li').remove();
	infowindow = null;
	if(keys.length > 0){
		for(var keyval = 0; keyval < keys.length; keyval ++){
			markers[keys[keyval]].setMap(null);
		}
	}
	places = [];
	keys = [];
	contents = [];
	markers = {};
	var address = $('#sAddress').val();
	if(!geocoder){
		geocoder = new google.maps.Geocoder();
	}
	var geocodeRequest = {
			'address' : address
	};	
	
	geocoder.geocode(geocodeRequest, function(results, status) {
		if(status == google.maps.GeocoderStatus.OK){
			/*alert('Total Results :: '+results.length);
			alert(JSON.stringify(results));*/
			for(var i=0; i< results.length; i++){
				places.push(results[i].geometry.location);
				contents.push(results[i].formatted_address);
				keys.push('key' + i);
			}
			bounds = new google.maps.LatLngBounds();
			markLocations();			
		}
		else if(status == google.maps.GeocoderStatus.ZERO_RESULTS){
			alert('No results found.Please enter a valid address');
		}
			
		
	});
}

/*var placeData = {'place':[
              		    {
              		    	'lat':17.074241,
              		    	'lng':82.149078,
              		    	'key':'Home',
              		    	'description' : 'Where is my home?'
              		    },
              		    {
              		    	'lat':17.073882,
              		    	'lng':82.1494,
              		    	'key':'commPark',
              		    	'description' : 'Where is my community park?'
              		    },
              		    {
              		    	'lat':17.074805,
              		    	'lng':82.145215,
              		    	'key':'school',
              		    	'description' : 'Where is my school?'
              		    }
             ]};


function loadPlaces()
{
	for(var i=0;i< placeData.place.length; i++)
	{
		tempPlace = placeData.place[i];
		keys.push(tempPlace.key);
		contents.push(tempPlace.description);
		places.push(new google.maps.LatLng(tempPlace.lat,tempPlace.lng));
	}
}*/

$(document).ready(function(){
	
	//loadPlaces();
	
	var mapDiv = $('#myMap')[0];
	
	var latlng = new google.maps.LatLng(20.00,80.00);
	
	var options = {
			center:latlng,
			zoom:4,
			mapTypeId: google.maps.MapTypeId.ROADMAP,
			
			//Turn off zoom control.
			disableDefaultUI: true,
			
			navigationControl : true,
			
			navigationControlOptions : {
				position : google.maps.ControlPosition.TOP_RIGHT,
				style : google.maps.NavigationControlStyle.ZOOM_PAN
			},
			
			//Map/Satellite/Hybrid/Terrain
			mapTypeControl : true,
			
			//How do you want to see the MapTypeControl??
			mapTypeControlOptions: {
				style : google.maps.MapTypeControlStyle.DROPDOWN_MENU,
				position : google.maps.ControlPosition.BOTTOM,
				mapTypeids:[
				      google.maps.MapTypeId.ROADMAP,
				      google.maps.MapTypeId.SATELLITE
				 ]
			},
			
			scaleControl : true,
			keyboardShortcuts : false,
			disableDoubleClickZoom : true,
			draggable: true,
			scrollwheel: false,
			streetViewControl: true,
			//backgroundColor: 'blue',
			draggableCursor: 'default',
			draggingCursor: 'move'
	};
	
	map = new google.maps.Map(mapDiv,options);
	
});

function pushMarker(key,place,totw,toth,placeInd){
	var marker =   new google.maps.Marker({
		position:place,
		map: map,
		title: 'Click me',
		icon: new google.maps.MarkerImage('../images/num_markers.png',new google.maps.Size(width,height),new google.maps.Point(totw,toth),new google.maps.Point(16,35))
	});
	
	google.maps.event.addListener(marker,'click',function(){
		
		if(!infowindow)
		{
			infowindow = new google.maps.InfoWindow();
		}
		infowindow.setContent(getContent(contents[placeInd]));
		infowindow.open(map,marker);
	});
	
	markers[key] = marker;
}

function markLocations(){
	var totw = 0.0;
	var toth = 0.0;
	for(var i=0;i < places.length; i++)
	{
		place = places[i];
		if(totw + width > xWidth)
		{
			totw = xWidth - width;
		}
		pushMarker(keys[i], place,totw,toth,i);
		totw = totw + width + 0.01;
		if(totw > xWidth)
		{
			totw = 0.0;
			toth = toth + height + 0.01;
		}
		bounds.extend(place);
		var id = 'place' + i;
		$('#sidebar ul').append("<li><div id=\"" + id + "\"><b>" + contents[i] + "</b></div></li>");
		
		var obj = document.getElementById(id);
		obj.onmouseover = function(){
			var index = $(this).attr('id').match(/\d+$/)[0];
			markers[keys[index]].setAnimation(google.maps.Animation.BOUNCE);
		};
		obj.onmouseout = function(){
			var index = $(this).attr('id').match(/\d+$/)[0];
			markers[keys[index]].setAnimation(null);
		};
		
	}
	map.fitBounds(bounds);
}
function getContent(content)
{
	return value = '<div class=\"info\">' +
	'<img src="../images/Penguins.jpg" alt="" />' +
	'<h2>Maps are awesome</h2>' +
	'<p>'+content+'<p>' +
	'<p><a href="http://www.svennerberg.com">A sample link</a></p>' +
	'</div>';
}