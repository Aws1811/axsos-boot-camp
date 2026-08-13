import axios from "axios";

const DeleteButton = (props) => {
    const { id, name,onDeleteSuccess } = props;
    const handleDelete = async () => {
        const confirmed = window.confirm(
            `Are you sure you want to remove ${name}?`,
        );
        if (!confirmed) return;
        try {
            const res = await axios.delete(
                `http://localhost:8000/api/players/${id}`,
            );
            onDeleteSuccess();
        } catch (err) {
            console.log("Error deleting player:", err);
        }
    };
    return <button onClick={handleDelete}> Delete</button>;
    
};

export default DeleteButton;
