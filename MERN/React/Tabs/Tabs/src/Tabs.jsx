import { useState } from "react";
import './App.css';
const Tabs = (props) => {
    const [activeIndex, setActiveIndex] = useState(0); 

    return (
        <>
            <div className="tab-headers">
                {props.tabs.map((tab, index) => (
                    <button
                        key={index}
                        className={
                            activeIndex === index ? "tab-header active" 
                            : "tab-header"
                        }
                        onClick={() => setActiveIndex(index)}
                    >
                        {tab.label}
                    </button>
                ))}
            </div>
            <div className="tab-content">
                {props.tabs[activeIndex].content}
            </div>
        </>
    );
};

export default Tabs;