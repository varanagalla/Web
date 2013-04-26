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

(function()
{
	window.onload = function()
	{
		var mapDiv = document.getElementById('map');
		var latlng = new google.maps.LatLng(37.09,-95.71);
		var options = {
				center:latlng,
				zoom:4,
				mapTypeId: google.maps.MapTypeId.ROADMAP,
				
				//Turn off zoom control.
				disableDefaultUI: true,
				
				navigationControl : true,
				
				navigationControlOptions : {
					position : google.maps.ControlPosition.TOP_RIGHT,
					style : google.maps.NavigationControlStyle.ANDROID
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
				backgroundColor: 'blue',
				draggableCursor: 'move',
				draggingCursor: 'move'
		};

		var map = new google.maps.Map(mapDiv,options);
	};
})();


