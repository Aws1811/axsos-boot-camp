import { Link } from "react-router-dom";

const ProjectList = (props) => {
    const { projects } = props;
    return (
        <div>
            <h2>All products</h2>
            {projects.map((project) => (
                <p key={project._id}>
                    <Link to={`/products/${project._id}`}>{project.title}</Link>
                </p>
            ))}
        </div>
    );
};
export default ProjectList;
