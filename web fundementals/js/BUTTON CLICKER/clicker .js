
var likeButtons = document.querySelectorAll(".likebtn");
var notif = document.querySelector(".notif");
var okey = document.querySelector(".ok");
likeButtons.forEach(function(likebtn){
    likebtn.addEventListener("click", function(){
        var spanlike = likebtn.querySelector(".likes");
        let count = parseInt(spanlike.textContent);
        count++;
        notif.style.display ="flex";
        spanlike.textContent = count;
        likebtn.disabled = true;
    });
    
    okey.addEventListener("click",function(){
        notif.style.display = "none";
    })
});

function remove(element){
    element.style.display = "none";
    // element.remove(); 
    
}

function signout(change){
    change.innerText = "Sign Out";
    change.style.width = "80px";
}


