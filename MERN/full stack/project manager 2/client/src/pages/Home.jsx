import ProjectForm from "../components/ProjectForm";
import ProjectList from "../components/ProjectList";
import { useEffect, useState } from "react";
import axios from "axios";

const Home = (props) => {
    const [projects, setProjects] = useState([]);

    useEffect(() => {
        const fetchProjects = async () => {
            try {
                const res = await axios.get(
                    "http://localhost:8000/api/project",
                );
                setProjects(res.data.projects);
            } catch (err) {
                console.log("ERROR,", err);
            }
        };
        fetchProjects();
    }, []);

    const createProject = async (project) => {
        try {
            const res = await axios.post(
                "http://localhost:8000/api/project",
                project,
            );
            setProjects([...projects, res.data.project]);
        } catch (err) {
            console.log("Error creating project:", err);
        }
    };
    return (
        <div>
            <ProjectForm onSubmitProp={createProject} />
            <ProjectList projects={projects} />
        </div>
    );
};
export default Home;
