import axios from "axios";
import { useEffect, useState } from "react";
import { Link, useParams } from "react-router-dom";
import StatusButton from "../components/StatusButton";
import styles from "../components/styles/Page.module.css";


const ManageStatus = () => {
    const { gameNum,playerId } = useParams();
    const [players, setPlayers] = useState([]);

    useEffect(() => {
        const fetchPlayers = async () => {
            try {
                const res = await axios.get(
                    "http://localhost:8000/api/player",
                );
                setPlayers(res.data.players);
            } catch (err) {
                console.log("Error fetching players:", err);
            }
        };
        fetchPlayers();
    }, []);

    const updateStatus = async (playerId, newStatus) => {
        try {
            const res = await axios.patch(
                `http://localhost:8000/api/player/${playerId}/status`,
                { game: `game${gameNum}`, status: newStatus },
            );
            setPlayers(
                players.map((player) =>
                    player._id === playerId ? res.data.player : player,
                ),
            );
        } catch (err) {
            console.log("Error updating status:", err);
        }
    };

    return (
        <div className={styles.page}>
            <h1>Player status - game {gameNum}</h1>
            <Link className={styles.gameLink} to="/status/game/1"> Game 1</Link> |{" "}
            <Link className={styles.gameLink} to="/status/game/2"> Game 2</Link> |{" "}
            <Link className={styles.gameLink} to="/status/game/3"> Game 3</Link>
            <table className={styles.table}>
                <thead>
                    <tr>
                        <th>Team name </th>
                        <th> actions </th>
                    </tr>
                </thead>
                <tbody>
                    {players.map((player) => (
                        <tr key={player._id}>
                            <td>{player.name}</td>
                            <td>
                                <StatusButton
                                    label="Playing"
                                    currentStatus={
                                        player.status[`game${gameNum}`]
                                    }
                                    onClick={() =>
                                        updateStatus(player._id, "Playing")
                                    }
                                />
                                <StatusButton
                                    label="Not Playing"
                                    currentStatus={
                                        player.status[`game${gameNum}`]
                                    }
                                    onClick={() =>
                                        updateStatus(player._id, "Not Playing")
                                    }
                                />
                                <StatusButton
                                    label="Undecided"
                                    currentStatus={
                                        player.status[`game${gameNum}`]
                                    }
                                    onClick={() =>
                                        updateStatus(player._id, "Undecided")
                                    }
                                />
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
};
export default ManageStatus;
