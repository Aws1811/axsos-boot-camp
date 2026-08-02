import { useState } from "react";
import "./App.css";
const Tabs = (props) => {
    const [activeIndex, setActiveIndex] = useState(0);

    const handleTabClick = (index, tab) => {
        setActiveIndex(index);
        if (tab.onClick) {
            tab.onClick();
        }
    };

    return (
        <>
            <div className="tab-headers">
                {props.tabs.map((tab, index) => (
                    <button
                        key={index}
                        className={
                            activeIndex === index
                                ? "tab-header active"
                                : "tab-header"
                        }
                        onClick={()=>handleTabClick(index,tab)}
                    >
                        {tab.label}
                    </button>
                ))}
            </div>
            <div className="tab-content" key={activeIndex}>{props.tabs[activeIndex].content}</div>
        </>
    );
};

export default Tabs;
