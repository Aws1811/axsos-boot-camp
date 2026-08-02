import React from "react";
import Header from "./components/Header.jsx";
import Navigation from "./components/Navigation.jsx";
import styles from './assets/App.module.css';
import Main from "./components/Main";
import SubContents from "./components/SubContents";
import Advertisement from "./components/Advertisement";
function App() {
    return (
        <div className={styles.app}>
            <Header />
            <Navigation />
            <Main>
                <SubContents />
                <SubContents />
                <SubContents />
                <Advertisement />
            </Main>
        </div>
    );
}

export default App;
