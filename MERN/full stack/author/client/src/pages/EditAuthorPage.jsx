import { useEffect, useState } from "react";
import { Link, useNavigate, useParams } from "react-router-dom";
import AuthorForm from "../components/AuthorForm";
import axios from "axios";

const EditAuthorPage = () => {
    const { id } = useParams();
    const navigate = useNavigate();
    const [author, setAuthor] = useState(null);
    const [notFound, setNotFound] = useState(false);
    const [error, setError] = useState("");

    const fetchAuthor = async () => {
        try {
            const res = await axios.get(
                `http://localhost:8000/api/author/${id}`,
            );
            setAuthor(res.data.author);
        } catch (err) {
            setNotFound(true);
        }
    };
    useEffect(() => {
        fetchAuthor();
    }, []);

    const handelSubmit = async (e, data) => {
        e.preventDefault();
        try {
            await axios.put(`http://localhost:8000/api/author/${id}`, data);
            setError("");
            navigate("/authors");
        } catch (err) {
            setError(err.response.data.err);
        }
    };

    if (notFound) {
        return (
            <div>
                <p>can't find the author,try the link below</p>
                <Link to="/author/new"> Add new author</Link>
            </div>
        );
    }

    if (!author) return <p>loading .......................</p>;
    return (
        <>
            <h1>Favorite authors</h1>
            <h2>Edit this author</h2>
            <AuthorForm
                handelSubmit={handelSubmit}
                error={error}
                initialName={author.name}
                onCancel={() => navigate("/authors")}
            />
        </>
    );
};
export default EditAuthorPage;
