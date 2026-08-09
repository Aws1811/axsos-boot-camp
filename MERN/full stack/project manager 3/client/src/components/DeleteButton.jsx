import axios from "axios";

const DeleteButton = (props) => {
    const { id, succss } = props;

    const handleDelete = async () => {
        try {
            await axios.delete(`http://localhost:8000/api/project/${id}`);
            succss();
        } catch (err) {
            console.log("Error deleting project:", err);
        }
    };
    return <button onClick={handleDelete}>Delete</button>;
};

export default DeleteButton;