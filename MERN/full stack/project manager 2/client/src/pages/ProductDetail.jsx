import { useParams } from "react-router-dom";
import { useState,useEffect } from "react";
import axios from "axios";



const ProductDetail = () => {

    const { id } = useParams();
    const [item, setItem] = useState(null);

    useEffect(() => {
        const fetchItem = async () => {
            try {
                const res = await axios.get(
                    `http://localhost:8000/api/project/${id}`,
                );
                setItem(res.data.project);
            } catch (err) {
                console.log("Error fetching product:", err);
            }
        };
        fetchItem();
    }, [id]);

    if (!item) return <p>Loading...</p>;
    return (
        <div>
            <h2>{item.title}</h2>
            <p>Price : {item.price}</p>
            <p>desceription : {item.descrption} </p>
        </div>
    );
};

export default ProductDetail;