import axios from "axios";
import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import AuthorList from "../components/AuthorList";

const TableOfAuthors = () => {
    const [authors, setAuthors] = useState([]);
    useEffect(() => {
        const fetchAuthor = async () => {
            try {
                const res = await axios.get("http://localhost:8000/api/author");
                setAuthors(res.data.authors);
            } catch (err) {
                console.log("Error fetching authors:", err);
            }
        };
        fetchAuthor();
    }, []);

    const removeFromList = (id) => {
        setAuthors(authors.filter((authors) => authors._id !== id));
    };
    return (
        <div>
            <h1>Favorite authors</h1>
            <Link to="/author/new"> Add an author</Link>
            <AuthorList authors={authors} removeFromList={removeFromList} />
        </div>
    );
};
export default TableOfAuthors;
