function validateForm() {
    var name = document.getElementById('name').value;
    var email = document.getElementById('email').value;
    var message = document.getElementById('message').value;

    if (name === "" || email === "" || message === "") {
        alert("Please fill in all fields.");
        return false;
    }

    // Here you could add code to send the form data to a server or backend
    alert("Message sent successfully!");
    return true;  // Prevent form from submitting for this demo
}
