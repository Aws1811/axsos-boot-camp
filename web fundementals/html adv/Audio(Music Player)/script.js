// var musics  = document.querySelectorAll(".music");
// var param = document.querySelectorAll(".para");
// var ahmed = document.querySelector(".first img");
// var theMu = document.querySelector("audio");
// var h2 = document.querySelector(".first h2");
// var p2 = document.querySelector(".first p:nth-child(4)");
// var activePara = null;
// var oldText = "";
// for (let i =0 ; i<musics.length;i++){ 
//     musics[i].addEventListener('click',function(){
//         if (activePara !== null) {
//         activePara.innerText = oldText;
//     }
//     oldText = param[i].innerText.trim();
//     activePara = param[i];
//         if(param[i].innerText.trim()==="rain sound"){
        // this.querySelector(".para").innerText = " Ahmed Mosen";
//         theMu.src = "Rain Sounds   15 seconds soundtrack.mp3";
//         ahmed.src = "what-is-rain-960x640.jpg";
//         h2.innerText = "rain sound";
//         p2.innerText = "By Aws Sleebi";
//         }else if(param[i].innerText.trim()==="Ahmed Mosen"){
        // this.querySelector(".para").innerText = " rain sound";
//         theMu.src = "Ahmad Mohsen Meme Template  Porcupine Dance Meme.mp3";
//         ahmed.src = "avatars-gPdwMzzDxK3X3yMi-KIzytA-t240x240.jpg";
//         h2.innerText = "Ahmed Mohsen";
//         p2.innerText = "By Ahmed Mohsen";
//         }else if(param[i].innerText.trim()==="relax noise"){
        // this.querySelector(".para").innerText = " rain sound";
//         theMu.src = "Nature sounds Meditation forest sounds ofbirds singing relaxation - 20 Sec Short Video.mp3";
//         ahmed.src = "relax-009.jpg";
//         h2.innerText = "relax noise";
//         p2.innerText = "By Aws Ali";
//         }else if (param[i].innerText.trim()==="speaking english"){
        // this.querySelector(".para").innerText = " rain sound";
//         theMu.src = "A one minute TEDx Talk for the digital age  Woody Roseland  TEDxMileHigh.mp3";
//         ahmed.src = "medium-portrait-young-african-american-600nw-2465904141.webp";
//         h2.innerText = "speaking english";
//         p2.innerText = "By Aws mohammed";
//         }else if (param[i].innerText.trim()==="speaking arabic"){
        // this.querySelector(".para").innerText = " rain sound";
//         theMu.src = "الحروف العربية من الالف الى الياء - الحروف الهجائية للأطفال.mp3";
//         ahmed.src = "Arabic.jpg";
//         h2.innerText = "speaking arabic";
//         p2.innerText = "By Aws Ali mohammed Sleebi";
//         }
//         activePara.innerText = h2.innerText;
//     });
//     musics[i].addEventListener('mouseover',function(){
//         musics[i].style.backgroundColor = "#BCDCFF";
//     });
//     musics[i].addEventListener('mouseleave',function(){
//         musics[i].style.backgroundColor = "rgb(196, 193, 189)";
//     });
// };
var musics = document.querySelectorAll(".music");
var ahmed = document.querySelector(".first img");
var theMu = document.querySelector("audio");
var h2 = document.querySelector(".first h2");
var p2 = document.querySelector(".first p:nth-child(4)");

var activeIndex = -1;

for (let i = 0; i < musics.length; i++) {
    var para = musics[i].querySelector(".para");
    para.dataset.original = para.innerText.trim();
}

function showTrack(name) {
    if (name === "Ahmed Mohsen") {
        theMu.src = "Ahmad Mohsen Meme Template  Porcupine Dance Meme.mp3";
        ahmed.src = "avatars-gPdwMzzDxK3X3yMi-KIzytA-t240x240.jpg";
        h2.innerText = "Ahmed Mohsen";
        p2.innerText = "By Ahmed Mohsen";
    } else if (name === "rain sound") {
        theMu.src = "Rain Sounds   15 seconds soundtrack.mp3";
        ahmed.src = "what-is-rain-960x640.jpg";
        h2.innerText = "rain sound";
        p2.innerText = "By Aws Sleebi";
    } else if (name === "relax noise") {
        theMu.src = "Nature sounds Meditation forest sounds ofbirds singing relaxation - 20 Sec Short Video.mp3";
        ahmed.src = "relax-009.jpg";
        h2.innerText = "relax noise";
        p2.innerText = "By Aws Ali";
    } else if (name === "speaking english") {
        theMu.src = "A one minute TEDx Talk for the digital age  Woody Roseland  TEDxMileHigh.mp3";
        ahmed.src = "medium-portrait-young-african-american-600nw-2465904141.webp";
        h2.innerText = "speaking english";
        p2.innerText = "By Aws Mohammed";
    } else if (name === "speaking arabic") {
        theMu.src = "الحروف العربية من الالف الى الياء - الحروف الهجائية للأطفال.mp3";
        ahmed.src = "Arabic.jpg";
        h2.innerText = "speaking arabic";
        p2.innerText = "By Aws Ali Mohammed Sleebi";
    }
}

showTrack("Ahmed Mohsen");

for (let i = 0; i < musics.length; i++) {
    musics[i].addEventListener("click", function () {
        var currentPara = this.querySelector(".para");
        var originalName = currentPara.dataset.original;

        if (activeIndex === i) {
            currentPara.innerText = originalName;
            activeIndex = -1;
            showTrack("Ahmed Mohsen");
            return;
        }

        if (activeIndex !== -1) {
            var oldPara = musics[activeIndex].querySelector(".para");
            oldPara.innerText = oldPara.dataset.original;
        }

        showTrack(originalName);
        currentPara.innerText = "Ahmed Mohsen";
        activeIndex = i;
    });

    musics[i].addEventListener("mouseover", function () {
        this.style.backgroundColor = "#BCDCFF";
    });

    musics[i].addEventListener("mouseleave", function () {
        this.style.backgroundColor = "rgb(196, 193, 189)";
    });
}