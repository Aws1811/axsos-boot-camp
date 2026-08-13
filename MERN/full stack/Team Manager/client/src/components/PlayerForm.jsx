import { useState } from "react";
import Box from "@mui/material/Box";
import Button from "@mui/material/Button";
import Typography from "@mui/material/Typography";
import TextField from "@mui/material/TextField";

const PlayerForm = (props) => {
    const { handleSubmit, error } = props;
    const [name, setName] = useState("");
    const [prefer, setPrefer] = useState("");

    const isValid = name.length >= 2;

    return (
        <form onSubmit={(e) => handleSubmit(e, { name, prefer })}>
            {error ? <Typography color="error">{error}</Typography> : null}
            <Box sx={{ m: 2 }}>
                <TextField
                    variant="filled"
                    label="Player Name"
                    onChange={(e) => setName(e.target.value)}
                    value={name}
                    error={name.length > 0 && !isValid}
                />
                {name.length > 0 && !isValid && (
                    <Typography variant="caption">
                        *Name must be at least 2 characters in length.
                    </Typography>
                )}
            </Box>
            <Box sx={{ m: 2 }}>
                <TextField
                    variant="filled"
                    label="Prefered position"
                    onChange={(e) => setPrefer(e.target.value)}
                    value={prefer}
                />
            </Box>
            <button type="submit" disabled={!isValid}>
                submit
            </button>
        </form>
    );
};
export default PlayerForm;
