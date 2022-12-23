function validateform(){
    var username  =document.form1.username.value;
    var password = document.form1.password.value;
    var ConfirmPassword = document.form1.ConfirmPassword.value;
    var address=document.form1.address.value;
 

    if(username.length<6){

       

        document.getElementById("userid").innerHTML="*Must conatin 6 letters*";

        return false;

    }

    else if(password.length<8 ){

        document.getElementById("pwd").innerHTML="*password must be of 8 characters*";

        return false;

    }

    else if(!(password.match(uppercasel)) || !(password.match(numbr))){

        document.getElementById("Cpassword").innerHTML="Password must conatin one Capital and one number";

        return false;

    }
    else if(password != ConfirmPassword){

        document.getElementById("pwdNew").innerHTML="Password must be same";

        return false;

    }

    else{

        var output=username+" "+address;



        localStorage.setItem('output',output);

        return true;

    }
}

