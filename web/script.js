window.onload = function() {
  for (let fdpView of document
    .getElementsByClassName('fdp-view')) {

    let xhr = new XMLHttpRequest();
    xhr.open('GET', "http://localhost:8080/fdp");
    xhr.setRequestHeader('Accept','application/json');
    xhr.setRequestHeader('Access-Control-Allow-Origin', '*');
    xhr.setRequestHeader("Access-Control-Allow-Methods", "DELETE, POST, GET, OPTIONS");
    xhr.onreadystatechange = (event) => {
      console.log(event);
    };
    xhr.send();
  }
};
