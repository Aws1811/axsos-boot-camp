import { useState } from "react";
import { useNavigate } from "react-router-dom";

const SearchBar = () => {
    const [resource, setResource] = useState("people");
    const [id, setId] = useState("");
    const navigate = useNavigate();

    const handleSearch = (e) => {
        e.preventDefault();
        if (id === "") return;
        navigate(`/${resource}/${id}`);
    };

    return (
        <form onSubmit={handleSearch}>
            <label>Search for: </label>
            <select
                value={resource}
                onChange={(e) => setResource(e.target.value)}
            >
                <option value="people">people</option>
                <option value="planets">planets</option>
            </select>

            <label> ID: </label>
            <input
                type="number"
                value={id}
                onChange={(e) => setId(e.target.value)}
            />

            <button type="submit">Search</button>
        </form>
    );
};

export default SearchBar;
