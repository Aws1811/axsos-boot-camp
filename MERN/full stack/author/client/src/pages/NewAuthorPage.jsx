import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import AuthorForm from "../components/AuthorForm";

const NewAuthorPage = (props) => {
    const navigate = useNavigate();
    const [error, setError] = useState("");

    const handelSubmit = async (event, data) => {
        event.preventDefault();
        try {
            await axios.post("http://localhost:8000/api/author", data);
            setError("");
            navigate("/authors");
        } catch (err) {
            setError(err.response.data.err);
        }
    };

    return (
        <>
            <h1>Favorite authors</h1>
            <h2>Add a new Author:-</h2>
            <AuthorForm
                handelSubmit={handelSubmit}
                error={error}
                onCancel={() => navigate("/authors ")}
            />
        </>
    );
};

export default NewAuthorPage;