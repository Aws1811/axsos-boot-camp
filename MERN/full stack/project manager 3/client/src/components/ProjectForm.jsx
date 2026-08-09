import { useState } from "react";

const ProjectForm = (props) => {
    const {
        initialTitle = "",
        initialPrice = "",
        initialDescrption = "",
        onSubmitProp,
    } = props;
    const [title, setTitle] = useState(initialTitle);
    const [price, setPrice] = useState(initialPrice);
    const [descrption, setDescrption] = useState(initialDescrption);

    const handleSubmit = (e) => {
        e.preventDefault();
        onSubmitProp({ title, price, descrption });
        setTitle("");
        setPrice("");
        setDescrption("");
    };
    return (
        <div>
            <form onSubmit={handleSubmit}>
                <label>title</label>
                <input
                    type="text"
                    value={title}
                    name="title"
                    onChange={(e) => setTitle(e.target.value)}
                />

                <label>price</label>
                <input
                    type="number"
                    value={price}
                    name="price"
                    onChange={(e) => setPrice(e.target.value)}
                />

                <label> descrption</label>
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