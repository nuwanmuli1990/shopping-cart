// Shorthand for $( document ).ready()
$(function() {
	
	$('#home').removeClass('active');

	switch (menuStatus) {
	case "Home":
		$('#home').addClass('active');
		break;
	case "About":
		$('#about').addClass('active');
		break;
	case "Contact":
		$('#contact').addClass('active');
		break;
	default:
		break;
	}
});