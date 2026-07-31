import { useState } from "react";
import { Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import Number from "./pages/Number";
import Word from "./pages/Word";
import Color from "./pages/Color";

function App() {
    return (
        <Routes>
            <Route path="/home" element={<Home />} />
            <Route path="/Number/:id" element={<Number />} />
            <Route path="/:word" element={<Word />} />
            <Route path=":word1/:background/:color" element={<Color />} />
        </Routes>
    );
}

export default App;
