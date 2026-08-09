import { useState, useEffect } from "react";
import { useParams, useNavigate } from "react-router-dom";
import axios from "axios";
import ProjectForm from "../components/ProjectForm";

const EditProduct = () => {
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

    const updateProject = async (updatedProject) => {
        try {
            await axios.put(
                `http://localhost:8000/api/project/${id}`,
                updatedProject,
            );
            navigate(`/products/${id}`);
        } catch (err) {
            console.log("Error updating project:", err);
        }
    };

    if (!product) return <p>Loading...</p>;

    return (
        <div>
            <h1>Edit Product</h1>
            <ProjectForm
                onSubmitProp={updateProject}
                initialTitle={product.title}
                initialPrice={product.price}
                initialDescrption={product.descrption}
            />
        </div>
    );
};

export default EditProduct;
