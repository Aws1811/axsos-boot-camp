import { useState } from "react";

const ToDoList = () => {
    const [task, setTask] = useState([]);
    const [newTaskInput, setNewTaskInput] = useState([]);

    const addTask = (e) => {
        e.preventDefault();
        if (newTaskInput === "") return;

        const newTask = {
            text: newTaskInput,
            completed: false,
        };

        setTask([...task, newTask]);
        setNewTaskInput("");
    };

    const removeTask = (idx) => {
        setTask(task.filter((task, index) => index !== idx));
    };

    const toggleTask = (idx) => {
        setTask(
            task.map((task, index) =>
                index === idx ? { ...task, completed: !task.completed } : task,
            ),
        );
    };
    return (
        <div>
            <form onSubmit={addTask}>
                <input
                    type="text"
                    value={newTaskInput}
                    onChange={(e) => setNewTaskInput(e.target.value)}
                    placeholder="Get MERN black belt."
                />
                <button type="submit">Add</button>
            </form>

            <ul>
                {task.map((task, index) => (
                    <li key={index}>
                        <span
                            style={{
                                textDecoration: task.completed
                                    ? "line-through"
                                    : "none",
                            }}
                        >
                            {task.text}
                        </span>
                        <input
                            type="checkbox"
                            checked={task.completed}
                            onChange={() => toggleTask(index)}
                        />
                        <button onClick={() => removeTask(index)}>
                            Delete
                        </button>
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default ToDoList;
