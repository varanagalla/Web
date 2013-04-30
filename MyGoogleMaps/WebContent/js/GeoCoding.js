/**
 * Geo coordinates lookup for a global address.
 * Author : VaraPrasad Nagalla
 * Created On : 2013-04-25.
 */

var map,geocoder;

window.onload = function(){
	
	var mapOptions = {
		zoom : 5,
		center: new google.maps.LatLng(20.00,80.00),
		mapTypeId: google.maps.MapTypeId.ROADMAP 
	};
	
	map = new google.maps.Map(document.getElementById('map'),mapOptions);
};


function getGeoCordinates(){
	var address = document.getElementById('GeoCord').value;
	if(!geocoder){
		geocoder = new google.maps.Geocoder();
	}
	var geocodeRequest = {
			'address' : address
	};	
	
	geocoder.geocode(geocodeRequest, function(results, status) {
		if(status == google.maps.GeocoderStatus.OK){
			
			alert('Total Results :: '+results.length);
			//alert(JSON.stringify(results));
			var frAddresses = [];
			for(var i=0; i< results.length; i++){
				frAddresses.push(results[i].formatted_address);				
			}
				
			for(var i=0;i < frAddresses.length;i++){
				alert(frAddresses[i]);
			}
			/*var lat = results[0].geometry.location.lat;
			var long = results[0].geometry.location.lng;
			var formatted_address = results[0].formatted_address;
			
			alert('Your formatted address is :: '+formatted_address);*/
		}
		
	});
	
	return false;
}

