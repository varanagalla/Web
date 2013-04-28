/**
 * Google maps related stuff.
 * Author : VaraPrasad Nagalla
 * Created On : 2013-04-25.
 */

var author = {
		name : 'Vara',
		age  : 29,
		tellName : function()
		{
			alert(author.name);
		}
};

var placeData = {'place':[
              		    {
              		    	'lat':17.074241,
              		    	'lng':82.149078,
              		    	'description':'<b>My Home</b>'
              		    },
              		    {
              		    	'lat':17.073882,
              		    	'lng':82.1494,
              		    	'description':'<b>Our community park</b>'
              		    },
              		    {
              		    	'lat':17.075882,
              		    	'lng':82.14874,
              		    	'description':'<b>My Father-in-law\'s Home</b>'
              		    },
              		    {
              		    	'lat':17.073554,
              		    	'lng':82.152296,
              		    	'description':'<b>Play ground </b>'
              		    },
              		    {
              		    	'lat':17.074805,
              		    	'lng':82.145215,
              		    	'description':'<b>My School</b>'
              		    },
              		    {
              		    	'lat':17.073544,
              		    	'lng':82.147007,
              		    	'description':'<b>My Dad\'s Office</b>'
              		    },
              		    {
              		    	'lat':17.074118,
              		    	'lng':82.142715,
              		    	'description':'<b>Library</b>'
              		    }
             ]};
var places = [];
var contents = [];
var tempPlace = null;
function loadPlaces()
{
	for(var i=0;i< placeData.place.length; i++)
	{
		tempPlace = placeData.place[i];
		contents.push(tempPlace.description);
		places.push(new google.maps.LatLng(tempPlace.lat,tempPlace.lng));
	}
}

var infowindow = null;
var bounds = new google.maps.LatLngBounds();
var shadow = new google.maps.MarkerImage('../images/shadow.png',null,null,new google.maps.Point(16,35));
var nrow = 5;
var ncol = 20;
var xWidth = 500;
var yWidth = 100;
var height = yWidth/nrow;
var width = xWidth/ncol;
var map = null;
var placeInd = 0;
function getMarker(totw,toth,i,place)
{
	return marker = new google.maps.Marker({
		position:place,
		map: map,
		title: 'Click me',
		icon: new google.maps.MarkerImage('../images/num_markers.png',new google.maps.Size(width,height),new google.maps.Point(totw,toth),new google.maps.Point(16,35)),
		//icon: image,
		shadow : shadow,
		flat: true,
		animation:google.maps.Animation.DROP
	});
};

(function()
{
	window.onload = function()
	{
		loadPlaces();
		var mapDiv = document.getElementById('map');
		var latlng = new google.maps.LatLng(40.7257,-74.0047);
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
		
		//var pointer = new google.maps.MarkerImage('../images/marker.png');
		
		
		var totw = 0.0;
		var toth = 0.0;
		var marker = null;
		var place = null;
		for(var i=0;i < places.length; i++)
		{
			setTimeout(function(){
				place = places[placeInd];
				if(totw + width > xWidth)
				{
					totw = xWidth - width;
				}
				marker = getMarker(totw,toth,i,place);
				totw = totw + width + 0.01;
				if(totw > xWidth)
				{
					totw = 0.0;
					toth = toth + height + 0.01;
				}
				bounds.extend(place);
				(function (placeInd,marker)
				{
					google.maps.event.addListener(marker,'click',function(){
						
						if(!infowindow)
						{
							infowindow = new google.maps.InfoWindow();
						}
						infowindow.setContent(getContent(contents[placeInd]));
						/*var infowindow = new google.maps.InfoWindow({
							content : 'Place number ' + i
						});*/
						infowindow.open(map,marker);
					});
					
					google.maps.event.addListener(marker,'click',function(){
						marker.setAnimation(google.maps.Animation.BOUNCE);						
					});
					
					google.maps.event.addListener(marker,'mouseout',function(){
						marker.setAnimation(null);
					});
					
				})(placeInd,marker);					
				placeInd++;
				map.fitBounds(bounds);
			},i*200);			
		};
	};
})();
function getContent(content)
{
	return content = '<div id="info">' +
	'<img src="../images/Penguins.jpg" alt="" />' +
	'<h2>Maps are awesome</h2>' +
	'<p>'+content+'</p>' +
	'<p><a href="http://www.svennerberg.com">A sample link</a></p>' +
	'</div>';
}

/*var video = document.createElement('video');
video.setAttribute('src',
'../videos/Wildlife.ogv');
video.setAttribute('width', '300');
video.setAttribute('height', '200');
video.setAttribute('controls', 'controls');
video.setAttribute('autoplay', 'autoplay');
// Passing the video variable as the content for the InfoWindow
infoWindow.setContent(video);*/



