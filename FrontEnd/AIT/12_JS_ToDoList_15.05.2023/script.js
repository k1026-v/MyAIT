const task= document.getElementById ('taskInput');
const addTaskButton= document.getElementById ('addTask');
const taskListUl= document.getElementById ('taskList');

addTaskButton.addEventListener ('click', addTask);

taskList.addEventListener('click', (e)=>{
    console.log(e);
    if (e.target.tagName==='BUTTON') {
        e.target.parentElement.remove();
    }
})

function addTask () {
    const taskName = task.value.trim();
    if (taskName){
        const li= document.createElement ('li');
        li.innerHTML = `<span>${taskName}</span><button>Delete</button><button>Done</button>`;
        taskList.appendChild(li);
       
    }
    task.value='';
}