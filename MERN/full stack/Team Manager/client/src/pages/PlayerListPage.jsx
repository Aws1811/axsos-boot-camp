import axios from "axios";
import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import PlayerList from "../components/PlayerList";
import styles from "../components/styles/Page.module.css";

const PlayerListPage = (props) => {
    const [players, setPlayers] = useState([]);

    useEffect(() => {
        const fetchPlayers = async () => {
            try {
                const res = await axios.get("http://localhost:8000/api/player");
                setPlayers(res.data.players);
            } catch (err) {
                console.log("Error fetching players:", err);
            }
        };
        fetchPlayers();
    }, []);

    const removeFromList = (id) => {
        setPlayers(players.filter((player) => player._id !== id));
    };
    return (
        <div className={styles.page}>
            <h1>List</h1>
            <Link to="/players/addplayer">Add player</Link>
            <PlayerList players={players} removeFromList={removeFromList} />
        </div>
    );
};
export default PlayerListPage;
