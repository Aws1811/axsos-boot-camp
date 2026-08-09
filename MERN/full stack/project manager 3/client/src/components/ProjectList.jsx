import { Link } from "react-router-dom";
import DeleteButton from "./DeleteButton";

const ProjectList = (props) => {
    const { projects, removeFromList } = props;
    return (
        <div>
            <h2>All products</h2>
            {projects.map((project) => (
                <p key={project._id}>
                    <Link to={`/products/${project._id}`}>{project.title}</Link>
                    <Link to={`/products/${project._id}/edit`}>Edit</Link>
                    <DeleteButton
                        id={project._id}
                        succss={() => removeFromList(project._id)}
                    />
                </p>
            ))}
        </div>
    );
};
export default ProjectList;
