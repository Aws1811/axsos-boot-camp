import { BrowserRouter, Route, Routes } from "react-router-dom";
import TableOfAuthors from "./pages/TableOfAuthors";
import NewAuthorPage from "./pages/NewAuthorPage";
import EditAuthorPage from "./pages/editAuthorPage";

function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/authors" element={<TableOfAuthors />} />
                <Route path="/author/new" element={<NewAuthorPage />} />
                <Route path="/author/:id/edit" element={<EditAuthorPage />} />
            </Routes>
        </BrowserRouter>
    );
}
export default App;
