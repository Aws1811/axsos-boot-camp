import { useState } from "react";
import DeleteButton from "./DeleteButton";
import styles from "../components/styles/Page.module.css";


const PlayerList = (props) => {
    const { players, removeFromList } = props;
    return (
        <>
            <table className={styles.table}>
                <thead>
                    <tr>
                        <th>team name</th>
                        <th>prefered position</th>
                        <th>actions</th>
                    </tr>
                </thead>
                <tbody>
                    {players.map((player) => (
                        <tr key={player._id}>
                            <td>{player.name}</td>
                            <td>{player.prefer}</td>
                            <td>
                                <DeleteButton
                                    id={player._id}
                                    name={player.name}
                                    onDeleteSuccess={() =>
                                        removeFromList(player._id)
                                    }
                                />
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </>
    );
};

export default PlayerList;
