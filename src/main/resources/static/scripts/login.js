let username = document.forms["loginForm"]["username"];
let password = document.forms["loginForm"]["password"];
let pattern = new RegExp("^[a-z0-9_-]{3,15}$");

username.addEventListener("input", validateUsername)
password.addEventListener("input", validatePassword)

function validateUsername() {
    if (!(username.value === "") && pattern.test(username.value)){
        username.classList.remove("invalid-field");
        username.classList.add("valid-field");
        document.getElementById(username.name+"Invalid").style.opacity = 0;
        username.style.borderColor = "green";
        return true;
    } else if( ! (username.classList.contains("invalid-field") ) ){
        username.classList.add("invalid-field");
        username.classList.remove("valid-field");
        document.getElementById(username.name+"Invalid").style.opacity = 1;
        username.style.borderColor = "red";
    }
    return false;
}
function validatePassword(){
    if (password.value === "") {
        password.classList.add("invalid-field");
        password.classList.remove("valid-field");
        document.getElementById(password.name+"Invalid").style.opacity = 1;
        password.style.borderColor = "red";
        return false;
    } else if( ! (password.classList.contains("valid-field") ) ) {
        password.classList.remove("invalid-field");
        password.classList.add("valid-field");
        document.getElementById(password.name+"Invalid").style.opacity = 0;
        password.style.borderColor = "green";
    }
    return true;
}

function validateForm(){
    if (validateUsername() & validatePassword()) { //Using just & so it checks both, even if the first is false (it applies the style)
        console.log("VALID");
        return false;
    } else {
        console.log("Invalid");
        document.getElementById("invalidLogin").style.opacity = 1;
        return false;
    }
    //TODO SERVER SIDE VALIDATION AND CHECK AGAINST USERS DB TABLE
}