import { useState, useEffect } from "react";
import { useParams, useNavigate, Link } from "react-router-dom";
import axios from "axios";
import DeleteButton from "../components/DeleteButton";

const ProductDetail = () => {
    const { id } = useParams();
    const navigate = useNavigate();
    const [product, setProduct] = useState(null);

    useEffect(() => {
        const fetchProduct = async () => {
            try {
                const res = await axios.get(
                    `http://localhost:8000/api/project/${id}`,
                );
                setProduct(res.data.project);
            } catch (err) {
                console.log("Error fetching product:", err);
            }
        };
        fetchProduct();
    }, [id]);

    if (!product) return <p>Loading...</p>;

    return (
        <div>
            <h2>{product.title}</h2>
            <p>Price: ${product.price}</p>
            <p>Description: {product.descrption}</p>
            <Link to={`/products/${id}/edit`}>Edit - - -</Link>
            <DeleteButton
                id={id}
                succss={() => navigate("/products")}
            />
        </div>
    );
};

export default ProductDetail;