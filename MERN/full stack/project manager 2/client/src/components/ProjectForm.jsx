import { useState } from "react";

const ProjectForm = (props) => {
    const [title, setTitle] = useState("");
    const [price, setPrice] = useState("");
    const [descrption, setDescrption] = useState("");

    const handleSubmit = (e) => {
        e.preventDefault();
        props.onSubmitProp({ title, price, descrption });
        setTitle("");
        setPrice("");
        setDescrption("");
    };
    return (
        <div>
            <form onSubmit={handleSubmit}>
                <label >title</label>
                <input
                    type="text"
                    value={title}
                    name="title"
                    onChange={(e) => setTitle(e.target.value)}
                />

                <label >price</label>
                <input
                    type="number"
                    value={price}
                    name="price"
                    onChange={(e) => setPrice(e.target.value)}
                />

                <label > descrption</label>
                <input
                    type="text"
                    name="descrption"
                    value={descrption}
                    onChange={(e) => setDescrption(e.target.value)}
                />

                <button type="submit">create</button>
            </form>
        </div>
    );
};

export default ProjectForm;