import { useState } from "react";
import Form from "./Form";

const Box = () => {
    const [box, setBox] = useState([]);

    const addBox = (newBox) => {
        setBox([newBox, ...box]);
    };

    return (
        <>
            <Form onAddBox={addBox} />
            <section style={{ display: "flex", width: "100%" }}>
                {box.map((b, index) => (
                    <div
                        key={index}
                        style={{
                            backgroundColor: b.color,
                            width: `${b.size}px`,
                            height: `${b.size}px`,
                        }}
                    ></div>
                ))}
                <div className="red"></div>
                <div className="green"></div>
                <div className="purple"></div>
            </section>
        </>
    );
};

export default Box;
