(function() {
    var app = angular.module('store', []);
    app.controller('StoreController', function() {
	this.products = gems;
    });

    app.controller('PanelController', function() {
	this.tab = 1;
	this.selectTab = function(setTab) {
	    this.tab = setTab;
	};
	this.isSelected = function(checkTab) {
	    return this.tab === checkTab;
	};
    });
    app.controller('ReviewController', function() {
	this.review = {};
	this.addReview = function(product) {
	    product.reviews.push(this.review);
	    this.review = {}; // clear form
	};

    });

    var gems = [
	    {
		name : "testGem",
		price : 2.99,
		description : 'buy me!!',
		canPurchase : true,
		soldOut : false,
		img : 'http://images.hangame.co.kr/hangame/main2012/gameinfo/jg_gi_20150120.jpg',
		reviews : [ {
		    stars : 5,
		    body : 'I love it',
		    author : 'joe@naver.com'
		}, {
		    stars : 1,
		    body : 'I hate it',
		    author : 'jo22e@naver.com'
		} ]

	    },
	    {
		name : "testGem22",
		price : 50.00,
		description : 'sold out..',
		canPurchase : false,
		soldOut : true,
		img : 'http://images.hangame.co.kr/hangame/main2012/gameinfo/asta_gi_20150115.jpg',
		reviews : [ {
		    stars : 1,
		    body : 'fuck love it',
		    author : 'ewewewx@naver.com'
		}, {
		    stars : 1,
		    body : 'I hate it',
		    author : '2323232@naver.com'
		} ]
	    },
	    {
		name : "testGem3",
		price : 444.99,
		description : 'buy me2!!',
		canPurchase : true,
		soldOut : false,
		img : 'http://images.hangame.co.kr/hangame/main2012/gameinfo/wooparoosaga_gi_20150122.jpg',
		reviews : [ {
		    stars : 5,
		    body : 'goood',
		    author : '111@naver.com'
		}, {
		    stars : 5,
		    body : 'it good',
		    author : 'xxxx@naver.com'
		} ]

	    } ]
})();
