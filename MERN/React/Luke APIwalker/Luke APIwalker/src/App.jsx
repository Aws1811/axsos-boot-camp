import { BrowserRouter, Route, Routes } from "react-router-dom";
import Person from "./Pages/Person";
import Planet from "./Pages/Planet";
import Home from "./Pages/Home";

function App(){
  return(
    <BrowserRouter>
    <Routes>
      <Route path="/" element={<Home/>} />
      <Route path="/people/:id" element={<Person/>} />
      <Route path="/planets/:id" element={<Planet/>} />
    </Routes>
    </BrowserRouter>
  )
}