import axios from "axios";

const DeleteButton = (props) => {
    const { id, onDeleteSuccess } = props;
    const handelDelete = async () => {
        try {
            await axios.delete(`http://localhost:8000/api/author/${id}`);
            onDeleteSuccess();
        } catch (err) {
            console.log("Error deleting author:", err);
        }
    };
    return <button onClick={handelDelete}> Delete</button>;
};
export default DeleteButton;