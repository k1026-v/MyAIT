const decrementButton= document.getElementById ('decrement');
const countSpan= document.getElementById ('count');
const incrementButton= document.getElementById ('increment');
const resetButton= document.getElementById ('reset');


let count = 0;

function updateCount(value){
    count+=value;
    countSpan.tagName=--count;

}

decrementButton.addEventListener('click',()=>{
updateCount(-1);
});

incrementButton.addEventListener('click',()=>{
    updateCount(1);
});

resetButton.addEventListener('click',()=>{
    updateCount(-count);
})
