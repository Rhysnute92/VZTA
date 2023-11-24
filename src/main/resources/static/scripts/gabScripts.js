function selectTrail(string, element) {
 console.log('Clicked')
 let listEl = document.getElementsByClassName('liHeader')
 for (let i = 0; i < listEl.length; i++) {
  listEl[i].classList.remove('selected')
 }
 document.getElementById(string).classList.add("selected")

}

function updateOutput() {
 $.post("test_ajax_frag").done(function (fragment) {
  console.log(fragment);
  $("#trailInfoBox").replaceWith(fragment);
 });
}