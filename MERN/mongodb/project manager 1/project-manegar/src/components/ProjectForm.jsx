import { useState } from "react";
import axios from "axios";

const ProjectForm = () => {
    const [title, setTitle] = useState("");
    const [price, setPrice] = useState("");
    const [descrption, setDescrption] = useState("");

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            const response = await axios.post(
                "http://localhost:8000/api/project/create",
                {
                    title,
                    price,
                    descrption,
                },
            );
            console.log(response.data);
            setTitle("");
            setPrice("");
            setDescrption("");
        } catch (err) {
            console.log("Error creating project:", err);
        }
    };

    return (
        <div>
            <h1>Project Manager</h1>

            <form onSubmit={handleSubmit}>
                <label>Title</label>
                <input
                    value={title}
                    onChange={(e) => setTitle(e.target.value)}
                />

                <label>Price</label>
                <input
                    type="number"
                    value={price}
                    onChange={(e) => setPrice(e.target.value)}
                />

                <label>Description</label>
                <input
                    value={descrption}
                    onChange={(e) => setDescrption(e.target.value)}
                />

                <button type="submit">Create</button>
            </form>
        </div>
    );
};

export default ProjectForm;
