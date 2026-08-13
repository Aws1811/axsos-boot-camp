import { useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import axios from "axios";
import PlayerForm from "../components/PlayerForm";
import styles from "../components/styles/Page.module.css";

const AddPlayerPage = (props) => {
    const navigate = useNavigate();
    const [error, setError] = useState("");

    const handleSubmit = async (e, data) => {
        e.preventDefault();
        try {
            const res = await axios.post(
                "http://localhost:8000/api/player",
                data,
            );
            setError("");
            navigate("/players/list");
        } catch (err) {
            setError(err.response.data.err);
        }
    };
    return (
        <div className={styles.page}>
            
            <PlayerForm handleSubmit={handleSubmit} error={error} />
        </div>
        
    );
};
export default AddPlayerPage;
