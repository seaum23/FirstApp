$(document).ready(function(){
	$('.slider-active').owlCarousel({
		loop:true,
		navText:['<i class="glyphicon glyphicon-chevron-left"></i>','<i class="glyphicon glyphicon-chevron-right"></i>'],
		animateIn: 'bounceIn',
		nav:true,
		responsive:{
			0:{
				items:1
			},
			600:{
				items:3
			},
			1000:{
				items:5
			}
		}
	})
});

