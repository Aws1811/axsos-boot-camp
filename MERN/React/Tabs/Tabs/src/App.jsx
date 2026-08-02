import Tabs from "./Tabs";

function App() {
    const tabData = [
        {
            label: "Tab 1",
            content: "Tab 1 content is showing here.",
            onClick: () => console.log("Tab 1 clicked!"),
        },
        { label: "Tab 2", content: "Tab 2 content is showing here." },
        { label: "Tab 3", content: "Tab 3 content is showing here." },
    ];

    return (
        <div className="App">
            <Tabs tabs={tabData} />
        </div>
    );
}

export default App;
