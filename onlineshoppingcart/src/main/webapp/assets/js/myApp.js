// Shorthand for $( document ).ready()
$(function() {
	
	$('#home').removeClass('active');
	//alert(menuStatus)
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
	case "Product":
		$('#product').addClass('active');
		break;
	case "CategoryProduct":
		$('#product').addClass('active');
		$('#cat_'+catName).addClass('active');
		break;
	default:
		break;
	}
});