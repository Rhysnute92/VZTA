const container = document.getElementById('container');
const registerBtn = document.getElementById('register');
const loginBtn = document.getElementById('login');

registerBtn.addEventListener('click', () => {
    container.classList.add("active");
});

loginBtn.addEventListener('click', () => {
    container.classList.remove("active");
});


const emailRegEx = new RegExp(/^[A-Za-z0-9.-_]+@[A-Za-z0-9.-]+\.[A-Za-z]+$/m);
const passwordRegEx = new RegExp(/^[A-Za-z0-9_!#$%&'*+\/=?`{|}~^.-]+$/m);
const usernameRegEx = new RegExp(/^[A-Za-z ]+$/m);

function loginFormValidation(){
    let pass= true;
    let email = $("#login-email").val();
    let password = $("#login-password").val();
    if (email === "") {
        alert("Email cannot be empty");
        pass = false;
    } else if ( !(emailRegEx.test(email)) ) {
        pass = false;
        alert("Invalid Email address")
    }
    if (password === "") {
        alert("Password cannot be empty");
        pass = false;
    } else if ( !(passwordRegEx.test(password)) ) {
        pass = false;
        alert("Password contains invalid characters");
    }
    return pass;
}

function registerFormValidation(){
    /*WHYTF THIS DONT WORK*/
    let pass=true;
    let email = $("#register-email").val();
    let username = $("#register-username").val();
    let password = $("#register-password").val();

    if (email == "") {
        console.log("Email empty bit")
        pass = false;
        alert("Email cannot be empty");
    } else if ( !(emailRegEx.test(email)) ) {
        console.log("Email no match")
        pass = false;
        alert("Invalid Email address");
    }

    if (username == "") {
        pass = false;
        alert("Username cannot be empty")
    } else if ( !(usernameRegEx.test(username)) ) {
        console.log(!usernameRegEx.test(username));
        pass = false;
        alert("Invalid username");
    }

    if (password == "") {
        pass = false;
        alert("Password cannot be empty");
    } else if ( !(passwordRegEx.test(password)) ) {
        pass = false;
        alert("Password contains invalid characters");
    }
    return pass;
}