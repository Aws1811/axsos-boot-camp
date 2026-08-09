import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./pages/Home";
import ProductDetail from "./pages/ProductDetail";
import EditProduct from "./pages/EditProduct";

function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/products" element={<Home />} />
                <Route path="/products/:id/edit" element={<EditProduct />} />
                <Route path="/products/:id" element={<ProductDetail />} />
            </Routes>
        </BrowserRouter>
    );
}

export default App;
