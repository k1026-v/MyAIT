console.log('Hello world');
console.log(document);

//document.body.innerHTML = '<h1> Hello word!</h1>' 

const div1= document.getElementById ('div1');

console.log(div1);
div1.style.border='1px solid black'

const a=document.querySelector ('#div');
console.log(a);

const pDiv= document.querySelectorAll('#div1>p');
console.log(pDiv);

for (let i = 0; i<pDiv.length; i++){
    pDiv[i].innerHTML=`<span>new text ${i}</span>`
}

const children=div1.children;

for(let i = 0; i<children.length; i++){
    children[i].style.color='red';
 }

const newP=document.createElement('p');
console.log(newP);

const newPText= document.createTextNode('This text was created');
newP.appendChild(newPText);

div1.appendChild(newP);
div1.insertBefore(newP, div1.firstChild); 