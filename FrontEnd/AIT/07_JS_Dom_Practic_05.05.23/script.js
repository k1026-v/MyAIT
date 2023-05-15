const t = setInterval(move,20);
let pos = 0;
let flag = true;                        
const box = document.getElementById ('box');
  //clearInterval (t); //останавливает  setInterval
 
function move () {
    // if (pos === 0) {
    //flag = true;
    //} 

   // if (pos === 150) {
    //flag = false;
    //} 
    //if (flag){
    //    pos ++;
    //}else {pos --;}

    flag ? pos ++ : pos --; // if-else in 1 row

    if (pos ===0 || pos === 150){
        flag = !flag;
    } 

    
    box.style.right =pos+'px';
    box.style.bottom =pos+'px';
}