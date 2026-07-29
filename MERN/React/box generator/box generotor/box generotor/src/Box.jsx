import { useState } from "react";

const Box = () => {
    const [color, setColor] = useState("");
    const [box, setBox] = useState([]);

    const handleSubmit = (e) => {
        e.preventDefault();

        setBox([...box, color]);
        setColor("");
    };

    return (
        <>
            <form onSubmit={handleSubmit}>
                <label htmlFor="color">Color</label>
                <input
                    type="text"
                    name="color"
                    value={color}
                    onChange={(e) => setColor(e.target.value)}
                />
                <button type="submit"> add new button</button>
            </form>
            {box.map((boxColor, index) => (
                <div
                    key={index}
                    style={{
                        backgroundColor: boxColor,
                        width: "100px",
                        height: "100px",
                    }}
                ></div>
            ))}
            <div className="red"></div>
            <div className="green"></div>
            <div className="purple"></div>
        </>
    );
};

export default Box;
