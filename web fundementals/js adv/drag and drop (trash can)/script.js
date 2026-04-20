var truck = null;
var drag = document.querySelectorAll(".card");
drag.forEach(drg =>{drg.addEventListener('dragstart',(e)=>{
    truck = e.target;
    truck.classList.add('dragging');
    });
});

const wind = document.querySelector(".wind");
wind.addEventListener('dragover',(e)=>{
    e.preventDefault();
    wind.classList.add('drag-over');
});
wind.addEventListener('drop',(e)=>{
    wind.classList.remove('drag-over');
    wind.appendChild(truck);
    truck.classList.remove('dragging');
    truck =null;
});