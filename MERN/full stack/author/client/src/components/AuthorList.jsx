import { Link } from "react-router-dom";
import DeleteButton from "./DeleteButton";

const AuthorList = (props) => {
    const { authors, removeFromList } = props;
    return (
        <div>
            <h2>We have quotes by:</h2>
            <table>
                <thead>
                    <tr>
                        <th>Author</th>
                        <th>Actions available</th>
                    </tr>
                </thead>
                <tbody>
                    {authors.map((authors) => (
                        <tr key={authors._id}>
                            <td>{authors.name}</td>
                            <td>
                                <Link to={`/author/${authors._id}/edit`}>
                                    Edit
                                </Link>{" "}    
                                <DeleteButton
                                    id={authors._id}
                                    onDeleteSuccess={() =>
                                        removeFromList(authors._id)
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

export default AuthorList;
