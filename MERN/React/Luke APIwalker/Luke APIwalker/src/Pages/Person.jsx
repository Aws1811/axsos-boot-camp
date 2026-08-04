import { useState, useEffect } from "react";
import { useParams, Link } from "react-router-dom";
import axios from "axios";

const Person = () => {
    const { id } = useParams();
    const [character, setCharacter] = useState(null);
    const [homeworldName, setHomeworldName] = useState("");
    const [homeworldId, setHomeworldId] = useState(null);
    const [error, setError] = useState(false);

    useEffect(() => {
        const fetchCharacter = async () => {
            try {
                const response = await axios.get(
                    `https://swapi.dev/api/people/${id}/`,
                );
                setCharacter(response.data);
                setError(false);

                const homeworldUrl = response.data.homeworld;
                const urlParts = homeworldUrl.split("/").filter(Boolean);
                const extractedId = urlParts[urlParts.length - 1];
                setHomeworldId(extractedId);

                const homeworldResponse = await axios.get(homeworldUrl);
                setHomeworldName(homeworldResponse.data.name);
            } catch (err) {
                console.log("Error fetching character:", err);
                setError(true);
            }
        };

        fetchCharacter();
    }, [id]);

    if (error) {
        return (
            <div>
                <h2>These aren't the droids you're looking for.</h2>
                <img src="/obi-wan.jpg" alt="Obi-Wan Kenobi" width="300" />
            </div>
        );
    }

    if (!character) return <p>Loading...</p>;

    return (
        <div>
            <h2>{character.name}</h2>
            <p>
                <strong>Height:</strong> {character.height} cm
            </p>
            <p>
                <strong>Mass:</strong> {character.mass} kg
            </p>
            <p>
                <strong>Hair Color:</strong> {character.hair_color}
            </p>
            <p>
                <strong>Skin Color:</strong> {character.skin_color}
            </p>
            <p>
                <strong>Homeworld:</strong>{" "}
                <Link to={`/planets/${homeworldId}`}>
                    {homeworldName || "homeworld"}
                </Link>
            </p>
        </div>
    );
};
export default Person;
