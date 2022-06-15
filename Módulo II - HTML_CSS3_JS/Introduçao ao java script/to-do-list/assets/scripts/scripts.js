insertIntoTaskArea = () =>{
	let taskInput = document.querySelector(".task-input");
	let taskName = taskInput.value;

	if(taskName == "")
	{
		window.alert("Task deve ser inserida no input");
		return;
	}
	
	let taskArea = document.querySelector(".task-area");
	let id = taskArea.childElementCount;

	let taskDescription = document.createTextNode(taskName);
	let taskDiv = document.createElement("div");
	taskDiv.classList.add("task-div")

	let taskCheckbox = document.createElement("input");
	taskCheckbox.setAttribute("type", "checkbox");
	taskCheckbox.setAttribute("id", id);

	let taskCheckboxLabel = document.createElement("label");
	taskCheckboxLabel.setAttribute("for", id);
	taskCheckboxLabel.appendChild(taskDescription);

	let deleteTaskButton = document.createElement("button");
	deleteTaskButton.classList.add("task-delete");
	deleteTaskButton.innerHTML = "x";
	deleteTaskButton.addEventListener("click", () => { removeTask(taskDiv)});

	taskDiv.appendChild(taskCheckbox);
	taskDiv.appendChild(taskCheckboxLabel);
	taskDiv.appendChild(deleteTaskButton);

	taskArea.appendChild(taskDiv);

	taskInput.value = "";
}

removeTask = (taskDiv) =>{
	if(window.confirm("Deseja realmente deletar essa task?"))
	{
		let taskArea = document.querySelector(".task-area");
		taskArea.removeChild(taskDiv);
	}
}
