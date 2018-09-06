window.onscroll = function() {myFunction()};

var header = document.getElementById('myHeader');
var sticky = header.offsetTop;

function myFunction() {
  if (window.pageYOffset > header.offsetTop) {
    document.getElementById("myHeader").classList.add("sticky");
  } else {
    document.getElementById("myHeader").classList.remove("sticky");
  }
}
