import { BrowserRouter, Route, Routes } from "react-router-dom";
import PlayerListPage from "./pages/PlayerListPage";
import AddPlayerPage from "./pages/addPlayerPage";
import ManageStatus from "./pages/ManageStatus";
import Nav from "./components/Nav";

function App() {
    return (
        <BrowserRouter>
        <Nav/>
            <Routes>
                <Route path="/players/list" element={<PlayerListPage />} />
                <Route path="/players/addplayer" element={<AddPlayerPage />} />
                <Route
                    path="/status/game/:gameNum"
                    element={<ManageStatus />}
                />
                <Route />
            </Routes>
        </BrowserRouter>
    );
}
export default App;
