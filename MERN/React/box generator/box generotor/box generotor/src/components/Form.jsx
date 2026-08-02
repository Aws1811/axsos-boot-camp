import { useState } from "react";

const Form = (props) => {
    const [color, setColor] = useState("");
    const [size, setSize] = useState("");

    const hundleSubmit = (e) => {
        e.preventDefault();
        props.onAddBox({ color, size });
        setColor("");
        setSize("");
    };
    return (
        <form onSubmit={hundleSubmit}>
            <label htmlFor="color">color</label>
            <input
                type="text"
                name="color"
                value={color}
                onChange={(e) => setColor(e.target.value)}
                id=""
            />
            <label htmlFor=""> size</label>
            <input
                type="text"
                name="size"
                value={size}
                onChange={(e) => setSize(e.target.value)}
            />
            <button type="submit"> add a box</button>
        </form>
    );
};
export default Form;
