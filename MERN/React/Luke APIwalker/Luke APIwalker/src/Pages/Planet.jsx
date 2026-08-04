import { useState, useEffect } from "react";
import { useParams } from "react-router-dom";
import axios from "axios";

const Planet = () => {
    const { id } = useParams();
    const [planet, setPlanet] = useState(null);
    const [error, setError] = useState(false);

    useEffect(() => {
        const fetchPlanet = async () => {
            try {
                const response = await axios.get(`https://swapi.dev/api/planets/${id}/`);
                setPlanet(response.data);
                setError(false);
            } catch (err) {
                console.log("Error fetching planet:", err);
                setError(true);
            }
        };

        fetchPlanet();
    }, [id]);

    if (error) {
        return (
            <div>
                <h2>These aren't the droids you're looking for.</h2>
                <img src="/obi-wan.jpg" alt="Obi-Wan Kenobi" width="300" />
            </div>
        );
    }

    if (!planet) return <p>Loading...</p>;

    return (
        <div>
            <h2>{planet.name}</h2>
            <p><strong>Climate:</strong> {planet.climate}</p>
            <p><strong>Terrain:</strong> {planet.terrain}</p>
            <p><strong>Surface Water:</strong> {planet.surface_water}</p>
            <p><strong>Population:</strong> {planet.population}</p>
        </div>
    );
};

export default Planet;